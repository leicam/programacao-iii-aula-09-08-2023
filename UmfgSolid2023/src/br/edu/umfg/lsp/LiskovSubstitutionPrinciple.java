package br.edu.umfg.lsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LiskovSubstitutionPrinciple {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static void execute() throws Exception{
        executeOld();
        executeNew();
    }

    private static void executeOld() throws Exception {
        ContaCorrente contaCorrente = new ContaCorrente("111.111.111-11",
                "PESSOA UM",
                0.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca("222.222.222-22",
                "PESSOA DOIS",
                0.0);

        creditar(contaCorrente);
        creditar(contaPoupanca);

        System.out.println(contaPoupanca.toString());
        System.out.println(contaCorrente.toString());
    }

    //sobrecarga de método
    private static void creditar(ContaCorrente contaCorrente) throws Exception {
        System.out.println("Informe o valor para créditar na conta:");
        contaCorrente.creditar(Double.parseDouble(reader.readLine()));
    }

    private static void creditar(ContaPoupanca contaPoupanca) throws Exception{
        System.out.println("Informe o valor para créditar na conta:");
        contaPoupanca.creditar(Double.parseDouble(reader.readLine()));
    }

    private static void executeNew() throws Exception {
        ContaCorrenteRefatorada contaCorrente = new ContaCorrenteRefatorada("111.111.111-11",
                "PESSOA TRES",
                0.0);

        ContaPoupancaRefatorada contaPoupanca = new ContaPoupancaRefatorada("222.222.222-22",
                "PESSOA QUATRO",
                0.0);

        creditarRefatorado(contaCorrente);
        creditarRefatorado(contaPoupanca);

        System.out.println(contaPoupanca.toString());
        System.out.println(contaCorrente.toString());
    }

    private static void creditarRefatorado(AbstractConta conta) throws Exception {
        System.out.println("Informe o valor para créditar na conta:");
        conta.creditar(Double.parseDouble(reader.readLine()));
    }
}
