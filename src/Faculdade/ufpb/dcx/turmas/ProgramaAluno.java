package Faculdade.ufpb.dcx.turmas;

import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ayla","111",7);
        Aluno aluno2 = new Aluno("João","222",8);



        System.out.println("Nomes dos alunos criados: ");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.getNota());

        System.out.println("-------------------");

        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getMatricula());
        System.out.println(aluno2.getNota());

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o novo nome do primeiro aluno? ");



    }

}
