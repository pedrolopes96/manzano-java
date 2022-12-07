/* Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial. */
import java.util.Scanner;
public class L3Ex011 {
   public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        float width, length, totalSpace = 0;
        String space;
        char answer;

        System.out.println("Deseja informar um cômodo? ");
        answer = entrance.next().charAt(0);
        entrance.nextLine();

        while (answer == 's' || answer == 'S') {
            System.out.println("Qual cômodo deseja inserir? ");
            space = entrance.nextLine();
            System.out.println("Informe a largura desse cômodo: ");
            width = entrance.nextFloat ();
            System.out.println("Informe o comprimento desse cômodo: ");
            length = entrance.nextFloat ();
            totalSpace = totalSpace + width * length;
            System.out.println("Deseja informar outro cômodo? ");
            answer = entrance.next().charAt(0);
            entrance.nextLine();
        }
        System.out.println("A área total da residência é: " + totalSpace);
    
   } 
}
