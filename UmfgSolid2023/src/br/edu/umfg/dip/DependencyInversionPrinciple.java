package br.edu.umfg.dip;

public class DependencyInversionPrinciple {
    public static void execute(){
        executeOld();
        executeNew();
    }

    private static void executeOld() {
        Venda venda = new Venda();

        venda.setDescricaoProduto("PRODUTO UM");
        venda.setValorProduto(10.99f);
    }

    private static void executeNew() {
        ProdutoRefatorado produto = new ProdutoRefatorado(
                "PRODUTO DOIS",
                13.99f
        );

        VendaRefatorada venda = new VendaRefatorada(produto);
        System.out.println(venda.toString());
    }
}
