package br.edu.umfg.isp;

public class RenegadeRefatorado implements CarroRefatorado{
    @Override
    public void acelerar() {
        System.out.println("Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Freando!");
    }
}
