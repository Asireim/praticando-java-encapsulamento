package br.com.alura.praticandoJava.AvaliacaoDeFilmes;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Integer> avaliacoes = new ArrayList<Integer>();

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            this.avaliacoes.add(nota);
        } else {
            System.out.println("Apenas é permitido inserir avaliações entre 1 e 5.");
        }
    }

    public void verificarAvaliacoes() {
        int total = 0;
        for (int i = 0; i < avaliacoes.size(); i++) {
            total += avaliacoes.get(i);
        }

        double calculo = (double) total / avaliacoes.size();
        System.out.printf("Média de avaliações para %s: %.2f", this.titulo, calculo);
    }
}
