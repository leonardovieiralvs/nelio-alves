package introducaoCursoJava.FHerançaEPolimorfismo;

import introducaoCursoJava.FHerançaEPolimorfismo.entities.Employee;
import introducaoCursoJava.FHerançaEPolimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char character = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (character == 'y') {
                System.out.print("Additional: ");
                double additional = sc.nextDouble();
                Employee outEmp = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                list.add(outEmp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
