package nelio.curso.exercicio.p2;

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
        leitor.close();
    }
}
