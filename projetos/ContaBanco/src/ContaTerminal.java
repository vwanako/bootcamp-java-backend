import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o saldo disponível: ");
        double saldo = scanner.nextDouble();

    }
}
