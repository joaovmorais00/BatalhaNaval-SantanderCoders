package br.com.grupo12;

import java.util.Scanner;

public class Usuario extends Jogador{

    Usuario() {
        this.insereNavios();
//        this.exibeNavios();
    }

    @Override
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

                this.tabuleiro.coordenadasTabuleiro[linhaNavio][colunaNavio] = Legendas.NAVIO_POSICIONADO.getLegenda();
            }

    }


}
