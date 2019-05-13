package br.carloskafka.helloservicetransacao.dtos;

public class ResultadoSolicitacaoTransacaoCreditoDTO {
	private String idTransacaoCredito;
	private boolean sucesso;

	public String getIdTransacaoCredito() {
		return idTransacaoCredito;
	}

	public void setIdTransacaoCredito(String idTransacaoCredito) {
		this.idTransacaoCredito = idTransacaoCredito;
	}

	public boolean isSucesso() {
		return sucesso;
	}

	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}

}
