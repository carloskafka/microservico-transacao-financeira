package br.carloskafka.microservicogerenciadortransacao.domainservice;

import java.sql.Date;

public class GerenciadorTransacao {
	private Date dataInicio;
	private Date dataTermino;
	private StatusTransacao statusTransacao;
	private String observacoes;

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public StatusTransacao getStatusTransacao() {
		return statusTransacao;
	}

	public void setStatusTransacao(StatusTransacao statusTransacao) {
		this.statusTransacao = statusTransacao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
