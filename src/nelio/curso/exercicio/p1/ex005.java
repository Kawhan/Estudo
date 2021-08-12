package nelio.curso.exercicio.p1;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);


        int codigo_1;
        int num_1;
        double valor_1;
        double total_1;

        int codigo_2;
        int num_2;
        double valor_2;
        double total_2;

        double total_geral;

        codigo_1 = leitor.nextInt();
        num_1 = leitor.nextInt();
        valor_1 = leitor.nextDouble();
        total_1 = num_1 * valor_1;

        codigo_2 = leitor.nextInt();
        num_2 = leitor.nextInt();
        valor_2 = leitor.nextDouble();
        total_2 = num_2 * valor_2;

        total_geral = total_1 + total_2;
        System.out.printf("VALOR A PAGAR: R$%.2f%n",total_geral);

        leitor.close();
    }
}
