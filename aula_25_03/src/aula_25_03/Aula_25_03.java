
package aula_25_03;

import java.util.Scanner;


public class Aula_25_03 {

 
    public static void main(String[] args) {
       
//       Scanner grava = new Scanner (System.in);
//       int tab, c=1;
//       
//       System.out.println("Escolha uma tabuada do 1 ao 9:");
//       tab = grava.nextInt();
//       
//       System.out.println("====== Tabuada do "+tab+" =======");
//       while(c <=10){
//       System.out.println(tab + "X" + c + " = " + (tab*c));
//       
//       c++;
//       }
//       System.out.println("==========================");

        //EX1
        
//        System.out.println("===== Exercicio 1: ===== \nExiba os números de 150 á 300");
//        int c = 150;
//        
//        while(c<=300){
//            System.out.println(c);
//            c++;
//        }
//        System.out.println("========================");

    //EX2
//
//        System.out.println("===== Exercicio 2: ===== \nExiba os numeros impares entre 100 e 200.");
//    int c =100;
//    
//    while(c <=200 ){
//        if(c % 2 != 0){
//        System.out.println(c);
//        }
//        c++;
//    }
//     System.out.println("========================");

    //EX3
//    System.out.println("===== Exercicio 3: ===== \nExiba os numeros  de 100 ate 0");
//    int c = 100;
//    while(c >= 0){
//        System.out.println(c);
//        c--;
//    }
//    System.out.println("========================");
    
    //EX4
    System.out.println("===== Exercicio 4: ===== \nExiba a soma dos números de 1 ate 1000(Fibonnaci)");
     int c = 1, fib = 0;
     while(c<= 1000){
         fib = fib + c;
         c++;
         if(c<=1000){
         System.out.println(fib + "+" + c + "= " + (fib + c));
         }
     }
         System.out.println(" A soma dos númerosde 1 até 1000 é: " + fib);
         System.out.println("========================");
         
         
    }
    
}
