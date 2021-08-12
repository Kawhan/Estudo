package nelio.curso.exercicio.p3;

import java.util.Scanner;

public class ex_003_while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Digite o valor da coordenada x: ");
        valor1 = leitor.nextInt();

        System.out.println("Digite o valor da coordenada y: ");
        valor2 = leitor.nextInt();

        while(valor1 != 0 && valor2 != 0){
            if (valor1 > 0 && valor2 > 0){
                System.out.println("Q1");
            }
            else if ( valor1 <0 && valor2 > 0){
                System.out.println("Q2");
            }
            else if ( valor1 < 0 && valor2 < 0){
                System.out.println("Q3");
            }
            else if (valor1 >0 && valor2 < 0){
                System.out.println("Q4");
            }

            System.out.println("Digite o valor da coordenada x: ");
            valor1 = leitor.nextInt();

            System.out.println("Digite o valor da coordenada y: ");
            valor2 = leitor.nextInt();
        }




        leitor.close();
    }
}
