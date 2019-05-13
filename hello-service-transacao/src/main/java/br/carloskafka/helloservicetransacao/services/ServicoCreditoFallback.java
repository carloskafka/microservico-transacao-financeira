package br.carloskafka.helloservicetransacao.services;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import br.carloskafka.helloservicetransacao.dtos.SolicitacaoTransacaoCreditoDTO;
import br.carloskafka.helloservicetransacao.dtos.TransacaoCreditoDTO;

@Component
public class ServicoCreditoFallback implements ServicoCredito {

	@Override
	public List<TransacaoCreditoDTO> obterTransacoesCreditoPorIdConta(String idConta) {
		return Collections.emptyList();
	}

	@Override
	public void creditarValor(SolicitacaoTransacaoCreditoDTO solicitacaoTransacaoCreditoDto) {
		System.out.println("Falha ao efetuar comunicação com microserviço creditador");
	}

}
