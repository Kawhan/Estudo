package Faculdade.ex009;

public class TestaSisControleFuncionarios {
    public static void main(String [] args) {
        SisControleFuncionarios sistema = new SisControleFuncionarios();
        Funcionario func1 = new Funcionario("Maria Silva","111.111.111-11", 200, 45);
        Funcionario func2 = new Funcionario("Leandro","55.333.45-60", 45, 6);
        sistema.cadastraFuncionario(func1);
        sistema.cadastraFuncionario(func2);
        if(sistema.existeFuncionarioComNome("Leandro")){
            System.out.println("Usuário cadastrado com sucesso");
        }else{
            System.out.println("Problema no cadastro");
        }

        System.out.println("Número de funcionarios ");
        System.out.println(sistema.contarQuantidadeDeFuncionariosComHoraExtra());

        for (Funcionario funcionario : sistema.pesquisaFuncionariosComSalarioMaiorQue(500)) {
            System.out.println(funcionario.getNome());
        }
    }

}