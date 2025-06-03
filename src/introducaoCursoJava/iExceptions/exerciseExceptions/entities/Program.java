package introducaoCursoJava.iExceptions.exerciseExceptions.entities;

import introducaoCursoJava.iExceptions.domainexceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
Account acc = new Account();

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdraw = sc.nextDouble();
            acc.deposit(withdraw);
            acc = new Account(number, holder, balance, withdraw);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawl = sc.nextDouble();
            acc.withdraw(withdrawl);
            System.out.println("New balance: " + acc.getBalance());

        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
