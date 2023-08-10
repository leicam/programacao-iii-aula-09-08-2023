package br.edu.umfg.srp;

public abstract class AbstractFuncionario {
    private String nome;
    private Double salario;

    protected AbstractFuncionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    abstract TipoFuncionarioSrp getTipoFuncionario();

    @Override
    public String toString() {
        return this.nome + " | " + this.salario + " | " + getTipoFuncionario();
    }
}
