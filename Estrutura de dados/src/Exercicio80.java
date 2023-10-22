import java.util.Scanner;

public class Exercicio80 {

    public static void main(String[] args) {
        // Declara um scanner para ler os valores do vetor
        Scanner scanner = new Scanner(System.in);

        // Declara um vetor para armazenar os valores do vetor
        int[] vetor = new int[20];

        // Declara uma variável para armazenar o maior elemento do vetor
        int maiorElemento = 0;

        // Declara uma variável para armazenar a posição do maior elemento do vetor
        int posicaoMaiorElemento = 0;

        // Itera sobre todos os elementos do vetor
        for (int i = 0; i < 20; i++) {
            if (vetor[i] <= 0) {
                throw new IllegalArgumentException("Os parâmetros devem ser números inteiros positivos");
            } else if (vetor[i]>=0) {
                // Lê um valor do vetor
                System.out.println("Digite o valor do elemento " + (i + 1) + ": ");

            }
            vetor[i] = scanner.nextInt();

            // Verifica se o valor do elemento é maior que o maior elemento atual
            if (vetor[i] > maiorElemento) {
                // Atualiza o maior elemento
                maiorElemento = vetor[i];

                // Atualiza a posição do maior elemento
                posicaoMaiorElemento = i;
            }
        }

        // Imprime o maior elemento do vetor
        System.out.println("O maior elemento do vetor é: " + maiorElemento);

        // Imprime a posição do maior elemento do vetor
        System.out.println("A posição do maior elemento do vetor é: " + posicaoMaiorElemento);
    }
}