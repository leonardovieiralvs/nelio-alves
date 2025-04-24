package introducaoCursoJava.applicationVetor;

import java.util.Locale;
import java.util.Scanner;

public class applicationVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double [n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;
        System.out.println("AVERAGE HEIGHT: "+media);

//        System.out.println((vect[0] + vect[1] + vect[2]) / n);


//        double a = sc.nextDouble();
//        vect[0] = a;
//        double b = sc.nextDouble();
//        vect[1] = b;
//        double c = sc.nextDouble();
//        vect[2] = c;
//
//        double result = (vect[0] + vect[1] + vect[2]) / 3;
//        System.out.printf(String.format("%.2f%n", result));
        sc.close();
    }
}