package introducaoCursoJava.fHerançaEPolimorfismo.ExercicioFixacao.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFee = customsFree;
    }

    public double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String toString() {
        return name
                + " $"
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $"
                + customsFee
                + ")";
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
