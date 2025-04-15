package introducaoCursoJava.application;

import introducaoCursoJava.application.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite 3 numeros X: ");
        triangleX.a = input.nextDouble();
        triangleX.b = input.nextDouble();
        triangleX.c = input.nextDouble();

        System.out.println("Digite 3 numeros Y: ");
        triangleY.a = input.nextDouble();
        triangleY.b = input.nextDouble();
        triangleY.c = input.nextDouble();

        double resultX = triangleX.resultSides(triangleX.a, triangleX.b, triangleX.c);
        double resultY = triangleY.resultSides(triangleY.a, triangleY.b, triangleY.c);
        System.out.printf("Triangle X area: %.4f%n", resultX);
        System.out.printf("Triangle X area: %.4f%n", resultY);

        Triangle.higherResult(resultX, resultY);
    }
}
