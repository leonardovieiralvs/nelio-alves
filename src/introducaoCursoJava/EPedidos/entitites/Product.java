package introducaoCursoJava.EPedidos.entitites;

import java.util.List;
import java.util.function.Predicate;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public static String UpperCaseName(Product p) {
        return p.getName().toUpperCase();
    }

    public double filterInitial(List<Product> product, Predicate<Product> criterio) {
        double sum = 0.0;
        for (Product p : product) {
            if (criterio.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
