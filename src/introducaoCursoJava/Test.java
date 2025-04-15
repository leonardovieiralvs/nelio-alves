package introducaoCursoJava;

import java.util.Scanner;

class Compare {
    public void showResult(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Compare compare = new Compare();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        compare.showResult(a, b, c);
    }
}
