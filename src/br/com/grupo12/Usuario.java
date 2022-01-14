package br.com.grupo12;

import java.util.Scanner;

public class Usuario extends Jogador{

    Usuario() {
        this.insereNavios();
        this.exibeNavios(true);
    }

    @Override
    public void insereNavios() {

            String coordenadaNavio;
            int linhaNavio;
            int colunaNavio;
            boolean entradaValida;

            Scanner input = new Scanner(System.in);

            System.out.println("Para começar o jogo, você deve escolher a posição dos seus navios no tabuleiro!");
            System.out.println("");

            for (int i = 0; i < this.quantidadeNavios; i++) {

                entradaValida = false;

                while (entradaValida == false){

                    System.out.printf("Digite a coordenada em que ficará o navio %s: (Ex: A1, C3, D4) %n", (i + 1));
                    coordenadaNavio = input.next();

                    String[] coordenadaNavioSplit = coordenadaNavio.split("");

                    /*
                    if(coordenadaNavioSplit.length != 2) {
                        System.out.printf("\nEntrada inválida!\n");
                        continue;
                    }
                    else if(!this.tabuleiro.pertenceLinhaTabuleiro(coordenadaNavioSplit[0])) {
                        System.out.printf("\nEntrada inválida!\n");
                        continue;
                    }
                    else if(!this.tabuleiro.pertenceColunaTabuleiro(coordenadaNavioSplit[1])) {
                        System.out.printf("\nEntrada inválida!\n");
                        continue;
                    }

                     */

                    if (!this.validaCoordenada(coordenadaNavioSplit)) {
                        continue;
                    }

                    linhaNavio = LinhasTabuleiro.valueOf(coordenadaNavioSplit[0].toUpperCase()).getValor();
                    colunaNavio = Integer.parseInt(coordenadaNavioSplit[1]);

                    if(this.tabuleiro.coordenadasTabuleiro[linhaNavio][colunaNavio] == Legendas.NAVIO_POSICIONADO.getLegenda()) {
                        System.out.printf("\nUm navio já foi inserido nessa casa!\n");
                        continue;
                    } else {
                        this.tabuleiro.coordenadasTabuleiro[linhaNavio][colunaNavio] = Legendas.NAVIO_POSICIONADO.getLegenda();
                        entradaValida = true;
                    }

                }
            }
    }

    public boolean validaCoordenada(String[] coordenadaNavioSplit) {

        if(coordenadaNavioSplit.length != 2) {
            System.out.printf("\nEntrada inválida!\n");
            return false;
        }
        else if(!this.tabuleiro.pertenceLinhaTabuleiro(coordenadaNavioSplit[0])) {
            System.out.printf("\nEntrada inválida!\n");
            return false;
        }
        else if(!this.tabuleiro.pertenceColunaTabuleiro(coordenadaNavioSplit[1])) {
            System.out.printf("\nEntrada inválida!\n");
            return false;
        }
        return true;
    }

}
