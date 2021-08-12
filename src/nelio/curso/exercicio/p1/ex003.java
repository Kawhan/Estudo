package nelio.curso.exercicio.p1;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int conta;

        num1 = leitor.nextInt();
        num2 = leitor.nextInt();
        num3 = leitor.nextInt();
        num4 = leitor.nextInt();

        conta = (num1*num2)-(num3*num4);

        System.out.println("DIFERENCA = "+conta);
    }
}
