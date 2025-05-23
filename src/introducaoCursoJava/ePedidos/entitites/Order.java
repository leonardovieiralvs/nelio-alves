package introducaoCursoJava.ePedidos.entitites;

import introducaoCursoJava.ePedidos.entitites.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Client client, OrderStatus status, Date moment) {
        this.client = client;
        this.status = status;
        this.moment = moment;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total(Double price, Integer quantity) {
        double sum = 0;
        for (OrderItem orderItem : items) {
            sum += price * quantity;
        }
        return sum;
    }
}
