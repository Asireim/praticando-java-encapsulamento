package br.com.alura.praticandoJava.ValidacaoDeLogin;

public class Estudante {
    private String login;
    private String senha;

    public Estudante(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String login, String senha) {
            if (this.login.equals(login) && this.senha.equals(senha)) {
                return true;
            } else {
                return false;
            }
    }
}
