package exercicio11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SimulacaoLoteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60) + 1); // Gera números de 1 a 60
        }


        Set<Integer> numerosEscolhidos = new HashSet<>();
        System.out.println("Digite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();


            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
                i--;
            } else if (numerosEscolhidos.contains(numero)) {
                System.out.println("Número repetido! Digite um número diferente.");
                i--;
            } else {
                numerosEscolhidos.add(numero);
            }
        }

        int acertos = 0;
        for (int numero : numerosEscolhidos) {
            if (numerosSorteados.contains(numero)) {
                acertos++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Seus números: " + numerosEscolhidos);
        System.out.println("Você acertou " + acertos + " número(s).");

        scanner.close();
    }
}