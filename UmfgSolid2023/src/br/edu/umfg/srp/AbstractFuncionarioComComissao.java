package br.edu.umfg.srp;

public abstract class AbstractFuncionarioComComissao
        extends AbstractFuncionario{

    private Double totalVendas;

    protected AbstractFuncionarioComComissao(String nome, Double salario,
                                             Double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    abstract Double getComissao(Double valorTotalVendas);

    @Override
    public String toString() {
        return super.toString() + " | " + getComissao(this.totalVendas);
    }
}
