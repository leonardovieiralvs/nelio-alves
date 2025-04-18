package introducaoCursoJava.applicationNotas;

import introducaoCursoJava.applicationNotas.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Entre com o nome e as três notas do aluno: ");
        System.out.print("Nome: ");
        aluno.name = sc.nextLine();
        System.out.print("Notas: ");
        aluno.a = sc.nextDouble();
        aluno.b = sc.nextDouble();
        aluno.c = sc.nextDouble();

        if (aluno.soma() > 60) {
            System.out.println("FINAL GRADE: "+aluno.soma());
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE: "+aluno.soma());
            System.out.println("FAILED");
            System.out.println("MISSING: "+aluno.falta()+" POINTS");
        }
    }
}
