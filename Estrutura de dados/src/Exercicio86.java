import java.util.Scanner;

public class Exercicio86 {
    public static void main(String[] args) {
        // Declaração de variáveis
        int[] numeros = new int[10];

        // Leitura dos números
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordenação dos números
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        // Impressão dos números ordenados
        System.out.println("Números ordenados em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }
}