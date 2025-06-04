package introducaoCursoJava.iExceptions.exerciseExceptions.entities;

import introducaoCursoJava.iExceptions.domainexceptions.DomainException;
import introducaoCursoJava.iExceptions.exerciseExceptions.entities.domainexcpetions.DomainExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdraw = sc.nextDouble();
        Account acc = new Account(number, holder, balance, withdraw);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double withdrawl = sc.nextDouble();
        try {
            acc.withdraw(withdrawl);
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));

        } catch (DomainExceptions e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
