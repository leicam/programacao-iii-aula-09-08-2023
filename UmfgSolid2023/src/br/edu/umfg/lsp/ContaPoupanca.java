package br.edu.umfg.lsp;

public class ContaPoupanca {
    private String cpf;
    private String nome;
    private double saldo;

    public ContaPoupanca(String cpf, String nome, double saldo) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
    }

    void debitar(double valor) throws Exception {
        if (valor <= 0)
            throw new Exception("Valor inválido");

        if (this.saldo - valor < 0)
            throw new Exception("Saldo não pode ser negativo");

        //this.saldo = this.saldo - valor;
        this.saldo -= valor;
    }

    void creditar(double valor) throws Exception{
        if (valor <= 0)
            throw new Exception("Valor inválido");

        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.saldo;
    }
}
