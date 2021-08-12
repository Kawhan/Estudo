package nelio.curso;

import java.util.Locale;

public class teste_ternario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;


        System.out.printf("Valor de desconto %.2f%n",desconto);


    }
}
