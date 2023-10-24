import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        double nota = 0;
        System.out.print("Insina a 1a nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Insira a 2a nota: ");
        nota2 = sc.nextDouble();
        nota = (nota1+nota2)/2;
        if (nota >= 6){
            System.out.printf("Aluno Aprovado, sua média é de "+ nota, "%.2f");
        } else {
            System.out.printf("Aluno Reprovado, sua média é de "+ nota, "%.2f");
        }
    }
}
