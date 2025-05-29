package introducaoCursoJava.hExercicio.entities;

public class PessoaJuridica extends Pessoa {
    private Double nEmployees;

    public PessoaJuridica(String name, Double anualIncome, Double nEmployees) {
        super(name, anualIncome);
        this.nEmployees = nEmployees;
    }

    @Override
    public double fees() {
        return nEmployees * 14 / 100;
    }

    public Double getnEmployees() {
        return nEmployees;
    }

    public void setnEmployees(Double nEmployees) {
        this.nEmployees = nEmployees;
    }
}
