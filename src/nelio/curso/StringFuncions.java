package nelio.curso;

public class StringFuncions {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s01 = original.toLowerCase(); // Trasformar todos em letras minusculas

        String s02 = original.toUpperCase(); // Trasformar todas em letras maiusculas

        String s03 = original.trim(); // Trim vai manter as mesmas letras originais e vai eliminar os espaços inicio fim

        String s04 = original.substring(2);// Pegar o caracter da posição 2 em diante e monta uma new String

        String s05 = original.substring(2,9);// Corta apartir do 2 abaixo do caracter 9

        String s06 = original.replace('a','x'); //  trocar o "a" por "x"

        String s07 = original.replace("abc","xy"); // Sempre que achar "abc" trocar por "xy"

        int i = original.indexOf("bc");// Procurar onde esta a primeira apartição elemento em nossa String

        int j = original.lastIndexOf("bc"); // Onde está a ultima ocorrencia do bc

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(i);
        System.out.println(j);
    }
}
