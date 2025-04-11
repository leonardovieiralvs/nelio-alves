package introducaoCursoJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero que corresponde o dia da semana: ");
        int dia = input.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira"); break;
            case 2:
                System.out.println("Terça-feira");
            case 3:
                System.out.println("Quarta-feira");
            case 4:
                System.out.println("Quinta-feira");
            case 5:
                System.out.println("Sexta-feira");
            case 6:
                System.out.println("Sábado");
            default:
                System.out.println("Domingo");
        }
    }
}
