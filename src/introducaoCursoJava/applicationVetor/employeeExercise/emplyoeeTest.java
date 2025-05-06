package introducaoCursoJava.applicationVetor.employeeExercise;

import java.util.*;
import java.util.stream.Collectors;

public class emplyoeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Emplyoee emp = new Emplyoee();
        List<Emplyoee> emplyoees = new ArrayList<>();

        System.out.print("How many emplyoees will be registered? ");
        int cont = sc.nextInt();


        for (int i = 0; i < cont; i++) {
            System.out.println();
            System.out.println("Emplyoee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emp = new Emplyoee(id, name, salary);
            emplyoees.add(emp);
        }

        System.out.print("Enter the emplyoee id that will have salary increase: ");
        int i = sc.nextInt();
        emp = null;
        for (Emplyoee e : emplyoees) {
            if (e.getId() == i) {
                emp = e;
                break;
            }
        }

        if (emp != null) {
            System.out.println();
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exists! ");
        }

        System.out.println("List of emplyoee");
        for (Emplyoee emplyoee : emplyoees) {
            System.out.println(emplyoee);
        }


    }
}
