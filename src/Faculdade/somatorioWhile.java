package Faculdade;

import java.util.Scanner;

public class somatorioWhile {
    public static void main(String[] args) {
        int soma = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você quer que a soma va ate que número: ");
        int max = Integer.parseInt(leitor.nextLine());
        int cont = 1;
        while (cont <= max) {
            soma += cont;
            cont++;
        }
        System.out.println("Soma de 1 a "+max+" é de: " +soma);
        leitor.close();

    }
}
