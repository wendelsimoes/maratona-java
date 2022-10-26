package academy.devdojo.maratonajava.introducao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Wendel";
        String endereco = "Candeias, Bahia";
        double salario = 3000;
        Date dataRecebimentoSalario = new GregorianCalendar(2020, Calendar.APRIL, 10).getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + sdf.format(dataRecebimentoSalario));
    }
}
