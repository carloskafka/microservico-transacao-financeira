package br.carloskafka.microservicocaixa;

import org.springframework.boot.SpringApplication;

import br.carloskafka.microservicocaixa.qualifier.Microservice;

@Microservice
public class AplicacaoTransacao {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoTransacao.class, args);
	}

}