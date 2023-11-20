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
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Rota;


public class formConsultaPassagem extends javax.swing.JFrame {


    
    public void carregarInfo(int IdPassageiro, int IdRota){

        this.setVisible(false);
        formConfirmarPag pag = new formConfirmarPag(IdPassageiro,IdRota);
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
        lblidpass.setText(Integer.toString(obj.getIdPassageiro()));
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
        lblID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSAIDA = new javax.swing.JTextField();
        txtDESTINO = new javax.swing.JTextField();
        txtDATAIDA = new javax.swing.JTextField();
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
        lblidpass = new javax.swing.JLabel();
        txtDATAVOLTA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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

        lblID.setText("Embarque");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(142, 157, 204));

        jPanel1.setBackground(new java.awt.Color(142, 157, 204));
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

        txtDATAIDA.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtDATAIDA.setForeground(new java.awt.Color(123, 123, 123));
        txtDATAIDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDATAIDAMouseClicked(evt);
            }
        });
        txtDATAIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDATAIDAActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Embarque");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desembarque");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dt.Saída");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dt.Chegada");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor");

        lblidpass.setText("jLabel7");

        txtDATAVOLTA.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtDATAVOLTA.setForeground(new java.awt.Color(123, 123, 123));
        txtDATAVOLTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDATAVOLTAMouseClicked(evt);
            }
        });
        txtDATAVOLTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDATAVOLTAActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data volta:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Para onde você vai?");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("De onde você vai sair?");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data saída:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                .addComponent(Txtvalor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)))
                        .addGap(52, 52, 52)
                        .addComponent(RESERVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7))
                                            .addGap(26, 26, 26)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDATAVOLTA, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDATAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblidpass)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDATAVOLTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDATAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblidpass)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Txtdesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtdtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtdtchegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RESERVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(10, 10, 10)
                                .addComponent(Txtembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSAIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSAIDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSAIDAActionPerformed

    private void txtDATAIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDATAIDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDATAIDAActionPerformed

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        carregarRota();
    }//GEN-LAST:event_btnComprarMouseClicked

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked
        formLogin login = new formLogin();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void tblROTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblROTASMouseClicked

        int selectedRow =   tblROTAS.getSelectedRow();        
        if(selectedRow != -1){
            Txtembarque.setText(tblROTAS.getValueAt(selectedRow, 1).toString());
            lblID.setText(tblROTAS.getValueAt(selectedRow, 0).toString());
            Txtdesembarque.setText(tblROTAS.getValueAt(selectedRow, 2).toString());
            Txtdtsaida.setText(tblROTAS.getValueAt(selectedRow, 3).toString());
            Txtdtchegada.setText(tblROTAS.getValueAt(selectedRow,4).toString());
            Txtvalor.setText(tblROTAS.getValueAt(selectedRow,5).toString());
            
            rotaDao r = new rotaDao();
            
            rt = r.selecionarUmaRota(Integer.parseInt(lblID.getText()));
            rt.setIdRota(Integer.parseInt(lblID.getText()));
            pass.setIdPassageiro(Integer.parseInt(lblidpass.getText()));
            
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

    private void txtSAIDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSAIDAMouseClicked
        
    }//GEN-LAST:event_txtSAIDAMouseClicked

    private void txtDESTINOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDESTINOMouseClicked
       
    }//GEN-LAST:event_txtDESTINOMouseClicked

    private void txtDATAIDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDATAIDAMouseClicked
   
    }//GEN-LAST:event_txtDATAIDAMouseClicked

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

        JOptionPane.showMessageDialog(null,pass.getIdPassageiro());
        JOptionPane.showMessageDialog(null,rt.getIdRota());                       
        carregarInfo(pass.getIdPassageiro(),rt.getIdRota());
    }//GEN-LAST:event_RESERVARMouseClicked

    private void txtDATAVOLTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDATAVOLTAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDATAVOLTAMouseClicked

    private void txtDATAVOLTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDATAVOLTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDATAVOLTAActionPerformed

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
    private javax.swing.JTextField Txtdesembarque;
    private javax.swing.JTextField Txtdtchegada;
    private javax.swing.JTextField Txtdtsaida;
    private javax.swing.JTextField Txtembarque;
    private javax.swing.JTextField Txtvalor;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblidpass;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnPedido;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JTable tblROTAS;
    private javax.swing.JTextField txtDATAIDA;
    private javax.swing.JTextField txtDATAVOLTA;
    private javax.swing.JTextField txtDESTINO;
    private javax.swing.JTextField txtSAIDA;
    // End of variables declaration//GEN-END:variables
}
