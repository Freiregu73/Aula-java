/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Funcoes_DAO {
    
    public static void fechar(){
        String x = JOptionPane.showInputDialog(null, "Deseja realmente sair? \n 1-SIM \n 2-NÃO");
        int op = Integer.parseInt(x);
        if(op == 1){
            System.exit(0);
        }else if(op == 2){
            JOptionPane.showMessageDialog(null,"Voltando ao sistema...");
        }else{
            JOptionPane.showMessageDialog(null,"Opção invalida!");
        }
    }
    
}
