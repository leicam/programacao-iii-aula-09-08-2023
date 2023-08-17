package br.edu.umfg.isp;

public class CommanderRefatorado implements CarroComQuatroPorQuatro {
    @Override
    public void acionarQuatroPorQuatro() {
        System.out.println("Acionando 4x4!");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("Freando!");
    }
}
