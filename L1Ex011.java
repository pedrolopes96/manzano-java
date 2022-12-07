/* Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
com o usuário, para que seja apresentado o valor em moeda americana. */

import java.util.Scanner;

public class L1Ex011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double cotacaoDolar, saldoDisponivel, conversaoDolar;

        System.out.println("Informe a cotação do dólar: ");
        cotacaoDolar = entrada.nextDouble();

        System.out.println("Informe o saldo disponível em reais: ");
        saldoDisponivel = entrada.nextDouble();

        conversaoDolar = saldoDisponivel / cotacaoDolar;
        System.out.println("O valor convertido para dólares é: " + conversaoDolar);
    }
}
