package br.com.grupo12;

import java.util.Random;

public class Computador extends Jogador{

    Computador() {
        this.insereNavios();
        this.exibeNavios(false);
    }


    @Override
    public void insereNavios() {

            int linhaNavioComputer;
            int colunaNavioComputer;
//            int[] validaLinha = new int[3];
//            int[] validaColuna = new int[3];
            Random sorteio = new Random();

            for (int i = 0; i < this.quantidadeNavios; i++) {
                linhaNavioComputer = sorteio.nextInt(10);
                colunaNavioComputer = sorteio.nextInt(10);

                while(this.tabuleiro.coordenadasTabuleiro[linhaNavioComputer][colunaNavioComputer] == Legendas.NAVIO_POSICIONADO.getLegenda()){
                    linhaNavioComputer = sorteio.nextInt(10);
                    colunaNavioComputer = sorteio.nextInt(10);
                }

                this.tabuleiro.coordenadasTabuleiro[linhaNavioComputer][colunaNavioComputer] = Legendas.NAVIO_POSICIONADO.getLegenda();

//                validaLinha[i] = linhaNavioComputer;
//                validaColuna[i] = colunaNavioComputer;
            /*System.out.println(linhaNavioComputer);
            System.out.println(colunaNavioComputer);*/

//                for (int anterior = 0; anterior < i; anterior++) {
//
//                    boolean b = (validaLinha[i] == validaLinha[anterior]) && (validaColuna[i] == validaColuna[anterior]);
//                    if (b) {
//                        linhaNavioComputer = sorteio.nextInt(10);
//                        colunaNavioComputer = sorteio.nextInt(10);
//                        /*System.out.println(linhaNavioComputer);
//                        System.out.println(colunaNavioComputer);*/
//                        this.tabuleiro.coordenadasTabuleiro[linhaNavioComputer][colunaNavioComputer] = Legendas.NAVIO_POSICIONADO.getLegenda();
//
//                    }
//                }
            }
        }

}
