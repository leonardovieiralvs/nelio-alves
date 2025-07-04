package introducaoCursoJava.KInterfaces.model;

import introducaoCursoJava.KInterfaces.model.entites.CarRental;
import introducaoCursoJava.KInterfaces.model.entites.Vehicle;
import introducaoCursoJava.KInterfaces.model.services.BrazilTaxService;
import introducaoCursoJava.KInterfaces.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel ");
        System.out.print("Modelo do carro: ");
        String car = sc.next();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        sc.nextLine();
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental carRental = new CarRental(start, finish, new Vehicle(car));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService service = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        service.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

    }
}
