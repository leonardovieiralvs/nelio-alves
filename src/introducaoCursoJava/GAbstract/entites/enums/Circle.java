package introducaoCursoJava.GAbstract.entites.enums;

import introducaoCursoJava.GAbstract.entites.Shape;

public class Circle extends Shape {
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
