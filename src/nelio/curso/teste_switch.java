package nelio.curso;

import java.util.Scanner;

public class teste_switch {
    public static void main(String[] args) {
        // Programas de teste de dias usando switch case
        Scanner leitor = new Scanner(System.in);

        String dia;
        int valor;

        System.out.println("Digite o número inteiro que deseja verificar de acordo com a semana: ");
        valor = leitor.nextInt();

        switch (valor) {
            case (1):
                dia = "Segunda-feira";
                break;
            case (2):
                dia = "Terça-feira";
                break;
            case (3):
                dia = "Quarta-feira";
                break;
            case (4):
                dia = "Quinta-feira";
                break;
            case (5):
                dia = "Sexta-feira";
                break;
            case (6):
                dia = "Sabado";
                break;
            case (7):
                dia = "Domingo";
                break;
            default:
                dia = "Valor invalido";
                break;
        }
        System.out.println("Dia da semana: "+dia);
        leitor.close();
    }

}
