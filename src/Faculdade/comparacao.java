package Faculdade;

import javax.swing.*;
import java.util.Locale;

// Printf é para usar o format tipo System.out.printf("A altura de %s é %.3f\n", nome, altura );
public class comparacao {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String calculadora = JOptionPane.showInputDialog("Digite o que deseja soma, sub ou multi");

        if (calculadora.toUpperCase().equals("SOMA")){

            double numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número que deseja somar: "));
            double numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número que deseja somar: "));

            soma(numero_1,numero_2);
            JOptionPane.showMessageDialog(null,"Obrigado por usar a calculadora " + nome);


        } else if (calculadora.toUpperCase().equals("SUB")){
            double numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número que deseja subtrair: "));
            double numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número que deseja subtrair: "));

            subtracao(numero_1,numero_2);
            JOptionPane.showMessageDialog(null,"Obrigado por usar a calculadora " + nome);


        } else if (calculadora.toUpperCase().equals("MULTI")){
            double numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número que deseja multiplicar: "));
            double numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número que deseja multiplicar: "));

            multiplicacao(numero_1,numero_2);
            JOptionPane.showMessageDialog(null,"Obrigado por usar a calculadora " + nome);


        } else {
            JOptionPane.showMessageDialog(null,"ERRO,tente novamente obrigado " + nome);
        }




    }

    public static Double soma(Double numero_1, Double numero_2){
        double soma_valores = numero_1 + numero_2;

        JOptionPane.showMessageDialog(null,"Sua soma é: " + soma_valores);
        return soma_valores;
    }

    public static Double subtracao(Double numero_1, Double numero_2) {
        double subtracao_valores = numero_1 - numero_2;

        JOptionPane.showMessageDialog(null,"Sua subtração é igual a: " + subtracao_valores);

        return subtracao_valores;
    }

    public static Double multiplicacao(double numero_1, double numero_2){
        double multiplicacao_valores = numero_1 * numero_2;

        JOptionPane.showMessageDialog(null,"Sua multiplicação tem resultado de: " + multiplicacao_valores);

        return multiplicacao_valores;
    }

}
