package nelio.curso.exercicio.p1;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        Scanner leitor = new Scanner(System.in);

        int valor1;
        int valor2;
        int soma;

        valor1 =  leitor.nextInt();
        valor2 = leitor.nextInt();

        soma = valor1 + valor2;

        System.out.println("Soma = "+soma);

        leitor.close();
    }
}
