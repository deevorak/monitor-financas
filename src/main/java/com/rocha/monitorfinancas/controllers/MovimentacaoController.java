package com.rocha.monitorfinancas.controllers;

import com.rocha.monitorfinancas.model.dto.DespesaDTO;
import com.rocha.monitorfinancas.model.dto.ReceitaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @PostMapping("/receita")
    public ResponseEntity<Object> receita(@RequestBody ReceitaDTO receita) {


        return ResponseEntity.ok().build();
    }

    @PostMapping("/despesa")
    public ResponseEntity<Object> despesa(@RequestBody DespesaDTO despesa) {


        return ResponseEntity.ok().build();
    }


}
