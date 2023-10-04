import java.util.Scanner;

public class Exercicio12 {
        public Exercicio12() {
        }

        public static void main(String[] args) {
            Scanner fahrenheit = new Scanner(System.in);
            double Fahrenheit = 0.0;
            double temperatura = 0.0;
            double celsius = 0.0;
            System.out.println("INSIRA A TEMPERATURA EM GRAUS FAHRENHEIT (ºF): ");
            temperatura = fahrenheit.nextDouble();
            celsius = (temperatura - 32.0) / 1.8;
            System.out.println("A temperatura em celsius é de: " + celsius);
        }
    }

