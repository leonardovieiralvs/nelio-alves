package introducaoCursoJava.MHashCode_Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while(line != null) {

                String[] fields = line.split("\\s+");
                String userName = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(userName, moment));
                line = br.readLine();
            }

            System.out.println("Total Users: " + set.size());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
