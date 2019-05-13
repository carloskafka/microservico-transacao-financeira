package br.carloskafka.helloservicetransacao.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.carloskafka.helloservicetransacao.dtos.SolicitacaoTransacaoCreditoDTO;
import br.carloskafka.helloservicetransacao.dtos.TransacaoCreditoDTO;

@FeignClient(name = "hello-service-credito", fallback = ServicoCreditoFallback.class)
public interface ServicoCredito {
	@GetMapping("/transacoes/{id_conta}")
	public List<TransacaoCreditoDTO> obterTransacoesCreditoPorIdConta(@PathVariable("id_conta") String idConta);

	@PostMapping("/transacao-credito/")
	public void creditarValor(@RequestBody SolicitacaoTransacaoCreditoDTO solicitacaoTransacaoCreditoDto);
}
