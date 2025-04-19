package introducaoCursoJava.applicationbNotas.entities;

public class Aluno {
    public String name;
    public double a;
    public double b;
    public double c;


    public double soma() {
        return a + b + c;
    }

    public double falta() {
        return a + b + c - 60;
    }

}
