/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clientes;

import functions.Email;
import static functions.Geradores.gerarCodigoRecuperacao;
import javax.swing.JFrame;
import utils.Validador;


public class formEsqueciSenha extends javax.swing.JFrame {


    public formEsqueciSenha() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        this.textESQUECEUEMAIL.setDocument(new Validador(30));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNOME1 = new javax.swing.JLabel();
        lblNOME = new javax.swing.JLabel();
        textESQUECEUEMAIL = new javax.swing.JTextField();
        btnMUDARSENHA = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnLOGIN = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Recuperação de senha"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(50, 54, 66));

        lblNOME1.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME1.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME1.setText("Esqueceu sua senha?");
        lblNOME1.setToolTipText("");

        lblNOME.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNOME.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME.setText("E-mail");
        lblNOME.setToolTipText("");

        textESQUECEUEMAIL.setName("txtEmail"); // NOI18N
        textESQUECEUEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textESQUECEUEMAILActionPerformed(evt);
            }
        });

        btnMUDARSENHA.setBackground(new java.awt.Color(50, 54, 66));
        btnMUDARSENHA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMUDARSENHA.setForeground(new java.awt.Color(255, 255, 255));
        btnMUDARSENHA.setText("Mudar Senha");
        btnMUDARSENHA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMUDARSENHAMouseClicked(evt);
            }
        });
        btnMUDARSENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMUDARSENHAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNOME1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNOME)
                    .addComponent(textESQUECEUEMAIL)
                    .addComponent(btnMUDARSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblNOME1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textESQUECEUEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMUDARSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        mnLOGIN.setText("Login");
        mnLOGIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLOGINMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnLOGIN);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnLOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLOGINMouseClicked
        this.setVisible(false);
        this.dispose();
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnLOGINMouseClicked

    private void textESQUECEUEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textESQUECEUEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textESQUECEUEMAILActionPerformed

    private void btnMUDARSENHAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMUDARSENHAMouseClicked
        String fromEmail = "";
        String password = "";
        String toEmail = this.textESQUECEUEMAIL.getText().trim();
        String emailSubject = "Recuperar senha";

        Email email = new Email(fromEmail, password, toEmail, emailSubject, "","html");
        String codigo = gerarCodigoRecuperacao(6);
        email.enviarRecuperacao(codigo);
        
        formCodigoVerificacao cod = new formCodigoVerificacao(codigo,toEmail);
        cod.setExtendedState(JFrame.MAXIMIZED_BOTH);
        cod.setVisible(true);
    }//GEN-LAST:event_btnMUDARSENHAMouseClicked

    private void btnMUDARSENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUDARSENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMUDARSENHAActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formEsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEsqueciSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMUDARSENHA;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNOME;
    private javax.swing.JLabel lblNOME1;
    private javax.swing.JMenu mnLOGIN;
    private javax.swing.JTextField textESQUECEUEMAIL;
    // End of variables declaration//GEN-END:variables
}
