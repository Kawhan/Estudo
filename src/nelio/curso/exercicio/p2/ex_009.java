package nelio.curso.exercicio.p2;

import java.util.Locale;
import java.util.Scanner;

public class ex_009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int minutos = leitor.nextInt();
        double conta = 50.0;
        double valor_total = 0;
        double valor_adicional =2;

        if (minutos <= 100){
            valor_total = conta;
        }
        else{
            minutos -= 100;
            valor_adicional *= minutos;

            valor_total += conta + valor_adicional;
        }

        System.out.println("Valor a pagar em R$"+valor_total);
        leitor.close();
    }
}
