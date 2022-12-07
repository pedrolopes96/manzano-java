/* Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de
segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o
referido cálculo. Lembre-se de que a variável A deve ser diferente de zero. */
import java.util.Scanner;
public class L2Ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Informe o valor de a: ");
        a = entrada.nextDouble();
        if (a != 0){
            System.out.println("Informe o valor de b: ");
            b = entrada.nextDouble();
            System.out.println("Informe o valor de c: ");
            c = entrada.nextDouble();
            delta = Math.pow(b, 2) - 4 * a * c;
            System.out.println("Delta = " + delta);
            if (delta > 0) {
                x1 = (((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("O valor de x': " + x1);
                x2 = (((-b - Math.sqrt(delta)) / (2 * a)));
                System.out.println("O valor de x'': " + x2);
            }
            else {
                System.out.println("Não existem raízes reais para delta < 0");
            }
        }
        else {
            System.out.println("Uma equação do segundo grau só é completa quando a é diferente de 0");
        }
    }
    
}
