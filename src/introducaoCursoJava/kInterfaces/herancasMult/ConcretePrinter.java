package introducaoCursoJava.kInterfaces.herancasMult;

import introducaoCursoJava.kInterfaces.herancasMult.Interface.Printer;

public class ConcretePrinter extends Device implements Printer {
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("ProcessDocPrinter: " + doc);
    }

    public void print(String doc) {
        System.out.println("voidPrint: " + doc);
    }
}
