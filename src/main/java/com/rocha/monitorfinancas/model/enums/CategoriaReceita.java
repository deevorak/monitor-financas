package com.rocha.monitorfinancas.model.enums;

public enum CategoriaReceita {

    SALARIO("Salário"),
    RENDIMENTO("Rendimento"),
    INVESTIMENTO("Investimento"),
    ALUGUEL("Aluguel"),
    EMPRESTIMO("Empréstimo"),
    DOACAO("Doação"),
    PREMIO("Prêmio"),
    OUTROS("Outros");

    private String descricao;

    CategoriaReceita(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
