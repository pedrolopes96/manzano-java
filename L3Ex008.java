/* Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
programa deve apresentar os valores das duas temperaturas. A fórmula de conversão
é sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */
import java.util.Scanner;
public class L3Ex008 {
    public static void main(String[] args) {

        for (double celsius = 1; celsius <= 10; celsius++) {
            System.out.println(celsius * 10 + "°C = " + (90 * celsius + 160) / 5 + "°F" );
        }
    }
}
