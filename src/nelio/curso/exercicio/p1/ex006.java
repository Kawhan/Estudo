package nelio.curso.exercicio.p1;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double A,B,C;
        double pi = 3.14159;

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n",(A*C)/2);
        System.out.printf("CIRCULO: %.3f%n",(pi*Math.pow(C,2.0)));
        System.out.printf("TRAPEZIO: %.3f%n",((A+B)*C)/2);
        System.out.printf("QUADRADO: %.3f%n",(B*B));
        System.out.printf("RETANGULO: %.3f%n",(A*B));

        leitor.close();
    }
}
