/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clientes;

import javax.swing.JOptionPane;
import model.Passageiro;
import view.clientes.formLogin;
import view.clientes.formConfirmarPag;
import controller.rotaDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Rota;


/**
 *
 * @author alesandro.rsjunior
 */
public class formConsultaPassagem extends javax.swing.JFrame {


    
    public void carregarInfo(int IdPassageiro, int IdRota){
        IdPassageiro = pass.getIdPassageiro();
        IdRota = rt.getIdRota();
        
        this.setVisible(false);
        formConfirmarPag pag = new formConfirmarPag(IdRota,IdPassageiro);
        pag.setVisible(true);
    }
    
    public void carregarRota() {
        rotaDao rota = new rotaDao();
        rota.criarBanco();
        ArrayList<Rota> rotas = rota.selecionarRotas();

        DefaultTableModel model = (DefaultTableModel) tblROTAS.getModel();
        model.setRowCount(0);

        for (Rota rota2 : rotas) {
            model.addRow(new Object[]{rota2.getIdRota(), rota2.getOrigem(), rota2.getDestino(), rota2.getDtSaida(), rota2.getDtChegada(), rota2.getVlPreco()});
        }
    }
    
    Passageiro pass = new Passageiro();
    Rota rt = new Rota();
    
    public formConsultaPassagem(Passageiro obj) {
        initComponents();
        this.mnNOME.setText(obj.getNome());
        this.mnID.setText("Id: " + obj.getIdPassageiro());
        carregarRota();
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        pass = obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txtsaida = new javax.swing.JTextField();
        Txtdestino = new javax.swing.JTextField();
        Txtdata = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblROTAS = new javax.swing.JTable();
        RESERVAR = new javax.swing.JButton();
        Txtembarque = new javax.swing.JTextField();
        Txtdesembarque = new javax.swing.JTextField();
        Txtdtsaida = new javax.swing.JTextField();
        Txtdtchegada = new javax.swing.JTextField();
        Txtvalor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        mnPedido = new javax.swing.JMenu();
        mnPERFIL = new javax.swing.JMenu();
        mnSAIR = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(142, 157, 204));

        jPanel1.setBackground(new java.awt.Color(142, 157, 204));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busque a sua passagem");

        Txtsaida.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Txtsaida.setForeground(new java.awt.Color(123, 123, 123));
        Txtsaida.setText("De onde você vai sair?");
        Txtsaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtsaidaMouseClicked(evt);
            }
        });
        Txtsaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtsaidaActionPerformed(evt);
            }
        });

        Txtdestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Txtdestino.setForeground(new java.awt.Color(123, 123, 123));
        Txtdestino.setText("Para onde você vai?");
        Txtdestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtdestinoMouseClicked(evt);
            }
        });

        Txtdata.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Txtdata.setForeground(new java.awt.Color(123, 123, 123));
        Txtdata.setText("Data ida");
        Txtdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtdataMouseClicked(evt);
            }
        });
        Txtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtdataActionPerformed(evt);
            }
        });

        btnComprar.setBackground(new java.awt.Color(69, 73, 74));
        btnComprar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("BUSCAR");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
        });
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        tblROTAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Embarque", "Desembarque", "Dt.Saída", "Dt.Chegada", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblROTAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblROTASMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblROTAS);

        RESERVAR.setBackground(new java.awt.Color(69, 73, 74));
        RESERVAR.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        RESERVAR.setForeground(new java.awt.Color(255, 255, 255));
        RESERVAR.setText("RESERVAR");
        RESERVAR.setMaximumSize(new java.awt.Dimension(100, 25));
        RESERVAR.setMinimumSize(new java.awt.Dimension(100, 25));
        RESERVAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RESERVARMouseClicked(evt);
            }
        });
        RESERVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESERVARActionPerformed(evt);
            }
        });

        Txtembarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtembarqueActionPerformed(evt);
            }
        });

        jLabel1.setText("Embarque");

        jLabel3.setText("Desembarque");

        jLabel4.setText("Dt.Saída");

        jLabel5.setText("Dt.Chegada");

        jLabel6.setText("Valor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Txtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txtembarque)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txtdesembarque)
                                .addGap(18, 18, 18)
                                .addComponent(Txtdtsaida)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txtdtchegada)
                                .addGap(18, 18, 18)
                                .addComponent(Txtvalor)
                                .addGap(323, 323, 323))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(362, 362, 362)))
                        .addComponent(RESERVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprar)
                    .addComponent(Txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RESERVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txtembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtdesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtdtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtdtchegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jMenuBar1.add(jMenu7);

        mnNOME.setText("Nome");
        mnNOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnNOMEMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnNOME);

        mnID.setText("0");
        jMenuBar1.add(mnID);

        mnPedido.setText("Pedido");
        mnPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPedidoMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPedido);

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
        jMenuBar1.add(mnSAIR);

        setJMenuBar(jMenuBar1);

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

    private void TxtsaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtsaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtsaidaActionPerformed

    private void TxtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtdataActionPerformed

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        carregarRota();
    }//GEN-LAST:event_btnComprarMouseClicked

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked
        formLogin login = new formLogin();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void tblROTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblROTASMouseClicked
        //formConfirmarPag pagamento = new formConfirmarPag();
        // this.setVisible(false);
        //pagamento.setVisible(true); 
        int selectedRow =   tblROTAS.getSelectedRow();        
        if(selectedRow != -1){
            Txtembarque.setText(tblROTAS.getValueAt(selectedRow, 1).toString());
            Txtdesembarque.setText(tblROTAS.getValueAt(selectedRow, 2).toString());
            Txtdtsaida.setText(tblROTAS.getValueAt(selectedRow, 3).toString());
            Txtdtchegada.setText(tblROTAS.getValueAt(selectedRow,4).toString());
            Txtvalor.setText(tblROTAS.getValueAt(selectedRow,5).toString());

        }
        
    }//GEN-LAST:event_tblROTASMouseClicked

    private void mnPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPedidoMouseClicked
        this.setVisible(false);
        formPedidoRealizado pedido = new formPedidoRealizado(pass);
        pedido.setVisible(true);      
    }//GEN-LAST:event_mnPedidoMouseClicked

    
    private void mnNOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNOMEMouseClicked

    }//GEN-LAST:event_mnNOMEMouseClicked

    private void mnPERFILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPERFILMouseClicked
        this.setVisible(false);
        formInfoPassageiro info = new formInfoPassageiro(pass);
        info.setVisible(true);     
    }//GEN-LAST:event_mnPERFILMouseClicked

    private void TxtsaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtsaidaMouseClicked
        // TODO add your handling code here:
                this.Txtsaida.setText("");
    }//GEN-LAST:event_TxtsaidaMouseClicked

    private void TxtdestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtdestinoMouseClicked
        // TODO add your handling code here:
                this.Txtdestino.setText("");
    }//GEN-LAST:event_TxtdestinoMouseClicked

    private void TxtdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtdataMouseClicked
        // TODO add your handling code here:
                this.Txtdata.setText("");
    }//GEN-LAST:event_TxtdataMouseClicked

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarActionPerformed

    private void RESERVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESERVARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RESERVARActionPerformed

    private void TxtembarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtembarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtembarqueActionPerformed

    
    
    private void RESERVARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESERVARMouseClicked

        carregarInfo(pass.getIdPassageiro(),rt.getIdRota());

    }//GEN-LAST:event_RESERVARMouseClicked

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
            java.util.logging.Logger.getLogger(formConsultaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formConsultaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formConsultaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formConsultaPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Passageiro passageiro = new Passageiro();
                new formConsultaPassagem(passageiro).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RESERVAR;
    private javax.swing.JTextField Txtdata;
    private javax.swing.JTextField Txtdesembarque;
    private javax.swing.JTextField Txtdestino;
    private javax.swing.JTextField Txtdtchegada;
    private javax.swing.JTextField Txtdtsaida;
    private javax.swing.JTextField Txtembarque;
    private javax.swing.JTextField Txtsaida;
    private javax.swing.JTextField Txtvalor;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnPedido;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JTable tblROTAS;
    // End of variables declaration//GEN-END:variables
}
