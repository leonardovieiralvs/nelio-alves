package introducaoCursoJava.kInterface1.service;

public class PaypalService implements OnlinePaymentService {

    @Override
    public Double paymentFee(Double amount) { // taxa pagamento
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) { // juros
       return amount * 0.01 * months;
    }
}
