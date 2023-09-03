import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        // Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual = saldoAtual + valorDeposito - valorRetirada;

        // Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        String saldoFormatado = String.format("%.1f", saldoAtual);
        System.out.println("Saldo atualizado na conta: " + saldoFormatado);

        scanner.close();
    }
}