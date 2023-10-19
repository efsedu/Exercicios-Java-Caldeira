import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    public static void main(String[] args) {

        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a data da tarefa: ");
                    String data = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    Tarefa novaTarefa = new Tarefa(titulo, data, descricao);
                    listaDeTarefas.add(novaTarefa);
                    break;

                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < listaDeTarefas.size()) {
                        listaDeTarefas.remove(indice);
                        System.out.println("Tarefa removida com sucesso.");
                    } else {
                        System.out.println("Índice inválido. Tarefa não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("\nLista de Tarefas:");
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        Tarefa tarefa = listaDeTarefas.get(i);
                        System.out.println("Tarefa #" + i);
                        System.out.println("Título: " + tarefa.getTitulo());
                        System.out.println("Data: " + tarefa.getData());
                        System.out.println("Descrição: " + tarefa.getDescricao());
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}