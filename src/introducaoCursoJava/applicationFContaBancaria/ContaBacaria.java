package introducaoCursoJava.applicationFContaBancaria;

public class ContaBacaria {
    private final static double SAQUE = 5.00;
    private final int accountNum;
    private String name;
    private double deposit;
    private double balance;


    public ContaBacaria(int accountNum, String name, double deposit) {
        this.accountNum = accountNum;
        this.name = name;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Account " + this.accountNum +
                ", Holder: " + this.name +
                ", Balance: $" + this.balance;
    }

    public double balanceAccount(double deposit) {
        return this.balance += deposit;
    }

    public double withdrawAccount(double withdraw) {
        return this.balance -= (withdraw + ContaBacaria.SAQUE);
    }

    public double getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
