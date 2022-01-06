package br.com.grupo12;

public enum Legendas {

    NAVIO_POSICIONADO('N'),
    TIRO_CERTEIRO('*'),
    TIRO_AGUA('-'),
    TIRO_CERTERIO_NAVIO_POSICIONADO('X'),
    TIRO_AGUA_NAVIO_POSICIONADO('n');

    private char legenda;

    Legendas(char legenda) {
        this.legenda = legenda;
    }

    public char getLegenda(){
        return this.legenda;
    }
}
