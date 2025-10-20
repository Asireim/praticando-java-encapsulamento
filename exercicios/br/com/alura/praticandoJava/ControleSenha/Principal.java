package br.com.alura.praticandoJava.ControleSenha;

public class Principal {
    public static void main(String[] args) {
        Usuario user = new Usuario("123456");
        user.setSenha("123456", "abc123");

        Usuario user2 = new Usuario("123456");
        user.setSenha("12345", "abc123");
    }
}
