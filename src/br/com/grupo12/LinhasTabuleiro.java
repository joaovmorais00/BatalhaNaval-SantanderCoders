package br.com.grupo12;

public enum LinhasTabuleiro {

    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7),
    I(8),
    J(9);

    private int valor;

    LinhasTabuleiro(int valor) {
        this.valor = valor;
    }
    public int getValor(){
        return this.valor;
    }
}
