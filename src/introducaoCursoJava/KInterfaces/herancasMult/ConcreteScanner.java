package introducaoCursoJava.KInterfaces.herancasMult;

import introducaoCursoJava.KInterfaces.herancasMult.Interface.Scanner;

public class ConcreteScanner extends Device implements Scanner {
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("ProcessDoc Scanner: " + doc);
    }

    @Override
    public String scan() {
        return "returnScanner";
    }

}
