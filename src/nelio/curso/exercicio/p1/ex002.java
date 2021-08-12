package nelio.curso.exercicio.p1;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double raio;
        double valor_pi;
        double area;


        raio = leitor.nextDouble();
        valor_pi = 3.14159;
        area = valor_pi * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f%n",area);
        leitor.close();
    }
}
