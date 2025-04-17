package introducaoCursoJava.application2.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    @Override
    public String toString() {
        return name + ", $"+price+ ", " + quantity + " units, Total: $" + totalValueInStock();
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }


    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
}
