/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Model.Funcoes_DAO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laboratorio-Info
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
        initComponents();
    }

    //Metodo atualiza tabela (inicio)
    
    public static DefaultTableModel  Cliente(ResultSet rs) {
        try {
           ResultSetMetaData metaData = rs.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
       // AS LINHAS ABAIXO SÃO REFERENTES AOS CAMPOS DA TABELA CLIENTE
            columnNames.addElement("Código");
            columnNames.addElement("Nome");
            columnNames.addElement("Endereço");
            columnNames.addElement("Telefone");
         
            Vector rows = new Vector();
            while (rs.next()) {
                Vector newRow = new Vector();
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }
           return new DefaultTableModel(rows, columnNames);
       } catch (Exception e) {

           return null;
        }
        }

    
    //fim
    
    // Inicio Metodo Refresh
    
     public void refresh(){
    
    try{
    Connection conn;
    conn = (Connection) DriverManager.getConnection(url, username, password);
    //Driver.carregaDriver();
    
            String sql = "SELECT * FROM cliente;";
    PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    Cliente.setModel(Cliente(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}    
    } 
    
    // Fim metod refresh
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("Exemplo?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        end_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SAIR_BTN = new javax.swing.JButton();
        SALVAR_BTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cliente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tel1_txt = new javax.swing.JTextField();
        cod1_txt = new javax.swing.JTextField();
        nome1_txt = new javax.swing.JTextField();
        end1_txt = new javax.swing.JTextField();
        ALTERAR_BTN = new javax.swing.JButton();
        CONSULTAR_BTN = new javax.swing.JButton();
        BACKUP_BTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cod2_txt = new javax.swing.JTextField();
        EXCLUIR_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setText("Nome:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(16, 29, 60, 14);
        jPanel2.add(nome_txt);
        nome_txt.setBounds(80, 26, 289, 20);
        jPanel2.add(end_txt);
        end_txt.setBounds(80, 64, 289, 20);

        jLabel2.setText("Endereço:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(16, 67, 60, 14);
        jPanel2.add(tel_txt);
        tel_txt.setBounds(80, 102, 289, 20);

        jLabel3.setText("Telefone:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(16, 105, 60, 14);

        SAIR_BTN.setText("Sair");
        SAIR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIR_BTNActionPerformed(evt);
            }
        });
        jPanel2.add(SAIR_BTN);
        SAIR_BTN.setBounds(220, 180, 90, 30);

        SALVAR_BTN.setText("Salvar");
        SALVAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALVAR_BTNActionPerformed(evt);
            }
        });
        jPanel2.add(SALVAR_BTN);
        SALVAR_BTN.setBounds(100, 180, 90, 30);

        jTabbedPane1.addTab("Cadastrar", jPanel2);

        jPanel3.setLayout(null);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, Cliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEnd}"));
        columnBinding.setColumnName("Endereço");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(Cliente);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 375, 91);

        jLabel4.setText("Telefone:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 200, 60, 20);

        jLabel5.setText("Código:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 110, 60, 20);

        jLabel6.setText("Nome:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 140, 60, 20);

        jLabel7.setText("Endereço:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 170, 60, 20);

        tel1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel1_txtActionPerformed(evt);
            }
        });
        jPanel3.add(tel1_txt);
        tel1_txt.setBounds(80, 200, 300, 20);

        cod1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod1_txtActionPerformed(evt);
            }
        });
        jPanel3.add(cod1_txt);
        cod1_txt.setBounds(80, 110, 90, 20);

        nome1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome1_txtActionPerformed(evt);
            }
        });
        jPanel3.add(nome1_txt);
        nome1_txt.setBounds(80, 140, 300, 20);

        end1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end1_txtActionPerformed(evt);
            }
        });
        jPanel3.add(end1_txt);
        end1_txt.setBounds(80, 170, 300, 20);

        ALTERAR_BTN.setText("Alterar");
        ALTERAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERAR_BTNActionPerformed(evt);
            }
        });
        jPanel3.add(ALTERAR_BTN);
        ALTERAR_BTN.setBounds(290, 100, 90, 30);

        CONSULTAR_BTN.setText("Consultar");
        CONSULTAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTAR_BTNActionPerformed(evt);
            }
        });
        jPanel3.add(CONSULTAR_BTN);
        CONSULTAR_BTN.setBounds(190, 100, 90, 30);

        BACKUP_BTN.setText("Backup");
        BACKUP_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKUP_BTNActionPerformed(evt);
            }
        });
        jPanel3.add(BACKUP_BTN);
        BACKUP_BTN.setBounds(280, 230, 90, 30);

        jTabbedPane1.addTab("Consultar/Alterar", jPanel3);

        jPanel4.setLayout(null);

        jLabel8.setText("Informe o código:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(150, 80, 100, 20);
        jPanel4.add(cod2_txt);
        cod2_txt.setBounds(120, 110, 160, 20);

        EXCLUIR_BTN.setText("EXCLUIR");
        EXCLUIR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIR_BTNActionPerformed(evt);
            }
        });
        jPanel4.add(EXCLUIR_BTN);
        EXCLUIR_BTN.setBounds(150, 150, 100, 30);

        jTabbedPane1.addTab("Excluir", jPanel4);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SAIR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIR_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SAIR_BTNActionPerformed

    private void SALVAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALVAR_BTNActionPerformed
        Model.Funcoes_DAO.salvar();
        refresh();
    }//GEN-LAST:event_SALVAR_BTNActionPerformed

    private void tel1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel1_txtActionPerformed

    private void cod1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod1_txtActionPerformed

    private void nome1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome1_txtActionPerformed

    private void end1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end1_txtActionPerformed

    private void CONSULTAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTAR_BTNActionPerformed
        Model.Funcoes_DAO.consultar();
    }//GEN-LAST:event_CONSULTAR_BTNActionPerformed

    private void ALTERAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERAR_BTNActionPerformed
        Model.Funcoes_DAO.alterar();
        refresh();
    }//GEN-LAST:event_ALTERAR_BTNActionPerformed

    private void EXCLUIR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIR_BTNActionPerformed
        String x = JOptionPane.showInputDialog(null, "Dejesa realmente excluir o registro? \n1-Sim \n2-Não");
        int cod = Integer.parseInt(x);
        
        if(cod == 1){
            Model.Funcoes_DAO.excluir();
            refresh();
        }else if(cod == 2){
            JOptionPane.showMessageDialog(null, "Registro não foi excluido");
        }else{
            JOptionPane.showMessageDialog(null, "Opção invalida!\n Por favor utilize 1 ou 2");
        }
        
    }//GEN-LAST:event_EXCLUIR_BTNActionPerformed

    private void BACKUP_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKUP_BTNActionPerformed
     Model.Funcoes_DAO.backup();
    }//GEN-LAST:event_BACKUP_BTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTERAR_BTN;
    private javax.swing.JButton BACKUP_BTN;
    private javax.swing.JButton CONSULTAR_BTN;
    private javax.swing.JTable Cliente;
    private javax.swing.JButton EXCLUIR_BTN;
    private javax.swing.JButton SAIR_BTN;
    private javax.swing.JButton SALVAR_BTN;
    private java.util.List<View.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    public static javax.swing.JTextField cod1_txt;
    public static javax.swing.JTextField cod2_txt;
    public static javax.swing.JTextField end1_txt;
    public static javax.swing.JTextField end_txt;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextField nome1_txt;
    public static javax.swing.JTextField nome_txt;
    public static javax.swing.JTextField tel1_txt;
    public static javax.swing.JTextField tel_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
