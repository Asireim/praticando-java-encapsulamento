package br.com.alura.praticandoJava.CadastrandoVeiculos;

public class Veiculo {
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.printf("""
                Veículo cadastrado:
                
                Modelo: %s
                Placa: %s
                Ano: %d
                """, this.modelo, this.placa, this.ano);
    }
}
