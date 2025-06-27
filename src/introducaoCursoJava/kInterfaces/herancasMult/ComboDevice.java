package introducaoCursoJava.kInterfaces.herancasMult;

import introducaoCursoJava.kInterfaces.herancasMult.Interface.Printer;
import introducaoCursoJava.kInterfaces.herancasMult.Interface.Scanner;

public class ComboDevice extends Device implements Scanner, Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("ProcessDoc ComboDevice: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("ComboDevice: " + doc);
    }

    @Override
    public String scan() {
        return "comboDevice SCANNER";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
