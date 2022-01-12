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
            int linhaNavio = 0;
            int colunaNavio = 0;

            Scanner input = new Scanner(System.in);

            System.out.println("Para começar o jogo, você deve escolher a posição dos seus navios no tabuleiro!");
            System.out.println("");

            for (int i = 0; i < this.quantidadeNavios; i++) {
                System.out.printf("Digite a coordenada em que ficará o navio %s: (Ex: A1, C3, D4) %n", (i + 1));
                coordenadaNavio = input.next();

                String[] coordenadasNavioSplit = coordenadaNavio.split("");
                linhaNavio = LinhasTabuleiro.valueOf(coordenadasNavioSplit[0].toUpperCase()).getValor();
                colunaNavio = Integer.parseInt(coordenadasNavioSplit[1]);
                while (linhaNavio<LinhasTabuleiro.A.getValor() || linhaNavio>LinhasTabuleiro.J.getValor() || colunaNavio<0 || colunaNavio>9 || this.tabuleiro.coordenadasTabuleiro[linhaNavio][colunaNavio] == Legendas.NAVIO_POSICIONADO.getLegenda()){
                    if(this.tabuleiro.coordenadasTabuleiro[linhaNavio][colunaNavio] == Legendas.NAVIO_POSICIONADO.getLegenda())
                        System.out.printf("\nUm navio já foi inserido nessa casa!\n");
                    else System.out.printf("\nEntrada inválida!\n");
                    System.out.printf("Digite a coordenada em que ficará o navio %s: (Ex: A1, C3, D4) %n", (i + 1));
                    coordenadaNavio = input.next();

                    coordenadasNavioSplit = coordenadaNavio.split("");
                    linhaNavio = LinhasTabuleiro.valueOf(coordenadasNavioSplit[0].toUpperCase()).getValor();
                    colunaNavio = Integer.parseInt(coordenadasNavioSplit[1]);
                }
                this.tabuleiro.coordenadasTabuleiro[linhaNavio][colunaNavio] = Legendas.NAVIO_POSICIONADO.getLegenda();
            }

    }


}
