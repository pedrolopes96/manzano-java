/* Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. */

import java.util.Scanner;
public class L3Ex001 {
    public static void main(String[] args) {
    Scanner entrance = new Scanner(System.in);
     int number, count;
     
     System.out.println("Informe um número: ");
     number = entrance.nextInt();
     
     /* USANDO FOR: */
     for (count = 1; count <= 10 ; count ++) {
        System.out.println(number + "*" + count + "=" + number * count);
     }

     /* USANDO O WHILE: */
     count = 1;
     while (count <= 10) {
        System.out.println(number + "*" + count + "=" + number * count);
        count++;
     }

     /* USANDO DO WHILE: */
     count = 0;
     do {
        count++;
        System.out.println(number + "*" + count + "=" + number * count);
     }while (count<10);

    }
}
