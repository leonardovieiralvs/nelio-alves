package introducaoCursoJava.ePedidos.entitites;

public class OrderItem {
    private Integer quantity;
    private Product product;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName()+", $");
        sb.append(price+", ");
        sb.append("Quantity: "+quantity);
        sb.append(subTotal());
        return sb.toString();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return quantity * price;
    }
}
