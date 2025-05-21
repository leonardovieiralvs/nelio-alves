package introducaoCursoJava.dEnumeracao2.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;


    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public double setValuePerHour() {
        return valuePerHour * hours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    private double totalValue(double totalValue) {
        return totalValue * hours;
    }
}
