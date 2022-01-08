package br.com.grupo12;

public abstract class Jogador {

    public Tabuleiro tabuleiro;
    public int quantidadeNavios;

    Jogador() {
        this.tabuleiro = new Tabuleiro();
        this.quantidadeNavios = 3;
    }

    public abstract void atiraNavio();

    public abstract void insereNavios();

}
