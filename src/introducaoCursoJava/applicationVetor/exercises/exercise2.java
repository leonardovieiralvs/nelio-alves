package introducaoCursoJava.applicationVetor.exercises;

import java.util.Locale;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você quer digitar? ");
        int cont = sc.nextInt();

        double[] vect = new double[cont];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            vect[i] = num;
        }

        System.out.print("VALORES = ");
        for (double value : vect) {
            System.out.print(value+" ");
        }

        double sum = 0;
        for (double soma : vect) {
            sum += soma;
        }
        System.out.println("\nSOMA = "+sum);

        double total = sum / cont;
        System.out.println("MEDIA = "+total);

        sc.close();
    }
}
