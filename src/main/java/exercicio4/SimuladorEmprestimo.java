package exercicio4;

import java.util.Scanner;

public class SimuladorEmprestimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        int numeroParcelas;
        while (true) {
            System.out.print("Em quantas parcelas deseja pagar? (6 a 48): ");
            numeroParcelas = scanner.nextInt();

            if (numeroParcelas >= 6 && numeroParcelas <= 48) {
                break; // Número de parcelas válido
            } else {
                System.out.println("Número de parcelas inválido. Digite um valor entre 6 e 48.");
            }
        }

        double jurosMensal = 0.03;
        double valorTotal = valorEmprestimo * Math.pow(1 + jurosMensal, numeroParcelas);

        double valorParcela = valorTotal / numeroParcelas;

        System.out.println("\n--- Resultado da Simulação ---");
        System.out.printf("Nome do cliente: %s%n", nome);
        System.out.printf("Valor do empréstimo: R$ %.2f%n", valorEmprestimo);
        System.out.printf("Número de parcelas: %d%n", numeroParcelas);
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);
        System.out.printf("Valor da parcela mensal: R$ %.2f%n", valorParcela);

        scanner.close();
    }
}