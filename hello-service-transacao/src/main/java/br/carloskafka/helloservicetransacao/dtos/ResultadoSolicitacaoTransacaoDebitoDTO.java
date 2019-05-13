package br.carloskafka.helloservicetransacao.dtos;

public class ResultadoSolicitacaoTransacaoDebitoDTO {
	private String idTransacaoDebito;
	private boolean sucesso;

	public String getIdTransacaoDebito() {
		return idTransacaoDebito;
	}

	public void setIdTransacaoDebito(String idTransacaoDebito) {
		this.idTransacaoDebito = idTransacaoDebito;
	}

	public boolean isSucesso() {
		return sucesso;
	}

	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}

}
