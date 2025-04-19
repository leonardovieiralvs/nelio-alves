package applicationCalculatorStatic;

public class Calculator {
    public final static double PI = 3.14159;
    public final static double PORCENTAGE = 6.0;

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

    public static double currencyConverter(double price, double change) {
//        double result = price * change * PORCENTAGE / 100;
//        return price * change + result;
        return price * change * (1 + PORCENTAGE / 100);
    }
}
