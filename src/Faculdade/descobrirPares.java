package Faculdade;

import javax.swing.*;

public class descobrirPares {
    public static void main(String[] args) {
        int limit = Integer.parseInt(JOptionPane.showInputDialog("Digite até qual quer saber os números pares"));
        int cont = 0;
        int soma = 0;

        while (cont <= limit){
            if (cont % 2 == 0){
                System.out.println(cont);
                soma+=cont;
            }
            cont++;
        }

        JOptionPane.showMessageDialog(null,"A soma dos seus números parés é: "+soma);

    }
}
