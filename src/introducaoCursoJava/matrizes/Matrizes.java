package introducaoCursoJava.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[][] vect = new int[3][3];

        System.out.print("Digite o valor da Matriz: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Valor: ");
                vect[i][j] = sc.nextInt();
            }
        }


        int result = 0;
        System.out.println("Main diagonal: ");
        for (int i = 0; i < num; i++) {
            System.out.print(" " + vect[i][i]);
            for (int j = 0; j < num; j++) {
                if (vect[i][j] < 0) {
                    result++;
                }
            }
        }
        System.out.println("\nNegative numbers = " + result);
    }
}
