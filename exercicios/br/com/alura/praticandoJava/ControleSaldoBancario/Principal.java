package br.com.alura.praticandoJava.ControleSaldoBancario;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana", 0);
        System.out.println("Efetuando depósito...");
        conta.depositar(1000.00);
        System.out.println("Efetuando saque...");
        conta.sacar(1200.00);
        System.out.println("\n");

        Conta conta1 = new Conta("Henrique", 900);
        System.out.println("Efetuando depósito...");
        conta1.depositar(1000.00);
        System.out.println("Efetuando saque...");
        conta1.sacar(1200.00);
    }
}
