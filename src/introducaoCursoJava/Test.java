package introducaoCursoJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num = 0;
        int soma = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("[1] Alcool");
        System.out.println("[2] Gasolina");
        System.out.println("[3] Diesel");
        System.out.println("[4] Fim");
        while (num != 4) {
            System.out.println("#### Escolha o tipo do combustivel: ");
            num = input.nextInt();
            if (num == 1) {
                alcool++;
            } else if (num == 2) {
                gasolina++;
            } else if (num == 3) {
                diesel++;
            } else if (num == 4){
                System.out.println("MUITO OBRIGADO");
            } else {
                System.out.println("Numero invalido!");
            }
        }
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}
