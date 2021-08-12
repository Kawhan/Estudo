package nelio.curso.exercicio.p2;

import java.util.Scanner;

public class ex_004 {
    public static void main(String[] args) {
        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner leitor = new Scanner(System.in);
        int hour_start;
        int hour_end;

        System.out.println("DIgite a hora que começou o jogo: ");
        hour_start = leitor.nextInt();

        System.out.println("Digite a hora que o jogo acabou: ");
        hour_end = leitor.nextInt();

        if ( hour_start < hour_end){
            System.out.println("O jogo durou" +(hour_end-hour_start)+" HORA(S)");
        }
        else{
            System.out.println("O jogo durou "+(24 - hour_start+hour_start)+" HORA(S)");
        }



        leitor.close();
    }
}
