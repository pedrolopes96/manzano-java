/* Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da
média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.
Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta
condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição. */
import java.util.Scanner;
public class L2Ex004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d, media, exame, mediaFinal;

        System.out.println("Informe a primeira nota: ");
        a = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        b = entrada.nextDouble();

        System.out.println("Informe a terceira nota: ");
        c = entrada.nextDouble();

        System.out.println("Informe a quarta nota: ");
        d = entrada.nextDouble();

        media = (a + b + c + d) / 4;

        if (media > 7) {
            System.out.println("O aluno foi aprovado!!!");
        }
        else {
            System.out.println("Informe a nota do exame: ");
            exame = entrada.nextDouble();

            mediaFinal = (media + exame) /  2;

            if (mediaFinal >= 5 ) {
                System.out.println("Aluno aprovado no exame final, com média: " + mediaFinal);
            }
            else {
                System.out.println("Aluno reprovado, com méida: " + mediaFinal);
            }
        }
    }
}
