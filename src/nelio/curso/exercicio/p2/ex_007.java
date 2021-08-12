package nelio.curso.exercicio.p2;

import java.util.Locale;
import java.util.Scanner;

public class ex_007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”.
        //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        //situação

        Scanner leitor = new Scanner(System.in);
        double valor1;
        double valor2;

        System.out.println("Digite o valor de x: ");
        valor1 = leitor.nextDouble();

        System.out.println("Digite o valor de y: ");
        valor2 = leitor.nextDouble();

        if (valor1 > 0 && valor2 > 0){
            System.out.println("Q1");
        }
        else if ( valor1 <=0 && valor2 > 0){
            System.out.println("Q2");
        }
        else if ( valor1 < 0 && valor2 < 0){
            System.out.println("Q3");
        }
        else if (valor1 >0 && valor2 < 0){
            System.out.println("Q4");
        }
        else if ( valor1 == 0 && valor2 == 0){
            System.out.println("Origem");
        }

        leitor.close();

    }
}
