package nelio.curso.Aula002;

import java.util.Scanner;

public class estr_condicional3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int horas;

        System.out.println("Quantas horas? ");
        horas = leitor.nextInt();

        if (horas < 12){
            System.out.println("Bom dia");
        }
        else if(horas < 18) {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }
        leitor.close();

    }
}
