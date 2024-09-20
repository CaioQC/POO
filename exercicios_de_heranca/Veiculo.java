package Veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println("Acelerando: ");
    }

    public void exibirInformacoes(){
        System.out.println(marca + ", " + modelo + ", " + ano);
    }
}
