package introducaoCursoJava.MHashCode_Set.Exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Set<Students> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for couse A? ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int num = sc.nextInt();
            set.add(new Students(num));
        }

        System.out.print("How many students for couse B? ");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            int num = sc.nextInt();
            set.add(new Students(num));
        }

        System.out.print("How many students for couse C? ");
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int num = sc.nextInt();
            set.add(new Students(num));
        }

        System.out.println(set.size());
    }
}
