/* Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
disponível com o usuário, para que seja apresentado o valor em moeda brasileira. */

import java.util.Scanner;
public class L1Ex010 {
    public static void main(String[] args) {
        double cotacaoDolar, saldoDisponivel, conversaoParaReal;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a cotação do dólar: ");
        cotacaoDolar = entrada.nextDouble();

        System.out.println("Informe a quantia disponível em dólares: ");
        saldoDisponivel = entrada.nextDouble();

        conversaoParaReal = cotacaoDolar * saldoDisponivel;
        System.out.println("O valor convertido para reais é: " + conversaoParaReal);
    }
}
