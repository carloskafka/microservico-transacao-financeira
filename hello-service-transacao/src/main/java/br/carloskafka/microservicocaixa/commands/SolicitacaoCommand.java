package br.carloskafka.microservicocaixa.commands;

import java.io.Serializable;
import java.util.UUID;

import br.carloskafka.microservicocaixa.eventos.Evento;
import br.carloskafka.microservicocaixa.eventos.EventoSolicitacaoCriada;

public class SolicitacaoCommand implements Evento, Serializable {
	private static final long serialVersionUID = 203573801055315298L;
	
	private String idCorrelacao;
	private String idContaOrigem;
	private String idContaDestino;
	private double valorASerCreditado;

	public SolicitacaoCommand(String idContaOrigem, String idContaDestino, double valorASerCreditado) {
		super();
		this.idContaOrigem = idContaOrigem;
		this.idContaDestino = idContaDestino;
		this.valorASerCreditado = valorASerCreditado;
		this.idCorrelacao = UUID.randomUUID().toString();
	}

	public String getIdContaOrigem() {
		return idContaOrigem;
	}

	public String getIdContaDestino() {
		return idContaDestino;
	}

	public double getValorASerCreditado() {
		return valorASerCreditado;
	}

	public String getIdCorrelacao() {
		return idCorrelacao;
	}

	@Override
	public Evento obterEvento() {
		return new EventoSolicitacaoCriada(idCorrelacao);
	}

	@Override
	public String toString() {
		return "SolicitacaoCommand [idCorrelacao=" + idCorrelacao + ", idContaOrigem=" + idContaOrigem
				+ ", idContaDestino=" + idContaDestino + ", valorASerCreditado=" + valorASerCreditado + "]";
	}

}
