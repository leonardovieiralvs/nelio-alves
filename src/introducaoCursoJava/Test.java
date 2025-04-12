package introducaoCursoJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        System.out.print("Digite quantidade de deseja repetir o LOOP: ");
        int loop = input.nextInt();

        for (int i = 0; i < loop; i++) {
            System.out.print("Digite o desejado numero: ");
            double num = input.nextDouble();
            soma += (num) / loop;
        }
        System.out.printf("%.2f%n", soma);
        input.close();
    }
}
