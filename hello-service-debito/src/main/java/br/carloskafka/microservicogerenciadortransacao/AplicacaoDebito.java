package br.carloskafka.microservicogerenciadortransacao;

import org.springframework.boot.SpringApplication;

import br.carloskafka.microservicogerenciadortransacao.qualifier.Microservice;

@Microservice
public class AplicacaoDebito {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoDebito.class, args);
	}

	
}