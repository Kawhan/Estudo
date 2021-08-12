package Faculdade;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aula_18_marc {
    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));

        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota: "));

        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira nota: "));

        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua quarta nota: "));

        DecimalFormat df = new DecimalFormat("0.00"); // Aplicação do format decimal

        double media = (nota1+nota2+nota3+nota4) / 4;


        JOptionPane.showMessageDialog(null,"Sua media é: " + df.format(media));


        // Scanner leitor = new Scanner(System.in);

        // System.out.println("Digite sua primeira nota:");
        // double nota1 = Double.parseDouble(leitor.nextLine());

        // System.out.println("Digite sua segunda nota:");
        // double nota2 = Double.parseDouble(leitor.nextLine());

        // System.out.println("Digite sua terceira nota:");
        // double nota3 = Double.parseDouble(leitor.nextLine());

        // double media = (nota1 + nota2 + nota3) / 3;

        // System.out.printf("A média é : %.2f \n",media);

        // leitor.close();
    }
}
