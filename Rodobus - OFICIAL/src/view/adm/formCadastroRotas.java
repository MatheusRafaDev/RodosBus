package view.adm;

import controller.rotaDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Rota;
import java.util.ArrayList;
import controller.conectarDao;
import controller.motoristaDao;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import model.Motorista;

public class formCadastroRotas extends javax.swing.JFrame {

    public void VerificarData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        try {
            String inputText = txtCHEGADA4.getText().trim();
            sdf.setLenient(false);
            Date date = sdf.parse(inputText);
            txtCHEGADA4.setValue(sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Formato de data de saída é inválido. Use o formato dd/MM/yyyy HH:mm:ss", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCHEGADA4.setFocusLostBehavior(JFormattedTextField.PERSIST);
        }

        try {
            String inputText = txtSAIDA4.getText().trim();
            sdf.setLenient(false);
            Date date = sdf.parse(inputText);
            txtSAIDA4.setValue(sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Formato de data de chegada é inválido. Use o formato dd/MM/yyyy HH:mm:ss", "Erro", JOptionPane.ERROR_MESSAGE);
            txtSAIDA4.setFocusLostBehavior(JFormattedTextField.PERSIST);
        }
    }

    public void CarregarRotas() {

        rotaDao rota = new rotaDao();
        rota.criarBanco();
        ArrayList<Rota> rotas = rota.selecionarRotas();
        DefaultTableModel model = (DefaultTableModel) tblROTA.getModel();
        model.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (Rota rota2 : rotas) {
            model.addRow(new Object[]{rota2.getIdRota(), rota2.getIdMotorista() + " - " + rota2.getNomeMotorista(), rota2.getVlPreco(), rota2.getOrigem(), rota2.getDestino(), sdf.format(rota2.getDtSaida()), sdf.format(rota2.getDtChegada())});
        }
    }

    public void CarregarMotoristas() {
        DefaultComboBoxModel<String> mymodel = (DefaultComboBoxModel<String>) this.cmbMOTORISTA4.getModel();

        if (mymodel != null) {
            mymodel.removeAllElements();
        }

        motoristaDao motoristaDao = new motoristaDao();
        motoristaDao.criarBanco();
        ArrayList<Motorista> motoristas = motoristaDao.selecionarMotoristas();

        mymodel.addElement("");
        for (Motorista motorista : motoristas) {
            mymodel.addElement(motorista.getIdMotorista() + " - " + motorista.getNome());
        }
    }

    MaskFormatter mascara;
 
    
    MaskFormatter mascaraValor;

    public formCadastroRotas() {

        try {
            mascara  = new MaskFormatter("##/##/#### ##:##:##");
            mascaraValor = new MaskFormatter("###,###.00");
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        CarregarRotas();
        CarregarMotoristas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblROTA = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCADASTRAR4 = new javax.swing.JButton();
        btnNOVO4 = new javax.swing.JButton();
        btnALTERAR4 = new javax.swing.JButton();
        txtDESTINO4 = new javax.swing.JTextField();
        txtORIGEM4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCHEGADA4 = new javax.swing.JFormattedTextField(mascara);
        cmbMOTORISTA4 = new javax.swing.JComboBox<>();
        btnDELETAR4 = new javax.swing.JButton();
        txtVALOR4 = new javax.swing.JFormattedTextField(mascaraValor);
        btnBUSCAR4 = new javax.swing.JButton();
        lbID4 = new javax.swing.JLabel();
        txtSAIDA4 = new javax.swing.JFormattedTextField(mascara);

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(142, 157, 204));

        tblROTA.setForeground(new java.awt.Color(60, 63, 65));
        tblROTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Motorista", "Valor", "Filial Saida", "Filial Chegada", "Data saída", "Data chegada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblROTA.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblROTA.setSelectionForeground(new java.awt.Color(60, 63, 65));
        tblROTA.getTableHeader().setReorderingAllowed(false);
        tblROTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblROTAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblROTA);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cadastro de rotas");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Filial de destino");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Filial de origem");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data chegada");

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Data saída");

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Valor");

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Motorista");

        btnCADASTRAR4.setBackground(new java.awt.Color(69, 73, 74));
        btnCADASTRAR4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCADASTRAR4.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRAR4.setText("Cadastro");
        btnCADASTRAR4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCADASTRAR4MouseClicked(evt);
            }
        });
        btnCADASTRAR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRAR4ActionPerformed(evt);
            }
        });

        btnNOVO4.setBackground(new java.awt.Color(69, 73, 74));
        btnNOVO4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnNOVO4.setForeground(new java.awt.Color(255, 255, 255));
        btnNOVO4.setText("Novo Cadastro");
        btnNOVO4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOVO4MouseClicked(evt);
            }
        });
        btnNOVO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVO4ActionPerformed(evt);
            }
        });

        btnALTERAR4.setBackground(new java.awt.Color(69, 73, 74));
        btnALTERAR4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnALTERAR4.setForeground(new java.awt.Color(255, 255, 255));
        btnALTERAR4.setText("Alterar");
        btnALTERAR4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnALTERAR4MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cadastro de rotas");

        txtCHEGADA4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCHEGADA4FocusLost(evt);
            }
        });

        cmbMOTORISTA4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMOTORISTA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMOTORISTA4ActionPerformed(evt);
            }
        });

        btnDELETAR4.setBackground(new java.awt.Color(69, 73, 74));
        btnDELETAR4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnDELETAR4.setForeground(new java.awt.Color(255, 255, 255));
        btnDELETAR4.setText("Deletar");
        btnDELETAR4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDELETAR4MouseClicked(evt);
            }
        });
        btnDELETAR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETAR4ActionPerformed(evt);
            }
        });

        txtVALOR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVALOR4ActionPerformed(evt);
            }
        });

        btnBUSCAR4.setBackground(new java.awt.Color(69, 73, 74));
        btnBUSCAR4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBUSCAR4.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR4.setText("Buscar");
        btnBUSCAR4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBUSCAR4MouseClicked(evt);
            }
        });
        btnBUSCAR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCAR4ActionPerformed(evt);
            }
        });

        lbID4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbID4.setForeground(new java.awt.Color(255, 255, 255));
        lbID4.setText("0");

        txtSAIDA4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSAIDA4FocusLost(evt);
            }
        });
        txtSAIDA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSAIDA4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(cmbMOTORISTA4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtORIGEM4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtDESTINO4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCADASTRAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCHEGADA4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtVALOR4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnALTERAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSAIDA4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbID4)
                    .addComponent(btnNOVO4))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDELETAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBUSCAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDELETAR4)
                            .addComponent(btnBUSCAR4))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtORIGEM4)
                            .addComponent(txtSAIDA4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDESTINO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCHEGADA4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbMOTORISTA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVALOR4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnALTERAR4)
                            .addComponent(btnCADASTRAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNOVO4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(lbID4)
                        .addContainerGap())))
        );

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

    private void btnCADASTRAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCADASTRAR4MouseClicked
        VerificarData();

        rotaDao r = new rotaDao();
        Rota rota = new Rota();

        String origem = txtORIGEM4.getText();
        String destino = txtDESTINO4.getText();
        Double valor = Double.parseDouble(txtVALOR4.getText());

        String saidaText = txtSAIDA4.getText();
        String chegadaText = txtCHEGADA4.getText();

        Date saida = null;
        Date chegada = null;

        try {
            saida = (Date) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(saidaText);
            chegada = (Date) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(chegadaText);
        } catch (ParseException ex) {

        }

        rota.setDestino(destino);
        rota.setOrigem(origem);
        rota.setDtChegada(chegada);
        rota.setDtSaida(saida);
        rota.setVlPreco(valor);
        r.incluirRota(rota);
    }//GEN-LAST:event_btnCADASTRAR4MouseClicked

    private void btnNOVO4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOVO4MouseClicked
        lbID4.setText("0");
        txtORIGEM4.setText("");
        txtDESTINO4.setText("");
        txtCHEGADA4.setText("");
        txtCHEGADA4.setText("");
        txtVALOR4.setText("");
        cmbMOTORISTA4.setSelectedIndex(0);

    }//GEN-LAST:event_btnNOVO4MouseClicked

    private void btnALTERAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnALTERAR4MouseClicked

    }//GEN-LAST:event_btnALTERAR4MouseClicked

    private void txtCHEGADA4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCHEGADA4FocusLost


    }//GEN-LAST:event_txtCHEGADA4FocusLost

    private void btnCADASTRAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRAR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTRAR4ActionPerformed

    private void cmbMOTORISTA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMOTORISTA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMOTORISTA4ActionPerformed

    private void btnDELETAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDELETAR4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETAR4MouseClicked

    private void btnDELETAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETAR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETAR4ActionPerformed

    private void txtVALOR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVALOR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVALOR4ActionPerformed

    private void btnBUSCAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBUSCAR4MouseClicked
        CarregarRotas();
        CarregarMotoristas();
    }//GEN-LAST:event_btnBUSCAR4MouseClicked

    private void btnNOVO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVO4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOVO4ActionPerformed

    private void tblROTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblROTAMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblROTA.getModel();

        int selectedRow = tblROTA.getSelectedRow();

        if (selectedRow != -1) {
            lbID4.setText(model.getValueAt(selectedRow, 0).toString());

            txtVALOR4.setText(model.getValueAt(selectedRow, 2).toString());
            txtORIGEM4.setText(model.getValueAt(selectedRow, 3).toString());
            txtDESTINO4.setText(model.getValueAt(selectedRow, 4).toString());

            String MOTORISTA = model.getValueAt(selectedRow, 1).toString();
            int index = -1;
            for (int i = 0; i < cmbMOTORISTA4.getItemCount(); i++) {
                if (MOTORISTA.equals(cmbMOTORISTA4.getItemAt(i))) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                cmbMOTORISTA4.setSelectedIndex(index);
            } else {
                cmbMOTORISTA4.setSelectedIndex(0);
            }
            
            
            
            txtSAIDA4.setFormatterFactory(null);
            txtSAIDA4.setText(model.getValueAt(selectedRow, 5).toString());
                
            AbstractFormatterFactory formatterFactory = new DefaultFormatterFactory( mascara );
            txtSAIDA4.setFormatterFactory(formatterFactory);

  
  
           // txtCHEGADA4.setFormatterFactory(null);
            txtCHEGADA4.setText(model.getValueAt(selectedRow, 6).toString());

                    
        } else {
            lbID4.setText("0");
            txtORIGEM4.setText("");
            txtDESTINO4.setText("");
            txtSAIDA4.setText("");
            txtCHEGADA4.setText("");
            txtVALOR4.setText("");
            cmbMOTORISTA4.setSelectedIndex(0);
        }

    }//GEN-LAST:event_tblROTAMouseClicked

    private void btnBUSCAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCAR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBUSCAR4ActionPerformed

    private void txtSAIDA4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSAIDA4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSAIDA4FocusLost

    private void txtSAIDA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSAIDA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSAIDA4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCadastroRotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR4;
    private javax.swing.JButton btnBUSCAR4;
    private javax.swing.JButton btnCADASTRAR4;
    private javax.swing.JButton btnDELETAR4;
    private javax.swing.JButton btnNOVO4;
    private javax.swing.JComboBox<String> cmbMOTORISTA4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbID4;
    private javax.swing.JTable tblROTA;
    private javax.swing.JFormattedTextField txtCHEGADA4;
    private javax.swing.JTextField txtDESTINO4;
    private javax.swing.JTextField txtORIGEM4;
    private javax.swing.JFormattedTextField txtSAIDA4;
    private javax.swing.JFormattedTextField txtVALOR4;
    // End of variables declaration//GEN-END:variables
}
