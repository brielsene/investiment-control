package br.com.investment_control.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Investimento {
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private String hostname;
    private String ipHost;
    private LocalDateTime dataInvestimento;

    public Investimento(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;

    }

    public Investimento(Long id, String descricao, BigDecimal valor, String hostname, String ipHost, LocalDateTime dataInvestimento) {
        if(valor.compareTo(BigDecimal.ZERO) <0){
            throw new IllegalArgumentException("Não é permitido valor menor que zero");

        }
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.hostname = hostname;
        this.ipHost = ipHost;
        this.dataInvestimento = dataInvestimento;
    }


}
