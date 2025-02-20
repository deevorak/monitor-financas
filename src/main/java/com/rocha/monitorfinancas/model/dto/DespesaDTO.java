package com.rocha.monitorfinancas.model.dto;

public record DespesaDTO(double valor, String descricao, CategoriaDTO categoria, String data) {
}
