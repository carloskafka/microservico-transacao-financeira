package br.carloskafka.helloservicetransacao.services.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.carloskafka.helloservicetransacao.dtos.ResultadoTransferenciaDTO;
import br.carloskafka.helloservicetransacao.dtos.SolicitacaoTransacaoCreditoDTO;
import br.carloskafka.helloservicetransacao.dtos.SolicitacaoTransacaoDebitoDTO;
import br.carloskafka.helloservicetransacao.dtos.SolicitacaoTransferenciaDTO;
import br.carloskafka.helloservicetransacao.dtos.TransacaoCreditoDTO;
import br.carloskafka.helloservicetransacao.dtos.TransacaoDebitoDTO;
import br.carloskafka.helloservicetransacao.services.ServicoCredito;
import br.carloskafka.helloservicetransacao.services.ServicoDebito;

@RestController
public class ControladorTransacao {
	private Map<String, SolicitacaoTransferenciaDTO> solicitacoesTransferenciaDto = new HashMap<>();

	@Inject
	private ServicoDebito servicoDebito;
	@Inject
	private ServicoCredito servicoCredito;

	@PostMapping("/efetuar-transferencia")
	public ResultadoTransferenciaDTO efetuarTransferencia(
			@RequestBody SolicitacaoTransferenciaDTO solicitacaoTransferenciaDto) {
		ResultadoTransferenciaDTO resultadoTransferenciaDto = new ResultadoTransferenciaDTO();

		if (solicitacoesTransferenciaDto.containsKey(solicitacaoTransferenciaDto.getIdTransacao())) {
			solicitacaoTransferenciaDto = solicitacoesTransferenciaDto
					.get(solicitacaoTransferenciaDto.getIdTransacao());
			resultadoTransferenciaDto.setIdTransacao(solicitacaoTransferenciaDto.getIdTransacao());
			resultadoTransferenciaDto.setMensagem("Status da solicitação: " + solicitacaoTransferenciaDto.getStatusAtual());
		} else {
			String idContaOrigem = solicitacaoTransferenciaDto.getIdContaOrigem();
			String idContaDestino = solicitacaoTransferenciaDto.getIdContaDestino();
			double valorASerTransferido = solicitacaoTransferenciaDto.getValorASerTransferido();

			double saldoAtual = obterSaldoPorIdConta(idContaOrigem);

			if (saldoAtual >= valorASerTransferido) {
				efetuarDebitoNaConta(idContaOrigem, idContaDestino, valorASerTransferido);
				efetuarCreditoNaConta(idContaOrigem, idContaDestino, valorASerTransferido);
				
				resultadoTransferenciaDto.setMensagem("Sua solicitação de transferencia será processada em breve.");
				resultadoTransferenciaDto.setIdTransacao(solicitacaoTransferenciaDto.getIdTransacao());
				
				solicitacaoTransferenciaDto.setStatusAtual("EM_PROCESSAMENTO");
				solicitacoesTransferenciaDto.put(solicitacaoTransferenciaDto.getIdTransacao(),solicitacaoTransferenciaDto);
			} else {
				resultadoTransferenciaDto.setMensagem("A " + solicitacaoTransferenciaDto.getIdContaOrigem()
						+ " não possui saldo suficiente para realizar transferencia");
			}
		} 

		return resultadoTransferenciaDto;
	}

	private void efetuarCreditoNaConta(String idContaOrigem, String idContaDestino,
			double valorASerTransferido) {
		SolicitacaoTransacaoCreditoDTO solicitacaoTransacaoCreditoDto = new SolicitacaoTransacaoCreditoDTO();

		solicitacaoTransacaoCreditoDto.setIdContaOrigem(idContaOrigem);
		solicitacaoTransacaoCreditoDto.setIdContaDestino(idContaDestino);
		solicitacaoTransacaoCreditoDto.setValorASerCreditado(valorASerTransferido);

		servicoCredito.creditarValor(solicitacaoTransacaoCreditoDto);
	}

	private void efetuarDebitoNaConta(String idContaOrigem, String idContaDestino, double valorASerTransferido) {
		SolicitacaoTransacaoDebitoDTO solicitacaoTransacaoDebitoDto = new SolicitacaoTransacaoDebitoDTO();

		solicitacaoTransacaoDebitoDto.setIdContaOrigem(idContaOrigem);
		solicitacaoTransacaoDebitoDto.setIdContaDestino(idContaDestino);
		solicitacaoTransacaoDebitoDto.setValorASerDebitado(valorASerTransferido);

		servicoDebito.debitarValor(solicitacaoTransacaoDebitoDto);
	}

	private double obterSaldoPorIdConta(String idContaOrigem) {
		List<TransacaoDebitoDTO> transacoesDebito = servicoDebito.obterTransacoesDebitoPorIdConta(idContaOrigem);
		List<TransacaoCreditoDTO> transacoesCredito = servicoCredito.obterTransacoesCreditoPorIdConta(idContaOrigem);

		double saldoDebito = transacoesDebito.stream().mapToDouble(TransacaoDebitoDTO::getValor).sum();
		double saldoCredito = transacoesCredito.stream().mapToDouble(TransacaoCreditoDTO::getValor).sum();

		double saldoAtual = saldoDebito + saldoCredito;

		return saldoAtual;
	}

}