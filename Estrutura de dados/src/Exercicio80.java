import java.util.Scanner;
// Objetivo
//Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir o valor do
//maior elemento de Q e a respectiva posição que ele ocupa no vetor.
public class Exercicio80 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int maiorElemento = 0;
        int posicaoMaiorElemento = 0;
        for (int i = 0; i < 20; i++) {
            if (vetor[i] <= 0) {
                throw new IllegalArgumentException("Os parâmetros devem ser números inteiros positivos");
            } else if (vetor[i]>=0) {
                // Lê um valor do vetor
                System.out.println("Digite o valor do elemento " + (i + 1) + ": ");

            }
            vetor[i] = scanner.nextInt();

            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
                posicaoMaiorElemento = i;
            }
        }
        System.out.println("O maior elemento do vetor é: " + maiorElemento);
        System.out.println("A posição do maior elemento do vetor é: " + posicaoMaiorElemento);
    }
}