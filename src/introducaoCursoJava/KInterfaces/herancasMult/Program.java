package introducaoCursoJava.KInterfaces.herancasMult;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1001");
        p.processDoc("Printer");
        p.print("PRINTER");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("7777");
        s.processDoc("Scanner");
        System.out.println(s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("8888");
        c.processDoc("Combo");
        c.print("Print Combo");
        System.out.println(c.scan());
    }
}
