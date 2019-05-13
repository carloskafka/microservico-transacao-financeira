package br.carloskafka.helloservicetransacao.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.carloskafka.helloservicetransacao.dtos.SolicitacaoTransacaoDebitoDTO;
import br.carloskafka.helloservicetransacao.dtos.TransacaoDebitoDTO;

@FeignClient(name = "hello-service-debito", fallback = ServicoDebitoFallback.class)
public interface ServicoDebito {
	@GetMapping("/transacoes/{id_conta}")
	public List<TransacaoDebitoDTO> obterTransacoesDebitoPorIdConta(@PathVariable("id_conta") String idConta);
	
	@PostMapping("/transacao-debito/")
	public void debitarValor(@RequestBody SolicitacaoTransacaoDebitoDTO solicitacaoTransacaoDebitoDto);
}
