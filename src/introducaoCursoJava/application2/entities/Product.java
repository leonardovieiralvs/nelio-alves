package introducaoCursoJava.application2.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    @Override
    public String toString() {
        return "Product data: "+name+", $"+price+", "+quantity+" units, Total: $"+totalValueInStock();
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
        updateData(quantity);
    }


    public void removeProducts(int quantity) {
        this.quantity -= quantity;
        updateData(quantity);
    }

    public void updateData(Object c) {
        System.out.println("Updated data: "+name+", $"+this.price+", "+this.quantity+" units, Total: $"+totalValueInStock());
    }
}
