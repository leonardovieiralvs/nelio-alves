package introducaoCursoJava.IGenerics.exercises.calculationService;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStr);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }

    }
}
