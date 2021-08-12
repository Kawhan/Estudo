package nelio.curso.exercicio.p3;

import java.util.Scanner;

public class ex_001_while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x;
        int soma=0;

        System.out.println("Digite o primeiro número, desde que seja diferente de zero: ");
        x = leitor.nextInt();

        while(x != 0){
            soma += x;
            System.out.println("Digite o proximo número: ");
            x = leitor.nextInt();
        }

        System.out.println("A soma dos números é; "+soma);
        leitor.close();
    }
}
