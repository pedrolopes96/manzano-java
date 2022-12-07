/* Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da
mensagem de saudação o nome previamente informado. */
import java.util.Scanner;
public class L2Ex012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char sex;
        String name;

        System.out.println("Informe o seu nome: ");
        name = entrada.nextLine();
        System.out.println("Informe o seu sexo (M/F) ");
        sex = entrada.next().charAt(0);

        if (sex == 'F' || sex == 'f')
            System.out.println("Ilma Sra. " + name);
        else
            System.out.println("Ilmo Sr. " + name);
    }
}
