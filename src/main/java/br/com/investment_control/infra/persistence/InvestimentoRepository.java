package br.com.investment_control.infra.persistence;

import br.com.investment_control.domain.entities.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<InvestimentoEntity, Long> {
}
