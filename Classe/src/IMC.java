
import java.util.Scanner;
public class IMC {
    double peso;
    double altura;
    String sexo;
    double imc = peso / (altura*altura);

    public IMC(){
    }
    public void Valores ( double peso, double altura, String sexo){
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;

    }
//    public void pedeInformacoes (){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Qual seu peso? ");
//        peso = sc.nextDouble();
//        System.out.print("Qual sua altura? ");
//        altura = sc.nextDouble();
//        System.out.print("Qual sua idade? ");
//        idade = sc.nextInt();

    void calculoIMC (double imc){
        if (imc >= 18.5) {
            System.out.println("Sua Classificação é de Magreza");
        } else if (imc <= 18.5 && imc >= 24.9) ;{
            System.out.println("Sua Classificação Está Dentro do Normal");
        } if (imc <= 25.0 && imc >= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso I");
        } else if (imc <= 30.0 && imc >= 39.9) {
            System.out.println("Sua Classificação é Obesidade II");
        } else if (imc <= 40.0 ) {
            System.out.println("Sua Classificação é Obesidade Grave III");
        }

    }
}
