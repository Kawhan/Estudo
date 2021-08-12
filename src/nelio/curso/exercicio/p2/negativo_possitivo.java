package nelio.curso.exercicio.p2;

import java.util.Scanner;

public class negativo_possitivo {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = leitor.nextInt();

        if (numero >= 0) {
            System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
    leitor.close();
    }
}
