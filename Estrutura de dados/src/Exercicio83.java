import java.util.Arrays;
import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor= new double[20];
        for (int i=0; i<20; i++) {
            System.out.print("Digite um " + (i + 1) + " numero: ");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 20-1; i>=0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
