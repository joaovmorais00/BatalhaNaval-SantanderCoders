package br.com.grupo12;

import java.util.Scanner;

public class Usuario extends Jogador{

    Usuario() {
        this.insereNavios();
        this.exibeNavios();
    }

    @Override
    public void atiraNavio() {

    }

    @Override
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

                this.tabuleiro.coordenadasTabuleiro[linhaNavio][colunaNavio] = Legendas.NAVIO_POSICIONADO.getLegenda();
            }

    }

    public void exibeNavios() {

            System.out.println("---------------------------------------------");
            System.out.println("                   USUÁRIO");
            System.out.println("---------------------------------------------");
            System.out.println("|   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
            System.out.println("---------------------------------------------");

            String linha = "";

            for (int i = 0; i < this.tabuleiro.coordenadasTabuleiro.length; i++) {
                linha = linha + "| ";
                for (int j = 0; j < this.tabuleiro.coordenadasTabuleiro.length + 1; j++) {
                    if (j == 0) {
                        linha = linha + LinhasTabuleiro.values()[i];
                    } else {

                        linha = linha + this.tabuleiro.coordenadasTabuleiro[i][j - 1];

                    }
                    linha = linha + " | ";
                }
                System.out.println(linha);
                System.out.println("---------------------------------------------");
                linha = "";
            }
        }
}
