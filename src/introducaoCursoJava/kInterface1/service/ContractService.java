package introducaoCursoJava.kInterface1.service;

import introducaoCursoJava.kInterface1.entitites.Contract;
import introducaoCursoJava.kInterface1.entitites.Installment;

import java.util.ArrayList;
import java.util.List;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public void processContract(Contract contract, Integer months) {

        contract.setInstallment(new ArrayList<>());
    }
}
