package br.edu.umfg.dip;

public class Venda {
    private Produto produto = new Produto();

    public void setDescricaoProduto(String descricao) {
        this.produto.setDescricao(descricao);
    }

    public void setValorProduto(Float valor) {
        this.produto.setValor(valor);
    }
}
