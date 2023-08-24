package br.edu.umfg.dip;

public class ProdutoRefatorado {
    private String descricao;
    private Float valor;

    public ProdutoRefatorado(String descricao, Float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "DESCRICAO: " + this.descricao + " | VALOR: " + this.valor;
    }
}