/* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
Volume = π * Raio2 * Altura*/

import java.util.Scanner;
public class L1Ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double volume, raio, altura;

        System.out.println("Informe o raio: ");
        raio = entrada.nextDouble();

        System.out.println("Informe a altura: ");
        altura = entrada.nextDouble();

        volume = 3.14 * Math.pow(raio, 2) * altura;
        System.out.println("O volume da lata é igual a : " + volume);
        
    }
}
