package introducaoCursoJava.applicationFContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ContaBacaria contaBacaria;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit? (y/n)? ");
        String resp = sc.next();
//        char resp = sc.next().charAt(0);
        if (resp.equalsIgnoreCase("y")) {
            System.out.print("Enter inital deposit value: ");
            double initialDeposit = sc.nextDouble();
            contaBacaria = new ContaBacaria(accountNum, name, initialDeposit);
        } else {
            contaBacaria = new ContaBacaria(accountNum, name);
        }

        System.out.println("\nAccount data: ");
        System.out.println(contaBacaria);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        contaBacaria.balanceAccount(deposit);

        System.out.println("\nUpdate data: ");
        System.out.println(contaBacaria);

        System.out.print("\nEnter a withdrawl value: ");
        double withdraw = sc.nextDouble();
        contaBacaria.withdrawAccount(withdraw);

        System.out.println("Update data: ");
        System.out.println(contaBacaria);


    }
}