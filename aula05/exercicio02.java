import java.util.Random;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == numeroDigitado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado no array.");
        } else {
            System.out.println("Número não encontrado no array.");
        }

        scanner.close();
    }
}