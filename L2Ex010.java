/* Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas mensagens: "O valor está na faixa permitida", caso o usuário forneça o valor nesta faixa, ou a mensagem "O valor está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9. */
import java.util.Scanner;
public class L2Ex010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("Informe um valor: ");
        valor = entrada.nextInt();

        if (valor >= 1 && valor <= 9 ) {
            System.out.println("O valor digitado é " + valor + ". Está dentro da faixa permitida.");
        }
        else {
            System.out.println("O valor informado está fora da faixa permitida.");
        }
    }
}
