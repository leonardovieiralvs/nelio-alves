package introducaoCursoJava.applicationVetor.exercises;

import java.util.Locale;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, maiorV;

        System.out.print("Quantos numeros você vai digitar? ");
        num = sc.nextInt();
        double[] numbers = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        maiorV = 0;
        for (int i = 0; i < num; i++) {
            if (numbers[i] < maiorV) {
                maiorV++;
            }
        }

        System.out.println("MAIOR VALOR = "+maiorV);









        sc.close();
    }
}
