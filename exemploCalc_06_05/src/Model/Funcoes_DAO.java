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
    public static int resultado=0;
    
    public static void soma(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1+val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resultado));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    
    public static void subtracao(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1-val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resultado));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    
    public static void multiplicacao(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1*val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resultado));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    
    public static void divisao(){
        val1 = Integer.parseInt(VALOR1_TXT.getText());
        val2 = Integer.parseInt(VALOR2_TXT.getText());
        resultado = val1/val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resultado));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    
    public static void limpar(){
        VALOR1_TXT.setText("");
        VALOR2_TXT.setText("");
        RESULTADO_TXT.setVisible(false);
        RESULTADO_TXT.setText("");
        RESULTADO_TXT.setBackground(Color.white);
        
    }
}
