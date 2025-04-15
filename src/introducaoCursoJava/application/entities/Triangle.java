package introducaoCursoJava.application.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;


    public double resultSides(double a, double b, double c) {
        double result = (a + b + c) / 2;
        result = Math.sqrt(result * (result - a) * (result - b) * (result - c));
        return result;
    }

    public static void higherResult(double valueOne, double valueTwo) {
        if (valueOne > valueTwo) {
            System.out.printf("Triangle area: %.4f%n", valueOne);
        } else {
            System.out.printf("Triangle area: %.4f%n", valueTwo);
        }
    }
}
