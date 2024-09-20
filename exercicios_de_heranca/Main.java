package Veiculos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tipo de veiculo que será exibido? (carro/moto): ");
        String tipoVeiculo = sc.nextLine().toLowerCase();

        System.out.print("Digite a marca do veiculo: ");
        String marca = sc.next();

        System.out.print("Digite o modelo do veiculo: ");
        String modelo = sc.next();

        System.out.print("Digite o ano do veiculo: ");
        int ano = sc.nextInt();

        Veiculo veiculo;

        if(tipoVeiculo.equals("carro")){
            System.out.print("Número de portas: ");
            int portas = sc.nextInt();
            veiculo = new Carro(marca, modelo, ano, portas);
            ((Carro)veiculo).abrirPortaMalas();
        }

        else if(tipoVeiculo.equals("moto")){
            System.out.print("Tem carenagem? (sim/não): ");
            sc.nextLine();
            String temCarenagemInput = sc.nextLine().toLowerCase();
            boolean temCarenagem = temCarenagemInput.equals("sim");
            veiculo = new Moto(marca, modelo, ano, temCarenagem);
            ((Moto)veiculo).empinar();
        }

        else {
            System.out.println("Tipo de veiculo inválido");
            veiculo = null;
        }

        if(veiculo != null){
            veiculo.acelerar();
            veiculo.exibirInformacoes();
        }

        sc.close();
    }
}
