/* Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor. */
import java.util.Scanner;
public class L2Ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, resultado;

        System.out.println("Informe o primeiro valor: ");
        a = entrada.nextDouble();

        System.out.println("Informe o segundo valor: ");
        b = entrada.nextDouble();

        if (a > b) {
            resultado = a - b;
            System.out.println("O resultado de a - b é igual: " + resultado);
        }
        else {
            resultado = b - a;
            System.out.println("O resultado de b - a é igual: " + resultado);
            
        }
    }
}
