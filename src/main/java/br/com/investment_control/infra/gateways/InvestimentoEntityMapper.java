package br.com.investment_control.infra.gateways;

import br.com.investment_control.domain.entities.Investimento;
import br.com.investment_control.infra.persistence.InvestimentoEntity;

public class InvestimentoEntityMapper {

    public InvestimentoEntityMapper(){

    }

    public InvestimentoEntity toEntity(Investimento investimento){
        return new InvestimentoEntity(investimento.getId(), investimento.getDescricao(), investimento.getValor(),
                investimento.getHostname(),investimento.getIpHost(), investimento.getDataInvestimento());
    }

    public Investimento toDomain(InvestimentoEntity investimento){
        return new Investimento(investimento.getId(), investimento.getDescricao(), investimento.getValor(), investimento.getHostName(),
                investimento.getIpHost(), investimento.getDataInvestimento());
    }
}
