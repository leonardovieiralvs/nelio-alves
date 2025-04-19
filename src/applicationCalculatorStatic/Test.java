package applicationCalculatorStatic;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

//        double circumference = Calculator.circumference(radius);
//        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI: %.2f%n", Calculator.PI);
    }
}
