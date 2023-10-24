import java.util.Scanner;
// Objetivo
// Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, o algoritmo deve
//ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado.
public class Exercicio86 {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.println("Números ordenados em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }
}