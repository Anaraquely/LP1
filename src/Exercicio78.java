import javax.swing.*;
import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        int i;
        String[] Nome = new String[10];
        for ( i =0; i<10; i++)
        {
            Nome[i]= (JOptionPane.showInputDialog("Digite um nome: "+(i+1)));
        }
        String Chave = new String();
        Scanner Identificacao = new Scanner(System.in);
        System.out.println("Digite o nome que você quer comparar: ");
        Chave = Identificacao.next();

        for (i=0; i<10; i++)
        {if (Nome[i].equals(Chave))
        {System.out.println("ACHEI!");
            break;}
        }
        if (i == 10)
        {System.out.println("NÃO ACHEI!");}

    }
}
