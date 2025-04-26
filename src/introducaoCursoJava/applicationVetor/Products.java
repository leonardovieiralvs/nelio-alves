package introducaoCursoJava.applicationVetor;

public class Products {
    private String name;
    private double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //    public void addProducts(String[] productName) {
//
//    }
//
//    public Double sumPrices(double[] sumPrices) {
//        return this.price += sumPrices[3];
//    }
}
