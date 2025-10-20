package br.com.alura.praticandoJava.CadastroProdutosComValidacao;

public class Principal {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse");
        mouse.setPreco(-59.99);
        System.out.printf("Produto: %s - Preço: R$ %.2f%n", mouse.getNome(), mouse.getPreco());

        Produto teclado = new Produto("Telcado");
        teclado.setPreco(49.99);
        System.out.printf("Produto: %s - Preço: R$ %.2f", teclado.getNome(), teclado.getPreco());
    }
}
