package br.com.investment_control.infra.gateways;

import br.com.investment_control.application.gateway.RepositorioDeInvestimento;
import br.com.investment_control.domain.entities.Investimento;
import br.com.investment_control.infra.persistence.InvestimentoEntity;
import br.com.investment_control.infra.persistence.InvestimentoRepository;

import java.util.List;

public class RepositorioDeInvestimentoJpa implements RepositorioDeInvestimento {

    private final InvestimentoRepository investimentoRepository;
    private final InvestimentoEntityMapper investimentoEntityMapper;

    public RepositorioDeInvestimentoJpa(InvestimentoRepository investimentoRepository, InvestimentoEntityMapper investimentoEntityMapper) {
        this.investimentoRepository = investimentoRepository;
        this.investimentoEntityMapper = investimentoEntityMapper;
    }

    @Override
    public Investimento criarInvestimento(Investimento investimento) {
        InvestimentoEntity investimentoEntity = new InvestimentoEntity(null, investimento.getDescricao(), investimento.getValor(),
                investimento.getHostname(), investimento.getIpHost(), investimento.getDataInvestimento());
        this.investimentoRepository.save(investimentoEntity);
        return investimentoEntityMapper.toDomain(investimentoEntity);
    }

    @Override
    public List<Investimento> listarInvestimentos() {
        List<InvestimentoEntity> all = this.investimentoRepository.findAll();
        return all.stream().map(investimentoEntityMapper::toDomain).toList();
    }
}
