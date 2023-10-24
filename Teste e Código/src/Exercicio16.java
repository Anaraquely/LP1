import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maca = 0;
        double custo_total = 0;
        System.out.print("Quantas maças vocÊ deseja comprar? ");
        maca = sc.nextInt();
        if (maca >= 12){
            custo_total = maca*1;
            System.out.printf("Foram compradas "+ maca+ " por R$1,00, o custo total da compra foi de R$"+custo_total);
        } else if (maca <= 11){
            custo_total = maca*1.30;
            System.out.println("Foram compradas "+ maca+ " por R$1,30, o custo total da compra foi de R$"+custo_total);
        }
    }
}
