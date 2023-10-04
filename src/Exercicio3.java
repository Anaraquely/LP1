public class Exercicio3 {
    public static void main(String[] args) {
        int a1 = (4 / 2) + (2 / 4);
        int a2 = 4 / 2 + 2 / 4;
        if (a1 == a2) {
            System.out.println("O resultado de A é igual :)");
        } else {
            System.out.println("O resultado de A é diferente :(");
        }
        int b1 = 4/(2+2)/4;
        int b2 = 4/2+2/4;
        if (b1 == b2) {
            System.out.println("O resultado de B é igual :)");
        } else {
            System.out.println("O resultado de B é diferente :(");
        }
        int c1 = (4+2)*2-4;
        int c2 = 4+2*2-4;
        if (c1 == c2){
            System.out.println("O resultado de C é igual :)");
        } else{
            System.out.println("O resultado de C é diferente :(");
        }
    }
}