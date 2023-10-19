import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números primos entre " + numero1 + " e " + numero2 + ":");

        for (int numero = numero1; numero <= numero2; numero++) {

            if (numero <= 1)
                continue;
                boolean numeroPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {

                if (numero % i == 0) {
                    numeroPrimo = false;
                    break;
                }
            }

            if (numeroPrimo) {
                System.out.print(numero + " ");
             }
        }
    }
}