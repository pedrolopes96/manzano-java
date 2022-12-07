/* Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
apresentação, caso o valor não seja maior que três. */

import java.util.Scanner;
public class L2Ex011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("Informe um valor: ");
        valor = entrada.nextInt();

        if (valor < 3 ) {
            System.out.println("O valor digitado é " + valor + ". Está dentro da faixa permitida.");
        }
        else {
            System.out.println("O valor informado está fora da faixa permitida.");
        }
    }
}
