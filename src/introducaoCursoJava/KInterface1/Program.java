package introducaoCursoJava.KInterface1;

import introducaoCursoJava.KInterface1.entitites.Contract;
import introducaoCursoJava.KInterface1.entitites.Installment;
import introducaoCursoJava.KInterface1.service.ContractService;
import introducaoCursoJava.KInterface1.service.PaypalService;

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
        int num = sc.nextInt();


        ContractService service = new ContractService(new PaypalService());

        service.processContract(obj, num);

        System.out.println("FATURA: ");
        for (Installment installment : obj.getInstallment()) {
            System.out.println(installment);
        }
    }
}
