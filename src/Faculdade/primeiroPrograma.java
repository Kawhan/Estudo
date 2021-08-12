package Faculdade;
// Para colocar os valores temos int e double e usa parse e o valor
// Para colocar as casas decimais em Java tem de colocar %.1f
// Lembrar dos conceitos do JOptionframe
// DOuble é para colocar números reais, para que ele tenha uma precisão maior do que o float
// Para criar uma lista primeiro sempre que vamos criar um array colocamos o tipo da variável e []
// Para mostra todas as notas temos de criar um for para varrer os elementos

import javax.swing.*;

public class primeiroPrograma {
    public static void main(String[] args) {


        String numero_str = JOptionPane.showInputDialog("Digite um número: ");

        int numero = Integer.parseInt(numero_str);


        double[] notas = {10.0 , 6.75 , 12.6 , 14.2};

        System.out.println("Suas notas são  "+notas[0]);
        JOptionPane.showMessageDialog(null,"Seu primeiro número é "+numero);
        System.out.println("Primeiro programa da aula de LP");
    }
}
