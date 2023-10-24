import java.security.SecureRandom;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        System.out.println("O antecessor de " + numero+" é " + antecessor);

    }
}
