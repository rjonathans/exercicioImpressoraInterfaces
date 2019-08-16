package br.com.digitalhouse;

public class Contrato extends Impressora implements Imprimivel {

    private String nome;
    private String tipo;

    public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato ... "+nome+"... muito legal do tipo... "+tipo);
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
