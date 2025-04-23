package introducaoCursoJava.applicationFContaBancaria;

public class ContaBacaria {
    private int accountNum;
    private String name;
    private double balance;

    public ContaBacaria(int accountNum, String name, double initialDeposit) {
        this.accountNum = accountNum;
        this.name = name;
        balanceAccount(initialDeposit);
    }

    public ContaBacaria(int accountNum, String name) {
        this.accountNum = accountNum;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Account " + this.accountNum +
                ", Holder: " + this.name +
                ", Balance: $" + this.balance;
    }

    public void balanceAccount(double deposit) {
        this.balance += deposit;
    }

    public void withdrawAccount(double withdraw) {
        this.balance -= (withdraw + 5);
    }
}
