package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 100000.253;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char charactere = 'M';

        // string
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println(nome);
    }
}
