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
    }
}
