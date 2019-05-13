package br.carloskafka.helloservicetransacao.services;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import br.carloskafka.helloservicetransacao.dtos.SolicitacaoTransacaoDebitoDTO;
import br.carloskafka.helloservicetransacao.dtos.TransacaoDebitoDTO;

@Component
public class ServicoDebitoFallback implements ServicoDebito {

	@Override
	public List<TransacaoDebitoDTO> obterTransacoesDebitoPorIdConta(String idConta) {
		return Collections.emptyList();
	}

	@Override
	public void debitarValor(SolicitacaoTransacaoDebitoDTO solicitacaoTransacaoDebitoDto) {
		System.out.println("Falha ao efetuar comunicação com microserviço debitador");
	}

}