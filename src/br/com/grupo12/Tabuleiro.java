package br.com.grupo12;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

    char[][] coordenadasTabuleiro = new char[10][10];

    Tabuleiro() {
        this.inicializaTabuleiro();
    }

    public void inicializaTabuleiro() {
        for (int i = 0; i < this.coordenadasTabuleiro.length; i++) {

            for (int j = 0; j < this.coordenadasTabuleiro.length; j++) {
                coordenadasTabuleiro[i][j] = ' ';
            }
        }
    }

    public void insereNavios() {

        String coordenadaNavio;
        int linhaNavio = 0;
        int colunaNavio = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Para começar o jogo, você deve escolher a posição dos seus navios no tabuleiro!");
        System.out.println("");

        for (int i = 0; i < 1; i++) {
            System.out.printf("Digite a coordenada em que ficará o navio %s: (Ex: A1, C3, D4) %n", (i + 1));
            coordenadaNavio = input.next();

            String[] coordenadasNavioSplit = coordenadaNavio.split("");
            linhaNavio = (int) LinhasTabuleiro.valueOf(coordenadasNavioSplit[0].toUpperCase()).getValor();
            colunaNavio = Integer.parseInt(coordenadasNavioSplit[1]);

            this.coordenadasTabuleiro[linhaNavio][colunaNavio] = Legendas.NAVIO_POSICIONADO.getLegenda();
        }
    }

        public void exibeNavios() {

            System.out.println("---------------------------------------------");
            System.out.println("                   USUÁRIO");
            System.out.println("---------------------------------------------");
            System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
            System.out.println("---------------------------------------------");

            String linha = "";

            for (int i = 0; i < this.coordenadasTabuleiro.length; i++) {
                linha = linha + "| ";
                for (int j = 0; j < this.coordenadasTabuleiro.length + 1; j++) {
                    if (j == 0) {
                        linha = linha + LinhasTabuleiro.values()[i];
                    } else {

                        linha = linha + this.coordenadasTabuleiro[i][j - 1];

                    }
                    linha = linha + " | ";
                }
                System.out.println(linha);
                System.out.println("---------------------------------------------");
                linha = "";
            }
        }



    /*
    public void exibeTabuleiro() {
        System.out.println("---------------------------------------------");
        System.out.println("                   JOGADOR");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("---------------------------------------------");

        String linha = "";

        for (int i = 0; i < 10; i++) {
            linha = linha + "| ";
            for (int j = 0; j < 11; j++) {
                if (j == 0) {
                    linha = linha + LinhasTabuleiro.values()[i];
                } else {

                    linha = linha + coordenadasTabuleiro[i][j - 1];

                }
                linha = linha + " | ";
            }
            System.out.println(linha);
            System.out.println("---------------------------------------------");
            linha = "";
        }
    }

     */

    // Metodo preencher navios jogador

    /*
    public void insereNavios() {
        String coordenadaNavio;
        int linhaNavio = 0;
        int colunaNavio = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Para começar o jogo, você deve escolher a posição dos seus navios no tabuleiro!");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a coordenada em que ficará o navio %s: (Ex: A1, C3, D4) %n", (i + 1));
            coordenadaNavio = input.next();

            String[] coordenadasNavioSplit = coordenadaNavio.split("");
            linhaNavio = (int) LinhasTabuleiro.valueOf(coordenadasNavioSplit[0].toUpperCase()).getValor();
            colunaNavio = Integer.parseInt(coordenadasNavioSplit[1]);

            coordenadasTabuleiro[linhaNavio][colunaNavio] = Legendas.NAVIO_POSICIONADO.getLegenda();
        }
    }

     */

    // Metodo preencher navios computador

    /*
    public void insereNaviosComputador() {
        int linhaNavioComputer;
        int colunaNavioComputer;
        int[] validaLinha = new int[3];
        int[] validaColuna = new int[3];
        Random sorteio = new Random();

        for (int i = 0; i < 3; i++) {
            linhaNavioComputer = sorteio.nextInt(10);
            colunaNavioComputer = sorteio.nextInt(10);
            validaLinha[i] = linhaNavioComputer;
            validaColuna[i] = colunaNavioComputer;
            // System.out.println(linhaNavioComputer);
            // System.out.println(colunaNavioComputer);
            coordenadasTabuleiro[linhaNavioComputer][colunaNavioComputer] = Legendas.NAVIO_POSICIONADO.getLegenda();

            for (int anterior = 0; anterior < i; anterior++) {

                boolean b = (validaLinha[i] == validaLinha[anterior]) && (validaColuna[i] == validaColuna[anterior]);
                if (b) {
                        linhaNavioComputer = sorteio.nextInt(10);
                        colunaNavioComputer = sorteio.nextInt(10);
                        // System.out.println(linhaNavioComputer);
                        // System.out.println(colunaNavioComputer);
                        coordenadasTabuleiro[linhaNavioComputer][colunaNavioComputer] = Legendas.NAVIO_POSICIONADO.getLegenda();

                }
            }
        }
    }

     */
}
