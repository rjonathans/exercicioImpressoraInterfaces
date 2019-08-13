package br.com.digitalhouse;

public class Contrato extends Impressora implements Imprimivel {

    private String nome;
    private String tipo;

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato ... "+nome+"... muito legal do tipo... "+tipo);
    }
}
