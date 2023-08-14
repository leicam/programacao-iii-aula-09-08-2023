package br.edu.umfg.ocp;

import java.util.ArrayList;
import java.util.List;

public class OpenClosedPrinciple {
    public static void Execute(){
        ExecuteOld();
        ExecuteNew();
    }

    private static void ExecuteNew() {
        System.out.println("NEW");

        ArrayList<AbstractDocumento> lista =
                new ArrayList<AbstractDocumento>();
        DocumentoPdf documentoPdf = new DocumentoPdf();
        DocumentoTxt documentoTxt = new DocumentoTxt();
        DocumentoXls documentoXls = new DocumentoXls();

        lista.add(documentoPdf);
        lista.add(documentoTxt);
        lista.add(documentoXls);

        imprimirListaNew(lista);
    }

    private static void imprimirListaNew(ArrayList<AbstractDocumento>  lista) {
        for (AbstractDocumento documento : lista){
            System.out.println("Imprimindo arquivo: ");
            documento.imprimir();
        }
    }

    private static void ExecuteOld() {
        System.out.println("OLD");

        ArrayList<AbstractDocumento> lista =
                new ArrayList<AbstractDocumento>();
        DocumentoPdf documentoPdf = new DocumentoPdf();
        DocumentoTxt documentoTxt = new DocumentoTxt();
        DocumentoXls documentoXls = new DocumentoXls();

        lista.add(documentoPdf);
        lista.add(documentoTxt);
        lista.add(documentoXls);

        imprimirListaOld(lista);
    }

    private static void imprimirListaOld(ArrayList<AbstractDocumento> lista) {
        for( AbstractDocumento documento : lista) {
            if (documento instanceof DocumentoTxt) {
                System.out.println("Imprimindo TXT: ");
                documento.imprimir();
            }
            else if (documento instanceof  DocumentoPdf) {
                System.out.println("Imprimindo PDF: ");
                documento.imprimir();
            }
        }
    }
}
