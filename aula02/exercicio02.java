import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char continua = 's';

        while (continua == 's') {

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Escolha a operação: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            int escolha = scanner.nextInt();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Escolha de operação inválida.");
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar (s/n)? ");
            continua = scanner.next().charAt(0);
        }

        System.out.println("Obrigado por usar a calculadora!");
        scanner.close();
    }
}