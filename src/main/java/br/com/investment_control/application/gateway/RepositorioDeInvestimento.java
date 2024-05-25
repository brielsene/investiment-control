package br.com.investment_control.application.gateway;

import br.com.investment_control.domain.entities.Investimento;

import java.util.List;

public interface RepositorioDeInvestimento {

    Investimento criarInvestimento(Investimento investimento);

    List<Investimento>listarInvestimentos();
}
