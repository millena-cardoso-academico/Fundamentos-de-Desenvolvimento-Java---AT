package exercicio8;

class ContaBancaria {
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
            System.out.println("Valor de depósito inválido.");
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
}

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Carlos", 1000.0);

        conta.exibirSaldo();
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(1500.0);
        conta.exibirSaldo();
    }
}