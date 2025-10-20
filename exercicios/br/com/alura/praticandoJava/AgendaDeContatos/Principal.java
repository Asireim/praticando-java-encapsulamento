package br.com.alura.praticandoJava.AgendaDeContatos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        for (int i = 0; i < contatos.size(); i++) {
            System.out.printf("%d. %s - %s%n", i+1, contatos.get(i).getNome(), contatos.get(i).getTelefone());
        }
    }
}
