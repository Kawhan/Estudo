package nelio.curso.exercicio.p3;

import java.util.Scanner;

public class ex_002_while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senha = 2200;
        int tentativa;

        System.out.println("Digite a tentativa de senha: ");
        tentativa = leitor.nextInt();

        while(tentativa != senha){
            System.out.println("Senha invalidade,digite novamente");
            tentativa = leitor.nextInt();
        }

        System.out.println("Acesso permitida");
        leitor.close();
    }
}
