import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double valor = scanner.nextDouble();
    scanner.close();

    while (true) {
      if (valor > 0) {
        // Imprimir a mensagem de sucesso, formatando o saldo atual (vide
        // Exemplos).
        System.out.println("Deposito realizado com sucesso!");
        String saldoFormatado = String.format("%.2f", valor);
        System.out.println("Saldo atual: R$ " + saldoFormatado);
        break;
      } else if (valor == 0) {
        // Imprimir a mensagem de valor inválido.
        System.out.println("Encerrando o programa...");
        return;
      } else {
        // Imprimir a mensagem de encerrar o programa.
        System.out.println("Valor invalido! Digite um valor maior que zero.");
        break;
      }
    }
  }
}