package br.com.alura.praticandoJava.ControleSenha;

public class Usuario {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            System.out.println("A senha foi alterada com sucesso.");
        } else {
            System.out.println("A senha atual não confere. A senha não foi alterada.");
        }
    }
}
