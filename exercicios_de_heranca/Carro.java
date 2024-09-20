package Veiculos;

public class Carro extends Veiculo{
    private int portas;
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void abrirPortaMalas(){
        System.out.print("Abrindo porta malas.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + portas);
    }
}
