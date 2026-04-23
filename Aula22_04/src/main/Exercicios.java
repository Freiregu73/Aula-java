package main;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicios {

    public static String mostrar = "", x = "";
    public static int v1 = 0, v2 = 0;
    public static Random gera = new Random(); 

    public static void exerc() {
        JOptionPane.showMessageDialog(null, "Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro vetor. \n"
                + "Mostre o vetor resultante. \n");

        int[] valor1 = new int[10];
        int[] valor2 = new int[10];
        int[] resp = new int[10];

        JOptionPane.showMessageDialog(null, "Digite os valores do primeiro vetor");
        for (int c = 0; c < 10; c++) {
            x = JOptionPane.showInputDialog(null, "Digite o " + (c + 1) + " valor");
            v1 = Integer.parseInt(x);
            valor1[c] = v1;
        }

        JOptionPane.showMessageDialog(null, "Digite os valores do segundo vetor");
        for (int c = 0; c < 10; c++) {
            x = JOptionPane.showInputDialog(null, "Digite o " + (c + 1) + " valor");
            v2 = Integer.parseInt(x);
            valor2[c] = v2;
        }

        for (int c = 0; c < 10; c++) {
            resp[c] = valor1[c] * valor2[c];
            mostrar = mostrar + resp[c] + '\n';
        }

        JOptionPane.showMessageDialog(null, "A multiplicação dos vetores é \n" + mostrar);

    }

    public static void exerc2() {
        JOptionPane.showMessageDialog(null, "Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros.\n"
                + " a seguir, conte quantos valores pares existem no vetor. ");

        int par = 0;
        int[] vetor = new int[20];
        JOptionPane.showMessageDialog(null, "Digite os valores do vetor");
        for (int c = 0; c < 20; c++) {
            x = JOptionPane.showInputDialog(null, "Digite o " + (c + 1) + " valor");
            v1 = Integer.parseInt(x);
            vetor[c] = v1;
        }

        for (int c = 0; c < 20; c++) {
            if (vetor[c] % 2 == 0) {
                par++;
            }
        }

        JOptionPane.showMessageDialog(null, "Existem " + par + " números pares no vetor");

    }

    public static void exerc3() {
        JOptionPane.showMessageDialog(null, "Escreva um algoritmo que leia um vetor de 10 posições de números inteiros e mostre somente PARES.");
        int [] vetor = new int [10];
        for (int c = 0; c <10; c++){
            vetor[c] = gera.nextInt(100);
        }
        
        Arrays.sort(vetor);
        
        for (int c = 0; c <10; c++){
            if(vetor[c] %2 == 0){
                mostrar = mostrar + vetor[c]+"|";
            }
        }
        
         JOptionPane.showMessageDialog(null, mostrar);
        
        

    }

}
