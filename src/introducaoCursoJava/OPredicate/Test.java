package introducaoCursoJava.OPredicate;

import introducaoCursoJava.EPedidos.entitites.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.00));

        Product ps = new Product();
        double sum = ps.filterInitial(list, p -> p.getPrice() < 100);
        System.out.println("Price: " + String.format("%.2f", sum));

    }
}
