/* Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
1 até 500. */
import java.util.Scanner;
public class L3Ex003 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int sum = 0, count;

        /* USANDO O FOR */
        for (count = 0; count <= 500; count += 2) {
            sum = sum + count;
        }
        System.out.println("A soma dos valores pares existentes na faixa de 1 até 500 é: " + sum);

        /* USANDO FOR E IF */
        sum = 0;
        for (count = 1; count <= 500; count ++) {
            if (count%2==0)
            sum = sum + count;
        }
        System.out.println("A soma dos valores pares existentes na faixa de 1 até 500 é: " + sum);


        /* USANDO WHILE */
        sum = 0;
        count = 0;
        while (count <= 500){
            sum = sum + count;
            count = count + 2;
        }
        System.out.println("A soma dos valores pares existentes na faixa de 1 até 500 é: " + sum);

        /* USANDO DO WHILE */
        sum = 0;
        count = 0;

        do {
            sum = sum + count;
            count = count + 2;
        } while (count <=500);
        System.out.println("A soma dos valores pares existentes na faixa de 1 até 500 é: " + sum);
    }
}
