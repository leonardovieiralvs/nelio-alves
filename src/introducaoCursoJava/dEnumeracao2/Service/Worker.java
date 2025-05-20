package introducaoCursoJava.dEnumeracao2.Service;

import introducaoCursoJava.dEnumeracao2.Entities.WorkerLevel;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void addContract(HourContract contract) {

    }

    public void removeContract(HourContract contract) {

    }

//    public double income(Integer year, Integer month) {
//        return
//    }
}
