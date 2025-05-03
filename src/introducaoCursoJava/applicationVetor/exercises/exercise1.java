package introducaoCursoJava.applicationVetor.exercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int cont = sc.nextInt();

        int[] negativos = new int[cont];
        for (int i = 0; i < cont; i++) {
            System.out.print("Digite um numero: ");
            negativos[i] = sc.nextInt();
        }

        for (int negativo : negativos) {
            if (negativo < 0) {
                System.out.println(negativo);
            }
        }
    }
}
