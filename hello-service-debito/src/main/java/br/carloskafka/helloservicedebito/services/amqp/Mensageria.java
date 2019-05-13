package br.carloskafka.helloservicedebito.services.amqp;

import org.springframework.stereotype.Component;

import br.carloskafka.helloservicedebito.dtos.SolicitacaoTransacaoDebitoDTO;

@Component
public class Mensageria {

	public void receberMensagem(SolicitacaoTransacaoDebitoDTO solicitacaoTransacaoDebitoDto) {
		System.out.println(solicitacaoTransacaoDebitoDto.toString());
	}
}
