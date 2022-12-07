/* Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3. */
import java.util.Scanner;
public class L2Ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d, resultado;

        System.out.println("Informe o primeiro valor: ");
        a = entrada.nextDouble();

        System.out.println("Informe o segundo valor: ");
        b = entrada.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        c = entrada.nextDouble();

        System.out.println("Informe o quarto valor: ");
        d = entrada.nextDouble();
        
        System.out.println("São divisíveis por 2 e 3: ");
        if (a % 6 == 0)
        System.out.println(a);
        if (b % 6 == 0)
        System.out.println(b);
        if (c % 6 == 0)
        System.out.println(c);
        if (d % 6 == 0)
        System.out.println(d);
    }
}
