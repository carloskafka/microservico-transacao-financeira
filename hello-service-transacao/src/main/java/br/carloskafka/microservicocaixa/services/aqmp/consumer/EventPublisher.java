package br.carloskafka.microservicocaixa.services.aqmp.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.carloskafka.microservicocaixa.commands.SolicitacaoCommand;

@Component
public class EventPublisher {
	private Logger logger = LoggerFactory.getLogger(EventPublisher.class);

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Scheduled(fixedDelay = 100)
	public void sendMessage() {
		String idContaOrigem = "1";
		String idContaDestino = "2";
		double valorASerCreditado = 100.0;

		SolicitacaoCommand solicitacao = new SolicitacaoCommand(idContaOrigem, idContaDestino,
				valorASerCreditado);

		rabbitTemplate.convertAndSend("hello", solicitacao);
		logger.info("Published message '{}'", solicitacao.toString());
	}

}