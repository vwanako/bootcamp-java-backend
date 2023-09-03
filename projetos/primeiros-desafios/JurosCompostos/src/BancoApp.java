import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        // Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        double jurosCorrigido = 1 + taxaJuros;
        double valorJuros = Math.pow(jurosCorrigido, periodo);

        valorFinal *= valorJuros;

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}