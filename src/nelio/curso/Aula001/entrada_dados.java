package nelio.curso.Aula001;

import java.util.Locale;
import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double peso;
        char letra;

        nome = sc.next();
        idade = sc.nextInt();
        peso = sc.nextDouble();
        letra = sc.next().charAt(0);

        System.out.println("O nome digitado é: "+nome);
        System.out.println("E sua idade é: "+idade);
        System.out.println("O seu peso é: "+peso);
        System.out.println("O caractere que você digitou é: "+letra);
        sc.close();

    }
}
