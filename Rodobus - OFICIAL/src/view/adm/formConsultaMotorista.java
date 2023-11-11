
package view.adm;

import controller.motoristaDao;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Motorista;

public class formConsultaMotorista extends javax.swing.JFrame {

    public formConsultaMotorista() {
        initComponents();
        
        motoristaDao m = new motoristaDao();
        m.criarBanco();
        ArrayList<Motorista> motoristas = m.selecionarMotoristas();
        
        DefaultTableModel model = (DefaultTableModel) tblMOTORISTAS.getModel();
        model.setRowCount(0); 
        
        for (Motorista motorista : motoristas) {
            model.addRow(new Object[]{motorista.getIdMotorista(),motorista.getNome(), motorista.getIdade(), motorista.getCpf(), motorista.getTelefone()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMOTORISTAS = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        textIdade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(142, 157, 204));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar  motorista");

        tblMOTORISTAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Idade", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMOTORISTAS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblMOTORISTASFocusGained(evt);
            }
        });
        tblMOTORISTAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMOTORISTASMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMOTORISTAS);
        tblMOTORISTAS.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TELEFONE");

        textTelefone.setBackground(new java.awt.Color(217, 217, 217));
        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("0");

        textIdade.setBackground(new java.awt.Color(217, 217, 217));
        textIdade.setForeground(new java.awt.Color(180, 180, 180));
        textIdade.setInheritsPopupMenu(true);
        textIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdadeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");

        textCPF.setBackground(new java.awt.Color(217, 217, 217));

        btnCadastrar.setBackground(new java.awt.Color(142, 157, 204));
        btnCadastrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CADASTRAR MOTORISTA");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOME");

        textNome.setBackground(new java.awt.Color(217, 217, 217));

        btnAlterar.setBackground(new java.awt.Color(142, 157, 204));
        btnAlterar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(142, 157, 204));
        btnBuscar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(142, 157, 204));
        btnDeletar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IDADE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblID)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(214, 214, 214)
                    .addComponent(jLabel7)
                    .addContainerGap(692, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeletar)
                            .addComponent(btnBuscar))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblID)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(jLabel7)
                    .addContainerGap(229, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentMoved

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed

    }//GEN-LAST:event_textTelefoneActionPerformed

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked

        Motorista Cadmoto = new Motorista();

        Cadmoto.setCpf(this.textCPF.getText());
        Cadmoto.setNome(this.textNome.getText());
        Cadmoto.setTelefone(this.textTelefone.getText());
        Cadmoto.setIdade(Integer.parseInt(this.textIdade.getText()));
        Cadmoto.setIdMotorista(0);

        motoristaDao m = new motoristaDao();
        m.incluir(Cadmoto);
        
        ArrayList<Motorista> motoristas = m.selecionarMotoristas();
        
        DefaultTableModel model = (DefaultTableModel) tblMOTORISTAS.getModel();
        model.setRowCount(0); 
        for (Motorista motorista : motoristas) {
            model.addRow(new Object[]{motorista.getIdMotorista(),motorista.getNome(), motorista.getIdade(), motorista.getCpf(), motorista.getTelefone()});
        }
        
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        motoristaDao m = new motoristaDao();
        
        DefaultTableModel model = (DefaultTableModel) tblMOTORISTAS.getModel();
        
        Motorista Cadmoto = new Motorista();

        Cadmoto.setCpf(this.textCPF.getText());
        Cadmoto.setNome(this.textNome.getText());
        Cadmoto.setTelefone(this.textTelefone.getText());
        Cadmoto.setIdade(Integer.parseInt(this.textIdade.getText()));
        Cadmoto.setIdMotorista(Integer.parseInt(this.lblID.getText()));
        
        m.alterar(Cadmoto);
        
        ArrayList<Motorista> motoristas = m.selecionarMotoristas();
        
        model.setRowCount(0); 
        for (Motorista motorista : motoristas) {
            model.addRow(new Object[]{motorista.getIdMotorista(),motorista.getNome(), motorista.getIdade(), motorista.getCpf(), motorista.getTelefone()});
        }
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        motoristaDao m = new motoristaDao();
        ArrayList<Motorista> motoristas = m.selecionarMotoristas();
        
        DefaultTableModel model = (DefaultTableModel) tblMOTORISTAS.getModel();
        model.setRowCount(0); 
        for (Motorista motorista : motoristas) {
            model.addRow(new Object[]{motorista.getIdMotorista(),motorista.getNome(), motorista.getIdade(), motorista.getCpf(), motorista.getTelefone()});
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void textIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdadeActionPerformed

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked
        motoristaDao m = new motoristaDao();
        m.excluir(Integer.parseInt(this.lblID.getText()));
       
        ArrayList<Motorista> motoristas = m.selecionarMotoristas();
        
        DefaultTableModel model = (DefaultTableModel) tblMOTORISTAS.getModel();
        model.setRowCount(0); 
        for (Motorista motorista : motoristas) {
            model.addRow(new Object[]{motorista.getIdMotorista(),motorista.getNome(), motorista.getIdade(), motorista.getCpf(), motorista.getTelefone()});
        }
        
        this.textCPF.setText("");
        this.textNome.setText("");
        this.textTelefone.setText("");
        this.textIdade.setText("");
        this.lblID.setText("");
       
    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tblMOTORISTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMOTORISTASMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblMOTORISTAS.getModel();

        int selectedRow = tblMOTORISTAS.getSelectedRow();

        if (selectedRow != -1) {
            lblID.setText(tblMOTORISTAS.getValueAt(selectedRow, 0).toString());
            textNome.setText(tblMOTORISTAS.getValueAt(selectedRow, 1).toString());
            textIdade.setText( tblMOTORISTAS.getValueAt(selectedRow, 2).toString());
            textCPF.setText(tblMOTORISTAS.getValueAt(selectedRow, 3).toString());
            textTelefone.setText(tblMOTORISTAS.getValueAt(selectedRow, 4).toString());
        } else {
            lblID.setText("0");
            textNome.setText("");
            textIdade.setText("");
            textCPF.setText("");
            this.textTelefone.setText("");
        }
    }//GEN-LAST:event_tblMOTORISTASMouseClicked

    private void tblMOTORISTASFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblMOTORISTASFocusGained

    }//GEN-LAST:event_tblMOTORISTASFocusGained

  
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
            java.util.logging.Logger.getLogger(formConsultaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formConsultaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formConsultaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formConsultaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formConsultaMotorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblMOTORISTAS;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
