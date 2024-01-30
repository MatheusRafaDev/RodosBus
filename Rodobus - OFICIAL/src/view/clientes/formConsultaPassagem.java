package view.clientes;

import javax.swing.JOptionPane;
import model.Passageiro;
import view.clientes.formLogin;
import view.clientes.formConfirmarPag;
import controller.rotaDao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.Rota;

public class formConsultaPassagem extends javax.swing.JFrame {
         
    public void carregarInfo(int IdPassageiro, int IdRota) {
        this.dispose();
        this.setVisible(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
        formAssento assento = new formAssento(IdPassageiro, IdRota);
        
        assento.setVisible(true);
       
    }

    public void carregarRota() {
        rotaDao rota = new rotaDao();
        ArrayList<Rota> rotas = rota.selecionarRotas();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DefaultTableModel model = (DefaultTableModel) tblROTAS.getModel();
                
        for (Rota rota2 : rotas) {
            model.addRow(new Object[]{
                rota2.getIdRota(),
                rota2.getOrigem(),
                rota2.getDestino(),
                sdf.format(rota2.getDtSaida()),
                sdf.format(rota2.getDtChegada()),
                rota2.getVlPreco()
            });
        }
    }

    public void carregarRotaFiltro(Date DATASAIDA, Date DATAVOLTA, String ORIGEM, String DESTINO) {
        rotaDao rota = new rotaDao();
        ArrayList<Rota> rotas = rota.selecionarRotasFiltro(DATASAIDA, DATAVOLTA, ORIGEM, DESTINO);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DefaultTableModel model = (DefaultTableModel) tblROTAS.getModel();
        model.setRowCount(0);

        for (Rota rota2 : rotas) {
            model.addRow(new Object[]{rota2.getIdRota(), rota2.getOrigem(), rota2.getDestino(), sdf.format(rota2.getDtSaida()), sdf.format(rota2.getDtChegada()), rota2.getVlPreco()});
        }
    }

    Passageiro pass = new Passageiro();
    Rota rt = new Rota();

    JMenuItem novoItem = new JMenuItem("Reservar");
    
    public formConsultaPassagem(Passageiro obj) {

        initComponents();
           
        carregarRota();
        this.mnNOME.setText(obj.getNome());
        this.mnID.setText("Id: " + obj.getIdPassageiro());

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        pass = obj;
        
        novoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int selectedRow = tblROTAS.getSelectedRow();
                
                if (selectedRow != -1) {
                    lblID.setText(tblROTAS.getValueAt(selectedRow, 0).toString());

                    rotaDao r = new rotaDao();

                    rt = r.selecionarUmaRota(Integer.parseInt(lblID.getText()));
                    rt.setIdRota(Integer.parseInt(lblID.getText()));
                    pass.setIdPassageiro(pass.getIdPassageiro());

                }
                    
                carregarInfo(pass.getIdPassageiro(), rt.getIdRota());
        }
        });

        jPopupMenu1.add(novoItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSAIDA = new javax.swing.JTextField();
        txtDESTINO = new javax.swing.JTextField();
        btnBUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblROTAS = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDATAVOLTA = new javax.swing.JFormattedTextField();
        txtDATASAIDA = new javax.swing.JFormattedTextField();
        lblID = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        mnPERFIL = new javax.swing.JMenu();
        mnPedido = new javax.swing.JMenu();
        mnSAIR = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(142, 157, 204));

        jPanel1.setBackground(new java.awt.Color(50, 54, 66));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busque a sua passagem");

        txtSAIDA.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtSAIDA.setForeground(new java.awt.Color(123, 123, 123));
        txtSAIDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSAIDAMouseClicked(evt);
            }
        });
        txtSAIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSAIDAActionPerformed(evt);
            }
        });

        txtDESTINO.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtDESTINO.setForeground(new java.awt.Color(123, 123, 123));
        txtDESTINO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDESTINOMouseClicked(evt);
            }
        });

        btnBUSCAR.setBackground(new java.awt.Color(69, 73, 74));
        btnBUSCAR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR.setText("BUSCAR");
        btnBUSCAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBUSCARMouseClicked(evt);
            }
        });
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });

        tblROTAS.setAutoCreateRowSorter(true);
        tblROTAS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblROTAS.setForeground(new java.awt.Color(60, 63, 65));
        tblROTAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tblROTAS.setGridColor(new java.awt.Color(60, 63, 65));
        tblROTAS.setOpaque(false);
        tblROTAS.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tblROTAS.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblROTAS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblROTAS.setShowGrid(false);
        tblROTAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblROTASMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblROTASMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblROTAS);
        tblROTAS.getAccessibleContext().setAccessibleDescription("");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data chegada:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Para onde você vai?");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("De onde você vai sair?");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data saída:");

        try {
            txtDATAVOLTA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDATASAIDA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDATASAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDATAVOLTA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBUSCAR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDATAVOLTA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDATASAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtSAIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSAIDAActionPerformed

    }//GEN-LAST:event_txtSAIDAActionPerformed

    private void btnBUSCARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBUSCARMouseClicked
        String saidaText = txtDATASAIDA.getText();
        String chegadaText = txtDATAVOLTA.getText();

        Date saida = null;
        Date volta = null;

        try {
            saida = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(saidaText);
            volta = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(chegadaText);
        } catch (ParseException ex) {

        }

        carregarRotaFiltro(saida, volta, this.txtDESTINO.getText(), this.txtSAIDA.getText());

        txtDATASAIDA.setFocusLostBehavior(JFormattedTextField.PERSIST);
        txtDATAVOLTA.setFocusLostBehavior(JFormattedTextField.PERSIST);


    }//GEN-LAST:event_btnBUSCARMouseClicked

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked

        this.dispose();
        this.setVisible(false);
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void tblROTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblROTASMouseClicked

        int selectedRow = tblROTAS.getSelectedRow();
        if (selectedRow != -1) {
            lblID.setText(tblROTAS.getValueAt(selectedRow, 0).toString());

            rotaDao r = new rotaDao();

            rt = r.selecionarUmaRota(Integer.parseInt(lblID.getText()));
            rt.setIdRota(Integer.parseInt(lblID.getText()));
            pass.setIdPassageiro(pass.getIdPassageiro());

        }

    }//GEN-LAST:event_tblROTASMouseClicked

    private void mnPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPedidoMouseClicked
        this.dispose();
        this.setVisible(false);
        formPedido pedido = new formPedido(pass);
        pedido.setVisible(true);
    }//GEN-LAST:event_mnPedidoMouseClicked


    private void mnNOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnNOMEMouseClicked

    }//GEN-LAST:event_mnNOMEMouseClicked

    private void mnPERFILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPERFILMouseClicked

        this.setVisible(false);
        formInfoPassageiro pag = new formInfoPassageiro(pass.getIdPassageiro());
        
        this.dispose();
        pag.setVisible(true);  
    }//GEN-LAST:event_mnPERFILMouseClicked

    private void txtSAIDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSAIDAMouseClicked

    }//GEN-LAST:event_txtSAIDAMouseClicked

    private void txtDESTINOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDESTINOMouseClicked

    }//GEN-LAST:event_txtDESTINOMouseClicked

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBUSCARActionPerformed


    private void tblROTASMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblROTASMouseReleased
       if (evt.isPopupTrigger()) {
        int row = tblROTAS.rowAtPoint(evt.getPoint());

        tblROTAS.setRowSelectionInterval(row, row);
        
        int x = evt.getX();
        int y = evt.getY();

        jPopupMenu1.show(tblROTAS, x, y);
        }
    }//GEN-LAST:event_tblROTASMouseReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Passageiro passageiro = new Passageiro();
                new formConsultaPassagem(passageiro).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnPedido;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JTable tblROTAS;
    private javax.swing.JFormattedTextField txtDATASAIDA;
    private javax.swing.JFormattedTextField txtDATAVOLTA;
    private javax.swing.JTextField txtDESTINO;
    private javax.swing.JTextField txtSAIDA;
    // End of variables declaration//GEN-END:variables
}
