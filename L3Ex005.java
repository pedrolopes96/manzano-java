/* Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). */
public class L3Ex005 {
    public static void main(String[] args) {
        double base = 3, exp, resultado;

        /* USANDO FOR */
        for (exp = 0; exp <= 15; exp ++ ){
            resultado = Math.pow(base, exp);
            System.out.println(resultado);
        }

        /* USANDO WHILE */
        resultado = 1;
        exp = 0;
        while (exp <= 15) {
            resultado = Math.pow(base, exp);
            System.out.println(resultado);
            exp++; 
        }

        /* USANDO DO WHILE */
        resultado = 1;
        exp = 0;
        do {
            resultado = Math.pow(base, exp);
            System.out.println(resultado);
            exp++;
        } while(exp <= 15);

    }
    
}
