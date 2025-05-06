package introducaoCursoJava.applicationVetor.employeeExercise;

public class Emplyoee {
    private Integer id;
    private String name;
    private Double salary;

    public Emplyoee() {
    }

    public Emplyoee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id+", "+this.name+", "+this.salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }
}
