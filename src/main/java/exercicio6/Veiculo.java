package exercicio6;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("\n--- Detalhes do Veículo ---");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.printf("Quilometragem: %.2f km%n", quilometragem);
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.printf("Viagem registrada! %.2f km adicionados à quilometragem.%n", km);
        } else {
            System.out.println("Quilometragem inválida. A viagem não foi registrada.");
        }
    }

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Fusca", 1980, 10000.0);
        Veiculo veiculo2 = new Veiculo("XYZ-5678", "Civic", 2020, 5000.0);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        veiculo1.registrarViagem(150.5);
        veiculo2.registrarViagem(300.0);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}