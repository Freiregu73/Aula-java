/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static View.Inicio_GUI.*;

public class Funcoes_DAO {
    public static double peso = 0, altura = 0, imc = 0;
    public static String classificacao = "";
      
    public static void imc(){
        altura = Double.parseDouble(ALTURA_TXT.getText());
        peso = Double.parseDouble(PESO_TXT.getText());
        imc = peso / (altura*altura);
        
        if (imc < 19 ) {
		classificacao = "Abaixo do peso!";
	} else if(imc < 25){
		classificacao = "Peso ideal";
	}else if(imc < 30){
		classificacao = "Sobrepeso";
	}else if(imc < 35){
		classificacao = "Obesidade grau 1";
	}else if(imc < 40){
		classificacao = "Obesidade grau 2";
	}else{
		classificacao = "Obesidade grau 3";
	};
        
        
        EXIBIR_TXT.setText( "Seu IMC é: " + String.valueOf(imc));
        EXIBIR2_TXT.setText( "Você está com: " + classificacao);
    }
    
    public static void sair(){
        System.exit(0);
    }
    
}
