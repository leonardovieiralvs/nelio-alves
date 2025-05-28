package introducaoCursoJava.fHerançaEPolimorfismo.ExercicioFixacao.entities;

public class ImportedProduct extends Product {
    private Double customsFree;

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double totalPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }
}
