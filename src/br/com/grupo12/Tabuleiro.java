package br.com.grupo12;

public class Tabuleiro {

    public char[][] coordenadasTabuleiro = new char[10][10];

    Tabuleiro() {
        this.inicializaTabuleiro();
    }

    private void inicializaTabuleiro() {
        for (int i = 0; i < this.coordenadasTabuleiro.length; i++) {

            for (int j = 0; j < this.coordenadasTabuleiro.length; j++) {
                coordenadasTabuleiro[i][j] = ' ';
            }
        }
    }
}
