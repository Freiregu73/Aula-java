
package atividade_04_03;

import java.util.Scanner;


public class Atividade_04_03 {

    
    public static void main(String[] args) {
       Scanner grava = new Scanner(System.in);
       //EX1
       
//       int kwh;
//       double tarifa;
//       
//       System.out.println("Quantos kWh você consumiu no mês?");
//       kwh = grava.nextInt();
//       
//       if(kwh <=0){
//           System.out.println("Valor invalido!");
//       }else if(kwh <= 50){
//           tarifa = kwh*0.20;
//           System.out.println("O valor da sua tarifa é: R$"+tarifa);
//       }else if(kwh <= 150){
//           tarifa = kwh*0.25;
//           System.out.println("O valor da sua tarifa é: R$"+tarifa);
//       }else if(kwh <= 300){
//           tarifa = kwh*0.30;
//           System.out.println("O valor da sua tarifa é: R$"+tarifa);
//       }else{
//           tarifa = kwh*0.40;
//           System.out.println("O valor da sua tarifa é: R$"+tarifa);
//       }

    //EX2
    
    int l1,l2,l3;
    
    System.out.println("Qual o valor do lado 1?");
    l1 = grava.nextInt();
    
    System.out.println("Qual o valor do lado 2?");
    l2 = grava.nextInt();
    
    System.out.println("Qual o valor do lado 3?");
    l3 = grava.nextInt();

    if(l1 <=0 || l2 <=0 || l3<=0){
        System.out.println("Valor invalido!");
    }else if(l1 == l2 && l1== l3){
        System.out.println("O seus trinagulo é Equilátero → três lados iguais");
    }else if(l1 == l2 && l1 != l3 || l1 != l2 && l1 == l3 ){
        System.out.println("O seus trinagulo é Isósceles → dois lados iguais");
    }else{
        System.out.println("O seus trinagulo é Escaleno → três lados diferentes");
    }
       
    //EX3
    
//    double altura, peso, imc;
// 
//      System.out.println("Qual a sua altura? ");
//      altura = grava.nextDouble();
//      
//      System.out.println("Qual o seu peso? ");
//      peso = grava.nextDouble();
//      
//      imc = peso/(altura*altura);
//      
//      if(altura <=0 && peso <=0){
//          System.out.println("Valor invalido!");
//      }else if(imc <=18.5){
//          System.out.println("Abaixo do peso o IMC é " + imc);
//      }else if(imc <=24.9){
//          System.out.println("Peso normal o IMC é " + imc);
//      }else if(imc <=29.9){
//          System.out.println("Sobrepeso o IMC é " + imc);
//      }else if(imc <=34.9){
//          System.out.println("Obesidade Grau I o IMC é " + imc);
//      }else if(imc <=39.9){
//          System.out.println("Obesidade Grau II o IMC é " + imc);
//      }else{
//          System.out.println("Obesidade Grau III o IMC é " + imc);
//      }

    //EX4
    
//    String veiculo;
//    int eixos;
//    
//    System.out.println("Qual o veiculo?");
//    veiculo = grava.next();
//    
//    if(veiculo.equalsIgnoreCase("carro")){
//        System.out.println("Tarifa igual a R$10,00");
//        
//    }else if(veiculo.equalsIgnoreCase("caminhonete")){
//        System.out.println("Tarifa igual a R$15,00");
//        
//    }else if(veiculo.equalsIgnoreCase("onibus")){
//        System.out.println("Quantos eixos?");
//        eixos = grava.nextInt();
//        System.out.println("Tarifa igual a R$" + (5.00*eixos));  
//        
//    }else if(veiculo.equalsIgnoreCase("caminhao")){
//        System.out.println("Quantos eixos?");
//        eixos = grava.nextInt();
//        System.out.println("Tarifa igual a R$" + (8.00*eixos));
//        
    }

    }
    
}
