package nelio.curso.Aula002;

import java.util.Scanner;

public class estr_condicional {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int x;
        x = leitor.nextInt();

        if (x > 1 && x < 6) {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }
        leitor.close();
    }



}
