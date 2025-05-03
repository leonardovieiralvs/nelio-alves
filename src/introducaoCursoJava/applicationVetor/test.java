package introducaoCursoJava.applicationVetor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Léo");
        list.add("Claudia");
        list.add("Márcio");
        list.add("Carol");
//        list.removeIf(x -> x.charAt(0) == 'C');
        for (String s : list) {
            System.out.println(s);
        }
//
        System.out.println("-----------");
//
//        List<String> resultName = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
//        for (String result : resultName) {
//            System.out.println(result);
//        }

        String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);

        System.out.println(name);
    }
}
