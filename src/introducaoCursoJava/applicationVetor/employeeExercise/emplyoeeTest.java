package introducaoCursoJava.applicationVetor.employeeExercise;

import java.util.*;
import java.util.stream.Collectors;

public class emplyoeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Emplyoee emp = new Emplyoee();
        List<Emplyoee> list = new ArrayList<>();

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
            list.add(emp);
        }

        System.out.print("Enter the emplyoee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = hasId(list, idSalary);
        if (pos == null) {
            System.out.println("This id does not exist! ");
            System.out.println(" ");
        } else {
            System.out.print("Enter the percentage: ");
            int percentage = sc.nextInt();
            list.get(pos).increaseSalary(percentage);
        }
//
//        Emplyoee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
//        if (emp == null) {
//
//            System.out.println(" ");
//        } else {
//            System.out.print("Enter the percentage: ");
//            int percentage = sc.nextInt();
//            emp.increaseSalary(percentage);
//        }
//
        System.out.println("List of Emplyooes: ");
        for (Emplyoee emplyoee : list) {
            System.out.println(emplyoee);
        }


    }

    public static Integer hasId(List<Emplyoee> emp, int id) {
        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

