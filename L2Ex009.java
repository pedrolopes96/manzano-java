/* Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem
informando se o número é par ou ímpar. */
import java.util.Scanner;
public class L2Ex009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;

        System.out.println("Informe um valor: ");
        a = entrada.nextInt();

        if (a % 2 == 0) {
            System.out.println("O número informado é par!!!");
        }
        else {
            System.out.println("O número informado é ímpar!!!");
        }
    }
}
