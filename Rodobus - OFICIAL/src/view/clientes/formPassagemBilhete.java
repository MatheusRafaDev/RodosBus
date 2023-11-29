/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clientes;

import controller.passageiroDao;
import controller.rotaDao;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import model.Passageiro;
import model.Reserva;
import model.Rota;


public class formPassagemBilhete extends javax.swing.JFrame {
  
    Rota rota = new Rota();
    Passageiro pass = new Passageiro();
    Reserva res = new Reserva();
    public formPassagemBilhete(Reserva reserva) {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        passageiroDao p = new passageiroDao();
        rotaDao r = new rotaDao();

        rota = r.selecionarUmaRota(reserva.getIdRota());
        pass = p.selecionarUmPassageiro(reserva.getIdPassageiro());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        
        this.txtNOME.setText(pass.getNome());
        this.txtCHEGADA.setText(rota.getOrigem());
        this.txtDESTINO.setText(rota.getDestino());
        this.txtSAIDA.setText(formato.format(rota.getDtSaida()));
        this.txtORIGEM.setText(formato.format(rota.getDtChegada()));
        this.txtVALORUNI.setText(String.valueOf((float) rota.getVlPreco()));
        this.txtID.setText(String.valueOf(pass.getIdPassageiro()));
        this.txtVALORTOTAL.setText(String.valueOf(res.getValorTotal()));
        this.txtQTD.setText(String.valueOf(res.getQuantidadeReserva()));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnNOME1 = new javax.swing.JMenu();
        mnID1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnNOME2 = new javax.swing.JMenu();
        mnID2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        mnNOME3 = new javax.swing.JMenu();
        mnID3 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNOME = new javax.swing.JLabel();
        txtSAIDA = new javax.swing.JLabel();
        txtORIGEM = new javax.swing.JLabel();
        txtCHEGADA = new javax.swing.JLabel();
        txtDESTINO = new javax.swing.JLabel();
        txtVALORUNI = new javax.swing.JLabel();
        txtASSENTO = new javax.swing.JLabel();
        txtVALORTOTAL = new javax.swing.JLabel();
        txtQTD = new javax.swing.JLabel();
        txtIDRESERVA = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        jMenuBar5 = new javax.swing.JMenuBar();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        mnPERFIL = new javax.swing.JMenu();
        mnPEDIDO = new javax.swing.JMenu();
        mnSAIR = new javax.swing.JMenu();

        mnNOME1.setText("Nome");
        jMenuBar1.add(mnNOME1);

        mnID1.setText("ID:");
        jMenuBar1.add(mnID1);

        jMenu2.setText("Perfil");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Pedido");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        mnNOME2.setText("Nome");
        jMenuBar2.add(mnNOME2);

        mnID2.setText("ID:");
        jMenuBar2.add(mnID2);

        jMenu3.setText("Perfil");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        jMenu6.setText("Sair");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Pedido");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu7);

        mnNOME3.setText("Nome");
        jMenuBar3.add(mnNOME3);

        mnID3.setText("ID:");
        jMenuBar3.add(mnID3);

        jMenu8.setText("Perfil");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Sair");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Pedido");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(50, 54, 66));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(988, 494));
        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dt.SAÍDA:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dt.CHEGADA:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ORIGEM:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESTINO:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID.RESERVA:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ASSENTO:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("---------------------------------------------------------- RECIBO ----------------------------------------------------------------");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("QUANTIDADE:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DESCRIÇÃO:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("VALOR (UNIDADE):");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("VALOR TOTAL:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Apresente este QRCODE na hora como passagem");

        txtNOME.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtNOME.setText("nome");

        txtSAIDA.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtSAIDA.setText("saida");

        txtORIGEM.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtORIGEM.setText("origem");

        txtCHEGADA.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtCHEGADA.setText("chegada");

        txtDESTINO.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtDESTINO.setText("destino");

        txtVALORUNI.setForeground(new java.awt.Color(255, 255, 255));
        txtVALORUNI.setText("valor");

        txtASSENTO.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtASSENTO.setForeground(new java.awt.Color(255, 255, 255));
        txtASSENTO.setText("assento");

        txtVALORTOTAL.setForeground(new java.awt.Color(255, 255, 255));
        txtVALORTOTAL.setText("valor total");

        txtQTD.setForeground(new java.awt.Color(255, 255, 255));
        txtQTD.setText("quantidade");

        txtIDRESERVA.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtIDRESERVA.setText("id reserva ");

        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtORIGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtASSENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDRESERVA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCHEGADA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtQTD)
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtVALORUNI)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel11)))
                            .addComponent(txtID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVALORTOTAL)
                            .addComponent(jLabel13))
                        .addGap(75, 75, 75)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCHEGADA, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtORIGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDRESERVA, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtASSENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQTD)
                            .addComponent(txtVALORUNI)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtVALORTOTAL)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        jLabel1.getAccessibleContext().setAccessibleDescription("");
        jLabel2.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleDescription("");
        jLabel3.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleDescription("");
        jLabel4.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleDescription("");
        jLabel5.getAccessibleContext().setAccessibleName("");
        jLabel5.getAccessibleContext().setAccessibleDescription("");
        jLabel6.getAccessibleContext().setAccessibleName("");
        jLabel6.getAccessibleContext().setAccessibleDescription("");
        jLabel7.getAccessibleContext().setAccessibleName("");
        jLabel7.getAccessibleContext().setAccessibleDescription("");
        txtNOME.getAccessibleContext().setAccessibleName("");
        txtSAIDA.getAccessibleContext().setAccessibleName("");
        txtORIGEM.getAccessibleContext().setAccessibleName("");
        txtCHEGADA.getAccessibleContext().setAccessibleName("");
        txtDESTINO.getAccessibleContext().setAccessibleName("");
        txtASSENTO.getAccessibleContext().setAccessibleName("");
        txtIDRESERVA.getAccessibleContext().setAccessibleName("");

        mnNOME.setText("Nome");
        jMenuBar5.add(mnNOME);

        mnID.setText("ID:");
        jMenuBar5.add(mnID);

        mnPERFIL.setText("Perfil");
        mnPERFIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPERFILMouseClicked(evt);
            }
        });
        jMenuBar5.add(mnPERFIL);

        mnPEDIDO.setText("Pedido");
        mnPEDIDO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPEDIDOMouseClicked(evt);
            }
        });
        jMenuBar5.add(mnPEDIDO);

        mnSAIR.setText("Sair");
        mnSAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSAIRMouseClicked(evt);
            }
        });
        jMenuBar5.add(mnSAIR);

        setJMenuBar(jMenuBar5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnPERFILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPERFILMouseClicked

    }//GEN-LAST:event_mnPERFILMouseClicked

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked
        this.setVisible(false);
        this.dispose();
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void mnPEDIDOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPEDIDOMouseClicked
        this.setVisible(false);
        this.dispose();
        formPedidoRealizado pedido = new formPedidoRealizado(pass);
        pedido.setVisible(true);
    }//GEN-LAST:event_mnPEDIDOMouseClicked

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reserva reserva = new Reserva();
                new formPassagemBilhete(reserva).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnID1;
    private javax.swing.JMenu mnID2;
    private javax.swing.JMenu mnID3;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnNOME1;
    private javax.swing.JMenu mnNOME2;
    private javax.swing.JMenu mnNOME3;
    private javax.swing.JMenu mnPEDIDO;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JLabel txtASSENTO;
    private javax.swing.JLabel txtCHEGADA;
    private javax.swing.JLabel txtDESTINO;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtIDRESERVA;
    private javax.swing.JLabel txtNOME;
    private javax.swing.JLabel txtORIGEM;
    private javax.swing.JLabel txtQTD;
    private javax.swing.JLabel txtSAIDA;
    private javax.swing.JLabel txtVALORTOTAL;
    private javax.swing.JLabel txtVALORUNI;
    // End of variables declaration//GEN-END:variables

   
}
