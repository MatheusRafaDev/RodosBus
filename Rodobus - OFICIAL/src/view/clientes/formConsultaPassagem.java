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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.Rota;

public class formConsultaPassagem extends javax.swing.JFrame {

    public void carregarInfo(int IdPassageiro, int IdRota) {
        this.setVisible(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
        formConfirmarPag pag = new formConfirmarPag(IdPassageiro, IdRota);

        pag.setVisible(true);
       
    }
    public void carregarInfo2(int IdPassageiro, int IdRota) {
        this.setVisible(false);
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         
        formInfoPassageiro pag = new formInfoPassageiro(IdPassageiro, IdRota);

        pag.setVisible(true);
    }

    public void carregarRota() {
        rotaDao rota = new rotaDao();
        ArrayList<Rota> rotas = rota.selecionarRotas();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DefaultTableModel model = (DefaultTableModel) tblROTAS.getModel();
                
        for (Rota rota2 : rotas) {
            model.addRow(new Object[]{rota2.getIdRota(), rota2.getOrigem(), rota2.getDestino(), sdf.format(rota2.getDtSaida()), sdf.format(rota2.getDtChegada()), rota2.getVlPreco()});
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
    MaskFormatter mascara;

    public formConsultaPassagem(Passageiro obj) {

        try {
            mascara = new MaskFormatter("##/##/####");
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        initComponents();
        
        carregarRota();
        this.mnNOME.setText(obj.getNome());
        this.mnID.setText("Id: " + obj.getIdPassageiro());

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
        btnBUSCAR = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDATAVOLTA = new javax.swing.JFormattedTextField(mascara);
        txtDATASAIDA = new javax.swing.JFormattedTextField(mascara);
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
        setTitle("Passagens");
        setBackground(new java.awt.Color(142, 157, 204));

        jPanel1.setBackground(new java.awt.Color(242, 147, 4));
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
        btnBUSCAR.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
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

        Txtembarque.setForeground(new java.awt.Color(255, 255, 255));
        Txtembarque.setEnabled(false);
        Txtembarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtembarqueActionPerformed(evt);
            }
        });

        Txtdesembarque.setForeground(new java.awt.Color(255, 255, 255));
        Txtdesembarque.setEnabled(false);

        Txtdtsaida.setForeground(new java.awt.Color(255, 255, 255));
        Txtdtsaida.setEnabled(false);

        Txtdtchegada.setForeground(new java.awt.Color(255, 255, 255));
        Txtdtchegada.setEnabled(false);

        Txtvalor.setForeground(new java.awt.Color(255, 255, 255));
        Txtvalor.setEnabled(false);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDATAVOLTA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2))
                                .addGap(151, 151, 151))
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
                                        .addComponent(Txtvalor))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(39, 39, 39)))
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RESERVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDATAVOLTA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBUSCAR)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(13, Short.MAX_VALUE))
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
        formLogin login = new formLogin();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void tblROTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblROTASMouseClicked

        int selectedRow = tblROTAS.getSelectedRow();
        if (selectedRow != -1) {
            Txtembarque.setText(tblROTAS.getValueAt(selectedRow, 1).toString());
            lblID.setText(tblROTAS.getValueAt(selectedRow, 0).toString());
            Txtdesembarque.setText(tblROTAS.getValueAt(selectedRow, 2).toString());
            Txtdtsaida.setText(tblROTAS.getValueAt(selectedRow, 3).toString());
            Txtdtchegada.setText(tblROTAS.getValueAt(selectedRow, 4).toString());
            Txtvalor.setText(tblROTAS.getValueAt(selectedRow, 5).toString());

            rotaDao r = new rotaDao();

            rt = r.selecionarUmaRota(Integer.parseInt(lblID.getText()));
            rt.setIdRota(Integer.parseInt(lblID.getText()));
            pass.setIdPassageiro(pass.getIdPassageiro());

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
     

        carregarInfo2(pass.getIdPassageiro(), rt.getIdRota());    
    }//GEN-LAST:event_mnPERFILMouseClicked

    private void txtSAIDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSAIDAMouseClicked

    }//GEN-LAST:event_txtSAIDAMouseClicked

    private void txtDESTINOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDESTINOMouseClicked

    }//GEN-LAST:event_txtDESTINOMouseClicked

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBUSCARActionPerformed

    private void RESERVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESERVARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RESERVARActionPerformed

    private void TxtembarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtembarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtembarqueActionPerformed


    private void RESERVARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESERVARMouseClicked
        carregarInfo(pass.getIdPassageiro(), rt.getIdRota());
    }//GEN-LAST:event_RESERVARMouseClicked

    public static void main(String args[]) {
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
    private javax.swing.JButton btnBUSCAR;
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
