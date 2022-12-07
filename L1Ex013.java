/* Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final o
quadrado da soma dos três valores lidos. */

import java.util.Scanner;
public class L1Ex013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, resultado;

        System.out.println("a: ");
        a = entrada.nextDouble();
        System.out.println("b: ");
        b = entrada.nextDouble();
        System.out.println("c: ");
        c = entrada.nextDouble();

        resultado = (Math.pow(a + b + c, 2));
        System.out.println("O resultado do quadrado da soma dos três números é igual a: " + resultado);
    }
}
