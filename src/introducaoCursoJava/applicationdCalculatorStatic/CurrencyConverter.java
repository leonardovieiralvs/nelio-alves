package introducaoCursoJava.applicationdCalculatorStatic;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollar will be bought: ");
        double change = sc.nextDouble();
        double v = Calculator.currencyConverter(price, change);
        System.out.printf("Amount to be paid in reais = %.2f%n", v);

        sc.close();
    }
}
