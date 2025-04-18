package introducaoCursoJava.applicationEmployee.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    @Override
    public String toString() {
        return name+", $"+String.format("%.2f%n", netSalary());
    }


    public double netSalary() {
        return grossSalary - tax;

    }

    public void increaseSalary(double porcentage) {
//        double result = (porcentage / 100) * netSalary();
//        this.grossSalary = netSalary() + result;
        this.grossSalary += this.grossSalary * porcentage / 100;
    }
}
