package br.edu.umfg.isp;

public class Renegade implements Carro{
    @Override
    public void acelerar() {
        System.out.println("Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }

    @Override
    public void ligarQuatroPorQuatro() throws Exception {
        throw new Exception("Metodo não implementado!");
    }
}