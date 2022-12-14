package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero2 - numero1);
        System.out.println(numero2 + numero1);
        System.out.println("Valor " + numero2 + numero1);
        System.out.println(numero2 + numero1 + " Valor");
        System.out.println(numero2 / numero1);
        System.out.println(numero1 / numero2);
        System.out.println((double) numero1 / numero2);

        // %
        int resto = 20 % 2;
        System.out.println(resto);
        resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezIgualVinte);
        boolean isDezIgualDez = 10 == 10;
        System.out.println(isDezIgualDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        System.out.println(isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanÃ§a = 10000;
        boolean daPraComprarPS5 = valorTotalContaCorrente > 3000 || valorTotalContaPoupanÃ§a > 3000;
        System.out.println(daPraComprarPS5);

        // = += -= *= /= %=
    }
}
