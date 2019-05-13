package br.carloskafka.microservicocaixa.eventos;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EventoSolicitacaoCriada implements Evento {
	private String idCorrelacao;
	private String dataHoraCriacao;

	public EventoSolicitacaoCriada(String idCorrelacao) {
		this.idCorrelacao = idCorrelacao;
		this.dataHoraCriacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
	}

	public String getIdCorrelacao() {
		return idCorrelacao;
	}

	public String getDataHoraCriacao() {
		return dataHoraCriacao;
	}

	@Override
	public Evento obterEvento() {
		return this;
	}

	@Override
	public String toString() {
		return "EventoSolicitacaoCriada [idCorrelacao=" + idCorrelacao + ", dataHoraCriacao=" + dataHoraCriacao + "]";
	}

}
