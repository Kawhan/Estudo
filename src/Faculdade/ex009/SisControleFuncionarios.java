package Faculdade.ex009;

import java.util.ArrayList;
import java.util.List;


public class SisControleFuncionarios {


    private List<Funcionario> funcionarios;

    public SisControleFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public SisControleFuncionarios(List<Funcionario> listaFun) {
        this.funcionarios = listaFun;
    }

    public void cadastraFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }

    public int contarQuantidadeDeFuncionariosComHoraExtra() {
        int contadorFun = 0;
        for(Funcionario f: this.funcionarios) {
            if(f.getHQuantidade() > 40.0) {
                contadorFun++;
            }
        }
        return contadorFun;
    }
    
    
    public boolean existeFuncionarioComNome(String nome) {
        for (Funcionario f: this.funcionarios) {
            if (f.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Funcionario> pesquisaFuncionariosComSalarioMaiorQue(double valorSalario) {
        ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
        for(Funcionario f: this.funcionarios) {
            if(f.calcularSalario() > valorSalario) {
                funcionario.add(f);
            }
        }
        return funcionario;
    }

    //Demais métodos da classe…
}