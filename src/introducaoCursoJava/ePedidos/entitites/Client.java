package introducaoCursoJava.ePedidos.entitites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date birthDate;

    public Client() {
    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " +
                "(" + sdf.format(birthDate) + ") - "
                + email;
    }

    //        StringBuilder sb = new StringBuilder();
//        sb.append(name+" ");
//        sb.append("("+sdf.format(birthDate)+") - ");
//        sb.append(email);
//        return sb.toString();

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
