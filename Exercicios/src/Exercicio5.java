import java.security.SecureRandom;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int Numero = scanner.nextInt();

        int antecessor = Numero - 1;
        System.out.println("O antecessor de " + Numero+" é " + antecessor);

    }
}
