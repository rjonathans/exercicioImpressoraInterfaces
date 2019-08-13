package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public abstract class Impressora implements Imprimivel{

    private Contrato contratoLegal;
    private Foto fotoSelfie;
    private Documento docWord;

    private List<Imprimivel> imprimiveis = new ArrayList<>();

    public void adicionarUmImprimivel(Imprimivel umImprimivel){
        imprimiveis.add(umImprimivel);
    }

    public void imprimirTudo() {
        for (int i = 0; i < imprimiveis.size(); i++) {
            System.out.println(imprimiveis.get(i).toString());
        }
    }

}
