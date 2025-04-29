package introducaoCursoJava.applicationVetor.exercises.Exercise3;

import introducaoCursoJava.applicationVetor.exercises.Exercise3.Entities.People;

import java.util.Locale;
import java.util.Scanner;

public class exercise3test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int cont = sc.nextInt();

        People[] people = new People[cont];

        for (int i = 0; i < cont; i++) {
            System.out.println("Dados da " + i + "a pessoa: ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            people[i] = new People(name, age, altura);
        }

        double sumAltura = 0;
        for (People person : people) {
            sumAltura += person.getAltura();
        }

        double media = sumAltura / cont;
        System.out.printf("Altura média: %.2f%n", media);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < cont; i++) {
            if (people[i].getAge() < 16) {
                System.out.println(people[i].getName());
            }
        }

    }
}
