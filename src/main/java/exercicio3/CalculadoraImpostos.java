package exercicio3;
//scanner pra ler entradas pelo terminal
import java.util.Scanner;

public class CalculadoraImpostos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu salário mensal: R$ ");

        double salarioMensal = scanner.nextDouble();
        double salarioAnual = salarioMensal * 12;
        double imposto = calcularImposto(salarioAnual);

        System.out.println("\n--- Resultado ---");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Salário Anual: R$ %.2f%n", salarioAnual);
        System.out.printf("Imposto a Pagar: R$ %.2f%n", imposto);
        System.out.printf("Salário Líquido Anual: R$ %.2f%n", salarioAnual - imposto);

        scanner.close();
    }

    public static double calcularImposto(double salarioAnual) {
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0; // Isento
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075; // 7,5%
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15; // 15%
        } else {
            imposto = salarioAnual * 0.275; // 27,5%
        }

        return imposto;
    }
}