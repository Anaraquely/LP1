// Objetivo
// Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano.
//Calcular e escrever:
//a) Menor temperatura do ano
//b) Maior temperatura do ano
//c) Temperatura média anual
//d) O número de dias no ano em que a temperatura foi inferior a média anual
public class Exercicio85 {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];

        for (int dia = 1; dia <= 365; dia++) {
            System.out.print("Digite a temperatura média do dia " + dia + ": ");
            temperaturas[dia - 1] = Double.parseDouble(System.console().readLine());
        }
        double menorTemperatura = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
        }

        double maiorTemperatura = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }
        double temperaturaMedia = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturaMedia += temperaturas[i];
        }
        temperaturaMedia /= temperaturas.length;

        int diasComTemperaturaInferiorAMedia = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < temperaturaMedia) {
                diasComTemperaturaInferiorAMedia++;
            }
        }

        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + temperaturaMedia);
        System.out.println("Número de dias com temperatura inferior à média anual: " + diasComTemperaturaInferiorAMedia);
    }
}
