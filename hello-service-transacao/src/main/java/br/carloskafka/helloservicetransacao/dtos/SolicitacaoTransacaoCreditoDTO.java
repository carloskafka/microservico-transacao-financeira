package br.carloskafka.helloservicetransacao.dtos;

import java.util.UUID;

public class SolicitacaoTransacaoCreditoDTO {
	private String idTransacao;
	private String idContaOrigem;
	private String idContaDestino;
	private double valorASerCreditado;

	public SolicitacaoTransacaoCreditoDTO() {
	}

	public SolicitacaoTransacaoCreditoDTO(String idContaOrigem, String idContaDestino, double valorASerCreditado) {
		this();
		this.idContaOrigem = idContaOrigem;
		this.idContaDestino = idContaDestino;
		this.valorASerCreditado = valorASerCreditado;
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

	public double getValorASerCreditado() {
		return valorASerCreditado;
	}

	public void setValorASerCreditado(double valorASerCreditado) {
		this.valorASerCreditado = valorASerCreditado;
	}

	public String getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(String idTransacao) {
		this.idTransacao = idTransacao;
	}

}
