package introducaoCursoJava.IGenerics.exercises.calculationService;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }



    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
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
