public class Operadores {
    public static void main(String[] args) throws Exception {
        // aula 2 - concatenação
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; // resultado: "31"
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1; // resultado: "1111"
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1"; // resultado: "1111"
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1); // resultado: "13"
        System.out.println(concatenacao);

        // aula 3
        int numero = 5;

        numero = -numero;
        System.out.println(numero);

        // aula 4
        int num = 4;

        num += 3;
        System.out.println(num);
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

    }
}
