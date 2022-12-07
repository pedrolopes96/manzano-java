/* Ler 8 elementos em uma matriz A tipo vetor. Construir uma matriz B de mesma dimensão com os
elementos da matriz A multiplicados por 3. O elemento B[i] deverá ser implicado pelo elemento
A[i]*3, o elemento B[2] implicado pelo elemento A[2]*3 e assim por diante, até 8. Apresentar o vetor
B. */

import java.util.Scanner;
public class L6Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int [8];
        int b[] = new int [8];
        int cont;
        for (cont = 0; cont <8; cont ++){
            System.out.println("Digite o " + (cont+1) + " ° valor de A: ");
            a[cont] = scanner.nextInt();
            b[cont] = a[cont] * 3;
        }
        System.out.println("Vetor B: ");
        for (cont = 0; cont < 8; cont++)
        System.out.println("B["+ (cont) + "] " + b[cont]);

        scanner.close();
        
     
    }
}
