package Faculdade.ufpb.dcx.turmas;

public class Aluno {

    private String nome;
    private String matricula;
    private double nota;


    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;

    }



    public double getNota () {
        return this.nota;
    }

    public String getMatricula () {
        return this.matricula;
    }

    public String getNome () {
        return this.nome;
    }




}
