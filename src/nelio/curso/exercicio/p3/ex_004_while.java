package nelio.curso.exercicio.p3;

import java.util.Scanner;

public class ex_004_while {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int produto=0;
        int alcool=0;
        int gasolina=0;
        int disel=0;

        while(produto != 4){
            System.out.println("Digite o valor que deseja: ");
            produto = leitor.nextInt();

            if (produto == 1){
                alcool+=1;
            }
            else if (produto == 2){
                gasolina +=1;
            }
            else if (produto == 3){
                disel +=1;
            }
            else if (produto > 4){
                System.out.println("Valor invalido");
            }



//            switch (produto){
//                case 1:
//                    alcool+=1;
//                    break;
//                case 2:
//                    gasolina+=1;
//                    break;
//                case 3:
//                    disel +=1;
//                    break;
//                case 4:
//                    break;
//                default:
//                    System.out.println("Valor invalido digite novamente: ");
//                    produto = leitor.nextInt();
//            }

        }

        System.out.println("Muito obrigado\n Alcool: "+alcool+"\n Gasolina: "+gasolina+"\n Disel: "+disel);
        leitor.close();
    }
}
