package introducaoCursoJava.bLocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTest01 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("1999-09-28");
        LocalDateTime d02 = LocalDateTime.parse("1999-09-28T01:30:26");
        Instant d03 = Instant.parse("1999-09-28T01:30:26Z");

        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(fmt03.format(d03));

    }
}
