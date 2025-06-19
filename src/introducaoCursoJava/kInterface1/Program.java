package introducaoCursoJava.kInterface1;

import introducaoCursoJava.kInterface1.entitites.Contract;
import introducaoCursoJava.kInterface1.entitites.Installment;
import introducaoCursoJava.kInterface1.service.ContractService;
import introducaoCursoJava.kInterface1.service.OnlinePaymentService;
import introducaoCursoJava.kInterface1.service.PaypalService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Installment> listInstallment = new ArrayList<>();

        System.out.println("Entre com os dos do contrato");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int numInstallment = sc.nextInt();


        ContractService service = new ContractService();

        service.processContract(obj, numInstallment);


    }
}
