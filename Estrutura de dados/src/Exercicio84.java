import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        int n;
        int[] a, b, soma;

        // Leitura do tamanho dos vetores
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho dos vetores: ");
        n = scanner.nextInt();

        // Alocação de memória para os vetores
        a = new int[n];
        b = new int[n];
        soma = new int[n];

        // Leitura dos vetores A e B
        System.out.print("Digite os elementos do vetor A: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Digite os elementos do vetor B: ");
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        // Cálculo da soma dos elementos dos vetores A e B
        for (int i = 0; i < n; i++) {
            soma[i] = a[i] + b[i];
        }

        // Impressão do vetor Soma
        System.out.print("Vetor Soma: ");
        for (int i = 0; i < n; i++) {
            System.out.print(soma[i] + " ");
        }

        System.out.println();
    }
}