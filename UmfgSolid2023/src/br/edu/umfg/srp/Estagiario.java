package br.edu.umfg.srp;

public class Estagiario extends AbstractFuncionario{

    public Estagiario(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    TipoFuncionarioSrp getTipoFuncionario() {
        return TipoFuncionarioSrp.Estagiario;
    }
}
