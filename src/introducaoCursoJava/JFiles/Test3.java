package introducaoCursoJava.JFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Bye"};
        String path = "c:\\temp\\inn.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
