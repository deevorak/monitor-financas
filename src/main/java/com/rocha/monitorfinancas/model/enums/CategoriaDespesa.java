package com.rocha.monitorfinancas.model.enums;

public enum CategoriaDespesa {
    ALUGUEL("Aluguel"),
    CONDOMINIO("Condomínio"),
    LUZ("Luz"),
    AGUA("Água"),
    TELEFONE("Telefone"),
    INTERNET("Internet"),
    ALIMENTACAO("Alimentação"),
    TRANSPORTE("Transporte"),
    EDUCACAO("Educação"),
    SAUDE("Saúde"),
    LAZER("Lazer"),
    VESTUARIO("Vestuário"),
    HIGIENE("Higiene"),
    EMBELEZAMENTO("Embelezamento"),
    IMPOSTOS("Impostos"),
    SEGURO("Seguro"),
    INVESTIMENTO("Investimento"),
    EMPRESTIMO("Empréstimo"),
    DOACAO("Doação"),
    OUTROS("Outros");

    private String descricao;

    CategoriaDespesa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
