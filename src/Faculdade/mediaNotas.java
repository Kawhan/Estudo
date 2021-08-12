package Faculdade;

import javax.swing.*;

public class mediaNotas {
    public static void main(String[] args) {
        String nota_1 = JOptionPane.showInputDialog("Digite sua primeira nota: ");
        double nota1 = Double.parseDouble(nota_1);
        String nota_2 = JOptionPane.showInputDialog("Digite sua segunda nota: ");
        double nota2 = Double.parseDouble(nota_2);
        String nota_3 = JOptionPane.showInputDialog("Digite sua terceira nota: ");
        double nota3 = Double.parseDouble(nota_3);
        String nota_4 = JOptionPane.showInputDialog("Digite sua quarta nota: ");
        double nota4 = Double.parseDouble(nota_4);

        double media = (nota1+nota2+nota3+nota4)/4;



        String texto = String.format("A média de suas notas é %.1f", media);
        JOptionPane.showMessageDialog(null,texto);

        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null,"Vocẽ foi aprovado!");
        }else if (media>=4){
            JOptionPane.showMessageDialog(null,"Você esta na final!");

        }else {
            JOptionPane.showMessageDialog(null,"Você foi reprovado por nota!");
        }

    }
}
