import java.util.Scanner;

public class Exercicio12 {
        public Exercicio12() {
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double fahrenheit = 0.0;
            double celsius = 0.0;
            System.out.println("INSIRA A TEMPERATURA EM GRAUS FAHRENHEIT (ºF): ");
            fahrenheit = sc.nextDouble();
            celsius = (fahrenheit - 32.0) / 1.8;
            System.out.printf("A temperatura em celsius é de: " + celsius, "%.2f");
        }
    }

