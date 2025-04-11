package introducaoCursoJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double conta = 50;
        int minuto;

        Scanner input = new Scanner(System.in);
        System.out.println("Minutos usados no plano telefonico: ");
        minuto = input.nextInt();
        if (minuto > 100) {
            conta += (minuto - 100) * 2;
        }
        System.out.printf("Valor a pagar: R$ %.2f%n", + conta);
        input.close();
    }
}
