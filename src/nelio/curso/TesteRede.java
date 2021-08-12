package nelio.curso;

import java.util.Scanner;

public class TesteRede {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int mask = 32;
        int n = leitor.nextInt();

        if ((n & mask) != 0 ){
            System.out.println("6th bit is true");
        }
        else {
            System.out.println("6th bit is false");
        }

        leitor.close();
    }
}
