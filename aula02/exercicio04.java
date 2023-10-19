import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraAoContrario = new StringBuilder(palavra).reverse().toString();

        System.out.println("Palavra ao contrário: " + palavraAoContrario);

        scanner.close();
    }
}