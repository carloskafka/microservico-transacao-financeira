package br.carloskafka.helloservicecredito.services.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.carloskafka.helloservicecredito.dtos.SolicitacaoTransacaoCreditoDTO;

@RestController
public class ControladorCredito {

	@PostMapping("/transacao-credito/")
	public void creditarValor(@RequestBody SolicitacaoTransacaoCreditoDTO solicitacaoTransacaoCreditoDto) {
		System.out.println(solicitacaoTransacaoCreditoDto.toString() + " realizada com sucesso.");
	}

}