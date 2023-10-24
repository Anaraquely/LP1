import java.util.Scanner;

// O mesmo exercício anterior, mas agora deve escrever o menor elemento do vetor e a respectiva
//posição dele nesse vetor.
public class Exercicio81 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int menorElemento = 0;
        int posicaoMenorElemento = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o valor do elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
                posicaoMenorElemento = i;
            }
        }
        System.out.println("O menor elemento do vetor é: " + menorElemento);
        System.out.println("A posição do menor elemento do vetor é: " + posicaoMenorElemento);
    }
}