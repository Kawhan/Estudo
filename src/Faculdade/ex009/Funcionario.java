package Faculdade.ex009;

public class Funcionario{
    private String nome;
    private String cpf;
    private double valorHora;
    private double quantHoras;
    private Funcionario quantHorasthis;
    // construtores aqui …

    public Funcionario(String nome, String cpf, double valorHora, double quantHoras) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorHora = valorHora;
        this.quantHoras = quantHoras;
    }

    public Funcionario() {
        this("","",100.00,40.0);
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double calcularSalario() {
        return this.quantHoras*this.valorHora;
    }
    //Demais métodos da classe por aqui …
    public String getNome() {
        return this.nome;
    }

    public double getQuantHoras() {
        return this.quantHoras;
    }

    public double valorSalario() {
        double salario = this.quantHorasthis.valorHora;
        return salario;
    }

    public String toString() {
        return "Funcionário de nome "+this.nome+" e CPF "+this.cpf;
    }

    public double getHQuantidade() {
        return quantHoras;
    }
}