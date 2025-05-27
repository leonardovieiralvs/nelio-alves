package introducaoCursoJava.fHerançaEPolimorfismo;

import introducaoCursoJava.fHerançaEPolimorfismo.entities.Employee;
import introducaoCursoJava.fHerançaEPolimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<>();
        List<OutsourcedEmployee> outEmp = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Employee #"+i+" data: ");
            System.out.print("Outsourced (y/n)? ");
            char character = sc.next().charAt(0);
            if (character == 'n') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();

                Employee employee = new Employee(name, hours, valuePerHour);
                emp.add(employee);
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                Double additional = sc.nextDouble();

                OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                outEmp.add(outsourcedEmployee);
            }

        }
    }
}
