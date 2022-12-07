/* Ler 10 elementos de uma matriz tipo vetor e apresentá-los. */
import java.util.Scanner;
public class L6Ex001 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int num [] = new int[5];
        int count;
        for (count = 0; count < 5; count++){
            System.out.println("Digite o " + (count+1) + "° número: ");
            num[count] = entrance.nextInt();
        }
        System.out.println("Estes foram os números digitados: ");
        for (count = 0; count < 5; count++) {
            System.out.println("Posição " + (count) + " número: " + num[count]);
        }
    }
}