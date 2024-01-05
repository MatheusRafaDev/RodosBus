/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clientes;

import controller.motoristaDao;
import controller.onibusDao;
import controller.passageiroDao;
import controller.rotaDao;
import controller.reservaDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Motorista;
import model.Onibus;
import model.Passageiro;
import model.Reserva;
import model.Rota;

public class formPedidoRealizado extends javax.swing.JFrame {

    Passageiro pass = new Passageiro();
    Rota rt = new Rota();
    Reserva res = new Reserva();

    public void carregarRota() {
        reservaDao reserva = new reservaDao();
        ArrayList<Reserva> reservas = reserva.FormPedidos(pass.getIdPassageiro());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DefaultTableModel model = (DefaultTableModel) tblPEDIDOS.getModel();
        model.setRowCount(0);
        for (Reserva reserva2 : reservas) {
            model.addRow(new Object[]{
                reserva2.getIdReserva(),
                reserva2.getIdRota(),
                sdf.format(reserva2.getDataReserva()),
                reserva2.getValorTotal(), reserva2.getStatus()
            });

        }
    }

    public formPedidoRealizado(Passageiro obj) {
        initComponents();

        this.mnNOME.setText(obj.getNome());
        this.mnID.setText("Id: " + obj.getIdPassageiro());

        pass = obj;
        carregarRota();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPEDIDOS = new javax.swing.JTable();
        pedidoBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pdORIGEM = new javax.swing.JLabel();
        pdDESTINO = new javax.swing.JLabel();
        pdDTSaida = new javax.swing.JLabel();
        pdDTChegada = new javax.swing.JLabel();
        pdBUS = new javax.swing.JLabel();
        pdMOTO = new javax.swing.JLabel();
        cancelarBTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnRODOBUS = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        mnPERFIL = new javax.swing.JMenu();
        mnPedido = new javax.swing.JMenu();
        mnSAIR = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meus pedidos");
        setBackground(new java.awt.Color(255, 102, 0));

        jPanel1.setBackground(new java.awt.Color(50, 54, 66));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Meus pedidos");

        tblPEDIDOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id.Reserva", "Id.Rota", "Data Reserva", "Quantidade", "Valor Total", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPEDIDOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPEDIDOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPEDIDOS);
        if (tblPEDIDOS.getColumnModel().getColumnCount() > 0) {
            tblPEDIDOS.getColumnModel().getColumn(0).setResizable(false);
            tblPEDIDOS.getColumnModel().getColumn(1).setResizable(false);
            tblPEDIDOS.getColumnModel().getColumn(2).setResizable(false);
            tblPEDIDOS.getColumnModel().getColumn(3).setResizable(false);
            tblPEDIDOS.getColumnModel().getColumn(4).setResizable(false);
            tblPEDIDOS.getColumnModel().getColumn(5).setResizable(false);
        }

        pedidoBTN.setBackground(new java.awt.Color(69, 73, 74));
        pedidoBTN.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        pedidoBTN.setForeground(new java.awt.Color(255, 255, 255));
        pedidoBTN.setText("CONSULTAR BILHETE DO PEDIDO");
        pedidoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidoBTNMouseClicked(evt);
            }
        });
        pedidoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoBTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Origem:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Destino:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Saida:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de Chegada:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modelo do Ônibus:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Motorista:");

        pdORIGEM.setForeground(new java.awt.Color(255, 255, 255));
        pdORIGEM.setText("-");

        pdDESTINO.setForeground(new java.awt.Color(255, 255, 255));
        pdDESTINO.setText("-");

        pdDTSaida.setForeground(new java.awt.Color(255, 255, 255));
        pdDTSaida.setText("-");

        pdDTChegada.setForeground(new java.awt.Color(255, 255, 255));
        pdDTChegada.setText("-");

        pdBUS.setForeground(new java.awt.Color(255, 255, 255));
        pdBUS.setText("-");

        pdMOTO.setForeground(new java.awt.Color(255, 255, 255));
        pdMOTO.setText("-");

        cancelarBTN.setBackground(new java.awt.Color(69, 73, 74));
        cancelarBTN.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cancelarBTN.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBTN.setText("CANCELAR RESERVA");
        cancelarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pedidoBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pdMOTO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pdORIGEM))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pdDESTINO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pdDTSaida))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pdDTChegada))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pdBUS)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedidoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pdORIGEM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pdDESTINO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pdDTSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pdDTChegada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pdBUS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pdMOTO))
                .addGap(85, 85, 85))
        );

        jMenuBar1.setForeground(new java.awt.Color(60, 63, 65));
        jMenuBar1.add(jMenu7);

        mnRODOBUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 1/house.png"))); // NOI18N
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

        mnPERFIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 1/user.png"))); // NOI18N
        mnPERFIL.setText("Perfil");
        mnPERFIL.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mnPERFIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPERFILMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPERFIL);

        mnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 1/cart.png"))); // NOI18N
        mnPedido.setText("Pedido");
        mnPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPedidoMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPedido);

        mnSAIR.setText("Sair");
        mnSAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSAIRMouseClicked(evt);
            }
        });
        mnSAIR.add(jSeparator1);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked
        this.dispose();
        this.setVisible(false);
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void mnRODOBUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRODOBUSMouseClicked
        this.setVisible(false);
        this.dispose();
        formConsultaPassagem consulta = new formConsultaPassagem(pass);
        consulta.setVisible(true);
    }//GEN-LAST:event_mnRODOBUSMouseClicked

    private void mnPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPedidoMouseClicked
        this.setVisible(false);
        this.dispose();
        formPedidoRealizado pedido = new formPedidoRealizado(pass);
        pedido.setVisible(true);
    }//GEN-LAST:event_mnPedidoMouseClicked

    private void mnPERFILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPERFILMouseClicked
        this.setVisible(false);
        this.dispose();
        formInfoPassageiro info = new formInfoPassageiro(pass.getIdPassageiro());
        info.setVisible(true);
    }//GEN-LAST:event_mnPERFILMouseClicked

    private void pedidoBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoBTNMouseClicked
        reservaDao rese = new reservaDao();
        if (! res.getStatus().equals("Cancelada")) {
            this.setVisible(false);
            this.dispose();
            passageiroDao p = new passageiroDao();
            rotaDao r = new rotaDao();
            res.setIdRota(res.getIdRota());
            res.setIdPassageiro(pass.getIdPassageiro());
            res.setIdReserva(res.getIdReserva());
            res.setValorTotal(res.getValorTotal());

            formPassagemBilhete pas = new formPassagemBilhete(res);
            pas.setVisible(true);
        } else
            JOptionPane.showMessageDialog(null, "Não é possivel consultar o bilhete de uma reserva cancelada! ");
    }//GEN-LAST:event_pedidoBTNMouseClicked

    private void tblPEDIDOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPEDIDOSMouseClicked
        int selectedRow = tblPEDIDOS.getSelectedRow();
        String lblID;
        String rtID;
        String psID;
        int onID;
        Onibus on = new Onibus();
        Motorista moto = new Motorista();
        int mtID;
        if (selectedRow != -1) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            lblID = tblPEDIDOS.getValueAt(selectedRow, 0).toString();
            rtID = (tblPEDIDOS.getValueAt(selectedRow, 1).toString());
            tblPEDIDOS.getValueAt(selectedRow, 2).toString();
            tblPEDIDOS.getValueAt(selectedRow, 3).toString();
            tblPEDIDOS.getValueAt(selectedRow, 4).toString();
            tblPEDIDOS.getValueAt(selectedRow, 5).toString();
            reservaDao r = new reservaDao();
            rotaDao r2 = new rotaDao();
            onibusDao r3 = new onibusDao();
            motoristaDao r4 = new motoristaDao();
            rt = r2.selecionarUmaRota(Integer.parseInt(rtID));
            res = r.selecionarUmaReserva(Integer.parseInt(lblID));
            onID = rt.getIdOnibus();
            mtID = rt.getIdMotorista();
            on.setIdOnibus(onID);
            on = r3.selecionarUmOnibus(onID);
            moto.setIdMotorista(mtID);
            moto = r4.selecionarUmMotorista(mtID);
            res.setIdReserva(Integer.parseInt(rtID));
            res.setIdPassageiro(pass.getIdPassageiro());
            this.pdORIGEM.setText(rt.getOrigem());
            this.pdDESTINO.setText(rt.getDestino());
            this.pdDTSaida.setText(formato.format(rt.getDtSaida()));
            this.pdDTChegada.setText(formato.format(rt.getDtChegada()));
            this.pdBUS.setText(on.getModelo());
            this.pdMOTO.setText(moto.getNome());
        }
    }//GEN-LAST:event_tblPEDIDOSMouseClicked

    private void cancelarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBTNMouseClicked
        String lblID;
        reservaDao reses = new reservaDao();
        int selectedRow = tblPEDIDOS.getSelectedRow();
        if (selectedRow != -1) {

            lblID = tblPEDIDOS.getValueAt(selectedRow, 0).toString();
            reses.alterarStatus(Integer.parseInt(lblID));
            carregarRota();
        }
    }//GEN-LAST:event_cancelarBTNMouseClicked

    private void pedidoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedidoBTNActionPerformed

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
            java.util.logging.Logger.getLogger(formPedidoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPedidoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPedidoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPedidoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Passageiro passageiro = new Passageiro();
                new formPedidoRealizado(passageiro).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnPedido;
    private javax.swing.JMenu mnRODOBUS;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JLabel pdBUS;
    private javax.swing.JLabel pdDESTINO;
    private javax.swing.JLabel pdDTChegada;
    private javax.swing.JLabel pdDTSaida;
    private javax.swing.JLabel pdMOTO;
    private javax.swing.JLabel pdORIGEM;
    private javax.swing.JButton pedidoBTN;
    private javax.swing.JTable tblPEDIDOS;
    // End of variables declaration//GEN-END:variables
}
