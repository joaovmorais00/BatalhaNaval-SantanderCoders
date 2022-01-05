package br.com.grupo12;

public class Tabuleiro {

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
                if (j == 0) linha = linha + Character.toString((char) (i + 65));
                else linha = linha + " ";
                linha = linha + " | ";
            }
            System.out.println(linha);
            System.out.println("---------------------------------------------");
            linha = "";
        }
    }
}
