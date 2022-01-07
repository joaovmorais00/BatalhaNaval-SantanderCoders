package br.com.grupo12;

import java.util.Scanner;

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

    // Metodo preencher navios jogador

    public void preencherNavios(){
        int linhaNavio = 0;
        int colunaNavio = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Para começar o jogo, você deve escolher a posição dos seus navios no tabuleiro!");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a linha em que ficará o navio %s: (Ex: 1, 3, 4) %n",(i + 1));
            linhaNavio = input.nextInt();
            System.out.printf("Digite a coluna em que ficará o navio %s: (EX: 0, 2, 5) %n", (i + 1));
            colunaNavio = input.nextInt();
            coordenadasTabuleiro [linhaNavio][colunaNavio] = 'N';
        }





    }

}
