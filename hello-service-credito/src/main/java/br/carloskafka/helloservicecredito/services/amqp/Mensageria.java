package br.carloskafka.helloservicecredito.services.amqp;

import org.springframework.stereotype.Component;

import br.carloskafka.helloservicecredito.dtos.SolicitacaoTransacaoCreditoDTO;

@Component
public class Mensageria {

	public void receberMensagem(SolicitacaoTransacaoCreditoDTO mensagem) {
		System.out.println(mensagem.toString());
	}
}
