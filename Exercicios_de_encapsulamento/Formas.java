public class Formas {
    public void calculaArea(double base, double lado){
        double area = base * lado;

        if(base == lado){
            System.out.println("A área do quadrado é igual a: " + area);
        }

        else{
            System.out.println("A área do retângulo é igual a: " + area);
        }
    }

    public void calculaArea(double raio){
        double area = 3.14 * (raio * raio);

        System.out.println("A área do circulo é igual a: " + area);
    }
}
