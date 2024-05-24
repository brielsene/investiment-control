package br.com.investment_control.domain.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class InvestimentoTest {
    @Test
    public void naoCriaInvestimentoCasaValorSejaMenorQueZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Investimento("Teste", BigDecimal.valueOf(-1350)));
    }

    @Test
    public void testaOrigemDoInvestimento(){
        FactoryInvestimento factoryInvestimento = new FactoryInvestimento();
        Investimento investimento = factoryInvestimento.criarInvestimento("Teste", BigDecimal.valueOf(1350));
        factoryInvestimento.settaOrigem();
        Assertions.assertEquals("192.168.0.10" ,investimento.getIpHost());
    }
}
