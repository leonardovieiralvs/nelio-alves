package introducaoCursoJava;


import java.util.Locale;

public class JavaDayOne {
    public String product1 = "Computer";
    public String product2 = "Office Desk";
    public int age = 30;
    public int price = 5290;
    public char gender = 'F';
    public double price1 = 2100;
    public double price2 = 650.50;
    public double measure = 52.234567;

    public static void main(String[] args) {
        double a;
        int b;

        a = 5;
        b = (int) a ;

        JavaDayOne javaDayOne = new JavaDayOne();
        System.out.println("Products");
        System.out.println(javaDayOne.product1+ " Which price is "+ javaDayOne.price1);
        System.out.println("Record "+javaDayOne.age+" years old, code "+ javaDayOne.price+ " and gender: "+javaDayOne.gender);
        System.out.println("Measue with eight decimal places "+javaDayOne.measure);
        System.out.printf("Rouded (Three decimal places): "+"%.3f%n", + javaDayOne.measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: "+"%.3f%n", + javaDayOne.measure);

        System.out.println(b);

    }
}
