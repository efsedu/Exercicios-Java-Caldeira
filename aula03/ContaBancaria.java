import java.util.Calendar;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private Calendar horarioAtual = Calendar.getInstance();

    public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void pix(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transferência PIX de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o PIX.");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        int horaAtual = horarioAtual.get(Calendar.HOUR_OF_DAY);
        if (horaAtual >= 8 && horaAtual < 19) {
            if (saldo >= valor) {
                saldo -= valor;
                destino.deposito(valor);
                System.out.println("Transferência de R$" + valor + " para " + destino.nome + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        } else {
            System.out.println("A transferência só pode ser realizada entre 8h e 19h.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void verificarHorario() {
        int hora = horarioAtual.get(Calendar.HOUR_OF_DAY);
        int minuto = horarioAtual.get(Calendar.MINUTE);
        System.out.println("Horário atual: " + hora + "h" + minuto + "min");
    }

    public void verificarInformacoes() {
        System.out.println("Informações da conta bancária:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        verificarSaldo();
        verificarHorario();
    }
}