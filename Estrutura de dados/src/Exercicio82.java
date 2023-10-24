import java.util.Scanner;
// Objetivo
//Ler um vetor A de 10 números. Após, ler mais um número e guardar em uma variável X.
//Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo após,
//imprimir o vetor M.
public class Exercicio82 {
    public static void main(String[] args) {
        double [] vetorA = new double [10];
        double [] vetorX = new double [1];
        double [] vetorM = new double[10];
        double valor = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um "+ (i + 1) +" numero: ");
            vetorA[i] = sc.nextDouble();
        }
            System.out.print("Digite mais um numero: ");
            vetorX[0] = sc.nextDouble();

            for (int i = 0; i < 10; i++){
                vetorM[i] = vetorA[i] * vetorX[0];
        }
            for (double numero : vetorM){
                System.out.println(numero);
            }
    }
}
