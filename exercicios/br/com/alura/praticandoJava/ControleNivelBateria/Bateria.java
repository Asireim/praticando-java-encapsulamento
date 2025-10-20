package br.com.alura.praticandoJava.ControleNivelBateria;

public class Bateria {
    private int nivel;

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            System.out.println("Não é possível definir um nível menor que 0 ou maior que 100.");
        }
    }

    public void getStatus() {
        if (this.nivel >= 80) {
            System.out.println("Bateria cheia");
        } else if (this.nivel >= 21 && this.nivel <= 79) {
            System.out.println("Bateria ok");
        } else {
            System.out.println("Bateria fraca");
        }
    }

}
