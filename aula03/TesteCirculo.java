public class TesteCirculo {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);

        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Circunferência: " + circulo.calcularCircunferencia());

    }
}