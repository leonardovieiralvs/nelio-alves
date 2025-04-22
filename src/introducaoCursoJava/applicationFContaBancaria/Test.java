package introducaoCursoJava.applicationFContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double deposit = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNum = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.next();
        System.out.print("Is there na initial deposit? (y/n)? ");
        String resp = sc.next();
        if (resp.equalsIgnoreCase("y")) {
            System.out.print("Enter inital deposit value: ");
            deposit = sc.nextDouble();
        }
        ContaBacaria contaBacaria = new ContaBacaria(accountNum, name, deposit);
        contaBacaria.balanceAccount(deposit);

        System.out.println("\nAccount data: ");
        System.out.println(contaBacaria);

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        contaBacaria.balanceAccount(deposit);

        System.out.println("\nUpdate data: ");
        System.out.println(contaBacaria);

        System.out.print("\nEnter a withdrawl value: ");
        double withdraw = sc.nextDouble();
        contaBacaria.withdrawAccount(withdraw);

        System.out.println("\nUpdate data: ");
        System.out.println(contaBacaria);


    }
}