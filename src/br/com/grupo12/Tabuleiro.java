package br.com.grupo12;

public class Tabuleiro {

    public char[][] coordenadasTabuleiro = new char[10][10];

    Tabuleiro() {
        this.inicializaTabuleiro();
    }

    private void inicializaTabuleiro() {
        for (int i = 0; i < this.coordenadasTabuleiro.length; i++) {

            for (int j = 0; j < this.coordenadasTabuleiro.length; j++) {
                coordenadasTabuleiro[i][j] = ' ';
            }
        }
    }

    public boolean pertenceLinhaTabuleiro(String coordenada0) {

        for (LinhasTabuleiro linha : LinhasTabuleiro.values()) {
            if(coordenada0.equalsIgnoreCase(linha.name())) {
                return true;
            }
        }
        return false;
    }
    public boolean pertenceColunaTabuleiro(String coordenada1) {

        return coordenada1.matches("^[0-9]");

    }
}
