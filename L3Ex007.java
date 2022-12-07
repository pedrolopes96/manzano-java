/* Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de
Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza
pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo
valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo
é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc. */
import java.util.Scanner;
public class L3Ex007 {
    public static void main(String[] args) {
        int a = 1, b = 0, c;
        Scanner entrada = new Scanner(System.in);

        for (int count = 1; count <= 15; count++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c + " ");
        }
    }
}