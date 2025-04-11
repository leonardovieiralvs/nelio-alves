package introducaoCursoJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.print("Digite quantidade de deseja repetir o LOOP: ");
        int loop = input.nextInt();
        for (int i = 0; i < loop; i++) {
            System.out.print("Digite o desejado numero: ");
            int num = input.nextInt();
            if (num >= 10 && num <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
        input.close();
    }
}
