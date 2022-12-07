/* Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */
import java.util.Scanner;
public class L3Ex002 {
    public static void main(String[] args) {
        int sum = 0, count;

        /* USANDO O FOR */
        for ( count = 1; count <= 100; count += 1 ) {
            sum = sum + count;
            
        }
        System.out.println("Essa é a soma dos cem primeiros números inteiros: " + sum );

        /* USANDO O WHILE */
        sum = 0;
        count = 0;

        while (count <= 100) {
            sum = sum + count;
            count += 1;
        }
        System.out.println("Essa é a soma dos cem primeiros números inteiros: " + sum );

        /* USANDO DO WHILE */
        sum = 0;
        count = 0;

        do {
            sum = sum + count;
            count += 1;
        } while (count <= 100);
        System.out.println("Essa é a soma dos cem primeiros números inteiros: " + sum );
    }
}
