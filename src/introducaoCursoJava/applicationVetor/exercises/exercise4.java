package introducaoCursoJava.applicationVetor.exercises;

import java.util.Locale;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, qtdNum, qtdPares;

        System.out.print("Quantos numeros você vai digitar? ");
        num = sc.nextInt();
        int[] pares = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Digite um numero: ");
            qtdNum = sc.nextInt();
            pares[i] += qtdNum;
        }

        qtdPares = 0;
        System.out.println("NUMEROS PARES");
        for (int i = 0; i < num; i++) {
            if (pares[i] % 2 == 0) {
                System.out.print(pares[i]+" ");
                qtdPares++;
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = "+qtdPares);


    }
}
