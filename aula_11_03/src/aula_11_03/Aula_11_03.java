
package aula_11_03;

import java.util.Scanner;

public class Aula_11_03 {

    
    public static void main(String[] args) {
     
        Scanner grava = new Scanner(System.in);
        
        //EX1
//        int limite, velocidade;
//        
//        System.out.println("****Consulta de multas****");
//        
//        System.out.println("Qual o limite de velocidade da via?");
//        
//        limite = grava.nextInt();
//        
//        System.out.println("Qual a velocidade do carro no momento?");
//        
//        velocidade = grava.nextInt();
//
//        if((velocidade- limite) < 10 ){
//            System.out.println("O usuario não possui multas!");
//        }else if((velocidade- limite) == 10 ){
//            System.out.println("Multa no valor de R$80,00");
//        }else if((velocidade- limite)  < 39 ){
//            System.out.println("Multa no valor de R$120,00");
//        }else{
//            System.out.println("Multa no valor de R$200,00");
//        }
//        System.out.println("*******************");

        //EX2
        
//        int pergunta1, pergunta2, pergunta3, pergunta4;
//        int pontos = 0;
//        
//        System.out.println("****Quiz****");
//        System.out.println("\n ");
//        System.out.println("****Pergunta 1****");
//        System.out.println("\n ");
//        System.out.println("Quantas copas do mundo o Brasil tem? \n 1)5 \n 2)3 \n 3)6 \n 4)4");
//        System.out.println("Responda apenas com o numero da alternativa");
//        pergunta1 = grava.nextInt();
//        System.out.println("\n ");
//        System.out.println("*************");
//        System.out.println("\n ");
//        
//        if(pergunta1 == 1){
//             System.out.println("resposta correta +1 ponto");
//             pontos++;
//             System.out.println("Total pontos: " + pontos);
//             
//        }else{
//             System.out.println("resposta errada");
//             System.out.println("Total pontos: " + pontos);
//        }
//        
//        System.out.println("\n ");
//        System.out.println("****Pergunta 2****");
//        System.out.println("\n ");
//        System.out.println("Quando nasceu o Santos FC? \n 1)1911 \n 2)1912 \n 3)1913 \n 4)1914");
//        System.out.println("Responda apenas com o numero da alternativa");
//        pergunta2 = grava.nextInt();
//        System.out.println("\n ");
//        System.out.println("*************");
//        System.out.println("\n ");
//        
//        if(pergunta2 == 2){
//             System.out.println("resposta correta +1 ponto");
//             pontos++;
//             System.out.println("Total pontos: " + pontos);
//        }else{
//             System.out.println("resposta errada");
//             System.out.println("Total pontos: " + pontos);
//        }
//        
//        System.out.println("\n ");
//        System.out.println("****Pergunta 3****");
//        System.out.println("\n ");
//        System.out.println("Quem descobriu o Brasil? \n 1)Pedro Álvares Cabral \n 2)Cristóvão Colombo \n 3)Albert Einstein \n 4)Santos Dumont");
//        System.out.println("Responda apenas com o numero da alternativa");
//        pergunta3 = grava.nextInt();
//        System.out.println("\n ");
//        System.out.println("*************");
//        System.out.println("\n ");
//        
//        if(pergunta3 == 1){
//             System.out.println("resposta correta +1 ponto");
//             pontos++;
//             System.out.println("Total pontos: " + pontos);
//        }else{
//             System.out.println("resposta errada");
//             System.out.println("Total pontos: " + pontos);
//        }
//        
//        System.out.println("\n ");
//        System.out.println("****Pergunta 4****");
//        System.out.println("\n ");
//        System.out.println("Quantas libertadores o Santos tem? \n 1)5 \n 2)3 \n 3)6 \n 4)4");
//        System.out.println("Responda apenas com o numero da alternativa");
//        pergunta4 = grava.nextInt();
//        System.out.println("\n ");
//        System.out.println("*************");
//        System.out.println("\n ");
//        
//        if(pergunta4 == 2){
//            System.out.println("resposta correta +1 ponto");
//            pontos++;
//             System.out.println("Total pontos: " + pontos);
//        }else{
//             System.out.println("resposta errada");
//             System.out.println("Total pontos: " + pontos);
//        };
//        
//        System.out.println("Final de quiz total de pontos: " + pontos);
//      
        
        //EX3
        
//        int idade;
//        
//        System.out.println("****Verificar categoria****");
//        System.out.println("Qual a idade do aluno?");
//        idade = grava.nextInt();
//
//        if(idade <= 0){
//                System.out.println("Idade invalida!");
//        }else if(idade <=10){
//            System.out.println("Categoria infantil");
//        }else if(idade <=13){
//            System.out.println("Categoria infanto-juvenil");
//        }else if(idade <=17){
//            System.out.println("Categoria pré-adolescete");
//        }else{
//            System.out.println("Categoria adulto");
//        }
//        

    //EX5
    int idade;
    int tempo_trabalho;
    int negativado;
    double renda;
    
    System.out.println("Qual a sua idade?");
        idade = grava.nextInt();
        
    System.out.println("Qual a sua renda");
        renda = grava.nextInt();
        
    System.out.println("Qual seu tempo de trabalho?");
        tempo_trabalho = grava.nextInt();
        
    System.out.println("Você está negativado? \n1-sim \n2-não");
        negativado = grava.nextInt();
        
    if(idade < 21 || idade >65 || renda <2500 || negativado == 1){
        System.out.println("Credito não aprovado!");
    }else if(renda >=2500 && renda <= 5000 && tempo_trabalho)
        
        
        
    }
    
}
