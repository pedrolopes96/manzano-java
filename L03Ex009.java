/* Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
somatório e a média aritmética dos valores lidos. */
import java.util.Scanner;
public class L03Ex009 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        double count = 1, value, result = 0;

        do {
            System.out.println("Insira " + count + "° número");
            value = entrance.nextDouble();
            result = result + value;
            count ++;
        } while (count <= 10); 
            System.out.println("A soma dos 10 valores digitados é: " + result);
            System.out.println("A média dos 10 valores digitados é: " + result/10);
    }
}
