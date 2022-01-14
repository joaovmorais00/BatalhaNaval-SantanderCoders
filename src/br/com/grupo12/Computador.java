package br.com.grupo12;

import java.util.Random;

public class Computador extends Jogador{

    Computador() {
        this.insereNavios();

    }


    @Override
    public void insereNavios() {

            int linhaNavioComputer;
            int colunaNavioComputer;
            Random sorteio = new Random();

            for (int i = 0; i < this.quantidadeNavios; i++) {
                linhaNavioComputer = sorteio.nextInt(10);
                colunaNavioComputer = sorteio.nextInt(10);

                while(this.tabuleiro.coordenadasTabuleiro[linhaNavioComputer][colunaNavioComputer] == Legendas.NAVIO_POSICIONADO.getLegenda()){
                    linhaNavioComputer = sorteio.nextInt(10);
                    colunaNavioComputer = sorteio.nextInt(10);
                }

                this.tabuleiro.coordenadasTabuleiro[linhaNavioComputer][colunaNavioComputer] = Legendas.NAVIO_POSICIONADO.getLegenda();

            }
        }

}
