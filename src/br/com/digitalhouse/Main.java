package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contrato contratoLegal = new Contrato("William","PDF");
        Foto fotoSelfie = new Foto("Minha Foto","JPG");
        Documento documentoWord = new Documento("papelada","Word");
        Impressora konica = new Impressora();

        konica.adicionarUmImprimivel(contratoLegal);
        konica.adicionarUmImprimivel(fotoSelfie);
        konica.adicionarUmImprimivel(documentoWord);
        konica.imprimirTudo();

    }
}
