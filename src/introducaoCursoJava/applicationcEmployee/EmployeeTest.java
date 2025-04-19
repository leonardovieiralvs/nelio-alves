package introducaoCursoJava.applicationcEmployee;

import introducaoCursoJava.applicationcEmployee.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter employee data");
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: "+ employee);

        System.out.print("Which porcentage to increase salary? ");
        double porcentage = sc.nextDouble();

        employee.increaseSalary(porcentage);
        System.out.println("Updated employee: "+employee);
    }
}
