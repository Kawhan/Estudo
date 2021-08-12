package Faculdade;

import javax.swing.*;

public class case_switch {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Digite o seu dia de trabalho: ");

        switch (dia){
            case "SEGUNDA":
            case  "TERÇA":
            case  "QUARTA":
            case "QUINTA":
                System.out.println("Bom dia de trabalho");
                break;
            case "SEXTA":
                System.out.println("Boa Sexta-feira");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("Bom final de semana");
                break;

        }
    }
}
