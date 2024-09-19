package Veiculos;

public class Carro extends Veiculo{
    private double portas;
    public Carro(String marca, String modelo, int ano, double portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public double getPortas() {
        return portas;
    }

    public void abrirPortaMalas(){
        System.out.print("Abrindo porta malas.");
    }

    public void exibirInformacoes(){
        
    }
}
