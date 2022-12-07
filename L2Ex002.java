/* Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um
valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1. */
import java.util.Scanner;
public class L2Ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, resultado;

        System.out.println("Informe o primeiro número: ");
        a = entrada.nextDouble();

        if (a > 0) {
            System.out.println("O número informado é positivo e possui valor: " + a);
        }
        else if (a < 0) {
            a = a * -1;
            System.out.println("O valor informado é negativo e o seu módulo é igual: " + a);
        }
        else {
            System.out.println("O valor informado é nulo");
        }
    }
}
