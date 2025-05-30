package introducaoCursoJava.hExercicio.entities;

public class PessoaJuridica extends Pessoa {
    protected Double nEmployees;

    public PessoaJuridica(String name, Double anualIncome, Double nEmployees) {
        super(name, anualIncome);
        this.nEmployees = nEmployees;
    }

    @Override
    public double tax() {
        if (nEmployees > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }

    public Double getnEmployees() {
        return nEmployees;
    }

    public void setnEmployees(Double nEmployees) {
        this.nEmployees = nEmployees;
    }
}
