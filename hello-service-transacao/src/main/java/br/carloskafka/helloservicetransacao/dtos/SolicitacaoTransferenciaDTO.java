package br.carloskafka.helloservicetransacao.dtos;

public class SolicitacaoTransferenciaDTO {
	private String idTransacao;
	private String idContaOrigem;
	private String idContaDestino;
	private double valorASerTransferido;
	private String statusAtual;

	public String getIdContaOrigem() {
		return idContaOrigem;
	}

	public void setIdContaOrigem(String idContaOrigem) {
		this.idContaOrigem = idContaOrigem;
	}

	public String getIdContaDestino() {
		return idContaDestino;
	}

	public void setIdContaDestino(String idContaDestino) {
		this.idContaDestino = idContaDestino;
	}

	public double getValorASerTransferido() {
		return valorASerTransferido;
	}

	public void setValorASerTransferido(double valorASerTransferido) {
		this.valorASerTransferido = valorASerTransferido;
	}

	public String getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(String idTransacao) {
		this.idTransacao = idTransacao;
	}

	public String getStatusAtual() {
		return statusAtual;
	}

	public void setStatusAtual(String statusAtual) {
		this.statusAtual = statusAtual;
	}

	@Override
	public String toString() {
		return "SolicitacaoTransferenciaDTO [idTransacao=" + idTransacao + ", idContaOrigem=" + idContaOrigem
				+ ", idContaDestino=" + idContaDestino + ", valorASerTransferido=" + valorASerTransferido
				+ ", statusAtual=" + statusAtual + "]";
	}

}
