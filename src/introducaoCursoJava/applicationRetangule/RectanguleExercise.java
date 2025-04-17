package introducaoCursoJava.applicationRetangule;

import introducaoCursoJava.applicationRetangule.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectanguleExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangleX = new Rectangle();

        System.out.println("Enter rectangule width and height: ");
        rectangleX.width = sc.nextDouble();
        rectangleX.height = sc.nextDouble();

        System.out.println("AREA: "+rectangleX.area());
        System.out.println("PERIMETER: "+rectangleX.perimeter());
        System.out.println("DIAGONAL: "+rectangleX.diagonal());
    }
}
