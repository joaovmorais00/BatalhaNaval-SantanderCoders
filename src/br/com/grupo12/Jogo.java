package br.com.grupo12;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Usuario jogador = new Usuario();
    private Computador computador = new Computador();

    public void startJogo(){
        while(jogador.quantidadeNavios !=0 || computador.quantidadeNavios !=0){
            this.atiraUsuario();
            jogador.exibeNavios(true);

            if(computador.quantidadeNavios ==0) break;

            this.atiraComputador();
            computador.exibeNavios(false);
        }
        //FINAL DO JOGO
        if(computador.quantidadeNavios==0) {
            System.out.printf("O Usuário foi o vencedor!\n\n");
        }
        else {
            System.out.printf("O Computador foi o vencedor!\n\n");
        }

        jogador.exibeNavios(true);
        computador.exibeNavios(false);
    }

    private void atiraUsuario() {
        String coordenadaTiro;
        int linha = 0;
        int coluna = 0;
        Scanner input = new Scanner(System.in);

        Boolean invalidInput = true;

        while (invalidInput==true){
            System.out.printf("\nDigite a posição do tabuleiro em que você deseja atirar:\n\n");
            coordenadaTiro = input.next();
            String[] coordenadasNavioSplit = coordenadaTiro.split("");
            linha = LinhasTabuleiro.valueOf(coordenadasNavioSplit[0].toUpperCase()).getValor();
            coluna = Integer.parseInt(coordenadasNavioSplit[1]);
            if(linha<LinhasTabuleiro.A.getValor() || linha>LinhasTabuleiro.J.getValor() || coluna<0 || coluna>9){
                System.out.printf("\nEntrada inválida!");
                continue;
            }
            switch(this.computador.tabuleiro.coordenadasTabuleiro[linha][coluna]){
                case 'N': case 'X': case 'n':
                    switch(this.jogador.tabuleiro.coordenadasTabuleiro[linha][coluna]){
                        case ' ':
                            System.out.println("Tiro certeiro!");
                            this.jogador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_CERTEIRO.getLegenda();
                            this.computador.quantidadeNavios--;
                            invalidInput = false;
                            break;
                        case 'N':
                            System.out.println("Tiro certeiro!");
                            this.jogador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_CERTERIO_NAVIO_POSICIONADO.getLegenda();
                            this.computador.quantidadeNavios--;
                            invalidInput = false;
                            break;
                        default:
                            System.out.println("Você já atirou nessa posição do tabuleiro!");
                            break;
                    }
                    break;
                case '*': case ' ': case '-':
                    switch(this.jogador.tabuleiro.coordenadasTabuleiro[linha][coluna]){
                        case ' ':
                            System.out.println("Tiro na água!");
                            this.jogador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_AGUA.getLegenda();
                            invalidInput = false;
                            break;
                        case 'N':
                            System.out.println("Tiro na água!");
                            this.jogador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_AGUA_NAVIO_POSICIONADO.getLegenda();
                            invalidInput = false;
                            break;
                        default:
                            System.out.println("Você já atirou nessa posição do tabuleiro!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Entrada inválida");
                    break;
            }
        }
    }

    private void atiraComputador() {
        int linha = -1;
        int coluna = -1;
        Random sorteio = new Random();

        Boolean invalidInput = true;

        while (invalidInput==true){
            linha = sorteio.nextInt(10);
            coluna = sorteio.nextInt(10);
            switch(this.jogador.tabuleiro.coordenadasTabuleiro[linha][coluna]){
                case 'N': case 'X': case 'n':
                    switch(this.computador.tabuleiro.coordenadasTabuleiro[linha][coluna]){
                        case ' ':
                            System.out.println("Tiro certeiro do computador!");
                            this.computador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_CERTEIRO.getLegenda();
                            invalidInput = false;
                            break;
                        case 'N':
                            System.out.println("Tiro certeiro do computador!");
                            this.computador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_CERTERIO_NAVIO_POSICIONADO.getLegenda();
                            invalidInput = false;
                            break;
                        default:
                            System.out.println("O computador já atirou nessa posição do tabuleiro!");
                            break;
                    }
                    break;
                case '*': case ' ': case '-':
                    switch(this.computador.tabuleiro.coordenadasTabuleiro[linha][coluna]){
                        case ' ':
                            System.out.println("Tiro na água do computador!");
                            this.computador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_AGUA.getLegenda();
                            invalidInput = false;
                            break;
                        case 'N':
                            System.out.println("Tiro na água do computador!");
                            this.computador.tabuleiro.coordenadasTabuleiro[linha][coluna] = Legendas.TIRO_AGUA_NAVIO_POSICIONADO.getLegenda();
                            invalidInput = false;
                            break;
                        default:
                            System.out.println("O computador já atirou nessa posição do tabuleiro!");
                            break;
                    }
                    break;
            }
        }
    }
}
