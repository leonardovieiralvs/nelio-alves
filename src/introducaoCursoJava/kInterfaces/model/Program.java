package introducaoCursoJava.kInterfaces.model;

import introducaoCursoJava.kInterfaces.model.services.BrazilTaxService;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Entre com os dados do aluguel ");
//        System.out.print("Modelo do carro: ");
//        String car = sc.next();
//        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
//        sc.next();
//        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
//        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
//        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
//        System.out.print("Entre com o preço por hora: ");
//        double pricePerHour = sc.nextDouble();
//        System.out.print("Entre com o preço por dia: ");
//        double pricePerDay = sc.nextDouble();
//        CarRental carRental = new CarRental(start, finish, new Vehicle(car));

        BrazilTaxService brazilTaxService = new BrazilTaxService();

        System.out.println(brazilTaxService.tax(100));
    }
}
