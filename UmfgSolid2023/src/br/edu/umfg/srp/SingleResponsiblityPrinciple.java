package br.edu.umfg.srp;

public class SingleResponsiblityPrinciple {
    public static void Execute(){
        ExecuteOld();
        ExecuteNew();
    }
    private static void ExecuteNew() {
        Estagiario estagiario = new Estagiario(
                "New Estagiario Um",
                1500.00
        );
        Vendedor vendedor = new Vendedor(
                "New Vendedor Um",
                3000.00,
                50000.00
        );

        System.out.println(estagiario.toString());
        System.out.println(vendedor.toString());
    }

    private static void ExecuteOld() {
        FuncionarioSrp funcionarioUm = new FuncionarioSrp(
                "Estagiario Um", 1500.00,
                TipoFuncionarioSrp.Estagiario);

        FuncionarioSrp funcionarioDois = new FuncionarioSrp(
                "Vendedor Um", 3000.00,
                TipoFuncionarioSrp.Vendedor);

        System.out.println(funcionarioUm.toString());
        System.out.println(funcionarioDois.toString());
    }
}
