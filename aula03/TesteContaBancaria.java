public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("Bob Esponja", "12345678901", 1, "Banco A", "Rua Principal 123", 1000.0);

        minhaConta.verificarInformacoes();
        minhaConta.saque(500.0);
        minhaConta.deposito(200.0);
        minhaConta.pix(300.0);
        minhaConta.transferencia(new ContaBancaria("Ciclope", "98765432109", 2, "Banco B", "Avenida Secundária 456", 0.0), 100.0);

        minhaConta.verificarSaldo();
        minhaConta.verificarHorario();
    }
}