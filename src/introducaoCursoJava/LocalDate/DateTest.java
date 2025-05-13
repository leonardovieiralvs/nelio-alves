package introducaoCursoJava.LocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime date01 = LocalDateTime.now();
        System.out.println(date01);

        LocalDate date02 = LocalDate.parse("2025-02-05");
        System.out.println(date02);

        Instant instantDate = Instant.now();
        System.out.println(instantDate);

        Instant instantDate2 = Instant.parse("2024-02-11T23:37:17Z");
        System.out.println(instantDate2);
        Instant instantDate3 = Instant.parse("2024-02-11T23:37:17-03:00");
        System.out.println(instantDate3);
    }
}
