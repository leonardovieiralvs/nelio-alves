package introducaoCursoJava.gAbstract.entites;

import introducaoCursoJava.gAbstract.entites.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();
}
