package view.clientes;

import controller.motoristaDao;
import controller.onibusDao;
import controller.passageiroDao;
import controller.rotaDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Motorista;
import model.Onibus;
import model.Passageiro;
import model.Rota;
import utils.Formatador;
import utils.Validador;
import utils.ValidarLetras;
import utils.ValidarNumero;


public class formInfoPassageiro extends javax.swing.JFrame {
    passageiroDao passageiro = new passageiroDao();
    Passageiro pass = new Passageiro();
    Rota rota = new Rota();
    
    public formInfoPassageiro(int passageiroId2) {
        initComponents();
        
        this.textEMAIL.setDocument(new Validador(30));
        this.textNOME.setDocument(new ValidarLetras(20));
        this.textNOMECOMPLETO.setDocument(new ValidarLetras(80));
        this.textSENHA.setDocument(new Validador(20));
        
        this.setLocationRelativeTo(null);  
        passageiroDao p = new passageiroDao();
        rotaDao r = new rotaDao();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        pass = p.selecionarUmPassageiro(passageiroId2);
        
        this.textNOME.setText(pass.getNome());
        this.textNOMECOMPLETO.setText(pass.getNomeCompleto());
        this.textTELEFONE.setText(pass.getCpf());
        this.textEMAIL.setText(pass.getEmail());
        this.textTELEFONE.setText(pass.getTelefone());
        this.textSENHA.setText("12323");
        this.textCPF.setText(pass.getCpf());
        this.mnNOME.setText(pass.getNome());
        this.mnID.setText("Id: " + pass.getIdPassageiro());
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSENHA2 = new javax.swing.JButton();
        btnSENHA5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNOME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textEMAIL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSENHA = new javax.swing.JButton();
        btnTEL = new javax.swing.JButton();
        btnCPF = new javax.swing.JButton();
        btnNOME = new javax.swing.JButton();
        btnEMAIL = new javax.swing.JButton();
        textTELEFONE = new javax.swing.JFormattedTextField();
        textCPF = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        btnNOMECOMPLETO = new javax.swing.JButton();
        textNOMECOMPLETO = new javax.swing.JTextField();
        textSENHA = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        mnRODOBUS = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        mnPERFIL = new javax.swing.JMenu();
        mnPedido = new javax.swing.JMenu();
        mnSAIR = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        jTextField1.setBackground(new java.awt.Color(50, 54, 66));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(217, 217, 217));
        jTextField1.setText("RODOBUS");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONIBUS");

        btnSENHA2.setBackground(new java.awt.Color(50, 54, 66));
        btnSENHA2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnSENHA2.setForeground(new java.awt.Color(134, 134, 134));
        btnSENHA2.setText("Alterar");
        btnSENHA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSENHA2MouseClicked(evt);
            }
        });

        btnSENHA5.setBackground(new java.awt.Color(50, 54, 66));
        btnSENHA5.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnSENHA5.setForeground(new java.awt.Color(134, 134, 134));
        btnSENHA5.setText("Alterar");
        btnSENHA5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSENHA5MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil");
        setBackground(new java.awt.Color(242, 147, 4));

        jPanel2.setBackground(new java.awt.Color(50, 54, 66));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Perfil");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome de usuário");

        textNOME.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");

        textEMAIL.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Senha");

        btnSENHA.setBackground(new java.awt.Color(50, 54, 66));
        btnSENHA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSENHA.setForeground(new java.awt.Color(255, 255, 255));
        btnSENHA.setText("Alterar");
        btnSENHA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSENHAMouseClicked(evt);
            }
        });
        btnSENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSENHAActionPerformed(evt);
            }
        });

        btnTEL.setBackground(new java.awt.Color(50, 54, 66));
        btnTEL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTEL.setForeground(new java.awt.Color(255, 255, 255));
        btnTEL.setText("Alterar");
        btnTEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTELMouseClicked(evt);
            }
        });

        btnCPF.setBackground(new java.awt.Color(50, 54, 66));
        btnCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCPF.setForeground(new java.awt.Color(255, 255, 255));
        btnCPF.setText("Alterar");
        btnCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCPFMouseClicked(evt);
            }
        });

        btnNOME.setBackground(new java.awt.Color(50, 54, 66));
        btnNOME.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNOME.setForeground(new java.awt.Color(255, 255, 255));
        btnNOME.setText("Alterar");
        btnNOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOMEMouseClicked(evt);
            }
        });
        btnNOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOMEActionPerformed(evt);
            }
        });

        btnEMAIL.setBackground(new java.awt.Color(50, 54, 66));
        btnEMAIL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEMAIL.setForeground(new java.awt.Color(255, 255, 255));
        btnEMAIL.setText("Alterar");
        btnEMAIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEMAILMouseClicked(evt);
            }
        });

        try {
            textTELEFONE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome completo");

        btnNOMECOMPLETO.setBackground(new java.awt.Color(50, 54, 66));
        btnNOMECOMPLETO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNOMECOMPLETO.setForeground(new java.awt.Color(255, 255, 255));
        btnNOMECOMPLETO.setText("Alterar");
        btnNOMECOMPLETO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNOMECOMPLETOMouseClicked(evt);
            }
        });
        btnNOMECOMPLETO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOMECOMPLETOActionPerformed(evt);
            }
        });

        textNOMECOMPLETO.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        textSENHA.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textEMAIL, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textNOME, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textTELEFONE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textNOMECOMPLETO, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textSENHA, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSENHA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNOMECOMPLETO, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNOMECOMPLETO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNOMECOMPLETO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTEL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSENHA, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(textSENHA))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnRODOBUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRODOBUSMouseClicked
        this.setVisible(false);
        this.dispose();
        formConsultaPassagem consulta = new formConsultaPassagem(pass);
        consulta.setVisible(true);
    }//GEN-LAST:event_mnRODOBUSMouseClicked

    private void mnPERFILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPERFILMouseClicked
        this.setVisible(false);
        this.dispose();
        formInfoPassageiro info = new formInfoPassageiro(pass.getIdPassageiro());
        info.setVisible(true);
    }//GEN-LAST:event_mnPERFILMouseClicked

    private void mnPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPedidoMouseClicked
        this.setVisible(false);
        this.dispose();
        formPedido pedido = new formPedido(pass);
        pedido.setVisible(true);
    }//GEN-LAST:event_mnPedidoMouseClicked

    private void mnSAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSAIRMouseClicked

        this.setVisible(false);
        this.dispose();
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_mnSAIRMouseClicked

    private void btnSENHA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSENHA2MouseClicked
        
    }//GEN-LAST:event_btnSENHA2MouseClicked

    private void btnSENHA5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSENHA5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSENHA5MouseClicked

    private void btnEMAILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEMAILMouseClicked
        String email = textEMAIL.getText().trim();
        pass.setEmail(email);
        
         if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o Email.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarEmail(pass);
        }
    }//GEN-LAST:event_btnEMAILMouseClicked

    private void btnNOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOMEActionPerformed

    private void btnNOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMEMouseClicked
        String nome = textNOME.getText().trim();
        pass.setNome(nome);
        
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o Nome de usuário.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarNome(pass);
        }
    }//GEN-LAST:event_btnNOMEMouseClicked

    private void btnCPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCPFMouseClicked
        String cpf = Formatador.limparFormatoCPF(textCPF.getText().trim());
        pass.setCpf(cpf);
        
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o CPF.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarCpf(pass);
        }
    }//GEN-LAST:event_btnCPFMouseClicked

    private void btnTELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTELMouseClicked
        String telefone = Formatador.limparFormatoTelefone(textTELEFONE.getText().trim());
        pass.setTelefone(telefone);
        
        if (telefone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o Telefone.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarTelefone(pass);
        }
    }//GEN-LAST:event_btnTELMouseClicked

    private void btnSENHAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSENHAMouseClicked
        String senha = textSENHA.getText().trim();
        pass.setSenha(senha);
        if (senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha A Senha.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarSenha(pass);
        }
    }//GEN-LAST:event_btnSENHAMouseClicked

    private void btnNOMECOMPLETOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNOMECOMPLETOMouseClicked
        String nomeCompleto = textNOMECOMPLETO.getText().trim();
        pass.setNomeCompleto(nomeCompleto);
        
        if (nomeCompleto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o Nome Completo.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        } else { 
            passageiro.alterarNomeCompleto(pass);
        }
    }//GEN-LAST:event_btnNOMECOMPLETOMouseClicked

    private void btnNOMECOMPLETOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOMECOMPLETOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNOMECOMPLETOActionPerformed

    private void btnSENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSENHAActionPerformed

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
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInfoPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Passageiro passageiro = new Passageiro();
                Passageiro pass = new Passageiro();
    Rota rt = new Rota();
                new formInfoPassageiro(pass.getIdPassageiro()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPF;
    private javax.swing.JButton btnEMAIL;
    private javax.swing.JButton btnNOME;
    private javax.swing.JButton btnNOMECOMPLETO;
    private javax.swing.JButton btnSENHA;
    private javax.swing.JButton btnSENHA2;
    private javax.swing.JButton btnSENHA5;
    private javax.swing.JButton btnTEL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnPERFIL;
    private javax.swing.JMenu mnPedido;
    private javax.swing.JMenu mnRODOBUS;
    private javax.swing.JMenu mnSAIR;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JTextField textEMAIL;
    private javax.swing.JTextField textNOME;
    private javax.swing.JTextField textNOMECOMPLETO;
    private javax.swing.JPasswordField textSENHA;
    private javax.swing.JFormattedTextField textTELEFONE;
    // End of variables declaration//GEN-END:variables
}
