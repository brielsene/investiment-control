package br.com.investment_control.application.usecases;

import br.com.investment_control.application.gateway.RepositorioDeInvestimento;
import br.com.investment_control.domain.entities.Investimento;

public class CriarInvestimento {
    private final RepositorioDeInvestimento repositorioDeInvestimento;

    public CriarInvestimento(RepositorioDeInvestimento repositorioDeInvestimento) {
        this.repositorioDeInvestimento = repositorioDeInvestimento;
    }

    public Investimento criarInvestimento(Investimento investimento){
        return repositorioDeInvestimento.criarInvestimento(investimento);
    }
}
