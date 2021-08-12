package nelio.curso.exercicio.p1;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int numero;
        double horas;
        double valor_hora;
        double conta;

        numero = leitor.nextInt();
        horas = leitor.nextDouble();
        valor_hora = leitor.nextDouble();

        conta = valor_hora*horas;

        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = %.2f%n",conta);
        leitor.close();
    }
}
