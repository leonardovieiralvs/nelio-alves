package introducaoCursoJava.kInterfaces.model.services;

import introducaoCursoJava.kInterfaces.model.entites.CarRental;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxService TaxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.TaxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

    }
}
