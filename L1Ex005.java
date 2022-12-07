/* Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
PRESTACAO = (VALOR + VALOR * TAXA/100 * TEMPO). */

import java.util.Scanner;
public class L1Ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double prestacao, valor, taxa, tempo;

        System.out.println("Informe o valor em reais: ");
        valor = entrada.nextDouble();

        System.out.println("Informe a taxa em porcentagem: ");
        taxa = entrada.nextDouble();

        System.out.println("Informe o  tempo em meses: ");
        tempo = entrada.nextDouble();

        prestacao = (valor + valor * taxa/100 * tempo);
        System.out.println("O valor da prestação é: " + prestacao);
    }
}
