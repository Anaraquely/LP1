import java.util.Scanner;
// Objetivo:
// Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos. Calcular a média
// da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da
// turma e o resultado da contagem.
public class Exercicio79 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[20];
        double media = 0;
        int quantidadeAlunosAcimaDaMedia = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            media += notas[i];
        }

        media = media / 20;

        for (int i = 0; i < 20; i++) {
            if (notas[i] > media) {
                quantidadeAlunosAcimaDaMedia++;
            }
        }

        System.out.println("A média das notas é: " + media);
        System.out.println("A quantidade de alunos com nota acima da média é: " + quantidadeAlunosAcimaDaMedia);
    }
}