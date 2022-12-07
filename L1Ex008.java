/* Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
VOLUME = COMPRIMENTO * LARGURA * ALTURA. */

import java.util.Scanner;
public class L1Ex008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double volume, comprimento, largura, altura;

        System.out.println("Informe o comprimento: ");
        comprimento =  entrada.nextDouble();

        System.out.println("Informe a largura: ");
        largura =  entrada.nextDouble();

        System.out.println("Informe a altura: ");
        altura =  entrada.nextDouble();

        volume = comprimento * largura * altura;
        System.out.println("O volume da caixa retangular é: " + volume);
    }
}
