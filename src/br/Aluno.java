package br;

public class Aluno {
    private String nome;
    private String matricula;
    private Curso curso = new Curso();

    public Aluno()
    {
        this ("");
    }

    public Aluno(String matricula)
    {
        this.matricula = matricula;
    }

    public String getNome()
    {
        return nome;
    }
    
    public String getMatricula()
    {
        return matricula;
    }

    public Curso getCurso()
    {
        return curso;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
