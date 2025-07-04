package introducaoCursoJava.HExercicio.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            System.out.println("Tax payer #"+i+" data: ");
            System.out.print("Individual of Company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, health));
            } else {
                System.out.print("Number of employees: ");
                double nEmployees = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, nEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Pessoa pessoa : list) {
            System.out.println(pessoa.getName() + ": $ "+ String.format("%.2f", pessoa.tax()));
        }

        System.out.println();

        double sum = 0.0;
        for (Pessoa pessoa : list) {
            sum += pessoa.tax();
        }

        System.out.println("TOTAL TAXES: $ "+ sum);


    }
}
