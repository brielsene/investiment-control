package br.com.investment_control.infra.gateways;

import br.com.investment_control.application.gateway.RepositorioDeInvestimento;
import br.com.investment_control.domain.entities.Investimento;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioInvestimentoEmArquivo implements RepositorioDeInvestimento {
    List<Investimento> investimentoList = new ArrayList<>();


    @Override
    public Investimento criarInvestimento(Investimento investimento) {
        this.investimentoList.add(investimento);
        return investimento;
    }

    @Override
    public List<Investimento> listarInvestimentos() {
        return this.investimentoList;
    }

    public void gravaEmArquivo(String nomeArquivo){
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(nomeArquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fileWriter.write(this.investimentoList.toString());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
