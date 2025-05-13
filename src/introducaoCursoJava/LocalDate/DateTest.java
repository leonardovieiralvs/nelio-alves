package introducaoCursoJava.LocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime date01 = LocalDateTime.now();
        System.out.println(date01);

        LocalDate date02 = LocalDate.parse("2025-02-05");
        System.out.println(date02);

        Instant instantDate = Instant.now();
        System.out.println(instantDate);

        LocalDate d03 = LocalDate.parse("25/05/2023", fmt);
        System.out.println(d03);
        System.out.println("-_-");

        LocalDate date00 = LocalDate.of(2022, 3, 22);
        System.out.println(date00);

        LocalDateTime date001 = LocalDateTime.of(1999, 9, 28, 20, 3);
        System.out.println(date001);
    }
}
