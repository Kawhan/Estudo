package Faculdade;


import java.util.Scanner;

// Programa que vai comparar Strings
// || --> Ou ou &&--> e

public class aula_18_marc_pt2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();

        imprime_nome(nome);

    }

    public static String imprime_nome(String nome) {
        System.out.println("Bem vindo nome" + nome);
        return nome;
    }


}
