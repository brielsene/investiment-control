package br.com.investment_control.domain.entities;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

public class FactoryInvestimento {
    private Investimento investimento;

    public Investimento modificarInvestimento(BigDecimal valorModify){
        this.investimento.setValor(investimento.getValor().add(valorModify));
        return this.investimento;
    }

    public Investimento criarInvestimento(String descricao, BigDecimal valor){
        LocalDateTime time = LocalDateTime.now();
        this.investimento = new Investimento(descricao, valor);
        investimento.setDataInvestimento(time);
        return investimento;
    }

    public Investimento settaOrigem(){
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            this.investimento.setHostname(localHost.getHostName());
            this.investimento.setIpHost(localHost.getHostAddress());
            return this.investimento;
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }



}
