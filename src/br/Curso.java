package br;


import java.util.ArrayList;

public class Curso {
    private String nome;
    private String descicao;
    private int codigoCurso;
    private ArrayList<Aluno> alunoss = new ArrayList<>();

    public Curso()
    {
        this (0,"");
    }

    public Curso(int codigoCurso, String nome)
    {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
    }

    public String getNome()
    {
        return nome;
    }

    public String getDescicao()
    {
        return descicao;
    }

    public int getCodigoCurso()
    {
        return codigoCurso;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setDescicao(String descicao)
    {
        this.descicao = descicao;
    }

    public void matriculaAluno(Aluno aluno)
    {
        aluno.getCurso().setNome(this.nome);
        aluno.getCurso().setDescicao(this.descicao);
        this.alunoss.add(aluno);
    }

    public Aluno getAluno(String matricula) {
        for (Aluno aluno : alunoss) {
            if(aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }
}
