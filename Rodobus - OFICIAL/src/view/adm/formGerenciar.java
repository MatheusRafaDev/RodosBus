/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.adm;

import controller.conectarDao;
import controller.motoristaDao;
import controller.passageiroDao;
import controller.onibusDao;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Motorista;
import model.Passageiro;
import model.Onibus;
import controller.rotaDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Rota;
import java.util.ArrayList;
import controller.conectarDao;
import controller.motoristaDao;
import controller.reservaDao;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.math.BigDecimal;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import model.Motorista;
import model.Reserva;
import utils.Controller;
import utils.Formatador;
import utils.Validador;
import utils.ValidarLetras;
import utils.ValidarNumero;
import view.clientes.formCadastroPassageiro;
import view.clientes.formLogin;
import utils.VerificadorData;
import utils.ValidarDataAno;

public class formGerenciar extends javax.swing.JFrame {

    Controller Controller = new Controller();
    VerificadorData VeriData = new VerificadorData();

    DefaultTableModel passageiroModel = null;
    DefaultTableModel motoristaModel = null;
    DefaultTableModel onibusModel = null;

    private void selecionarItemCombo(JComboBox<String> comboBox, String item) {
        int index = -1;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (item.equals(comboBox.getItemAt(i))) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            comboBox.setSelectedIndex(index);
        } else {
            comboBox.setSelectedIndex(0);
        }
    }

    private void selecionarItemComboPorCaractere(JComboBox<String> comboBox, char primeiroCaracter) {
        int index = -1;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            String item = comboBox.getItemAt(i);
            if (item.length() > 0 && primeiroCaracter == item.charAt(0)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            comboBox.setSelectedIndex(index);
        } else {
            comboBox.setSelectedIndex(0);
        }
    }

    private void limparCampos() {
        cmbPASSAGEIRO4.setSelectedIndex(0);
        cmbROTAS5.setSelectedIndex(0);
        cmbSTATUS4.setSelectedIndex(0);
        txtQTD4.setText("");
        txtVALORTOTAL4.setText("");
    }

    public formGerenciar() {
        initComponents();

        conectarDao oDao = new conectarDao();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        passageiroModel = (DefaultTableModel) tblPASSAGEIRO.getModel();
        motoristaModel = (DefaultTableModel) tblMOTORISTA.getModel();
        onibusModel = (DefaultTableModel) tblOnibus.getModel();

        Controller.carregarMotorista(motoristaModel, tblMOTORISTA);
        Controller.carregarComboBoxMotoristas(cmbMOTORISTA5);
        Controller.carregarPassageiro(passageiroModel, tblPASSAGEIRO);
        Controller.carregarMotorista(motoristaModel, tblMOTORISTA);
        Controller.carregarReservasDetalhadas(tblRESERVAS);
        Controller.carregarOnibus(tblOnibus);
        Controller.carregarRotas(tblROTA);

        Controller.carregarPassageirosComboBox(cmbPASSAGEIRO4);
        Controller.carregarStatusReservaComboBox(cmbSTATUS4);
        Controller.carregarOnibusComboBox(cmbONIBUS5);
        Controller.carregarComboBoxMotoristas(cmbMOTORISTA5);
        Controller.carregarRotasComboBox(cmbROTAS5);

        txtNOME1.setDocument(new ValidarLetras(30));
        txtIDADE1.setDocument(new ValidarNumero(3));

        txtNOME2.setDocument(new ValidarLetras(20));
        txtEMAIL2.setDocument(new Validador(30));
        txtIDADE2.setDocument(new ValidarNumero(3));
        txtSENHA2.setDocument(new Validador(20));

        txtMODELO3.setDocument(new Validador(30));
        txtPLACA3.setDocument(new Validador(7));
        txtCAPACIDADE3.setDocument(new ValidarNumero(2));
        txtANO3.setDocument(new ValidarDataAno(4, 2024));

        txtVALORTOTAL4.setDocument(new ValidarNumero(10));

        txtORIGEM5.setDocument(new ValidarLetras(40));
        txtDESTINO5.setDocument(new ValidarLetras(40));


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        pgROTAS = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMOTORISTA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCADASTRAR1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNOME1 = new javax.swing.JTextField();
        btnALTERAR1 = new javax.swing.JButton();
        btnBUSCAR1 = new javax.swing.JButton();
        btnDELETAR1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnNOVO1 = new javax.swing.JButton();
        txtTELEFONE1 = new javax.swing.JFormattedTextField();
        txtCPF1 = new javax.swing.JFormattedTextField();
        txtIDADE1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEMAIL2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNOME2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIDADE2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSENHA2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPASSAGEIRO = new javax.swing.JTable();
        btnDELETAR2 = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        btnALTERAR2 = new javax.swing.JButton();
        btnCADASTAR2 = new javax.swing.JButton();
        lblID2 = new javax.swing.JLabel();
        btnNOVO2 = new javax.swing.JButton();
        txtTELEFONE2 = new javax.swing.JFormattedTextField();
        txtCPF2 = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtMODELO3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPLACA3 = new javax.swing.JTextField();
        txtCAPACIDADE3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtANO3 = new javax.swing.JTextField();
        btnCADASTRAR3 = new javax.swing.JButton();
        btnNOVO3 = new javax.swing.JButton();
        btnALTERAR3 = new javax.swing.JButton();
        btnDELETAR3 = new javax.swing.JButton();
        btnBUSCAR3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOnibus = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnDELETAR4 = new javax.swing.JButton();
        btnBUSCAR4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRESERVAS = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        lblID4 = new javax.swing.JLabel();
        cmbPASSAGEIRO4 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        cmbROTAS5 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        cmbSTATUS4 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        btnCADASTRAR4 = new javax.swing.JButton();
        btnNOVA4 = new javax.swing.JButton();
        btnALTERA4 = new javax.swing.JButton();
        txtVALORTOTAL4 = new javax.swing.JTextField();
        txtQTD4 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblROTA = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnCADASTRAR5 = new javax.swing.JButton();
        btnNOVO5 = new javax.swing.JButton();
        btnALTERAR5 = new javax.swing.JButton();
        txtDESTINO5 = new javax.swing.JTextField();
        txtORIGEM5 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtCHEGADA5 = new javax.swing.JFormattedTextField();
        cmbMOTORISTA5 = new javax.swing.JComboBox<>();
        btnDELETAR5 = new javax.swing.JButton();
        txtVALOR5 = new javax.swing.JFormattedTextField();
        btnBUSCAR5 = new javax.swing.JButton();
        lbID4 = new javax.swing.JLabel();
        txtSAIDA5 = new javax.swing.JFormattedTextField();
        cmbONIBUS5 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnSAIR = new javax.swing.JMenu();

        jPanel5.setBackground(new java.awt.Color(142, 157, 204));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cadastrar novo Usuário");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("EMAIL");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("NOME");

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TELEFONE");

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("IDADE");

        jTextField14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(180, 180, 180));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SENHA");

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("CPF");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(125, 132, 178));
        jButton3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CADASTRAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 912, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento");

        pgROTAS.setPreferredSize(new java.awt.Dimension(1100, 462));

        jPanel2.setBackground(new java.awt.Color(242, 147, 4));
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de motorista");

        tblMOTORISTA.setAutoCreateRowSorter(true);
        tblMOTORISTA.setForeground(new java.awt.Color(60, 63, 65));
        tblMOTORISTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tblMOTORISTA.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblMOTORISTA.setSelectionForeground(new java.awt.Color(60, 63, 65));
        tblMOTORISTA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblMOTORISTAFocusGained(evt);
            }
        });
        tblMOTORISTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMOTORISTAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMOTORISTA);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefone");

        lblID1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblID1.setForeground(new java.awt.Color(255, 255, 255));
        lblID1.setText("0");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF");

        btnCADASTRAR1.setBackground(new java.awt.Color(69, 73, 74));
        btnCADASTRAR1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCADASTRAR1.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRAR1.setText("Cadastrar");
        btnCADASTRAR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCADASTRAR1MouseClicked(evt);
            }
        });
        btnCADASTRAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRAR1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastrar motorista");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome");

        btnALTERAR1.setBackground(new java.awt.Color(69, 73, 74));
        btnALTERAR1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnALTERAR1.setForeground(new java.awt.Color(255, 255, 255));
        btnALTERAR1.setText("Alterar");
        btnALTERAR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnALTERAR1MouseClicked(evt);
            }
        });
        btnALTERAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERAR1ActionPerformed(evt);
            }
        });

        btnBUSCAR1.setBackground(new java.awt.Color(69, 73, 74));
        btnBUSCAR1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBUSCAR1.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR1.setText("Buscar");
        btnBUSCAR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBUSCAR1MouseClicked(evt);
            }
        });
        btnBUSCAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCAR1ActionPerformed(evt);
            }
        });

        btnDELETAR1.setBackground(new java.awt.Color(69, 73, 74));
        btnDELETAR1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnDELETAR1.setForeground(new java.awt.Color(255, 255, 255));
        btnDELETAR1.setText("Deletar");
        btnDELETAR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDELETAR1MouseClicked(evt);
            }
        });
        btnDELETAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETAR1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Idade");

        btnNOVO1.setBackground(new java.awt.Color(69, 73, 74));
        btnNOVO1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnNOVO1.setForeground(new java.awt.Color(255, 255, 255));
        btnNOVO1.setText("Novo Cadastro");
        btnNOVO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOVO1MouseClicked(evt);
            }
        });
        btnNOVO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVO1ActionPerformed(evt);
            }
        });

        try {
            txtTELEFONE1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(btnNOVO1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtTELEFONE1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDADE1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnCADASTRAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnALTERAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCPF1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNOME1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDELETAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBUSCAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNOME1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDADE1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTELEFONE1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCADASTRAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnALTERAR1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNOVO1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDELETAR1)
                    .addComponent(btnBUSCAR1))
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(lblID1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pgROTAS.addTab("Motorista", jPanel1);

        jPanel4.setBackground(new java.awt.Color(242, 147, 4));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cadastrar novo usuário/passageiro");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefone");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Idade");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Senha");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consulta de passageiros");

        tblPASSAGEIRO.setForeground(new java.awt.Color(69, 73, 74));
        tblPASSAGEIRO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Email", "CPF", "Idade", "Telefone", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPASSAGEIRO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblPASSAGEIROFocusGained(evt);
            }
        });
        tblPASSAGEIRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPASSAGEIROMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPASSAGEIRO);

        btnDELETAR2.setBackground(new java.awt.Color(69, 73, 74));
        btnDELETAR2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnDELETAR2.setForeground(new java.awt.Color(255, 255, 255));
        btnDELETAR2.setText("Deletar");
        btnDELETAR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDELETAR2MouseClicked(evt);
            }
        });
        btnDELETAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETAR2ActionPerformed(evt);
            }
        });

        btnBuscar1.setBackground(new java.awt.Color(69, 73, 74));
        btnBuscar1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Buscar");
        btnBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseClicked(evt);
            }
        });
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnALTERAR2.setBackground(new java.awt.Color(69, 73, 74));
        btnALTERAR2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnALTERAR2.setForeground(new java.awt.Color(255, 255, 255));
        btnALTERAR2.setText("Alterar");
        btnALTERAR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnALTERAR2MouseClicked(evt);
            }
        });
        btnALTERAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERAR2ActionPerformed(evt);
            }
        });

        btnCADASTAR2.setBackground(new java.awt.Color(69, 73, 74));
        btnCADASTAR2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCADASTAR2.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTAR2.setText("Cadastrar");
        btnCADASTAR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCADASTAR2MouseClicked(evt);
            }
        });
        btnCADASTAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTAR2ActionPerformed(evt);
            }
        });

        lblID2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblID2.setForeground(new java.awt.Color(255, 255, 255));
        lblID2.setText("0");

        btnNOVO2.setBackground(new java.awt.Color(69, 73, 74));
        btnNOVO2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnNOVO2.setForeground(new java.awt.Color(255, 255, 255));
        btnNOVO2.setText("Novo Cadastro");
        btnNOVO2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOVO2MouseClicked(evt);
            }
        });
        btnNOVO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVO2ActionPerformed(evt);
            }
        });

        try {
            txtTELEFONE2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(lblID2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTELEFONE2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIDADE2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)))
                        .addComponent(txtNOME2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEMAIL2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCPF2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnNOVO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCADASTAR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnALTERAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtSENHA2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnDELETAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE)
                                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNOME2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTELEFONE2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDADE2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEMAIL2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtSENHA2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCADASTAR2)
                            .addComponent(btnALTERAR2))
                        .addGap(18, 18, 18)
                        .addComponent(btnNOVO2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(lblID2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDELETAR2)
                            .addComponent(btnBuscar1))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pgROTAS.addTab("Passageiro", jPanel3);

        jPanel8.setBackground(new java.awt.Color(242, 147, 4));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modelo");

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cadastrar ônibus");

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Placa");

        txtPLACA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLACA3ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Capacidade");

        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ano Fabricação");

        txtANO3.setInheritsPopupMenu(true);
        txtANO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtANO3ActionPerformed(evt);
            }
        });

        btnCADASTRAR3.setBackground(new java.awt.Color(69, 73, 74));
        btnCADASTRAR3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCADASTRAR3.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRAR3.setText("Cadastrar");
        btnCADASTRAR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCADASTRAR3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCADASTRAR3MouseEntered(evt);
            }
        });
        btnCADASTRAR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRAR3ActionPerformed(evt);
            }
        });

        btnNOVO3.setBackground(new java.awt.Color(69, 73, 74));
        btnNOVO3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnNOVO3.setForeground(new java.awt.Color(255, 255, 255));
        btnNOVO3.setText("Novo Cadastro");
        btnNOVO3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOVO3MouseClicked(evt);
            }
        });
        btnNOVO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVO3ActionPerformed(evt);
            }
        });

        btnALTERAR3.setBackground(new java.awt.Color(69, 73, 74));
        btnALTERAR3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnALTERAR3.setForeground(new java.awt.Color(255, 255, 255));
        btnALTERAR3.setText("Alterar");
        btnALTERAR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnALTERAR3MouseClicked(evt);
            }
        });
        btnALTERAR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERAR3ActionPerformed(evt);
            }
        });

        btnDELETAR3.setBackground(new java.awt.Color(69, 73, 74));
        btnDELETAR3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnDELETAR3.setForeground(new java.awt.Color(255, 255, 255));
        btnDELETAR3.setText("Deletar");
        btnDELETAR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDELETAR3MouseClicked(evt);
            }
        });
        btnDELETAR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETAR3ActionPerformed(evt);
            }
        });

        btnBUSCAR3.setBackground(new java.awt.Color(69, 73, 74));
        btnBUSCAR3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBUSCAR3.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR3.setText("Buscar");
        btnBUSCAR3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBUSCAR3MouseClicked(evt);
            }
        });
        btnBUSCAR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCAR3ActionPerformed(evt);
            }
        });

        tblOnibus.setForeground(new java.awt.Color(60, 63, 65));
        tblOnibus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Modelo", "Placa", "Capacidade", "Ano Fabr"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOnibus.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblOnibus.setSelectionForeground(new java.awt.Color(60, 63, 65));
        tblOnibus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblOnibusFocusGained(evt);
            }
        });
        tblOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOnibusMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblOnibus);

        jLabel27.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Consulta de ônibus");

        lblID3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblID3.setForeground(new java.awt.Color(255, 255, 255));
        lblID3.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel8)
                    .addComponent(lblID3)
                    .addComponent(jLabel26)
                    .addComponent(txtANO3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCADASTRAR3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNOVO3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnALTERAR3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMODELO3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(txtPLACA3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCAPACIDADE3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnDELETAR3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBUSCAR3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(txtMODELO3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPLACA3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCAPACIDADE3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtANO3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCADASTRAR3)
                            .addComponent(btnALTERAR3))
                        .addGap(18, 18, 18)
                        .addComponent(btnNOVO3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBUSCAR3)
                        .addComponent(btnDELETAR3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pgROTAS.addTab("Ônibus", jPanel7);

        jPanel11.setBackground(new java.awt.Color(242, 147, 4));

        btnDELETAR4.setBackground(new java.awt.Color(69, 73, 74));
        btnDELETAR4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
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

        btnBUSCAR4.setBackground(new java.awt.Color(69, 73, 74));
        btnBUSCAR4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
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

        tblRESERVAS.setForeground(new java.awt.Color(60, 63, 65));
        tblRESERVAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id.Reserva", "Id.Rota", "Data Reserva", "Status", "Motorista", "Passageiro", "Qtd.Resevas", "Vl.Total", "Origem", "Destino", "Dt.Saída", "Dt.Chegada", "Modelo Ônibus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRESERVAS.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblRESERVAS.setSelectionForeground(new java.awt.Color(60, 63, 65));
        tblRESERVAS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblRESERVASFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblRESERVASFocusLost(evt);
            }
        });
        tblRESERVAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRESERVASMouseClicked(evt);
            }
        });
        tblRESERVAS.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblRESERVASPropertyChange(evt);
            }
        });
        jScrollPane5.setViewportView(tblRESERVAS);

        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Consulta de reservas");

        lblID4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblID4.setForeground(new java.awt.Color(255, 255, 255));
        lblID4.setText("0");

        cmbPASSAGEIRO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPASSAGEIRO4ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Passageiro");

        cmbROTAS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbROTAS5ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Rota");

        cmbSTATUS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSTATUS4ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Status");

        jLabel40.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Vl.total");

        jLabel42.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Qtd.reservas");

        btnCADASTRAR4.setBackground(new java.awt.Color(69, 73, 74));
        btnCADASTRAR4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCADASTRAR4.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRAR4.setText("Cadastrar");
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

        btnNOVA4.setBackground(new java.awt.Color(69, 73, 74));
        btnNOVA4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnNOVA4.setForeground(new java.awt.Color(255, 255, 255));
        btnNOVA4.setText("Novo Cadastro");
        btnNOVA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOVA4MouseClicked(evt);
            }
        });
        btnNOVA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVA4ActionPerformed(evt);
            }
        });

        btnALTERA4.setBackground(new java.awt.Color(69, 73, 74));
        btnALTERA4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnALTERA4.setForeground(new java.awt.Color(255, 255, 255));
        btnALTERA4.setText("Alterar");
        btnALTERA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnALTERA4MouseClicked(evt);
            }
        });
        btnALTERA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERA4ActionPerformed(evt);
            }
        });

        txtVALORTOTAL4.setInheritsPopupMenu(true);
        txtVALORTOTAL4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVALORTOTAL4ActionPerformed(evt);
            }
        });

        txtQTD4.setInheritsPopupMenu(true);
        txtQTD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTD4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel37)
                        .addComponent(jLabel38)
                        .addComponent(jLabel39)
                        .addComponent(jLabel40)
                        .addComponent(jLabel42)
                        .addComponent(lblID4)
                        .addComponent(txtVALORTOTAL4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbROTAS5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSTATUS4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbPASSAGEIRO4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnCADASTRAR4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNOVA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(btnALTERA4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtQTD4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnDELETAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBUSCAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPASSAGEIRO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbROTAS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSTATUS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVALORTOTAL4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel42)
                        .addGap(3, 3, 3)
                        .addComponent(txtQTD4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCADASTRAR4)
                            .addComponent(btnALTERA4))
                        .addGap(36, 36, 36)
                        .addComponent(btnNOVA4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(btnDELETAR4)
                    .addComponent(btnBUSCAR4))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pgROTAS.addTab("Reservas", jPanel9);

        jPanel10.setBackground(new java.awt.Color(242, 147, 4));

        tblROTA.setForeground(new java.awt.Color(60, 63, 65));
        tblROTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Motorista", "Ônibus", "Valor", "Filial Saida", "Filial Chegada", "Data saída", "Data chegada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jScrollPane4.setViewportView(tblROTA);

        jLabel28.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Cadastro de rotas");

        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Filial de destino");

        jLabel30.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Filial de origem");

        jLabel31.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Data chegada");

        jLabel32.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Data saída");

        jLabel33.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Preço da passagem");

        jLabel34.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Motorista");

        btnCADASTRAR5.setBackground(new java.awt.Color(69, 73, 74));
        btnCADASTRAR5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCADASTRAR5.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRAR5.setText("Cadastro");
        btnCADASTRAR5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCADASTRAR5MouseClicked(evt);
            }
        });
        btnCADASTRAR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRAR5ActionPerformed(evt);
            }
        });

        btnNOVO5.setBackground(new java.awt.Color(69, 73, 74));
        btnNOVO5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnNOVO5.setForeground(new java.awt.Color(255, 255, 255));
        btnNOVO5.setText("Novo Cadastro");
        btnNOVO5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOVO5MouseClicked(evt);
            }
        });
        btnNOVO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVO5ActionPerformed(evt);
            }
        });

        btnALTERAR5.setBackground(new java.awt.Color(69, 73, 74));
        btnALTERAR5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnALTERAR5.setForeground(new java.awt.Color(255, 255, 255));
        btnALTERAR5.setText("Alterar");
        btnALTERAR5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnALTERAR5MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Cadastro de rotas");

        try {
            txtCHEGADA5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCHEGADA5.setToolTipText("");
        txtCHEGADA5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCHEGADA5FocusLost(evt);
            }
        });
        txtCHEGADA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCHEGADA5ActionPerformed(evt);
            }
        });

        cmbMOTORISTA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMOTORISTA5ActionPerformed(evt);
            }
        });

        btnDELETAR5.setBackground(new java.awt.Color(69, 73, 74));
        btnDELETAR5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnDELETAR5.setForeground(new java.awt.Color(255, 255, 255));
        btnDELETAR5.setText("Deletar");
        btnDELETAR5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDELETAR5MouseClicked(evt);
            }
        });
        btnDELETAR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETAR5ActionPerformed(evt);
            }
        });

        txtVALOR5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtVALOR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVALOR5ActionPerformed(evt);
            }
        });

        btnBUSCAR5.setBackground(new java.awt.Color(69, 73, 74));
        btnBUSCAR5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnBUSCAR5.setForeground(new java.awt.Color(255, 255, 255));
        btnBUSCAR5.setText("Buscar");
        btnBUSCAR5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBUSCAR5MouseClicked(evt);
            }
        });
        btnBUSCAR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCAR5ActionPerformed(evt);
            }
        });

        lbID4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbID4.setForeground(new java.awt.Color(255, 255, 255));
        lbID4.setText("0");

        try {
            txtSAIDA5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSAIDA5.setToolTipText("");
        txtSAIDA5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSAIDA5FocusLost(evt);
            }
        });
        txtSAIDA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSAIDA5ActionPerformed(evt);
            }
        });

        cmbONIBUS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbONIBUS5ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Ônibus");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(lbID4)
                            .addComponent(btnNOVO5)
                            .addComponent(jLabel36)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDESTINO5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(txtORIGEM5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btnCADASTRAR5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnALTERAR5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCHEGADA5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSAIDA5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel34))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbONIBUS5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMOTORISTA5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(138, 138, 138))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtVALOR5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btnDELETAR5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBUSCAR5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBUSCAR5)
                            .addComponent(btnDELETAR5))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addGap(5, 5, 5)
                        .addComponent(txtORIGEM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDESTINO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSAIDA5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCHEGADA5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMOTORISTA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbONIBUS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVALOR5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCADASTRAR5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnALTERAR5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNOVO5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbID4)
                        .addContainerGap())))
        );

        pgROTAS.addTab("Rotas", jPanel10);

        jMenu3.setText("RodoBus");
        jMenuBar2.add(jMenu3);

        mnSAIR.setText("Sair");
        mnSAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSAIRMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnSAIR);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgROTAS, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pgROTAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked

        this.dispose();
        this.setVisible(false);
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void txtSAIDA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSAIDA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSAIDA5ActionPerformed

    private void txtSAIDA5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSAIDA5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSAIDA5FocusLost

    private void btnBUSCAR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCAR5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBUSCAR5ActionPerformed

    private void btnBUSCAR5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBUSCAR5MouseClicked

        Controller.carregarRotas(tblROTA);
        Controller.carregarMotorista(motoristaModel, tblMOTORISTA);
        Controller.carregarOnibus(tblOnibus);
    }//GEN-LAST:event_btnBUSCAR5MouseClicked

    private void txtVALOR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVALOR5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVALOR5ActionPerformed

    private void btnDELETAR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETAR5ActionPerformed

    }//GEN-LAST:event_btnDELETAR5ActionPerformed

    private void btnDELETAR5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDELETAR5MouseClicked
        rotaDao rota = new rotaDao();
        rota.excluir(Integer.parseInt(this.lbID4.getText()));
        Controller.carregarRotas(tblROTA);
        lbID4.setText("0");
        txtORIGEM5.setText("");
        txtDESTINO5.setText("");

        txtSAIDA5.setText("");
        txtCHEGADA5.setText("");

        txtVALOR5.setText("");
        cmbMOTORISTA5.setSelectedIndex(0);
    }//GEN-LAST:event_btnDELETAR5MouseClicked

    private void cmbMOTORISTA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMOTORISTA5ActionPerformed

    }//GEN-LAST:event_cmbMOTORISTA5ActionPerformed

    private void txtCHEGADA5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCHEGADA5FocusLost

    }//GEN-LAST:event_txtCHEGADA5FocusLost

    private void btnALTERAR5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnALTERAR5MouseClicked
        rotaDao rota = new rotaDao();

        String IdMoto = (String) cmbMOTORISTA5.getSelectedItem();
        String numeroComoString = IdMoto.replaceAll("\\D+", "");
        int motorista = Integer.parseInt(numeroComoString);

        String IdBus = (String) cmbMOTORISTA5.getSelectedItem();
        String numeroComoString2 = IdBus.replaceAll("\\D+", "");
        int bus = Integer.parseInt(numeroComoString2);

        if (VeriData.verificarData(txtCHEGADA5, txtSAIDA5)) {
            String saidaText = txtSAIDA5.getText();
            String chegadaText = txtCHEGADA5.getText();
            Date saida = null;
            Date chegada = null;

            try {
                saida = (Date) new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(saidaText);
                chegada = (Date) new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(chegadaText);
            } catch (ParseException ex) {

            }
            DefaultTableModel model = (DefaultTableModel) tblROTA.getModel();
            Rota rotass = new Rota();
            rotass.setOrigem(this.txtORIGEM5.getText());
            rotass.setDestino(this.txtDESTINO5.getText());
            rotass.setDtChegada(chegada);
            rotass.setDtSaida(saida);
            rotass.setIdMotorista(motorista);
            rotass.setIdOnibus(bus);

            String textoValor = this.txtVALOR5.getText().trim();
            String valorSemPontos = textoValor.replace(",", "");
            double valor = Double.parseDouble(valorSemPontos);
            rotass.setVlPreco(valor);
    

            rotass.setIdRota(Integer.parseInt(this.lbID4.getText()));

            rota.alterar(rotass);
            txtSAIDA5.setFocusLostBehavior(JFormattedTextField.PERSIST);
            txtCHEGADA5.setFocusLostBehavior(JFormattedTextField.PERSIST);
            Controller.carregarRotas(tblROTA);
        }


    }//GEN-LAST:event_btnALTERAR5MouseClicked

    private void btnNOVO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVO5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOVO5ActionPerformed

    private void btnNOVO5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOVO5MouseClicked
        lbID4.setText("0");
        txtORIGEM5.setText("");
        txtDESTINO5.setText("");

        txtSAIDA5.setText("");
        txtCHEGADA5.setText("");

        txtVALOR5.setText("");
        cmbMOTORISTA5.setSelectedIndex(0);
    }//GEN-LAST:event_btnNOVO5MouseClicked

    private void btnCADASTRAR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRAR5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTRAR5ActionPerformed

    private void btnCADASTRAR5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCADASTRAR5MouseClicked

        rotaDao rota = new rotaDao();

        String IdMoto = (String) cmbMOTORISTA5.getSelectedItem();
        String numeroComoString = IdMoto.replaceAll("\\D+", "");
        int motorista = Integer.parseInt(numeroComoString);

        String IdBus = (String) cmbMOTORISTA5.getSelectedItem();
        String numeroComoString2 = IdBus.replaceAll("\\D+", "");
        int bus = Integer.parseInt(numeroComoString2);

        if (VeriData.verificarData(txtCHEGADA5, txtSAIDA5)) {
            String saidaText = txtSAIDA5.getText();
            String chegadaText = txtCHEGADA5.getText();
            Date saida = null;
            Date chegada = null;

            try {
                saida = (Date) new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(saidaText);
                chegada = (Date) new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(chegadaText);
            } catch (ParseException ex) {

            }
            DefaultTableModel model = (DefaultTableModel) tblROTA.getModel();
            Rota rotass = new Rota();
            rotass.setOrigem(this.txtORIGEM5.getText());
            rotass.setDestino(this.txtDESTINO5.getText());
            rotass.setDtChegada(chegada);
            rotass.setDtSaida(saida);
            rotass.setIdMotorista(motorista);
            rotass.setIdOnibus(bus);

            String textoValor = this.txtVALOR5.getText().trim();
            String valorSemPontos = textoValor.replace(",", "");
            double valor = Double.parseDouble(valorSemPontos);
            rotass.setVlPreco(valor);

            rotass.setIdRota(0);

            rota.incluirRota(rotass);
            txtSAIDA5.setFocusLostBehavior(JFormattedTextField.PERSIST);
            txtCHEGADA5.setFocusLostBehavior(JFormattedTextField.PERSIST);
            Controller.carregarRotas(tblROTA);
        }

        Controller.carregarRotas(tblROTA);
    }//GEN-LAST:event_btnCADASTRAR5MouseClicked

    private void tblROTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblROTAMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblROTA.getModel();

        int selectedRow = tblROTA.getSelectedRow();

        if (selectedRow != -1) {
            lbID4.setText(model.getValueAt(selectedRow, 0).toString());
            
            String stringValue = model.getValueAt(selectedRow, 3).toString();     
            txtVALOR5.setText(removeDecimalAndZeros(stringValue));

            txtORIGEM5.setText(model.getValueAt(selectedRow, 4).toString());
            txtDESTINO5.setText(model.getValueAt(selectedRow, 5).toString());

            String MOTORISTA = model.getValueAt(selectedRow, 1).toString();
            int index = -1;
            for (int i = 0; i < cmbMOTORISTA5.getItemCount(); i++) {
                if (MOTORISTA.equals(cmbMOTORISTA5.getItemAt(i))) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                cmbMOTORISTA5.setSelectedIndex(index);
            } else {
                cmbMOTORISTA5.setSelectedIndex(0);
            }

            String ONIBUS = model.getValueAt(selectedRow, 2).toString();
            int index2 = -1;
            for (int a = 0; a < cmbONIBUS5.getItemCount(); a++) {
                if (ONIBUS.equals(cmbONIBUS5.getItemAt(a))) {
                    index2 = a;
                    break;
                }
            }

            if (index2 != -1) {
                cmbONIBUS5.setSelectedIndex(index2);
            } else {
                cmbONIBUS5.setSelectedIndex(0);
            }

            String textoSaida = model.getValueAt(selectedRow, 6).toString().trim();
            String textoChegada = model.getValueAt(selectedRow, 7).toString().trim();

            try {

                SimpleDateFormat formatoDesejado = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                Date dataSaida = formatoDesejado.parse(textoSaida);
                Date dataChegada = formatoDesejado.parse(textoChegada);

                String saidaFormatada = formatoDesejado.format(dataSaida);
                String chegadaFormatada = formatoDesejado.format(dataChegada);

                txtSAIDA5.setText(saidaFormatada);
                txtCHEGADA5.setText(chegadaFormatada);

                txtSAIDA5.setFocusLostBehavior(JFormattedTextField.PERSIST);
                txtCHEGADA5.setFocusLostBehavior(JFormattedTextField.PERSIST);

            } catch (ParseException e) {
                e.printStackTrace();
            }

        } else {
            lbID4.setText("0");
            txtORIGEM5.setText("");
            txtDESTINO5.setText("");
            txtSAIDA5.setText("");
            txtCHEGADA5.setText("");
            txtVALOR5.setText("");
            cmbMOTORISTA5.setSelectedIndex(0);
            cmbONIBUS5.setSelectedIndex(0);
        }

        txtSAIDA5.setFocusLostBehavior(JFormattedTextField.PERSIST);
        txtCHEGADA5.setFocusLostBehavior(JFormattedTextField.PERSIST);
    }//GEN-LAST:event_tblROTAMouseClicked

    private void tblOnibusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOnibusMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblOnibus.getModel();

        int selectedRow = tblOnibus.getSelectedRow();

        if (selectedRow != -1) {
            lblID3.setText(tblOnibus.getValueAt(selectedRow, 0).toString());
            txtMODELO3.setText(tblOnibus.getValueAt(selectedRow, 1).toString());
            txtPLACA3.setText(tblOnibus.getValueAt(selectedRow, 2).toString());
            txtCAPACIDADE3.setText(tblOnibus.getValueAt(selectedRow, 3).toString());
            txtANO3.setText(tblOnibus.getValueAt(selectedRow, 4).toString());

        } else {
            lblID3.setText("0");
            txtMODELO3.setText("");
            txtANO3.setText("");
            txtCAPACIDADE3.setText("");
            txtPLACA3.setText("");
        }
    }//GEN-LAST:event_tblOnibusMouseClicked

    private void tblOnibusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblOnibusFocusGained

    }//GEN-LAST:event_tblOnibusFocusGained

    private void btnBUSCAR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCAR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBUSCAR3ActionPerformed

    private void btnBUSCAR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBUSCAR3MouseClicked
        Controller.carregarOnibus(tblOnibus);
    }//GEN-LAST:event_btnBUSCAR3MouseClicked

    private void btnDELETAR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETAR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETAR3ActionPerformed

    private void btnDELETAR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDELETAR3MouseClicked
        onibusDao bus = new onibusDao();
        bus.excluir(Integer.parseInt(this.lblID3.getText()));

        Controller.carregarOnibus(tblOnibus);

        this.txtCAPACIDADE3.setText("");
        this.txtMODELO3.setText("");
        this.txtPLACA3.setText("");
        this.txtANO3.setText("");
        this.lblID3.setText("");
    }//GEN-LAST:event_btnDELETAR3MouseClicked

    private void btnALTERAR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERAR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnALTERAR3ActionPerformed

    private void btnALTERAR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnALTERAR3MouseClicked
        onibusDao bus = new onibusDao();

        DefaultTableModel model = (DefaultTableModel) tblOnibus.getModel();

        Onibus Cadbus = new Onibus();

        Cadbus.setModelo(this.txtMODELO3.getText());
        Cadbus.setPlaca(this.txtPLACA3.getText());
        Cadbus.setAnoFabricacao(Integer.parseInt(this.txtANO3.getText()));
        Cadbus.setCapacidade(Integer.parseInt(this.txtCAPACIDADE3.getText()));
        Cadbus.setIdOnibus(Integer.parseInt(this.lblID3.getText()));

        bus.alterar(Cadbus);

        Controller.carregarOnibus(tblOnibus);
    }//GEN-LAST:event_btnALTERAR3MouseClicked

    private void btnNOVO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVO3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOVO3ActionPerformed

    private void btnNOVO3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOVO3MouseClicked
        this.txtCAPACIDADE3.setText("");
        this.txtMODELO3.setText("");
        this.txtPLACA3.setText("");
        this.txtANO3.setText("");
        this.lblID3.setText("");
    }//GEN-LAST:event_btnNOVO3MouseClicked

    private void btnCADASTRAR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRAR3ActionPerformed

    }//GEN-LAST:event_btnCADASTRAR3ActionPerformed

    private void btnCADASTRAR3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCADASTRAR3MouseClicked

        Onibus Cadbus = new Onibus();

        Cadbus.setModelo(this.txtMODELO3.getText());
        Cadbus.setPlaca(this.txtPLACA3.getText());
        Cadbus.setAnoFabricacao(Integer.parseInt(this.txtANO3.getText()));
        Cadbus.setCapacidade(Integer.parseInt(this.txtCAPACIDADE3.getText()));
        Cadbus.setIdOnibus(0);

        onibusDao bus = new onibusDao();

        bus.incluir(Cadbus);

        Controller.carregarOnibus(tblOnibus);
    }//GEN-LAST:event_btnCADASTRAR3MouseClicked

    private void txtANO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtANO3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtANO3ActionPerformed

    private void btnNOVO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOVO2ActionPerformed

    private void btnNOVO2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOVO2MouseClicked
        lblID2.setText("0");
        txtNOME2.setText("");
        txtIDADE2.setText("");
        txtCPF2.setText("");
        txtTELEFONE2.setText("");
        txtEMAIL2.setText("");
        txtSENHA2.setText("");
    }//GEN-LAST:event_btnNOVO2MouseClicked

    private void btnCADASTAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTAR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTAR2ActionPerformed

    private void btnCADASTAR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCADASTAR2MouseClicked
        Passageiro novoPassageiro = new Passageiro();

        novoPassageiro.setCpf(Formatador.limparFormatoCPF(this.txtCPF2.getText()));
        novoPassageiro.setNome(this.txtNOME2.getText());

        String email = this.txtEMAIL2.getText();
        if (Formatador.validarEmail(email) == false) {
            JOptionPane.showMessageDialog(this, "Email inválido", "Email inválido", JOptionPane.WARNING_MESSAGE);
        } else {

            novoPassageiro.setTelefone(Formatador.limparFormatoTelefone(this.txtTELEFONE2.getText()));
            novoPassageiro.setEmail(email);
            novoPassageiro.setIdade(Integer.parseInt(this.txtIDADE2.getText()));
            novoPassageiro.setSenha(this.txtSENHA2.getText());
            novoPassageiro.setIdPassageiro(0);

            passageiroDao passageiroDao = new passageiroDao();
            passageiroDao.Incluir(novoPassageiro);

        }

        Controller.carregarPassageiro(passageiroModel, tblPASSAGEIRO);
    }//GEN-LAST:event_btnCADASTAR2MouseClicked

    private void btnALTERAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERAR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnALTERAR2ActionPerformed

    private void btnALTERAR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnALTERAR2MouseClicked
        Passageiro passageiroParaAtualizar = new Passageiro();

        String email = this.txtEMAIL2.getText();

        if (Formatador.validarEmail(email) == false) {
            JOptionPane.showMessageDialog(this, "Email inválido", "Email inválido", JOptionPane.WARNING_MESSAGE);
        } else {

            passageiroParaAtualizar.setIdPassageiro(Integer.parseInt(this.lblID2.getText()));
            passageiroParaAtualizar.setCpf(Formatador.limparFormatoCPF(this.txtCPF2.getText()));
            passageiroParaAtualizar.setNome(this.txtNOME2.getText());
            passageiroParaAtualizar.setTelefone(Formatador.limparFormatoTelefone(this.txtTELEFONE2.getText()));
            passageiroParaAtualizar.setIdade(Integer.parseInt(this.txtIDADE2.getText()));
            passageiroParaAtualizar.setEmail(email);
            passageiroParaAtualizar.setSenha(this.txtSENHA2.getText());

            passageiroDao passageiroDao = new passageiroDao();
            passageiroDao.Alterar(passageiroParaAtualizar);
        }

        Controller.carregarPassageiro(passageiroModel, tblPASSAGEIRO);
    }//GEN-LAST:event_btnALTERAR2MouseClicked

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseClicked

        Controller.carregarPassageiro(passageiroModel, tblPASSAGEIRO);
    }//GEN-LAST:event_btnBuscar1MouseClicked

    private void btnDELETAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETAR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETAR2ActionPerformed

    private void btnDELETAR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDELETAR2MouseClicked
        passageiroDao passageiroDao = new passageiroDao();
        passageiroDao.Excluir(Integer.parseInt(this.lblID2.getText()));

        Controller.carregarPassageiro(passageiroModel, tblPASSAGEIRO);

        this.txtCPF2.setText("");
        this.txtNOME2.setText("");
        this.txtTELEFONE2.setText("");
        this.txtIDADE2.setText("");
        this.txtSENHA2.setText("");
        this.txtEMAIL2.setText("");
        this.lblID2.setText("");
    }//GEN-LAST:event_btnDELETAR2MouseClicked

    private void tblPASSAGEIROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPASSAGEIROMouseClicked
        DefaultTableModel passageiroModel = (DefaultTableModel) tblPASSAGEIRO.getModel();

        int selectedRow = tblPASSAGEIRO.getSelectedRow();

        if (selectedRow != -1) {
            lblID2.setText(tblPASSAGEIRO.getValueAt(selectedRow, 0).toString());
            txtNOME2.setText(tblPASSAGEIRO.getValueAt(selectedRow, 1).toString());
            txtEMAIL2.setText(tblPASSAGEIRO.getValueAt(selectedRow, 2).toString());
            txtCPF2.setText(tblPASSAGEIRO.getValueAt(selectedRow, 3).toString());
            txtIDADE2.setText(tblPASSAGEIRO.getValueAt(selectedRow, 4).toString());
            txtTELEFONE2.setText(tblPASSAGEIRO.getValueAt(selectedRow, 5).toString());
            txtSENHA2.setText(tblPASSAGEIRO.getValueAt(selectedRow, 6).toString());
        } else {
            lblID2.setText("0");
            txtNOME2.setText("");
            txtIDADE2.setText("");
            txtCPF2.setText("");
            txtTELEFONE2.setText("");
            txtEMAIL2.setText("");
            txtSENHA2.setText("");
        }
    }//GEN-LAST:event_tblPASSAGEIROMouseClicked

    private void tblPASSAGEIROFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblPASSAGEIROFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPASSAGEIROFocusGained

    private void btnDELETAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDELETAR4MouseClicked

        reservaDao reservaDao = new reservaDao();
        reservaDao.excluirReserva(Integer.parseInt(this.lblID4.getText()));

        Controller.carregarRotasComboBox(cmbROTAS5);
        Controller.carregarStatusReservaComboBox(cmbSTATUS4);
        Controller.carregarPassageirosComboBox(cmbPASSAGEIRO4);
        Controller.carregarReservasDetalhadas(tblRESERVAS);

    }//GEN-LAST:event_btnDELETAR4MouseClicked

    private void btnDELETAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETAR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETAR4ActionPerformed

    private void btnBUSCAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBUSCAR4MouseClicked
        Controller.carregarRotasComboBox(cmbROTAS5);
        Controller.carregarPassageirosComboBox(cmbPASSAGEIRO4);
        Controller.carregarReservasBasicas(tblRESERVAS);
        Controller.carregarReservasDetalhadas(tblRESERVAS);
    }//GEN-LAST:event_btnBUSCAR4MouseClicked

    private void btnBUSCAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCAR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBUSCAR4ActionPerformed

    private void tblRESERVASFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRESERVASFocusGained
       
    }//GEN-LAST:event_tblRESERVASFocusGained

    private void tblRESERVASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRESERVASMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblRESERVAS.getModel();
        int selectedRow = tblRESERVAS.getSelectedRow();

        if (selectedRow != -1) {
            lblID4.setText(model.getValueAt(selectedRow, 0).toString());

            String PASSAGEIRO = model.getValueAt(selectedRow, 5).toString();
            selecionarItemCombo(cmbPASSAGEIRO4, PASSAGEIRO);

            String ROTA = model.getValueAt(selectedRow, 1).toString();
            char primeiroCaracterRota = ROTA.charAt(0);
            selecionarItemComboPorCaractere(cmbROTAS5, primeiroCaracterRota);

            String STATUS = model.getValueAt(selectedRow, 3).toString();
            selecionarItemCombo(cmbSTATUS4, STATUS);

            txtQTD4.setText(model.getValueAt(selectedRow, 6).toString());
            
            String stringValue = model.getValueAt(selectedRow, 7).toString();
             
            txtVALORTOTAL4.setText(removeDecimalAndZeros(stringValue));
        } else {
            limparCampos();
        }

    }//GEN-LAST:event_tblRESERVASMouseClicked

     public static String removeDecimalAndZeros(String value) {
        String cleanedValue = value.replace(",", "").replace(".", "");
        int integerValue = Integer.parseInt(cleanedValue);

        return String.valueOf(integerValue);
    }

    private void cmbONIBUS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbONIBUS5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbONIBUS5ActionPerformed

    private void cmbPASSAGEIRO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPASSAGEIRO4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPASSAGEIRO4ActionPerformed

    private void cmbROTAS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbROTAS5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbROTAS5ActionPerformed

    private void cmbSTATUS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSTATUS4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSTATUS4ActionPerformed

    private void txtCHEGADA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCHEGADA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCHEGADA5ActionPerformed

    private void btnCADASTRAR4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCADASTRAR4MouseClicked
        Reserva reserva = new Reserva();
        reservaDao reservaDao = new reservaDao();

        char rotas = cmbROTAS5.getSelectedItem().toString().charAt(0);
        reserva.setIdRota(Character.getNumericValue(rotas));

        char passageiro = cmbPASSAGEIRO4.getSelectedItem().toString().charAt(0);
        reserva.setIdPassageiro(Character.getNumericValue(passageiro));

        reserva.setQuantidadeReserva(Integer.parseInt(txtQTD4.getText()));
        reserva.setStatus((String) cmbSTATUS4.getSelectedItem());
        reserva.setValorTotal(Double.parseDouble(txtVALORTOTAL4.getText()));

        reserva.setIdReserva(0);
        Date dataAtual = new Date();
        reserva.setDataReserva(dataAtual);

        reservaDao.incluir(reserva);

        Controller.carregarReservasDetalhadas(tblRESERVAS);
        cmbPASSAGEIRO4.setSelectedIndex(0);
        cmbROTAS5.setSelectedIndex(0);
        cmbSTATUS4.setSelectedIndex(0);
        txtQTD4.setText("");
        txtVALORTOTAL4.setText("");

        Controller.carregarRotasComboBox(cmbROTAS5);
        Controller.carregarPassageirosComboBox(cmbPASSAGEIRO4);
        Controller.carregarStatusReservaComboBox(cmbSTATUS4);
    }//GEN-LAST:event_btnCADASTRAR4MouseClicked

    private void btnCADASTRAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRAR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTRAR4ActionPerformed

    private void btnNOVA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOVA4MouseClicked
        cmbPASSAGEIRO4.setSelectedIndex(0);
        cmbROTAS5.setSelectedIndex(0);
        cmbSTATUS4.setSelectedIndex(0);
        txtVALORTOTAL4.setText("");
        txtQTD4.setText("");
    }//GEN-LAST:event_btnNOVA4MouseClicked

    private void btnNOVA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOVA4ActionPerformed

    private void btnALTERA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnALTERA4MouseClicked
        Reserva reserva = new Reserva();
        reservaDao reservaDao = new reservaDao();

        reserva.setIdReserva(Integer.parseInt(this.lblID4.getText()));
        char rotas = cmbROTAS5.getSelectedItem().toString().charAt(0);
        reserva.setIdRota(Character.getNumericValue(rotas));

        char passageiro = cmbPASSAGEIRO4.getSelectedItem().toString().charAt(0);
        reserva.setIdPassageiro(Character.getNumericValue(passageiro));

        reserva.setQuantidadeReserva(Integer.parseInt(txtQTD4.getText()));
        reserva.setStatus((String) cmbSTATUS4.getSelectedItem());
        reserva.setValorTotal(Double.parseDouble(txtVALORTOTAL4.getText()));

        Date dataAtual = new Date();
        reserva.setDataReserva(dataAtual);

        reservaDao.alterarReserva(reserva);

        Controller.carregarReservasDetalhadas(tblRESERVAS);
    }//GEN-LAST:event_btnALTERA4MouseClicked

    private void btnALTERA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnALTERA4ActionPerformed

    private void jPanel2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2ComponentMoved

    private void btnNOVO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOVO1ActionPerformed

    private void btnNOVO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOVO1MouseClicked
        this.txtCPF1.setText("");
        this.txtNOME1.setText("");
        this.txtTELEFONE1.setText("");
        this.txtIDADE1.setText("");
        this.lblID1.setText("0");
    }//GEN-LAST:event_btnNOVO1MouseClicked

    private void btnDELETAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETAR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDELETAR1ActionPerformed

    private void btnDELETAR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDELETAR1MouseClicked
        motoristaDao m = new motoristaDao();
        m.excluir(Integer.parseInt(this.lblID1.getText()));

        Controller.carregarMotorista(motoristaModel, tblMOTORISTA);

        this.txtCPF1.setText("");
        this.txtNOME1.setText("");
        this.txtTELEFONE1.setText("");
        this.txtIDADE1.setText("");
        this.lblID1.setText("");
    }//GEN-LAST:event_btnDELETAR1MouseClicked

    private void btnBUSCAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCAR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBUSCAR1ActionPerformed

    private void btnBUSCAR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBUSCAR1MouseClicked
        Controller.carregarMotorista(motoristaModel, tblMOTORISTA);
    }//GEN-LAST:event_btnBUSCAR1MouseClicked

    private void btnALTERAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERAR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnALTERAR1ActionPerformed

    private void btnALTERAR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnALTERAR1MouseClicked
        motoristaDao m = new motoristaDao();

        DefaultTableModel model = (DefaultTableModel) tblMOTORISTA.getModel();

        Motorista Cadmoto = new Motorista();

        Cadmoto.setCpf(Formatador.limparFormatoCPF(this.txtCPF1.getText()));
        Cadmoto.setNome(this.txtNOME1.getText());
        Cadmoto.setTelefone(Formatador.limparFormatoTelefone(this.txtTELEFONE1.getText()));
        Cadmoto.setIdade(Integer.parseInt(this.txtIDADE1.getText()));
        Cadmoto.setIdMotorista(Integer.parseInt(this.lblID1.getText()));

        m.alterar(Cadmoto);

        Controller.carregarMotorista(motoristaModel, tblMOTORISTA);
    }//GEN-LAST:event_btnALTERAR1MouseClicked

    private void btnCADASTRAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRAR1ActionPerformed

    }//GEN-LAST:event_btnCADASTRAR1ActionPerformed

    private void btnCADASTRAR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCADASTRAR1MouseClicked

        Motorista Cadmoto = new Motorista();

        Cadmoto.setCpf(Formatador.limparFormatoCPF(this.txtCPF1.getText()));
        Cadmoto.setNome(this.txtNOME1.getText());
        Cadmoto.setTelefone(Formatador.limparFormatoTelefone(this.txtTELEFONE1.getText()));
        Cadmoto.setIdade(Integer.parseInt(this.txtIDADE1.getText()));
        Cadmoto.setIdMotorista(0);

        motoristaDao m = new motoristaDao();

        m.incluir(Cadmoto);

        Controller.carregarMotorista(motoristaModel, tblMOTORISTA);
    }//GEN-LAST:event_btnCADASTRAR1MouseClicked

    private void tblMOTORISTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMOTORISTAMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblMOTORISTA.getModel();

        int selectedRow = tblMOTORISTA.getSelectedRow();

        if (selectedRow != -1) {
            lblID1.setText(tblMOTORISTA.getValueAt(selectedRow, 0).toString());
            txtNOME1.setText(tblMOTORISTA.getValueAt(selectedRow, 1).toString());
            txtIDADE1.setText(tblMOTORISTA.getValueAt(selectedRow, 2).toString());
            txtCPF1.setText(tblMOTORISTA.getValueAt(selectedRow, 3).toString());
            txtTELEFONE1.setText(tblMOTORISTA.getValueAt(selectedRow, 4).toString());

        } else {
            lblID1.setText("0");
            txtNOME1.setText("");
            txtIDADE1.setText("");
            txtCPF1.setText("");
            txtTELEFONE1.setText("");
        }
    }//GEN-LAST:event_tblMOTORISTAMouseClicked

    private void tblMOTORISTAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblMOTORISTAFocusGained

    }//GEN-LAST:event_tblMOTORISTAFocusGained

    private void btnCADASTRAR3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCADASTRAR3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTRAR3MouseEntered

    private void txtPLACA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLACA3ActionPerformed

    }//GEN-LAST:event_txtPLACA3ActionPerformed

    private void tblRESERVASFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRESERVASFocusLost
     
    }//GEN-LAST:event_tblRESERVASFocusLost

    private void tblRESERVASPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblRESERVASPropertyChange
        
    }//GEN-LAST:event_tblRESERVASPropertyChange

    private void txtQTD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTD4ActionPerformed

    private void txtVALORTOTAL4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVALORTOTAL4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVALORTOTAL4ActionPerformed

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
            java.util.logging.Logger.getLogger(formGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formGerenciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERA4;
    private javax.swing.JButton btnALTERAR1;
    private javax.swing.JButton btnALTERAR2;
    private javax.swing.JButton btnALTERAR3;
    private javax.swing.JButton btnALTERAR5;
    private javax.swing.JButton btnBUSCAR1;
    private javax.swing.JButton btnBUSCAR3;
    private javax.swing.JButton btnBUSCAR4;
    private javax.swing.JButton btnBUSCAR5;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCADASTAR2;
    private javax.swing.JButton btnCADASTRAR1;
    private javax.swing.JButton btnCADASTRAR3;
    private javax.swing.JButton btnCADASTRAR4;
    private javax.swing.JButton btnCADASTRAR5;
    private javax.swing.JButton btnDELETAR1;
    private javax.swing.JButton btnDELETAR2;
    private javax.swing.JButton btnDELETAR3;
    private javax.swing.JButton btnDELETAR4;
    private javax.swing.JButton btnDELETAR5;
    private javax.swing.JButton btnNOVA4;
    private javax.swing.JButton btnNOVO1;
    private javax.swing.JButton btnNOVO2;
    private javax.swing.JButton btnNOVO3;
    private javax.swing.JButton btnNOVO5;
    private javax.swing.JComboBox<String> cmbMOTORISTA5;
    private javax.swing.JComboBox<String> cmbONIBUS5;
    private javax.swing.JComboBox<String> cmbPASSAGEIRO4;
    private javax.swing.JComboBox<String> cmbROTAS5;
    private javax.swing.JComboBox<String> cmbSTATUS4;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbID4;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblID4;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JTabbedPane pgROTAS;
    private javax.swing.JTable tblMOTORISTA;
    private javax.swing.JTable tblOnibus;
    private javax.swing.JTable tblPASSAGEIRO;
    private javax.swing.JTable tblRESERVAS;
    private javax.swing.JTable tblROTA;
    private javax.swing.JTextField txtANO3;
    private javax.swing.JTextField txtCAPACIDADE3;
    private javax.swing.JFormattedTextField txtCHEGADA5;
    private javax.swing.JFormattedTextField txtCPF1;
    private javax.swing.JFormattedTextField txtCPF2;
    private javax.swing.JTextField txtDESTINO5;
    private javax.swing.JTextField txtEMAIL2;
    private javax.swing.JTextField txtIDADE1;
    private javax.swing.JTextField txtIDADE2;
    private javax.swing.JTextField txtMODELO3;
    private javax.swing.JTextField txtNOME1;
    private javax.swing.JTextField txtNOME2;
    private javax.swing.JTextField txtORIGEM5;
    private javax.swing.JTextField txtPLACA3;
    private javax.swing.JTextField txtQTD4;
    private javax.swing.JFormattedTextField txtSAIDA5;
    private javax.swing.JTextField txtSENHA2;
    private javax.swing.JFormattedTextField txtTELEFONE1;
    private javax.swing.JFormattedTextField txtTELEFONE2;
    private javax.swing.JFormattedTextField txtVALOR5;
    private javax.swing.JTextField txtVALORTOTAL4;
    // End of variables declaration//GEN-END:variables
}
