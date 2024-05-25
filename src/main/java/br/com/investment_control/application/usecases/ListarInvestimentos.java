package br.com.investment_control.application.usecases;

import br.com.investment_control.application.gateway.RepositorioDeInvestimento;
import br.com.investment_control.domain.entities.Investimento;

import java.util.List;

public class ListarInvestimentos {
    private final RepositorioDeInvestimento repositorioDeInvestimento;

    public ListarInvestimentos(RepositorioDeInvestimento repositorioDeInvestimento) {
        this.repositorioDeInvestimento = repositorioDeInvestimento;
    }

    public List<Investimento>listarTodosInvestimentos(){
        return this.repositorioDeInvestimento.listarInvestimentos();
    }
}
