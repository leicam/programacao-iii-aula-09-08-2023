package br.edu.umfg.isp;

public class Commander implements Carro {
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando!");
    }

    @Override
    public void ligarQuatroPorQuatro() {
        System.out.println("Ligando 4x4");
    }
}
