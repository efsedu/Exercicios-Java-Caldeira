import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        scanner.close();

        int metadeFrase = frase.length() / 2;

        String primeiraParte = frase.substring(0, metadeFrase);

        System.out.println("Primeira metade: " + primeiraParte);
    }
}