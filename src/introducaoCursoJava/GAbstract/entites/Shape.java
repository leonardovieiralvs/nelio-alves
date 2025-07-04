package introducaoCursoJava.GAbstract.entites;

import introducaoCursoJava.GAbstract.entites.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();
}
