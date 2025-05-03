package introducaoCursoJava.applicationVetor.employeeExercise;

public class Emplyoee {
    private int id;
    private String name;
    private double salary;

    public Emplyoee() {
    }

    public Emplyoee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id+", "+this.name+", "+this.salary;
    }

    public void increaseSalary(int value) {
        this.salary *= (double) value;
    }
}
