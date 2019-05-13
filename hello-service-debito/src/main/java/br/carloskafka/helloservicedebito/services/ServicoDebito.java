package br.carloskafka.helloservicedebito.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.carloskafka.helloservicedebito.dtos.SolicitacaoTransacaoDebitoDTO;
import br.carloskafka.helloservicedebito.dtos.TransacaoDebitoDTO;

@FeignClient(name = "hello-service-debito", fallback = ServicoDebitoFallback.class)
public interface ServicoDebito {
	@HystrixCommand
	@GetMapping("/transacoes/{id_conta}")
	public List<TransacaoDebitoDTO> obterTransacoesDebitoPorIdConta(@PathVariable("id_conta") String idConta);
	
	@PostMapping("/transacao-debito/")
	public void debitarValor(@RequestBody SolicitacaoTransacaoDebitoDTO solicitacaoTransacaoDebitoDto);
}
