/* Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores. */
import java.util.Scanner;
public class L2Ex008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d, e, maior, menor;

        System.out.print("Informe um número: ");
        a = entrada.nextInt();
        maior = menor = a;
        
        System.out.print("Informe outro número: ");
        b = entrada.nextInt();
        if (b > maior)
            maior = b;
        if (b < menor)
            menor = b;

        System.out.print("Informe outro número: ");
        c = entrada.nextInt();
        if (c > maior)
            maior = c;
        if (c < menor)
            menor = c;

        System.out.print("Informe outro número: ");
        d = entrada.nextInt();
        if (d > maior)
            maior = d;
        if (d < menor)
            menor = d;

        System.out.print("Informe outro número: ");
        e = entrada.nextInt();
        if (e > maior)
            maior = b;
        if (e < menor)
            menor = e;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
