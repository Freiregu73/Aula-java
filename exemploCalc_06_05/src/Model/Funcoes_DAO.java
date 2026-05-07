/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static View.Inicio_GUI.*;
import java.awt.Color;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Funcoes_DAO {
    
    public static int val1 =0, val2=0;
    public static double v1 = 0, v2=0;
    public static int resultado=0;
    public static double res=0;
    
    public static void soma(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1+val2;
        RESULTADO2_TXT.setText(String.valueOf(resultado));
        
    }
    
    public static void subtracao(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1-val2;
        RESULTADO2_TXT.setText(String.valueOf(resultado));
    }
    
    public static void multiplicacao(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1*val2;
        RESULTADO2_TXT.setText(String.valueOf(resultado));
    }
    
    public static void divisao(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1/val2;
        RESULTADO2_TXT.setText(String.valueOf(resultado));
    }
 
    public static void porcentagem(){
        v1 = Double.parseDouble(VALOR1_TXT.getText());
        v2 = Double.parseDouble(VALOR2_TXT.getText());
        res = v1*(v2/100);
        RESULTADO2_TXT.setText(String.valueOf(res));
    }
    
    public static void limpar(){
        VALOR1_TXT.setText("");
        VALOR2_TXT.setText("");
        RESULTADO2_TXT.setText("");
        
    }
    
}
