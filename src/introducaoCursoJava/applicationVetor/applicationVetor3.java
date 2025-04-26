package introducaoCursoJava.applicationVetor;

import java.util.Locale;
import java.util.Scanner;

public class applicationVetor3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade que de produtos que deseja inserir: ");
        int num = sc.nextInt();

        Products[] products = new Products[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Product: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Value: ");
            double price = sc.nextDouble();
            products[i] = new Products(name, price);
        }

        double soma = 0;
        for (Products product : products) {
            soma += (product.getPrice()) / 3;
        }

        System.out.println(soma);
    }
}
