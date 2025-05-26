package introducaoCursoJava.fHerançaEPolimorfismo;

public class BusinessAccount extends Account {
    private Double loanLimit;


    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
}
