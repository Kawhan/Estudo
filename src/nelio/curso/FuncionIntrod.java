package nelio.curso;

import java.util.Scanner;

public class FuncionIntrod {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int higher = max(a,b,c);

        System.out.println(higher);


        leitor.close();
    }

    public static int max(int x, int y, int z){
        int aux;

        if (x>y && x>z){
            aux = x;
        }
        else if (x > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }
}
