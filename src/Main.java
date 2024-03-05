import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade de pares de números (N): ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite o " + (i + 1) + "º par de números:");
            double numero1 = sc.nextDouble();
            double numero2 = sc.nextDouble();

            if (numero2 == 0) {
                System.out.println("Divisão impossível! Denominador igual a zero.");
            } else {
                double resultado = numero1 / numero2;
                System.out.println("Resultado da divisão: " + resultado);
            }
        }

        sc.close();
    }
}