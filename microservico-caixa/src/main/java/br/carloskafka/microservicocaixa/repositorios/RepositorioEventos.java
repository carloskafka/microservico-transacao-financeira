package br.carloskafka.microservicocaixa.repositorios;

import java.util.HashMap;
import java.util.Map;

import br.carloskafka.microservicocaixa.eventos.Evento;

public class RepositorioEventos {
	private static Map<String, Evento> eventos;
	
	public RepositorioEventos() {
		eventos = new HashMap<>();
	}
	
	public static void adicionarEvento(String idCorrelacao, Evento evento) {
		eventos.put(idCorrelacao, evento);
	}

	public static Evento obterUltimoEventoPorIdCorrelacao(String idCorrelacao) {
		return eventos.get(idCorrelacao);
	}
}
