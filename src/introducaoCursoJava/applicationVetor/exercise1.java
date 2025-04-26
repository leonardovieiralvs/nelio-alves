package introducaoCursoJava.applicationVetor;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int cont = sc.nextInt();

        int[] negativos = new int[1];
        for (int i = 0; i < cont; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            if (num == -1) {
                negativos[0] = num;
            }
        }

        for (int negativo : negativos) {
            System.out.println(negativo);
        }

    }
}
