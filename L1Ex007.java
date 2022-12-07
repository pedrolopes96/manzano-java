/* Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na
utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
multiplicação e apresentar doze resultados de saída. */

import java.util.Scanner;
public class L1Ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d;

        System.out.println("a: ");
        a = entrada.nextDouble();

        System.out.println("b: ");
        b = entrada.nextDouble();

        System.out.println("c: ");
        c = entrada.nextDouble();

        System.out.println("d: ");
        d = entrada.nextDouble();

        System.out.println("a + b= " + (a + b));
        System.out.println("a + c= " + (a + c));
        System.out.println("a + d= " + (a + d));
        System.out.println("b + c= " + (b + c));
        System.out.println("b + d= " + (b + d));
        System.out.println("c + d= " + (c + d));

        System.out.println("a * b= " + a * b);
        System.out.println("a * c= " + a * c);
        System.out.println("a * d= " + a * d);
        System.out.println("b * c= " + b * c);
        System.out.println("b * d= " + b * d);
        System.out.println("c * d= " + c * d);

    }
    
}
