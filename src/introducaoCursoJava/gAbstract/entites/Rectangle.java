package introducaoCursoJava.gAbstract.entites;

import introducaoCursoJava.gAbstract.entites.enums.Color;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }
}
