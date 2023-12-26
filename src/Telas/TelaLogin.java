/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.CBX;
import Classes.Conexao;
import static Classes.Conexao.statement;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
public class TelaLogin extends javax.swing.JInternalFrame {

    /**
     * Creates new form telinha
     */
    public TelaLogin() {
        initComponents();
    }

    
    Conexao con = new Conexao();
    String nome = "";
    int nivel = 0;
    CBX cb = new CBX();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxNivel = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 255));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnJogar.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJogarMouseClicked(evt);
            }
        });
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel2.setText("Escolaridade");

        cbxNivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNivelItemStateChanged(evt);
            }
        });
        cbxNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnJogar)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnJogar)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        /*String sql = "Select * from tb01_jogador";
               sql += " where tb01_jogador = '" + txtNome.getText();
        String nome="";    
        try{            
            con.conectar();
            System.out.println(sql);
            ResultSet rs = con.runSELECT(sql);
       
            if (rs.next()) {
              nome = rs.getString("tb01_nome");
              JOptionPane.showMessageDialog(null, "Bom jogo "+nome+"!");
              TelaJogo tela = new TelaJogo();
              tela.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                System.out.println("ss");
            }      
            con.desconectar();
        
        }
        catch (Exception e){
             System.out.println(e.getMessage());
         }*/
        String nome = txtNome.getText();
        int nivel = cbxNivel.getSelectedIndex();
        TelaJogo tela = new TelaJogo();
        tela.RecebeJogador(nivel,nome);
        BasicInternalFrameUI bi = (BasicInternalFrameUI)tela.getUI();
        bi.setNorthPane(null);
        getParent().add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_btnJogarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnJogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogarMouseClicked
    
    }//GEN-LAST:event_btnJogarMouseClicked

    private void cbxNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNivelActionPerformed
       
    }//GEN-LAST:event_cbxNivelActionPerformed

    private void cbxNivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNivelItemStateChanged
    
          
         
    }//GEN-LAST:event_cbxNivelItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
     String sql ="SELECT * FROM tb01_nivel";
     cbxNivel.addItem("Escolha");
     try{
        con.conectar();
        ResultSet rs = con.selectSQL(sql);
        while (rs.next()){
        cbxNivel.addItem(rs.getString("tb01_escol"));
        
        }
        con.desconectar();
     }  catch (ClassNotFoundException ex) {
           System.out.println("Erro: "+ex);
        } catch (SQLException ex) {
             System.out.println("Erro: "+ex);
        } 
    }//GEN-LAST:event_formInternalFrameOpened
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JComboBox<String> cbxNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
