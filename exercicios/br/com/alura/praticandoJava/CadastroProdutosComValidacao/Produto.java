package br.com.alura.praticandoJava.CadastroProdutosComValidacao;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Não é permitido um preço negativo.");
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }
}
