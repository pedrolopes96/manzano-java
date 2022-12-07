/* Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9 * C + 160) / 5, sendo F a emperatura em Fahrenheit e C a temperatura em Celsius. */

import java.util.Scanner;

public class L1Ex001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double fahrenheit, celsius;

        System.out.println("Informe a temperatura em Celsius: ");
        celsius = entrada.nextDouble();

        fahrenheit = (9 * celsius + 160/ 5);
        
        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
    }
}