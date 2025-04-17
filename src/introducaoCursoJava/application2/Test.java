package introducaoCursoJava.application2;


import introducaoCursoJava.application2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product);
        System.out.print("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        product.addProducts(add);

        System.out.print("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        product.removeProducts(remove);
    }
}
