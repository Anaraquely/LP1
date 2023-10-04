import java.util.Scanner;

public class Exercicio8 {
        public Exercicio8() {
        }

        public static void main(String[] args) {
            Scanner notas = new Scanner(System.in);
            double nota1 = 0.0;
            double nota2 = 0.0;
            double nota3 = 0.0;
            double media = 0.0;
            System.out.println("Digite a primera nota: ");
            nota1 = notas.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = notas.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = notas.nextDouble();
            media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
            System.out.println("A media final é de: " + media);
        }
    }

