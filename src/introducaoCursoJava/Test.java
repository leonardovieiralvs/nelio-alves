package introducaoCursoJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        input.close();
        System.out.println("O valor foi: "+x);
    }
}
