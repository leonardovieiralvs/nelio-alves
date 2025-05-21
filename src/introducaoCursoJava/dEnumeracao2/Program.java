package introducaoCursoJava.dEnumeracao2;

import introducaoCursoJava.dEnumeracao2.entities.enums.WorkerLevel;
import introducaoCursoJava.dEnumeracao2.entities.Departament;
import introducaoCursoJava.dEnumeracao2.entities.Worker;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Worker worker = new Worker();


        System.out.print("Enter departament's name: ");
        String departmentName = sc.nextLine();
        Departament department = new Departament(departmentName);
        System.out.println("Enter name data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine().toUpperCase());
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();


        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for (int i = 0; i < contracts; i++) {
            System.out.println("Enter contract #"+(i+1)+ "data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String date = sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String date = sc.next();
    }
}
