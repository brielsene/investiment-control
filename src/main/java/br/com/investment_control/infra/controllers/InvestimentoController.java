package br.com.investment_control.infra.controllers;

import br.com.investment_control.application.usecases.CriarInvestimento;
import br.com.investment_control.application.usecases.ListarInvestimentos;
import br.com.investment_control.domain.entities.Investimento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {
    private final CriarInvestimento criarInvestimento;
    private final ListarInvestimentos listarInvestimentos;

    public InvestimentoController(CriarInvestimento criarInvestimento, ListarInvestimentos listarInvestimentos) {
        this.criarInvestimento = criarInvestimento;
        this.listarInvestimentos = listarInvestimentos;
    }

    @PostMapping
    public ResponseEntity<InvestimentoReponseDto>criarInvestimento(@RequestBody InvestimentoRequestDto investimentoRequestDto){
        Investimento investimento = new Investimento(null, investimentoRequestDto.descricao(), investimentoRequestDto.valor(),
                investimentoRequestDto.hostName(), investimentoRequestDto.ipHost(), investimentoRequestDto.dataInvestimento());
                this.criarInvestimento.criarInvestimento(investimento);
                InvestimentoReponseDto investimentoReponseDto = new InvestimentoReponseDto(investimento.getDescricao(), investimento.getValor(),
                        investimento.getHostname(), investimento.getIpHost(), investimento.getDataInvestimento());
                return ResponseEntity.status(HttpStatus.CREATED).body(investimentoReponseDto);

    }

    @GetMapping
    public ResponseEntity<List<InvestimentoReponseDto>>listarUsuarios(){
        List<Investimento> investimentos = this.listarInvestimentos.listarTodosInvestimentos();
        return ResponseEntity.ok(investimentos.stream().map(i ->new InvestimentoReponseDto(i.getDescricao(), i.getValor(), i.getHostname(), i.getIpHost(),
                i.getDataInvestimento())).collect(Collectors.toList()));
    }
}
