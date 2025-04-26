package introducaoCursoJava.applicationVetor;

import java.util.Locale;
import java.util.Scanner;

public class applicationVetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade que de produtos que deseja inserir: ");
        int num = sc.nextInt();
        String[] product = new String[3];
        double[] value = new double[3];

        for (int i = 0; i < num; i++) {
            System.out.print("Product: ");
            product[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Value: ");
            value[i] = sc.nextDouble();
        }

        double sumProduct = 0;
        for (int i = 0; i < value.length; i++) {
            sumProduct += value[i];
        }

//        double sumProduct = 0;
//        for (double v : value) {
//            sumProduct += v;
//        }

        double media = sumProduct / num;
        System.out.println("AVERAGE PRICE: " + String.format("%.2f%n", media));
    }
}