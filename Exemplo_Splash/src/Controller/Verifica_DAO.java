/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static View.Login_GUI.cont;
import static View.Login_GUI.login_txt;
import static View.Login_GUI.senha_txt;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Verifica_DAO {
    public static void Verifica(){
        String login = login_txt.getText();
        String senha = senha_txt.getText();
        if(cont==3){
            JOptionPane.showMessageDialog(null, "Número de tentativas excedida");
            System.exit(0);
        }else{
            if (login.equals("ETEC") && senha.equals("a123")) {
                JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Sistema!");
                System.exit(0);
            }else{
                JOptionPane.showMessageDialog(null, "Login ou Senha incorreto\nTente Novamente");
                login_txt.setText("");
                senha_txt.setText("");
                cont++;
            }
        }
    }
}
