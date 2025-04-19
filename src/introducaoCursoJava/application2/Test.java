package introducaoCursoJava.application2;


import introducaoCursoJava.application2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        Product product1 = new Product(name, price);


        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        product.addProducts(add);
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        product.removeProducts(remove);
        System.out.println("Updated data: " + product);
        System.out.println(product1);
    }
}
