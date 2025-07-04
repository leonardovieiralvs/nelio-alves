package introducaoCursoJava.KInterfaces.herancasMult;

import introducaoCursoJava.KInterfaces.herancasMult.Interface.Printer;
import introducaoCursoJava.KInterfaces.herancasMult.Interface.Scanner;

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
