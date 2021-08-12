package Faculdade.ufpb.ex006;

import java.util.Arrays;
import java.util.Scanner;
public class ProgramaDescontos {
    public static double calculaValorComDesconto(double valorProduto) {

        if (valorProduto < 50) {
            return (valorProduto);
        } else if (valorProduto < 100) {
            return (valorProduto - (valorProduto * 0.05));
        } else {
            return (valorProduto - (valorProduto * 0.10));

        }
    }

    public static double calculaValorDesconto(double valorProduto) {

        if (valorProduto < 50) {
            return 0.0;
        } else if (valorProduto < 100) {
            return (valorProduto * 0.05);
        } else {
            return (valorProduto * 0.10);

        }
    }

    public static double calculaSomatorioDescontos(double produtos[]){
        double sum = Arrays.stream(produtos).sum();
        return sum;
    }

    public static String verificaProdutoComMaiorDesconto(Produto [] produto){
        double maior_valor = 0.0;
        String nome = "";


        for(int k=0; k < produto.length;k++) {
            if (maior_valor < produto[k].getPreco() || maior_valor == 0.0) {
                maior_valor = produto[k].getPreco();
                nome = produto[k].getNome();
            }
        }
        return nome;
    }





    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto[] produtos = new Produto[quant];
        double[] verifica = new double[quant];
        double[] precos_totais = new double[quant];
        double numero_verifica=0;
        String nome = "";
        double valorDesonto =0;
        for (int k = 0; k < quant; k++) {
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto =
                    calculaValorComDesconto(p.getPreco());
            double valorDesconto = calculaValorDesconto(p.getPreco());
            System.out.printf(
                    "O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);
            produtos[k] = p;
            precos_totais[k] = valorDesconto;
            verifica[k] = valorComDesconto;

        }


        String verifica_nome = verificaProdutoComMaiorDesconto(produtos);

        System.out.println("O valor da somatoria dos valores dos descontos é "+calculaSomatorioDescontos(precos_totais));
        System.out.println("O nome do produto que tem maior desconto é: "+verifica_nome);

        leitor.close();
    }
}