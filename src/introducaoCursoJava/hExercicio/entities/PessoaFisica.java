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
    public double fees() {
        return (anualIncome * 25 / 100) - (health * 50 / 100);
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }
}
