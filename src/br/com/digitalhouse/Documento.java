package br.com.digitalhouse;

public class Documento implements Imprimivel{
    public String nome;
    public String tipo;


    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word... "+nome+"... "+tipo+"!");
    }
}
