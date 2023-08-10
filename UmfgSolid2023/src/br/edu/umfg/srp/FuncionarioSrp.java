package br.edu.umfg.srp;

public class FuncionarioSrp {
    private String nome;
    private Double salario;
    private TipoFuncionarioSrp tipoFuncionario;

    public FuncionarioSrp(String nome, Double salario,
                          TipoFuncionarioSrp tipoFuncionario) {
        this.nome = nome;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public Double getComissao(Double totalVendasBruto){
        if (TipoFuncionarioSrp.Vendedor.equals(this.tipoFuncionario))
            return 0.0;
        else if (TipoFuncionarioSrp.Gerente.equals(this.tipoFuncionario))
            return totalVendasBruto * 0.3;

        return totalVendasBruto * 0.2;
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.salario + " | " + this.tipoFuncionario;
    }
}
