/* Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
portuguol (^). */
import java.util.Scanner;
public class L3Ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, exp, resultado, count;

        System.out.println("Informe o número da base: ");
        base = entrada.nextDouble();

        System.out.println("Informe o expoente: ");
        exp = entrada.nextDouble();

        resultado = Math.pow(base, exp);
        System.out.println("O resultado é: " + resultado);
    }
}
