package introducaoCursoJava.fHerançaEPolimorfismo;

public class test {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Leo", 100.0);
        Account acc2 = new BusinessAccount (1005, "Aquiles", 100.0, 1000.0);

        acc1.withdraw(10);
        System.out.println(acc1.getBalance());

        acc2.withdraw(10);
        System.out.println(acc2.getBalance());
    }
}
