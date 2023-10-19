import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInimigos = 300000;

        System.out.println("Leônidas: Quantos inimigos você acha que enfrentaremos, soldados?");
        int palpiteSoldado;

        do {
            System.out.print("Soldado: Digite seu palpite: ");
            palpiteSoldado = scanner.nextInt();

            if (palpiteSoldado < numeroInimigos) {

                System.out.println("Leônidas: Um pouco mais!");

            } else if (palpiteSoldado > numeroInimigos) {

                System.out.println("Leônidas: Um pouco menos!");

            } else {

                System.out.println("Leônidas: Correto, estamos prontos para enfrentar os " + numeroInimigos + " inimigos!");
            }

        } while (palpiteSoldado != numeroInimigos);

        scanner.close();
    }
}