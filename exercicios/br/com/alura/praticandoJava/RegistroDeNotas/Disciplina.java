package br.com.alura.praticandoJava.RegistroDeNotas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Double> notas = new ArrayList<Double>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.notas.add(nota);
        } else {
            System.out.printf("Nota inválida ignorada: %.1f%n", nota);
        }
    }

    public void retornarMedia() {
        double soma = 0;

        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }

        double media = (soma / notas.size());

        System.out.printf("""
                Total de notas válidas: %d
                Média em %s: %.2f
                %n""", this.notas.size(), this.nome, media);
    }
}
