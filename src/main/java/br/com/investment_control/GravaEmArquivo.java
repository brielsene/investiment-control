package br.com.investment_control;

import br.com.investment_control.domain.entities.FactoryInvestimento;
import br.com.investment_control.domain.entities.Investimento;
import br.com.investment_control.infra.gateways.RepositorioInvestimentoEmArquivo;

import java.math.BigDecimal;

public class GravaEmArquivo {
    public static void main(String[] args) {
        RepositorioInvestimentoEmArquivo arquivo = new RepositorioInvestimentoEmArquivo();
        FactoryInvestimento factoryInvestimento = new FactoryInvestimento();
        Investimento investimento = factoryInvestimento.criarInvestimento("teste", new BigDecimal(1350.50));
        factoryInvestimento.settaOrigem();
        arquivo.criarInvestimento(investimento);
        arquivo.gravaEmArquivo("teste.txt");
    }
}
