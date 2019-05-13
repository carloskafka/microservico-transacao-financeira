package br.carloskafka.helloservicecredito.dtos;

public class SolicitacaoTransferenciaDTO {
	private String idContaOrigem;
	private String idContaDestino;
	private double valorASerTransferido;

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
}
