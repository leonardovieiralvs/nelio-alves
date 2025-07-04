package introducaoCursoJava.FHerançaEPolimorfismo.ExercicioFixacao;

import introducaoCursoJava.FHerançaEPolimorfismo.ExercicioFixacao.entities.ImportedProduct;
import introducaoCursoJava.FHerançaEPolimorfismo.ExercicioFixacao.entities.Product;
import introducaoCursoJava.FHerançaEPolimorfismo.ExercicioFixacao.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                Product iproduct = new ImportedProduct(name, price, customFee);
                list.add(iproduct);
            } else if (ch == 'u') {
                System.out.print("Manufacture date: ");
                Date date = sdf.parse(sc.next());
                Product uproduct = new UsedProduct(name, price, date);
                list.add(uproduct);
            } else {
                Product cproduct = new Product(name, price);
                list.add(cproduct);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product);
        }

    }
}
