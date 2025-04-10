package introducaoCursoJava;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu numero como funcionário: ");
        int numF = input.nextInt();
        System.out.println("Digite o seu numero de horas trabalhadas: ");
        int horasT = input.nextInt();
        System.out.println("Valor que recebe por hora: ");
        double valor = input.nextDouble();

        double salario = horasT * valor;

        System.out.println("Numero do funcionário: "+numF);
        System.out.println("Salário Mensal: "+ salario);

    }
}
