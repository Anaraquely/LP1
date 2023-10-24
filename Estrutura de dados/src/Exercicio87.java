import java.util.Arrays;
import java.util.Scanner;

// Objetivo
//  O mesmo exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
//deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja,
//mantendo a ordem crescente do vetor.
public class Exercicio87 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        Arrays.sort(numeros);

        System.out.println("Vetor ordenado:");
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] > numeros[j]) {
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                    }
                }
                System.out.print(numeros + " ");

                System.out.print("\nDigite o número a ser inserido: ");
                int numeroNovo = scanner.nextInt();
                while (i < numeros.length && numeroNovo > numeros[i]) {
                    i++;
                }

                for (int j = numeros.length - 1; j > i; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[i] = numeroNovo;

                System.out.println("\nVetor ordenado com o novo número:");
                for (int num : numeros) {
                    System.out.print(numeros + " ");
                }
            }
        }
    }
