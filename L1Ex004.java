/* Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Possuindo o valor da
distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
LITROS_USADOS = DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

import java.util.Scanner;
public class L1Ex004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tempo, velocidade, distancia, litrosUsados;

        System.out.println("Informe a distância percorrida em km: ");
        distancia = entrada.nextDouble();

        System.out.println("Informe o tempo de viagem: ");
        tempo = entrada.nextDouble();

        velocidade = distancia / tempo;
        System.out.println("A velocidade média desenvolvida em km/h no trajeto foi de: " + velocidade);
        

        litrosUsados = distancia / 12;
        System.out.println("O consumo de combustível em litros nessa viagem foi de: " + litrosUsados);
        
    }
}