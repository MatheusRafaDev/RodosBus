package view.clientes;

import controller.motoristaDao;
import controller.onibusDao;
import controller.passageiroDao;
import controller.rotaDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Motorista;
import model.Onibus;
import model.Passageiro;
import model.Rota;
import utils.Formatador;
import utils.Validador;
import utils.ValidarLetras;
import utils.ValidarNumero;


public class formInfoPassageiro extends javax.swing.JFrame {
    passageiroDao passageiro = new passageiroDao();
    Passageiro pass = new Passageiro();
    Rota rota = new Rota();
    
    public formInfoPassageiro(int passageiroId2, int rotaId2) {
        initComponents();
        
        this.textEMAIL.setDocument(new Validador(30));
        this.textNOME.setDocument(new ValidarLetras(20));
        this.textSENHA.setDocument(new Validador(20));
        
        this.setLocationRelativeTo(null);  
        passageiroDao p = new passageiroDao();
        rotaDao r = new rotaDao();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        rota = r.selecionarUmaRota(rotaId2);
        pass = p.selecionarUmPassageiro(passageiroId2);
        
        this.textNOME.setText(pass.getNome());
        this.textTELEFONE.setText(pass.getCpf());
        this.textEMAIL.setText(pass.getEmail());
        this.textTELEFONE.setText(pass.getTelefone());
        this.textSENHA.setText(pass.getSenha());
        
        this.mnNOME.setText(pass.getNome());
        this.mnID.setText("Id: " + pass.getIdPassageiro());
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSENHA2 = new javax.swing.JButton();
        btnSENHA5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNOME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textEMAIL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSENHA = new javax.swing.JButton();
        textSENHA = new javax.swing.JTextField();
        btnTEL = new javax.swing.JButton();
        btnCPF = new javax.swing.JButton();
        btnNOME = new javax.swing.JButton();
        btnEMAIL = new javax.swing.JButton();
        textTELEFONE = new javax.swing.JFormattedTextField();
        textCPF = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnRODOBUS = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        mnPERFIL = new javax.swing.JMenu();
        mnSAIR = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnPedido = new javax.swing.JMenu();

        jTextField1.setBackground(new java.awt.Color(50, 54, 66));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(217, 217, 217));
        jTextField1.setText("RODOBUS");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONIBUS");

        btnSENHA2.setBackground(new java.awt.Color(50, 54, 66));
        btnSENHA2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnSENHA2.setForeground(new java.awt.Color(134, 134, 134));
        btnSENHA2.setText("Alterar");
        btnSENHA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSENHA2MouseClicked(evt);
            }
        });

        btnSENHA5.setBackground(new java.awt.Color(50, 54, 66));
        btnSENHA5.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnSENHA5.setForeground(new java.awt.Color(134, 134, 134));
        btnSENHA5.setText("Alterar");
        btnSENHA5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSENHA5MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 147, 4));

        jPanel2.setBackground(new java.awt.Color(242, 147, 4));

        jPanel1.setBackground(new java.awt.Color(69, 73, 74));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Perfil");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome");

        textNOME.setEditable(false);
        textNOME.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");

        textEMAIL.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Senha");

        btnSENHA.setBackground(new java.awt.Color(50, 54, 66));
        btnSENHA.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnSENHA.setForeground(new java.awt.Color(255, 255, 255));
        btnSENHA.setText("Alterar");
        btnSENHA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSENHAMouseClicked(evt);
            }
        });

        textSENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSENHAActionPerformed(evt);
            }
        });

        btnTEL.setBackground(new java.awt.Color(50, 54, 66));
        btnTEL.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnTEL.setForeground(new java.awt.Color(255, 255, 255));
        btnTEL.setText("Alterar");
        btnTEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTELMouseClicked(evt);
            }
        });

        btnCPF.setBackground(new java.awt.Color(50, 54, 66));
        btnCPF.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnCPF.setForeground(new java.awt.Color(255, 255, 255));
        btnCPF.setText("Alterar");
        btnCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCPFMouseClicked(evt);
            }
        });

        btnNOME.setBackground(new java.awt.Color(50, 54, 66));
        btnNOME.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnNOME.setForeground(new java.awt.Color(255, 255, 255));
        btnNOME.setText("Alterar");
        btnNOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOMEMouseClicked(evt);
            }
        });
        btnNOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOMEActionPerformed(evt);
            }
        });

        btnEMAIL.setBackground(new java.awt.Color(50, 54, 66));
        btnEMAIL.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnEMAIL.setForeground(new java.awt.Color(255, 255, 255));
        btnEMAIL.setText("Alterar");
        btnEMAIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEMAILMouseClicked(evt);
            }
        });

        try {
            textTELEFONE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(textEMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(textNOME)
                                    .addComponent(textSENHA)
                                    .addComponent(textTELEFONE)
                                    .addComponent(textCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCPF)
                                    .addComponent(btnSENHA)
                                    .addComponent(btnEMAIL)
                                    .addComponent(btnTEL)
                                    .addComponent(btnNOME)))))
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNOME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTELEFONE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEMAIL))
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCPF)
                    .addComponent(textCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSENHA))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jMenuBar1.add(jMenu7);

        mnRODOBUS.setText("RodoBus");
        mnRODOBUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnRODOBUSMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnRODOBUS);

        mnNOME.setText("Nome");
        jMenuBar1.add(mnNOME);

        mnID.setText("0");
        jMenuBar1.add(mnID);

        mnPERFIL.setText("Perfil");
        mnPERFIL.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        mnPERFIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPERFILMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPERFIL);

        mnSAIR.setText("Sair");
        mnSAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSAIRMouseClicked(evt);
            }
        });
        mnSAIR.add(jSeparator1);

        jMenuBar1.add(mnSAIR);

        mnPedido.setText("Pedido");
        mnPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPedidoMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPedido);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnRODOBUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRODOBUSMouseClicked
        this.setVisible(false);
        this.dispose();
        formConsultaPassagem consulta = new formConsultaPassagem(pass);
        consulta.setVisible(true);
    }//GEN-LAST:event_mnRODOBUSMouseClicked

    private void mnPERFILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPERFILMouseClicked
        this.setVisible(false);
        this.dispose();
        formInfoPassageiro info = new formInfoPassageiro(pass.getIdPassageiro(), rota.getIdRota());
        info.setVisible(true);
    }//GEN-LAST:event_mnPERFILMouseClicked

    private void mnPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPedidoMouseClicked
        this.setVisible(false);
        this.dispose();
        formPedidoRealizado pedido = new formPedidoRealizado(pass);
        pedido.setVisible(true);
    }//GEN-LAST:event_mnPedidoMouseClicked

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked

        this.setVisible(false);
        this.dispose();
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void btnSENHA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSENHA2MouseClicked
        
    }//GEN-LAST:event_btnSENHA2MouseClicked

    private void btnSENHA5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSENHA5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSENHA5MouseClicked

    private void btnEMAILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEMAILMouseClicked
        String email = textEMAIL.getText().trim();
        pass.setEmail(email);
        
         if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o Email.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarEmail(pass);
        }
    }//GEN-LAST:event_btnEMAILMouseClicked

    private void btnNOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOMEActionPerformed

    private void btnNOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMEMouseClicked
        String nome = textNOME.getText().trim();
        pass.setNome(nome);
        
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o Nome.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarNome(pass);
        }
    }//GEN-LAST:event_btnNOMEMouseClicked

    private void btnCPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCPFMouseClicked
        String cpf = Formatador.limparFormatoCPF(textCPF.getText().trim());
        pass.setCpf(cpf);
        
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o CPF.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarCpf(pass);
        }
    }//GEN-LAST:event_btnCPFMouseClicked

    private void btnTELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTELMouseClicked
        String telefone = Formatador.limparFormatoTelefone(textTELEFONE.getText().trim());
        pass.setTelefone(telefone);
        
        if (telefone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o Telefone.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarTelefone(pass);
        }
    }//GEN-LAST:event_btnTELMouseClicked

    private void textSENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSENHAActionPerformed

    private void btnSENHAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSENHAMouseClicked
        String senha = textSENHA.getText().trim();
        pass.setSenha(senha);
        if (senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha A Senha.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarSenha(pass);
        }
    }//GEN-LAST:event_btnSENHAMouseClicked

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
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Passageiro passageiro = new Passageiro();
                Passageiro pass = new Passageiro();
    Rota rt = new Rota();
                new formInfoPassageiro(pass.getIdPassageiro(), rt.getIdRota()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPF;
    private javax.swing.JButton btnEMAIL;
    private javax.swing.JButton btnNOME;
    private javax.swing.JButton btnSENHA;
    private javax.swing.JButton btnSENHA2;
    private javax.swing.JButton btnSENHA5;
    private javax.swing.JButton btnTEL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnPedido;
    private javax.swing.JMenu mnRODOBUS;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JTextField textEMAIL;
    private javax.swing.JTextField textNOME;
    private javax.swing.JTextField textSENHA;
    private javax.swing.JFormattedTextField textTELEFONE;
    // End of variables declaration//GEN-END:variables
}
