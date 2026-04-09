/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_08_04;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Aula_08_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //virus
//        for (int c = 1; c <= 4; c++) {
//            
//            JOptionPane.showMessageDialog(null, "Você se ferrou");
//        }
//       
    //EX1
//    double valor;
//    double valorF;
//    
//    String x =  JOptionPane.showInputDialog(null, "Digite o valor da compra");
//    valor = Double.parseDouble(x);
//    valorF = (valor*0.10);
//    JOptionPane.showMessageDialog(null,"Você ganhou 10% de desconto sobre a compra! \n o valor do seu desonto é de: R$" +valorF );

    //EX2
//    int n1, n2, soma, subt, div,mult;
//    JOptionPane.showMessageDialog(null,"As 4 operações com 2 números");
//    String x = JOptionPane.showInputDialog(null, "Digite o número 1");
//    n1 = Integer.parseInt(x);
//    String y = JOptionPane.showInputDialog(null, "Digite o número 2");
//    n2 = Integer.parseInt(y);
//    soma = n1 + n2;
//    subt = n1 - n2;
//    mult = n1 * n2;
//    div = n1 / n2;
//    JOptionPane.showMessageDialog(null,"Números escolhidos " + n1 + " " + n2 + "\n Soma = " + soma + "\n Subtração = "
//    + subt + "\n Multiplicação = " + mult + "\n Divisão = " +div);

    //EX3
    double peso, altura, imc;
    
    JOptionPane.showMessageDialog(null,"Calculo do IMC");
    
    String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
    
    String y = JOptionPane.showInputDialog(null, "Digite seu peso");
    peso = Double.parseDouble(y);
    String b = JOptionPane.showInputDialog(null, "Digite sua altura");
    altura = Double.parseDouble(b);
    
    imc = peso / (altura*altura);
    
    JOptionPane.showMessageDialog(null,"Olá "+nome+" seu IMC é de: \n" + String.format("%.2f", imc));
    
    }
    
}
