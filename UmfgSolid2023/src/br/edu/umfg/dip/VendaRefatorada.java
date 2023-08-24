package br.edu.umfg.dip;

public class VendaRefatorada {

    private ProdutoRefatorado produto;

    public VendaRefatorada(ProdutoRefatorado produto){
        this.produto = produto;
    }

    @Override
    public String toString() {
        return this.produto.toString();
    }
}
