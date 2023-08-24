package br.edu.umfg.isp;

public class InterfaceSegregationPrinciple {
    public static void execute() throws Exception {
        executeOld();
        executeNew();
    }

    private static void executeNew() {
        RenegadeRefatorado renegade = new RenegadeRefatorado();
        CommanderRefatorado commander = new CommanderRefatorado();

        System.out.println("Renegade:");
        renegade.acelerar();
        renegade.frear();

        System.out.println("Commander: ");
        commander.acelerar();
        commander.frear();
        commander.acionarQuatroPorQuatro();
    }

    private static void executeOld() throws Exception {
        Renegade renegade = new Renegade();
        Commander commander = new Commander();

        System.out.println("Renegade: ");
        renegade.acelerar();
        renegade.frear();
        //renegade.ligarQuatroPorQuatro();

        System.out.println("Commander: ");
        commander.acelerar();
        commander.frear();
        commander.ligarQuatroPorQuatro();
    }
}
