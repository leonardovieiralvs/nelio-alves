package introducaoCursoJava.HExercicio.entities;

public abstract class Pessoa {
    protected String name;
    protected Double anualIncome;

    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;

    public Pessoa() {
    }

    public Pessoa(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract double tax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }


}
