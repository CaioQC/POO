public class ImpostoDeRenda {
    private String nome;
    private double salarioBruto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double calcularImposto(){
        double salarioFinal = 0;

        if(salarioBruto < 2259.20) {
            salarioFinal = salarioBruto;
            System.out.println("O salário do final será de: " + salarioFinal + " R$.");
        }

        else if(salarioBruto >= 2259.21 && salarioBruto <= 2826.65){
            salarioFinal = salarioBruto * 0.925;
            System.out.println("O salário final será de: " + salarioFinal + " R$.");
        }

        else if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05){
            salarioFinal = salarioBruto * 0.85;
            System.out.println("O salário final será de: " + salarioFinal + " R$.");
        }

        else if(salarioBruto >= 3751.06 && salarioBruto <= 4664.68){
            salarioFinal = salarioBruto * 0.775;
            System.out.println("O salário final será de: " + salarioFinal + " R$.");
        }

        else if(salarioBruto > 4664.68){
            salarioFinal = salarioBruto * 0.725;
            System.out.println("O salário final será de: " + salarioFinal + " R$.");
        }

        return salarioFinal;
    }
}
