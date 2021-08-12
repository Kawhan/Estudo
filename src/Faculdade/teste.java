package Faculdade;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        for (int k = 0; k < n; k++) {
            int num = Integer.parseInt(leitor.nextLine());
            boolean ehPrimo = false;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    ehPrimo = true;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.printf("%d eh primo", num);
            } else {
                System.out.printf("%d não eh primo", num);
            }
        }
        leitor.close();
    }
}