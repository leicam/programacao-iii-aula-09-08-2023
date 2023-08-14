package br.edu.umfg.ocp;

public class DocumentoPdf extends AbstractDocumento {
    @Override
    void imprimir() {
        System.out.println("Imprimindo arquivo .PDF");
    }
}
