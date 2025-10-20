package br.com.alura.praticandoJava.SistemaDePontosParaAlunos;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    private void atualizarNivel() {
        this.nivel = (this.pontos / 100) + 1;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;
        atualizarNivel();
    }

    public void exibirStatus() {
        System.out.printf("""
                Nome do aluno: %s
                Pontos totais: %d
                Nível atual: %d
                %n""", this.nome, this.pontos, this.nivel);
    }
}
