import javax.swing.*;
import java.util.Scanner;
// Objetivo
//Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em um vetor.
// Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois
//escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no
//vetor), ou NÃO ACHEI caso contrário.
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
