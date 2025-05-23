package introducaoCursoJava.ePedidos;

import introducaoCursoJava.ePedidos.entitites.Client;
import introducaoCursoJava.ePedidos.entitites.Order;
import introducaoCursoJava.ePedidos.entitites.OrderItem;
import introducaoCursoJava.ePedidos.entitites.Product;
import introducaoCursoJava.ePedidos.entitites.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date: (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println("Enter order data: ");
        System.out.println("Status: "+ OrderStatus.PROCESSING);
        Client client = new Client(name, email, birthDate);

        System.out.print("How many item to this order? ");
        int itemsOrder = sc.nextInt();

        for (int i = 0; i < itemsOrder; i++) {
            System.out.print("Enter #"+i+ " item data: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double produtctPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

           OrderItem itens = new OrderItem(quantity, produtctPrice, new Product(productName));
           order.addItem(itens);
        }

        System.out.println("ORDER SUMARY: ");
        System.out.println("Order moment: "+ LocalDateTime.now().format(formatter));
        System.out.println("Order status: "+ OrderStatus.PROCESSING);
        System.out.println("Client: "+ client);
        System.out.println("Order Items: ");
    }
}
