import java.util.Scanner;

public class Exercicio79 {

    public static void main(String[] args) {
        // Declara um scanner para ler as notas dos alunos
        Scanner scanner = new Scanner(System.in);

        // Declara um vetor para armazenar as notas dos alunos
        double[] notas = new double[20];

        // Declara uma variável para armazenar a média das notas
        double media = 0;

        // Declara uma variável para armazenar a quantidade de alunos com nota acima da média
        int quantidadeAlunosAcimaDaMedia = 0;

        // Itera sobre todos os alunos
        for (int i = 0; i < 20; i++) {
            // Lê a nota do aluno
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            // Atualiza a média das notas
            media += notas[i];
        }

        // Calcula a média das notas
        media = media / 20;

        // Itera sobre todas as notas
        for (int i = 0; i < 20; i++) {
            // Verifica se a nota do aluno é maior que a média
            if (notas[i] > media) {
                // Incrementa a quantidade de alunos com nota acima da média
                quantidadeAlunosAcimaDaMedia++;
            }
        }

        // Imprime a média das notas
        System.out.println("A média das notas é: " + media);

        // Imprime a quantidade de alunos com nota acima da média
        System.out.println("A quantidade de alunos com nota acima da média é: " + quantidadeAlunosAcimaDaMedia);
    }
}