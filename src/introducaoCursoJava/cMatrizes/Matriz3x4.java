package introducaoCursoJava.cMatrizes;

import java.util.Scanner;

public class Matriz3x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total de linhas: ");
        int line = sc.nextInt();
        System.out.print("Total de colunas: ");
        int col = sc.nextInt();

        int[][] mat = new int[line][col];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            System.out.println();
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }

        System.out.println();
        System.out.print("Qual numero deseja saber as parciais? ");
        int num = sc.nextInt();


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Position " + i + "," + j + ":");
                if (j > 0) {
                    System.out.println("Left: " + mat[i][j - 1]);
                }
                if (i > 0) {
                    System.out.println("Up: " + mat[i - 1][j]);
                }
                if (j < mat[i].length - 1) {
                    System.out.println("Right: " + mat[i][j + 1]);
                }
                if (i < mat.length - 1) {
                    System.out.println("Down: " + mat[i + 1][j]);
                }
            }
        }
    }
}

