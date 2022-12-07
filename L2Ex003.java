/* Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
valor da média do aluno para qualquer condição. */
import java.util.Scanner;
public class L2Ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d, media;

        System.out.println("Informe a primeira nota: ");
        a = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        b = entrada.nextDouble();

        System.out.println("Informe a terceira nota: ");
        c = entrada.nextDouble();

        System.out.println("Informe a quarta nota: ");
        d = entrada.nextDouble();

        media = (a + b + c + d) / 4;

        if ( media >= 5) {
            System.out.println("Parabéns o aluno foi aprovado com média: " + media);
        }
        else {
            System.out.println("O aluno está reprovado com média: " + media);
        }
    }
}
