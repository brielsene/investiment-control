package br.com.investment_control.infra.controllers;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record InvestimentoReponseDto(
        String descricao,
        BigDecimal valor,
        String hostName,
        String ipHost,
        LocalDateTime dataInvestimento
) {
}
