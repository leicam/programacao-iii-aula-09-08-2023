package br.edu.umfg.ocp;

public class DocumentoTxt extends AbstractDocumento{
    @Override
    void imprimir() {
        System.out.println("Imprimindo arquivo .txt");
    }
}
