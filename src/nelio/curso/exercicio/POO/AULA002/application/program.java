package nelio.curso.exercicio.POO.AULA002.application;

import nelio.curso.exercicio.POO.AULA002.entites.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Triangle x,y; // Create new variables, using type Triangle
        x = new Triangle(); // Create new object type Triangle
        y = new Triangle(); // Create new object type Triangle

        System.out.println("Please, enter the measures of triangle X: ");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();

        System.out.println("Please, enter the measures of triangle Y: ");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();


        double areaX = x.area(); // Calling function/method area in object x;


        double areaY = y.area(); // Calling function/method area in object y;

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        }else{
            System.out.println("Large area: Y");
        }

        leitor.close();
    }
}
