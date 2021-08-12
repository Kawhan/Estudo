package nelio.curso.exercicio.p2;

import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {
        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.
        Scanner leitor = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Digite o primeiro número inteiro: ");
        numero = leitor.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        numero2 = leitor.nextInt();

        if (numero % numero2 == 0 || numero2 % numero == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        leitor.close();
    }
}
