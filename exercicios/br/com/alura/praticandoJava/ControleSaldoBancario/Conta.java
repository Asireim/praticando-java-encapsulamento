package br.com.alura.praticandoJava.ControleSaldoBancario;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado.");
            System.out.printf("Saldo atual de %s: R$ %.2f%n", this.titular, this.saldo);
        } else {
            System.out.println("Não é permitido depositar valores negativos.");
            System.out.printf("Saldo atual de %s: R$ %.2f%n", this.titular, this.saldo);
        }
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado.");
            System.out.printf("Saldo atual de %s: R$ %.2f%n", this.titular, this.saldo);
        } else {
            System.out.println("Não há saldo disponível para saque.");
            System.out.printf("Saldo atual de %s: R$ %.2f%n", this.titular, this.saldo);
        }
    }
}
