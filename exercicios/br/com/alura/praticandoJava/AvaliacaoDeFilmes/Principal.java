package br.com.alura.praticandoJava.AvaliacaoDeFilmes;

public class Principal {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(6);
        matrix.verificarAvaliacoes();
    }
}
