package exercicio9;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Carlos", 1000.0);

        System.out.println("--- Saldo Inicial ---");
        conta.exibirSaldo();

        System.out.println("\n--- Operações ---");
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(1500.0);
        conta.depositar(-100.0);

        System.out.println("\n--- Saldo Final ---");
        conta.exibirSaldo();
    }
}