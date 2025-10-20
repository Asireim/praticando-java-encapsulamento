package br.com.alura.praticandoJava.ControleNivelBateria;

public class Principal {
    public static void main(String[] args) {
        Bateria b = new Bateria();
        b.setNivel(85);
        b.getStatus();

        Bateria b1 = new Bateria();
        b1.setNivel(19);
        b1.getStatus();

        Bateria b2 = new Bateria();
        b2.setNivel(78);
        b2.getStatus();

        Bateria b3 = new Bateria();
        b3.setNivel(22);
        b3.getStatus();
    }
}
