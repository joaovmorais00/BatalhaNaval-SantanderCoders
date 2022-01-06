package br.com.grupo12;

public class Tabuleiro {

    char[][] coordenadasTabuleiro = new char[10][10];

    Tabuleiro() {
        this.inicializarTabuleiro();
    }

    /*
    public void mostraMatriz(){
        System.out.println("---------------------------------------------");
        System.out.println("                   JOGADOR");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");

        String linha = "";

        for (int i =0; i<10; i++){
            linha = linha + "| ";
            for(int j=0; j<11; j++) {
                if (j == 0) {
                    linha = linha + LinhasTabuleiro.values()[i];
                }
                else {
                    linha = linha + " ";
                }
                linha = linha + " | ";
            }
            System.out.println(linha);
            System.out.println("---------------------------------------------");
            linha = "";
        }
    }

     */

    public void inicializarTabuleiro() {
        for (int i =0; i<10; i++){

            for(int j=0; j<10; j++) {
              coordenadasTabuleiro[i][j] = ' ';
            }
        }
    }

    public void mostraMatriz(){
        System.out.println("---------------------------------------------");
        System.out.println("                   JOGADOR");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");

        String linha = "";

        for (int i =0; i<10; i++){
            linha = linha + "| ";
            for(int j=0; j<11; j++) {
                if (j == 0) {
                    linha = linha + LinhasTabuleiro.values()[i];
                }
                else {

                    linha = linha + coordenadasTabuleiro[i][j - 1];

                }
                linha = linha + " | ";
            }
            System.out.println(linha);
            System.out.println("---------------------------------------------");
            linha = "";
        }
    }

}