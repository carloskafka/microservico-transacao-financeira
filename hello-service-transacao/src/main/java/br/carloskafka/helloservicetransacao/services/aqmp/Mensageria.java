package br.carloskafka.helloservicetransacao.services.aqmp;

import org.springframework.stereotype.Component;

import br.carloskafka.helloservicetransacao.dtos.ResultadoSolicitacaoTransacaoCreditoDTO;
import br.carloskafka.helloservicetransacao.dtos.ResultadoSolicitacaoTransacaoDebitoDTO;

@Component
public class Mensageria {

	public void receberMensagem(Object resultadoTransferencia) {
		if (resultadoTransferencia instanceof ResultadoSolicitacaoTransacaoCreditoDTO) {
			
		} else if (resultadoTransferencia instanceof ResultadoSolicitacaoTransacaoDebitoDTO) {
			
		}
		
	}
}
