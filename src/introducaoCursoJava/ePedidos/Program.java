package introducaoCursoJava.ePedidos;

import introducaoCursoJava.ePedidos.entitites.Client;
import introducaoCursoJava.ePedidos.entitites.Order;
import introducaoCursoJava.ePedidos.entitites.OrderItem;
import introducaoCursoJava.ePedidos.entitites.Product;
import introducaoCursoJava.ePedidos.entitites.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        OrderItem orderItem = new OrderItem();

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date: (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());

        Order order = new Order(new Date(), status, client);
        System.out.print("How many item to this order? ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Enter #"+(i+1)+ " item data: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double produtctPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

           Product product = new Product(productName, produtctPrice);
           OrderItem it = new OrderItem(quantity, produtctPrice, product);
           order.addItem(it);
        }

        System.out.println(order);
    }
}
