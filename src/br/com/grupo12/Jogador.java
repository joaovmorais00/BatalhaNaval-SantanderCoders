package br.com.grupo12;

public abstract class Jogador {

    public Tabuleiro tabuleiro;
    public int quantidadeNavios;

    Jogador() {
        this.tabuleiro = new Tabuleiro();
        this.quantidadeNavios = 10;
    }


    public abstract void insereNavios();

    public void exibeNavios(Boolean usuario) {

        System.out.println("---------------------------------------------");

        if(usuario==true){
            System.out.println("                   USUÁRIO");
        }else{
            System.out.println("                 COMPUTADOR");
        }

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
