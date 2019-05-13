package br.carloskafka.helloservicetransacao.dtos;

public class SolicitacaoTransacaoDebitoDTO {
	private String idTransacao;
	private String idContaOrigem;
	private String idContaDestino;
	private double valorASerDebitado;

	public SolicitacaoTransacaoDebitoDTO() {
	}

	public SolicitacaoTransacaoDebitoDTO(String idContaOrigem, String idContaDestino, double valorASerDebitado) {
		this();
		this.idContaOrigem = idContaOrigem;
		this.idContaDestino = idContaDestino;
		this.valorASerDebitado = valorASerDebitado;
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

	public double getValorASerDebitado() {
		return valorASerDebitado;
	}

	public void setValorASerDebitado(double valorASerDebitado) {
		this.valorASerDebitado = valorASerDebitado;
	}

	public String getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(String idTransacao) {
		this.idTransacao = idTransacao;
	}

}
