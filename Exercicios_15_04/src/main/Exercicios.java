/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Exercicios {

    public static String mostrar = "", x = "";
    public static int n1 = 0, n2 = 0, n3 = 0;

    public static void exerc1() {
        JOptionPane.showMessageDialog(null, " Exercicio1 \n Imprima todos os múltiplos de 3, entre 1 e 100.");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                mostrar = mostrar + i + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "Os múltiplos de 3, entre 1 e 100 são: \n " + mostrar);

    }

    public static void exerc2() {
        int subs=0;
        JOptionPane.showMessageDialog(null, " Exercicio2 \n Solicite ao usuário 3 números e ordene do menor para o maior.");
        x = JOptionPane.showInputDialog(null, "Insira  valor 1:");
        n1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Insira  valor 2:");
        n2 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Insira  valor 3:");
        n3 = Integer.parseInt(x);
        
        for (int i=1; i<=3; i++){
            if(n1>n2){
                subs = n1;
                n1 = n2;
                n2 = subs;
            } else if(n2>n3){
                subs = n2;
                n2=n3;
                n3=subs;
            }
        }
        
        JOptionPane.showMessageDialog(null,n1+" "+n2+" "+n3);
        
    }
    
    public static void exerc3(){
        JOptionPane.showMessageDialog(null, " Exercicio1 \n  Imprimir os múltiplos de 7 menores que 200.");
        for (int i = 1; i <= 200; i++) {
            if (i % 7 == 0) {
                mostrar = mostrar + i + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "Os múltiplos de 7, menores que 200 são: \n " + mostrar);
    }
    
    public static void exerc4(){
       JOptionPane.showMessageDialog(null, " Exercicio1 \n  Calcular e imprimir os números divisíveis por 4 menores que 100.");
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                mostrar = mostrar + i + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "Os divissiveis de 4, menores que 100 são: \n " + mostrar);
    }

}
