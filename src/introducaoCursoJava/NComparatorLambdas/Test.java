package introducaoCursoJava.NComparatorLambdas;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Jabuticaba", 2.80));
        list.add(new Product("Bis", 8.50));
        list.add(new Product("Abobora", 2.70));
        list.add(new Product("Caju", 5.0));

        Comparator<Product> comp = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Collections.sort(list);

        for (Product p : list) {
            System.out.println(p);
        }
        System.out.println("--");
        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p); 
        }

    }
}
