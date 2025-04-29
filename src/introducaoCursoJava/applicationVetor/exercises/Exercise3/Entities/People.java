package introducaoCursoJava.applicationVetor.exercises.Exercise3.Entities;

public class People {
    private String name;
    private int age;
    private double altura;

    public People(String name, int age, double altura) {
        this.name = name;
        this.age = age;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", altura=" + altura +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
