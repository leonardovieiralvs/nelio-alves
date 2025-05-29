package introducaoCursoJava.gAbstract.entites;

import introducaoCursoJava.gAbstract.entites.enums.Circle;
import introducaoCursoJava.gAbstract.entites.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            System.out.println("Shape #"+i+" data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            if (ch == 'r') {
                System.out.print("Width: ");
                double wd = sc.nextDouble();
                System.out.print("Height: ");
                double hg = sc.nextDouble();
                list.add(new Rectangle(color, wd, hg));
            } else {
                System.out.print("Radius: ");
                double rd = sc.nextDouble();
                list.add(new Circle(color, rd));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS");

        for (Shape shape : list) {
            System.out.println(String.format("%.2f",shape.area()));
        }


    }
}
