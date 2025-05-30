package introducaoCursoJava.hExercicio.entities;

public class PessoaFisica extends Pessoa {
    protected Double health;

    public PessoaFisica(String name, Double anualIncome, Double health) {
        super(name, anualIncome);
        this.health = health;
    }

    public PessoaFisica() {
    }

    @Override
    public double tax() {
      double basicTax = (getAnualIncome() < 20000) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
        return basicTax;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }
}
