package br.carloskafka.microservicocaixa.services.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.carloskafka.microservicocaixa.commands.SolicitacaoCommand;
import br.carloskafka.microservicocaixa.eventos.Evento;
import br.carloskafka.microservicocaixa.repositorios.RepositorioEventos;

@RestController
public class ControladorCaixa {
	private Map<String, SolicitacaoCommand> solicitacoes;
	
	public ControladorCaixa() {
		solicitacoes = new HashMap<String, SolicitacaoCommand>();
	}
	
	@PostMapping
	public String realizarTransferencia(@RequestBody SolicitacaoCommand solicitacaoCommand) {
		if (solicitacoes.containsKey(solicitacaoCommand.getIdCorrelacao())) {
			solicitacaoCommand = solicitacoes.get(solicitacaoCommand.getIdCorrelacao());
			return "Status da Solicitação: " + obterUltimoStatus(solicitacaoCommand.getIdCorrelacao());
		} else {
			solicitacoes.put(solicitacaoCommand.getIdCorrelacao(), solicitacaoCommand);
			RepositorioEventos.adicionarEvento(solicitacaoCommand.getIdCorrelacao(), solicitacaoCommand.obterEvento());
			
			return "Sua solicitação será processada em breve";
		}
	}

	private Evento obterUltimoStatus(String idCorrelacao) {
		return RepositorioEventos.obterUltimoEventoPorIdCorrelacao(idCorrelacao);
	}
	
}
