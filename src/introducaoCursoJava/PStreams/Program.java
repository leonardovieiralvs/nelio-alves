package introducaoCursoJava.PStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.next();
        System.out.print("Enter salary: ");
        double salaryEmp = sc.nextDouble();

        List<Employee> emp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                emp.add(new Employee(fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> stringList = emp.stream().filter(e -> e.getSalary() > salaryEmp).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than " + salaryEmp + ":");
            stringList.forEach(System.out::println);

            double sum = emp.stream().filter(e -> e.getEmail().charAt(0) == 'm').map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);
            System.out.print("Sum of salary of people whose name starts with 'M': " + sum);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
