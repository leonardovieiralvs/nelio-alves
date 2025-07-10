package introducaoCursoJava.OPredicate;

import introducaoCursoJava.EPedidos.entitites.Product;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.00));

        list.removeIf(Product::staticProduct);
        for (Product product : list) {
            System.out.println(product);
        }

    }
}
