/* Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo. */
import java.util.Scanner;
public class L3Ex004 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int count;

        /*USANDO O FOR */
        for (count = 0; count <= 20; count++)
            if (count % 2 != 0)
                System.out.println(count);

        /*USANDO O WHILE */
        count = 0;
        while (count <= 20) {
            if (count % 2 != 0)
                System.out.println(count);
            count ++;
        }

        /*USANDO DO WHILE */
        count = 0;
        do {
            if (count % 2 != 0)
                System.out.println(count);
            count ++;
        } while (count <= 20);       
    }
}
