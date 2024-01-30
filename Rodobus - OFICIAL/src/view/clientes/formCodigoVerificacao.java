
package view.clientes;

import controller.passageiroDao;
import functions.Email;
import static functions.Geradores.gerarCodigoRecuperacao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Passageiro;


public class formCodigoVerificacao extends javax.swing.JFrame {
    
    String codigo2 = "";
    String email2 = "";
    passageiroDao passageiro = new passageiroDao();
    
    public formCodigoVerificacao(String codigo,String email) {
        initComponents();
        codigo2 = codigo;
        email2 = email;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNOME1 = new javax.swing.JLabel();
        textESQUECEU = new javax.swing.JTextField();
        btnMUDARSENHA = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnLOGIN = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Envio de código de verificação"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(50, 54, 66));

        lblNOME1.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME1.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME1.setText("Insira o código enviado no seu e-mail");
        lblNOME1.setToolTipText("");

        textESQUECEU.setName("txtEmail"); // NOI18N
        textESQUECEU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textESQUECEUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textESQUECEUMouseEntered(evt);
            }
        });
        textESQUECEU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textESQUECEUActionPerformed(evt);
            }
        });

        btnMUDARSENHA.setBackground(new java.awt.Color(50, 54, 66));
        btnMUDARSENHA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMUDARSENHA.setForeground(new java.awt.Color(255, 255, 255));
        btnMUDARSENHA.setText("Confirmar");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNOME1)
                    .addComponent(textESQUECEU, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMUDARSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblNOME1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textESQUECEU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMUDARSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textESQUECEUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textESQUECEUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textESQUECEUActionPerformed

    private void btnMUDARSENHAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMUDARSENHAMouseClicked
        JFrame frame = new JFrame("Confirmação");
        int resposta = JOptionPane.showConfirmDialog(frame, "Deseja trocar a senha?", "Troca de senha", JOptionPane.YES_NO_OPTION);
        
        
        if(this.textESQUECEU.getText().trim().equals(codigo2.trim())){
            
            if (resposta == JOptionPane.YES_OPTION) {
               this.setVisible(false);
               this.dispose(); 
               
                String senha = gerarCodigoRecuperacao(8);
                Passageiro pass = passageiro.selecionarPassageiroPorEmail(email2);
                
                pass.setSenha(senha);
                passageiro.alterarSenha(pass);
                
               
                JOptionPane.showMessageDialog(null, "Alteramos sua senha. Você receberá a nova senha no seu e-mail.");
                
                String fromEmail = "";
                String password = "";
                String toEmail = email2;
                String emailSubject = "";

                Email email = new Email(fromEmail, password, toEmail, emailSubject, "","html");
                
                email.enviarSenha(senha);
                
                this.setVisible(false);
                this.dispose();
                formLogin login = new formLogin();
                login.setVisible(true);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Código inválido.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMUDARSENHAMouseClicked

    private void btnMUDARSENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUDARSENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMUDARSENHAActionPerformed

    private void mnLOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLOGINMouseClicked
        this.setVisible(false);
        this.dispose();
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnLOGINMouseClicked

    private void textESQUECEUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textESQUECEUMouseClicked
        
    }//GEN-LAST:event_textESQUECEUMouseClicked

    private void textESQUECEUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textESQUECEUMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textESQUECEUMouseEntered

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
            java.util.logging.Logger.getLogger(formCodigoVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCodigoVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCodigoVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCodigoVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String codigo = "";
                String email = "";
                new formCodigoVerificacao(codigo,email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMUDARSENHA;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNOME1;
    private javax.swing.JMenu mnLOGIN;
    private javax.swing.JTextField textESQUECEU;
    // End of variables declaration//GEN-END:variables
}
