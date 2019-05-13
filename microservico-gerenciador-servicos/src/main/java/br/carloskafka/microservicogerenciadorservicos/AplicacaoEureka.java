package br.carloskafka.microservicogerenciadorservicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AplicacaoEureka {
    public static void main(String[] args) {
        SpringApplication.run(AplicacaoEureka.class, args);
    }
}