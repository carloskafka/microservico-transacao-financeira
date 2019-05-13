package br.carloskafka.helloservicecredito;

import org.springframework.boot.SpringApplication;

import br.carloskafka.helloservicecredito.qualifier.Microservice;

@Microservice
public class AplicacaoCredito {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoCredito.class, args);
	}

}