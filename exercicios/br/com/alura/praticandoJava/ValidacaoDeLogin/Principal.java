package br.com.alura.praticandoJava.ValidacaoDeLogin;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Estudante estudante = new Estudante("aluno2025", "escola@123");

        int tentativas = 3;
        boolean senhaCorreta = false;

        while (tentativas >= 0 && !senhaCorreta) {
            System.out.println("Insira o login: ");
            String login = leitura.nextLine();
            System.out.println("Insira a senha: ");
            String senha = leitura.nextLine();

            if (!estudante.validarSenha(login, senha)) {
                System.out.printf("Login ou senha incorreta. Tentativas restantes: %d%n", tentativas);
            } else {
                System.out.println("Login bem-sucedido!");
                senhaCorreta = true;
            }

            tentativas--;
        }
    }
}
