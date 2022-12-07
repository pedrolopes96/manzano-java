/* Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
conversão é C = (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/
import java.util.Scanner;

public class L1Ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Informe a temperatura em fahrenheit: ");
        fahrenheit = entrada.nextDouble();

        celsius = (fahrenheit - 32) * 5/9;

        System.out.println("A temperatura em celsius é: " + celsius);
    }
}
