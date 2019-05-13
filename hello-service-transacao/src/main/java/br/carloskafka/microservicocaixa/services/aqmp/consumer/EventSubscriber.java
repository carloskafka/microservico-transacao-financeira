package br.carloskafka.microservicocaixa.services.aqmp.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.carloskafka.microservicocaixa.commands.SolicitacaoCommand;

@Component
public class EventSubscriber {

	private Logger logger = LoggerFactory.getLogger(EventSubscriber.class);

	@RabbitListener(queues = "hello")
	public void receive(SolicitacaoCommand solicitacaoCommand) {
		logger.info("Received message '{}'", solicitacaoCommand.toString());
	}
}
