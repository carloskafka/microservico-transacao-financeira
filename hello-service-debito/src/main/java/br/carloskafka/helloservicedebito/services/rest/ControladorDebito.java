package br.carloskafka.helloservicedebito.services.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.carloskafka.helloservicedebito.dtos.SolicitacaoTransacaoDebitoDTO;

@RestController
public class ControladorDebito {

	@PostMapping("/transacao-debito/")
	public void debitarValor(SolicitacaoTransacaoDebitoDTO solicitacaoTransacaoDebitoDto) {
		System.out.println(solicitacaoTransacaoDebitoDto.toString() + " realizada com sucesso.");
	}

}