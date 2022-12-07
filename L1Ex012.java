/* Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
soma dos quadrados dos três valores lidos. */

import java.util.Scanner;
public class L1Ex012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, resultado;

        System.out.println("a: ");
        a = entrada.nextDouble();
        System.out.println("b: ");
        b = entrada.nextDouble();
        System.out.println("c: ");
        c = entrada.nextDouble();

        resultado = (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(a, 2));
        System.out.println("Soma dos quadrados dos três valores lidos é igual: " + resultado);
    }
}
