package br.com.grupo12;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro();
       // tab.mostraMatriz();

       tab.mostraMatriz();

        //tab.preencherNavios();
        tab.preencherNaviosComputador();
        tab.mostraMatriz();

    }
}
