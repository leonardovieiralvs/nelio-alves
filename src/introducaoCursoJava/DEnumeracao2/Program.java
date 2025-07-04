package introducaoCursoJava.DEnumeracao2;

import introducaoCursoJava.DEnumeracao2.entities.HourContract;
import introducaoCursoJava.DEnumeracao2.entities.enums.WorkerLevel;
import introducaoCursoJava.DEnumeracao2.entities.Departament;
import introducaoCursoJava.DEnumeracao2.entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter departament's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter name data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));


        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for (int i = 0; i < contracts; i++) {
            System.out.println("Enter contract #"+(i+1)+ "data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();

            HourContract hourContract = new HourContract(contractDate, valuePerHour, hour);
            worker.addContract(hourContract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+worker.getName());
        System.out.println("Departament: "+worker.getDepartament().getName());
        System.out.println("Income for "+monthAndYear+ ": "+ String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
