package exercicio10;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class RegistroCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] compras = new String[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Cadastro da Compra " + (i + 1) + " ---");

            System.out.print("Produto: ");
            String produto = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Preço Unitário: R$ ");
            double precoUnitario = scanner.nextDouble();
            scanner.nextLine();

            String compra = produto + " | " + quantidade + " | R$ " + precoUnitario;
            compras[i] = compra;
        }

        salvarComprasNoArquivo(compras);

        System.out.println("\n--- Compras Registradas ---");
        lerComprasDoArquivo();

        scanner.close();
    }

    public static void salvarComprasNoArquivo(String[] compras) {
        try (FileWriter escritor = new FileWriter("compras.txt")) {
            for (String compra : compras) {
                escritor.write(compra + "\n");
            }
            System.out.println("Compras salvas com sucesso no arquivo compras.txt!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar as compras no arquivo.");
            e.printStackTrace();
        }
    }

    public static void lerComprasDoArquivo() {
        try {
            Files.lines(Paths.get("compras.txt")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo compras.txt.");
            e.printStackTrace();
        }
    }
}