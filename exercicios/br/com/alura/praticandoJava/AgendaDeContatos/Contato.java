package br.com.alura.praticandoJava.AgendaDeContatos;

public class Contato {
    private final String nome;
    private final String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
