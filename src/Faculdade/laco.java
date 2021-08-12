package Faculdade;
import java.util.Scanner;

public class laco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("CALCULANDO NOTAS DA TURMA");
        System.out.println("Quantos alunos há na turma?");
        int numAlunos = Integer.parseInt(leitor.nextLine());
        int contador = 0;
        double [] todasAsNotas = new double[numAlunos];
        for (int k = 0; k < numAlunos; k++) {
            System.out.println("Qual o nome do(a) aluno(a)?");
            String nome = leitor.nextLine();
            System.out.println("Qual a nota do(a) aluno(a)?");
            double nota = Double.parseDouble(leitor.nextLine());
            if (nota<=4){
                contador += 1;
            }
            todasAsNotas[k] = nota;
            if (nota>= 8) {
                System.out.println("Parabéns "+nome+"! Continue assim!");
            } else if (nota>=7) {
                System.out.println("Muito bem, "+nome);
            }else{
                System.out.println("Estude mais "+nome+ ", que vai dar certo");
            }


        }
        //TODO: CÓDIGO A ADICIONAR
        System.out.println("O número de Alunos que tiveram nota menor ou igual a 4.0 foi "+contador);
        System.out.println("Programa concluído");
        leitor.close();
    }//fim do main
}
