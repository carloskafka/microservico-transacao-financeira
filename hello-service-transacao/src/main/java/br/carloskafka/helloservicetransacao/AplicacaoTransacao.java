package br.carloskafka.helloservicetransacao;

import org.springframework.boot.SpringApplication;

import br.carloskafka.helloservicetransacao.qualifier.Microservice;

@Microservice
public class AplicacaoTransacao {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoTransacao.class, args);
	}

}