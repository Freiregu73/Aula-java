
package aula_18_3;

import java.util.Scanner;


public class Aula_18_3 {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        //EX6
        
//        int nota1, nota2, nota3, faltas, diasLetivos;
//        int frequencia;
//        double media;
//        
//        System.out.println("Informe quantos dias letivos tiveram?");
//        diasLetivos = grava.nextInt();
//        
//        System.out.println("Quantas faltas o aluno teve?");
//        faltas = grava.nextInt();
//        
//        System.out.println("Digite a primeira nota do aluno:");
//        nota1 = grava.nextInt();
//        
//        System.out.println("Digite a segunda nota do aluno:");
//        nota2 = grava.nextInt();
//        
//        System.out.println("Digite a terceira nota do aluno:");
//        nota3 = grava.nextInt();
//        
//        frequencia = diasLetivos - (diasLetivos * faltas / 100);
//        media = (nota1 + nota2 + nota3)/3;
//        
//        if(media >= 7 && media < 10 && frequencia >= 75 && frequencia < 100){
//            System.out.println("Aluno aprovado");
//        }else if(media == 10 && frequencia >= 75 && frequencia < 100 || media >= 7 && media < 10 && frequencia == 100){
//            System.out.println("Aluno aprovado");
//        }else if(media >= 5 && media <= 6.9 && frequencia >=75){
//            System.out.println("Aluno em recuperação");
//        }else if(media == 10 && frequencia == 100){
//            System.out.println("Aluno aprovado com distinção");
//        }else{
//            System.out.println("Aluno reprovado");
//        }

    //EX7
    double valor_compra,valor_final=0;
    int vip, forma_pagamento;
    
    System.out.println("Informe o valor da compra:");
    valor_compra = grava.nextInt();
    
    System.out.println("Você possui o vip? \n1-Sim \n2-Não");
    vip = grava.nextInt();
    
    System.out.println("Qual a forma de pagamento? \n1-À vista \n2-Parcelado");
    forma_pagamento = grava.nextInt();
    
    if(vip!=1 && vip !=2 || forma_pagamento !=1 && forma_pagamento != 2 ){
        System.out.println("Vip ou Forma de pagamento errado!");
    }else if(vip == 1 && forma_pagamento == 1){
        valor_final = valor_compra - (valor_compra*20/100);
    }else if(vip==1 && forma_pagamento==2){
        valor_final = valor_compra - (valor_compra*10/100);
    }else if(vip==2 && forma_pagamento==1 && valor_compra>=500){
        valor_final = valor_compra - (valor_compra*15/100);
    }else if(vip==2 && forma_pagamento==2 && valor_compra>=500){
        valor_final = valor_compra - (valor_compra*15/100);
    }else{
        valor_final = valor_final;
    }
    
    System.out.println("Valor final da compra: R$" + valor_final);
    
    }
}
