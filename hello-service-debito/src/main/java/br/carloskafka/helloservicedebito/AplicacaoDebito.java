package br.carloskafka.helloservicedebito;

import org.springframework.boot.SpringApplication;

import br.carloskafka.helloservicedebito.qualifier.Microservice;

@Microservice
public class AplicacaoDebito {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoDebito.class, args);
	}

	
}