/* Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
segundo. */

import java.util.Scanner;
public class L1Ex009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, fatoracao;

        System.out.println("Informe o primeiro valor: ");
        a = entrada.nextInt();

        System.out.println("Informe o segundo valor: ");
        b = entrada.nextInt();

        fatoracao = (a - b) * (a - b);

        System.out.println("O resultado da fatoração é: " + fatoracao);
    }
}
