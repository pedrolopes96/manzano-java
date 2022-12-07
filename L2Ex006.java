/* Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente. */
import java.util.Scanner;
public class L2Ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, auxiliar;

        System.out.println("Informe o primeiro valor: ");
        a = entrada.nextDouble();

        System.out.println("Informe o segundo valor: ");
        b = entrada.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        c = entrada.nextDouble();

        if ( a > b ) {
            auxiliar = a;
            a = b;
            b = auxiliar;
        }
        if ( a > c ) {
            auxiliar = a;
            a = c;
            c = auxiliar;
        }
        if ( b > c ) {
            auxiliar = b;
            b = c;
            c = auxiliar;
        }
        System.out.println(a + ", " + b + "," + c);
    }
}
