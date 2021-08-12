package nelio.curso.exercicio.p2;

import java.util.Scanner;

public class ex_005 {
    public static void main(String[] args) {
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.

        Scanner leitor = new Scanner(System.in);
        int quant;
        int item;
        double valor_total;

        System.out.println("Digite o código do item que deseja: ");
        item = leitor.nextInt();

        System.out.println("Digite a quantidade do item que deseja: ");
        quant = leitor.nextInt();

        if (item == 1) {
            valor_total = quant * 4.00;
        }
        else if(item == 2){
            valor_total = quant * 4.50;
        }
        else if(item == 3){
            valor_total = quant * 5;
        }
        else if(item == 4){
            valor_total = quant * 2;
        }
        else {
            valor_total = quant * 1.5;
        }

        System.out.println("Total: R$ "+valor_total);

        leitor.close();
    }
}
