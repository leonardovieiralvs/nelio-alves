package introducaoCursoJava.IExceptions.exerciseExceptions.entities;

import introducaoCursoJava.IExceptions.exerciseExceptions.entities.domainexcpetions.DomainExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance == 0 || amount > withdrawLimit){
            throw new DomainExceptions("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new DomainExceptions ("Not enough balance");
        }

        this.balance -= amount;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
}
