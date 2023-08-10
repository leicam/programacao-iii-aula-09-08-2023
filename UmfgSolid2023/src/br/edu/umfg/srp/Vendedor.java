package br.edu.umfg.srp;

public class Vendedor extends AbstractFuncionarioComComissao {
    protected Vendedor(String nome, Double salario, Double totalVendas) {
        super(nome, salario, totalVendas);
    }

    @Override
    TipoFuncionarioSrp getTipoFuncionario() {
        return TipoFuncionarioSrp.Vendedor;
    }

    @Override
    Double getComissao(Double valorTotalVendas) {
        return valorTotalVendas * 0.02;
    }
}
