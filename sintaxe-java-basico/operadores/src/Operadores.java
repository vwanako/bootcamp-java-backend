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

        // aula 5
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        a = 6;
        resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        // aula 6
        int num1 = 1, num2 = 2;

        boolean simNao = num1 == num2;
        System.out.println("num1 é igual a num2? " + simNao);
        if (num1 == num2)
            System.out.println("a condição é verdadeira!");

        simNao = num1 > num2;
        System.out.println("num1 é maior que num2? " + simNao);

        String nomeUm = "Athena";
        String nomeDois = new String("Athena");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

    }
}
