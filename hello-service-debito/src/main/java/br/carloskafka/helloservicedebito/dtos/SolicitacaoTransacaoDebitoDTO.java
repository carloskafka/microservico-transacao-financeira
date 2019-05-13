package br.carloskafka.helloservicedebito.dtos;

public class SolicitacaoTransacaoDebitoDTO {
	private String idContaOrigem;
	private String idContaDestino;
	private double valorASerTransferido;

	public SolicitacaoTransacaoDebitoDTO() {
	}
	
	public SolicitacaoTransacaoDebitoDTO(String idContaOrigem, String idContaDestino, double valorASerTransferido) {
		super();
		this.idContaOrigem = idContaOrigem;
		this.idContaDestino = idContaDestino;
		this.valorASerTransferido = valorASerTransferido;
	}

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
