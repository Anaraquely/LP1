import java.util.Scanner;
// Objetivo
// Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). Após, ler dois
//vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro vetor Soma a soma dos
//elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma.
public class Exercicio84 {
    public static void main(String[] args) {
        int n;
        int[] a, b, soma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho dos vetores: ");
        n = scanner.nextInt();
        a = new int[n];
        b = new int[n];
        soma = new int[n];

        System.out.print("Digite os elementos do vetor A: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Digite os elementos do vetor B: ");
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma[i] = a[i] + b[i];
        }

        System.out.print("Vetor Soma: ");
        for (int i = 0; i < n; i++) {
            System.out.print(soma[i] + " ");
        }

        System.out.println();
    }
}