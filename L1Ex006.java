/* Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de
forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
variável A. Apresentar os valores trocados. */

import java.util.Scanner;

public class L1Ex006 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, troca;

        System.out.println("Informe o valor da primeira variável: ");
        a = entrada.nextInt();

        System.out.println("Informe o valor da segunda variável: ");
        b = entrada.nextInt();

        troca = a;
        a = b;
        b = troca;

        System.out.println("Os valores invertidos são: " + a + " e " + b);
    }
}