package br.com.investment_control.config;

import br.com.investment_control.application.gateway.RepositorioDeInvestimento;
import br.com.investment_control.application.usecases.CriarInvestimento;
import br.com.investment_control.application.usecases.ListarInvestimentos;
import br.com.investment_control.domain.entities.Investimento;
import br.com.investment_control.infra.gateways.InvestimentoEntityMapper;
import br.com.investment_control.infra.gateways.RepositorioDeInvestimentoJpa;
import br.com.investment_control.infra.persistence.InvestimentoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigInvestimento {

    @Bean
    public CriarInvestimento criarInvestimento(RepositorioDeInvestimento repositorioDeInvestimento){
        return new CriarInvestimento(repositorioDeInvestimento);
    }

    @Bean
    public ListarInvestimentos listarInvestimentos(RepositorioDeInvestimento repositorioDeInvestimento){
        return new ListarInvestimentos(repositorioDeInvestimento);
    }

    @Bean
    public RepositorioDeInvestimentoJpa repositorioDeInvestimentoJpa(InvestimentoRepository investimentoRepository, InvestimentoEntityMapper mapper){
        return new RepositorioDeInvestimentoJpa(investimentoRepository, mapper);
    }

    @Bean
    public InvestimentoEntityMapper investimentoEntityMapper(){
        return new InvestimentoEntityMapper();
    }
}
