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
import functions.Email;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
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
                reserva2.getQuantidade(),
                reserva2.getValorTotal(), 
                reserva2.getStatus()
            });

        }
    }

    public void carregarBilhete(int IdReserva) {
        this.dispose();
        this.setVisible(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
        reservaDao rese = new reservaDao();
        res = rese.selecionarUmaReserva(IdReserva);
        
        if (! res.getStatus().equals("Cancelada") && IdReserva > 0) {

            res = rese.selecionarUmaReserva(IdReserva);
          
            formPassagemBilhete pas = new formPassagemBilhete(res);
            pas.setVisible(true);
        } else
            JOptionPane.showMessageDialog(null, "Não é possivel consultar o bilhete de uma reserva cancelada! ");
    }
    
    public void cancelarPedido(int IdReserva) {
        reservaDao rese = new reservaDao();
        res = rese.selecionarUmaReserva(IdReserva);
        
        if(res.getStatus().equals("Cancelada")){
            return;
        }
        
        JFrame frame = new JFrame("Confirmação");
        int resposta = JOptionPane.showConfirmDialog(frame, "Deseja Cancelar o pedido?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            rese.alterarStatus(IdReserva);
            
            String fromEmail = "rafaelmatheus160@gmail.com";
            String password = "aopq iwrg nouk izon";
            String toEmail = pass.getEmail();
            String emailSubject = "Compra realizada";
            
            Email email = new Email(fromEmail, password, toEmail, emailSubject, "","html");
            
            email.enviarCancelamento(pass,res);
        }
        
        carregarRota();
    }
    
    JMenuItem Cancelar = new JMenuItem("Cancelar");
    JMenuItem Bilhete  = new JMenuItem("Consultar Bilhete");
    
    public formPedidoRealizado(Passageiro obj) {
        initComponents();
        
        this.mnNOME.setText(obj.getNome());
        this.mnID.setText("Id: " + obj.getIdPassageiro());
   
        pass = obj;
        
        carregarRota();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Bilhete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String id = lblID.getText();
                
                if(id == "0") {
                    return;
                } else {
                    carregarBilhete(Integer.parseInt(id));             
                }
            }
        });
           
        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = lblID.getText();
                
                 if(id == "0") {
                    return;
                } else {
                    cancelarPedido(Integer.parseInt(id));              
                }
       
            }
        });

        jPopupMenu1.add(Bilhete);
        jPopupMenu1.add(Cancelar);
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPEDIDOS = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
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

        tblPEDIDOS.setAutoCreateRowSorter(true);
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
        tblPEDIDOS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPEDIDOS.setShowGrid(false);
        tblPEDIDOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPEDIDOSMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPEDIDOSMouseReleased(evt);
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

        lblID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tblPEDIDOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPEDIDOSMouseClicked
        int selectedRow = tblPEDIDOS.getSelectedRow();
        
        if (selectedRow != -1) { 
            this.lblID.setText(tblPEDIDOS.getValueAt(selectedRow, 0).toString());
        }
    }//GEN-LAST:event_tblPEDIDOSMouseClicked

    private void tblPEDIDOSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPEDIDOSMouseReleased
       if (evt.isPopupTrigger()) {
        int row = tblPEDIDOS.rowAtPoint(evt.getPoint());

        tblPEDIDOS.setRowSelectionInterval(row, row);
        
        int x = evt.getX();
        int y = evt.getY();

        jPopupMenu1.show(tblPEDIDOS, x, y);
        }
    }//GEN-LAST:event_tblPEDIDOSMouseReleased

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblID;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnPedido;
    private javax.swing.JMenu mnRODOBUS;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JTable tblPEDIDOS;
    // End of variables declaration//GEN-END:variables
}
