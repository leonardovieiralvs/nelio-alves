package lGenerics.exercises.generics;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        PrintService<String> ps = new PrintService<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many values? ");
        int contador = sc.nextInt();

        for (int i = 0; i < contador; i++) {
            String num = sc.next();
            ps.addValue(num);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);
    }
}
