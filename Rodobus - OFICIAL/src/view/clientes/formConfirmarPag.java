package view.clientes;

import controller.passageiroDao;
import controller.rotaDao;
import static java.lang.System.in;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Passageiro;
import model.Rota;

public class formConfirmarPag extends javax.swing.JFrame {

    Rota rota = new Rota();
    Passageiro pass = new Passageiro();
    
    public formConfirmarPag(int passageiroId2, int rotaId2) {
        initComponents();

        passageiroDao p = new passageiroDao();
        rotaDao r = new rotaDao();

        rota = r.selecionarUmaRota(rotaId2);
        pass = p.selecionarUmPassageiro(passageiroId2);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        this.lblNOME.setText(pass.getNome());
        this.lblCPF.setText(pass.getCpf());
        this.lblEMAIL.setText(pass.getEmail());
        this.lblTELEFONE.setText(pass.getTelefone());
        this.lblEMBARQUE.setText(rota.getOrigem());
        this.lblDesembarque.setText(rota.getDestino());
        this.lblSaida.setText(formato.format(rota.getDtSaida()));
        this.lblchegada.setText(formato.format(rota.getDtChegada()));
        this.lbldistancia.setText(String.valueOf(rota.getVlDistancia()));
        this.lblvalor.setText(String.valueOf(rota.getVlPreco()));
        this.lblduracao.setText(rota.getDsDuracao());
        this.lblmotorista.setText(rota.getNomeMotorista());




        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jText_dadopassageiro = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jText_nome = new javax.swing.JTextField();
        jText_cpf = new javax.swing.JTextField();
        jText_email = new javax.swing.JTextField();
        jText_telefone = new javax.swing.JTextField();
        lblNOME = new javax.swing.JLabel();
        lblEMAIL = new javax.swing.JLabel();
        lblTELEFONE = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        jText_dadopassagem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jText_embarque = new javax.swing.JTextField();
        jText_desembarque = new javax.swing.JTextField();
        jText_saida = new javax.swing.JTextField();
        jText_chegada = new javax.swing.JTextField();
        jText_data = new javax.swing.JTextField();
        jText_valor = new javax.swing.JTextField();
        jText_valor1 = new javax.swing.JTextField();
        lblDesembarque = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblchegada = new javax.swing.JLabel();
        lbldistancia = new javax.swing.JLabel();
        lblvalor = new javax.swing.JLabel();
        lblmotorista = new javax.swing.JLabel();
        lblEMBARQUE = new javax.swing.JLabel();
        jText_valor2 = new javax.swing.JTextField();
        lblduracao = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jText_FormasPgt = new javax.swing.JTextField();
        jRadioButton_pix = new javax.swing.JRadioButton();
        jRadioButton_credito = new javax.swing.JRadioButton();
        jText_inf1 = new javax.swing.JTextField();
        jText_inf2 = new javax.swing.JTextField();
        jText_inf3 = new javax.swing.JTextField();
        jText_inf4 = new javax.swing.JTextField();
        jButton_Confirmaepagar = new javax.swing.JButton();
        lblteste = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 147, 4));

        jText_dadopassageiro.setBackground(new java.awt.Color(242, 147, 4));
        jText_dadopassageiro.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jText_dadopassageiro.setForeground(new java.awt.Color(255, 255, 255));
        jText_dadopassageiro.setText("Dado do (a) Passageiro(a)");
        jText_dadopassageiro.setBorder(null);
        jText_dadopassageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_dadopassageiroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(50, 54, 66));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jText_nome.setBackground(new java.awt.Color(50, 54, 66));
        jText_nome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_nome.setForeground(new java.awt.Color(255, 255, 255));
        jText_nome.setText("Nome");
        jText_nome.setBorder(null);
        jText_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_nomeActionPerformed(evt);
            }
        });

        jText_cpf.setBackground(new java.awt.Color(50, 54, 66));
        jText_cpf.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_cpf.setForeground(new java.awt.Color(255, 255, 255));
        jText_cpf.setText("CPF");
        jText_cpf.setBorder(null);
        jText_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_cpfActionPerformed(evt);
            }
        });

        jText_email.setBackground(new java.awt.Color(50, 54, 66));
        jText_email.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_email.setForeground(new java.awt.Color(255, 255, 255));
        jText_email.setText("E-mail");
        jText_email.setBorder(null);
        jText_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_emailActionPerformed(evt);
            }
        });

        jText_telefone.setBackground(new java.awt.Color(50, 54, 66));
        jText_telefone.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_telefone.setForeground(new java.awt.Color(255, 255, 255));
        jText_telefone.setText("Telefone");
        jText_telefone.setBorder(null);
        jText_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_telefoneActionPerformed(evt);
            }
        });

        lblNOME.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME.setText("Nome");
        lblNOME.setToolTipText("");

        lblEMAIL.setBackground(new java.awt.Color(51, 255, 204));
        lblEMAIL.setForeground(new java.awt.Color(255, 255, 255));
        lblEMAIL.setText("Email");

        lblTELEFONE.setBackground(new java.awt.Color(51, 255, 204));
        lblTELEFONE.setForeground(new java.awt.Color(255, 255, 255));
        lblTELEFONE.setText("Telefone");

        lblCPF.setBackground(new java.awt.Color(51, 255, 204));
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEMAIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTELEFONE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNOME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNOME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEMAIL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTELEFONE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jText_dadopassagem.setBackground(new java.awt.Color(242, 147, 4));
        jText_dadopassagem.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jText_dadopassagem.setForeground(new java.awt.Color(255, 255, 255));
        jText_dadopassagem.setText("Dados da Passagem de Ônibus");
        jText_dadopassagem.setBorder(null);
        jText_dadopassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_dadopassagemActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(50, 54, 66));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jText_embarque.setBackground(new java.awt.Color(50, 54, 66));
        jText_embarque.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_embarque.setForeground(new java.awt.Color(255, 255, 255));
        jText_embarque.setText("Embarque");
        jText_embarque.setBorder(null);
        jText_embarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_embarqueActionPerformed(evt);
            }
        });

        jText_desembarque.setBackground(new java.awt.Color(50, 54, 66));
        jText_desembarque.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_desembarque.setForeground(new java.awt.Color(255, 255, 255));
        jText_desembarque.setText("Desembarque");
        jText_desembarque.setBorder(null);
        jText_desembarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_desembarqueActionPerformed(evt);
            }
        });

        jText_saida.setBackground(new java.awt.Color(50, 54, 66));
        jText_saida.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_saida.setForeground(new java.awt.Color(255, 255, 255));
        jText_saida.setText("Dt.Saída");
        jText_saida.setBorder(null);
        jText_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_saidaActionPerformed(evt);
            }
        });

        jText_chegada.setBackground(new java.awt.Color(50, 54, 66));
        jText_chegada.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_chegada.setForeground(new java.awt.Color(255, 255, 255));
        jText_chegada.setText("Dt.Chegada");
        jText_chegada.setBorder(null);
        jText_chegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_chegadaActionPerformed(evt);
            }
        });

        jText_data.setBackground(new java.awt.Color(50, 54, 66));
        jText_data.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_data.setForeground(new java.awt.Color(255, 255, 255));
        jText_data.setText("Distância");
        jText_data.setBorder(null);
        jText_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_dataActionPerformed(evt);
            }
        });

        jText_valor.setBackground(new java.awt.Color(50, 54, 66));
        jText_valor.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_valor.setForeground(new java.awt.Color(255, 255, 255));
        jText_valor.setText("Valor");
        jText_valor.setBorder(null);
        jText_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_valorActionPerformed(evt);
            }
        });

        jText_valor1.setBackground(new java.awt.Color(50, 54, 66));
        jText_valor1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_valor1.setForeground(new java.awt.Color(255, 255, 255));
        jText_valor1.setText("Motorista");
        jText_valor1.setBorder(null);
        jText_valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_valor1ActionPerformed(evt);
            }
        });

        lblDesembarque.setBackground(new java.awt.Color(51, 255, 204));
        lblDesembarque.setForeground(new java.awt.Color(255, 255, 255));
        lblDesembarque.setText("Desembarque");

        lblSaida.setBackground(new java.awt.Color(51, 255, 204));
        lblSaida.setForeground(new java.awt.Color(255, 255, 255));
        lblSaida.setText("Saída");

        lblchegada.setBackground(new java.awt.Color(51, 255, 204));
        lblchegada.setForeground(new java.awt.Color(255, 255, 255));
        lblchegada.setText("Chegada");

        lbldistancia.setBackground(new java.awt.Color(51, 255, 204));
        lbldistancia.setForeground(new java.awt.Color(255, 255, 255));
        lbldistancia.setText("Distância");

        lblvalor.setBackground(new java.awt.Color(51, 255, 204));
        lblvalor.setForeground(new java.awt.Color(255, 255, 255));
        lblvalor.setText("Valor");

        lblmotorista.setBackground(new java.awt.Color(51, 255, 204));
        lblmotorista.setForeground(new java.awt.Color(255, 255, 255));
        lblmotorista.setText("Motorista");

        lblEMBARQUE.setBackground(new java.awt.Color(51, 255, 204));
        lblEMBARQUE.setForeground(new java.awt.Color(255, 255, 255));
        lblEMBARQUE.setText("Embarque");

        jText_valor2.setBackground(new java.awt.Color(50, 54, 66));
        jText_valor2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_valor2.setForeground(new java.awt.Color(255, 255, 255));
        jText_valor2.setText("Duração");
        jText_valor2.setBorder(null);
        jText_valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_valor2ActionPerformed(evt);
            }
        });

        lblduracao.setBackground(new java.awt.Color(51, 255, 204));
        lblduracao.setForeground(new java.awt.Color(255, 255, 255));
        lblduracao.setText("Duração");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jText_chegada)
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblchegada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldistancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblvalor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jText_embarque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEMBARQUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jText_desembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(lblDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jText_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(lblmotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jText_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblduracao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_embarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEMBARQUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_desembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesembarque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_chegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchegada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldistancia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvalor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblduracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmotorista))
                .addGap(14, 14, 14))
        );

        jPanel4.setBackground(new java.awt.Color(50, 54, 66));

        jText_FormasPgt.setBackground(new java.awt.Color(50, 54, 66));
        jText_FormasPgt.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jText_FormasPgt.setForeground(new java.awt.Color(255, 255, 255));
        jText_FormasPgt.setText("Formas de pagamento");
        jText_FormasPgt.setBorder(null);
        jText_FormasPgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_FormasPgtActionPerformed(evt);
            }
        });

        jRadioButton_pix.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jRadioButton_pix.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_pix.setText("Pagamaneto no pix");

        jRadioButton_credito.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jRadioButton_credito.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton_credito.setText("Pagar com Cartão de Crédito");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton_pix)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton_credito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jText_FormasPgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jText_FormasPgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_pix)
                    .addComponent(jRadioButton_credito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jText_inf1.setBackground(new java.awt.Color(242, 147, 4));
        jText_inf1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_inf1.setForeground(new java.awt.Color(255, 255, 255));
        jText_inf1.setText("- Embarque apenas com documento");
        jText_inf1.setBorder(null);
        jText_inf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_inf1ActionPerformed(evt);
            }
        });

        jText_inf2.setBackground(new java.awt.Color(242, 147, 4));
        jText_inf2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_inf2.setForeground(new java.awt.Color(255, 255, 255));
        jText_inf2.setText("- Apresente o comprovante na hora do embarque.");
        jText_inf2.setBorder(null);
        jText_inf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_inf2ActionPerformed(evt);
            }
        });

        jText_inf3.setBackground(new java.awt.Color(242, 147, 4));
        jText_inf3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_inf3.setForeground(new java.awt.Color(255, 255, 255));
        jText_inf3.setText("- Reembolso de 100% do valor em viagens canceladas");
        jText_inf3.setBorder(null);
        jText_inf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_inf3ActionPerformed(evt);
            }
        });

        jText_inf4.setBackground(new java.awt.Color(242, 147, 4));
        jText_inf4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jText_inf4.setForeground(new java.awt.Color(255, 255, 255));
        jText_inf4.setText("em até 1 hora antes do embarque");
        jText_inf4.setBorder(null);
        jText_inf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_inf4ActionPerformed(evt);
            }
        });

        jButton_Confirmaepagar.setBackground(new java.awt.Color(50, 54, 66));
        jButton_Confirmaepagar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton_Confirmaepagar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Confirmaepagar.setText("Confirma e pagar");
        jButton_Confirmaepagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ConfirmaepagarMouseClicked(evt);
            }
        });

        lblteste.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image 2.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblteste, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_dadopassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_dadopassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_inf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_inf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_inf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Confirmaepagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jText_inf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblteste, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jText_dadopassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jText_dadopassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jText_inf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_inf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_inf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_inf4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Confirmaepagar)
                            .addComponent(jLabel3))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_dadopassageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_dadopassageiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_dadopassageiroActionPerformed

    private void jText_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_nomeActionPerformed

    private void jText_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_cpfActionPerformed

    private void jText_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_emailActionPerformed

    private void jText_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_telefoneActionPerformed

    private void jText_dadopassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_dadopassagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_dadopassagemActionPerformed

    private void jText_embarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_embarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_embarqueActionPerformed

    private void jText_desembarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_desembarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_desembarqueActionPerformed

    private void jText_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_saidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_saidaActionPerformed

    private void jText_chegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_chegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_chegadaActionPerformed

    private void jText_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_dataActionPerformed

    private void jText_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_valorActionPerformed

    private void jText_FormasPgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_FormasPgtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_FormasPgtActionPerformed

    private void jText_inf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_inf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_inf1ActionPerformed

    private void jText_inf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_inf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_inf2ActionPerformed

    private void jText_inf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_inf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_inf3ActionPerformed

    private void jText_inf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_inf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_inf4ActionPerformed

    private void jButton_ConfirmaepagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ConfirmaepagarMouseClicked
        // TODO add your handling code here:
        formPagCartao cartao = new formPagCartao();
        this.setVisible(false);
        cartao.setVisible(true);
    }//GEN-LAST:event_jButton_ConfirmaepagarMouseClicked

    private void jText_valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_valor1ActionPerformed

    private void jText_valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_valor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_valor2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int passageiroId2 = 0;
                int rotaId2 = 0;
                new formConfirmarPag(passageiroId2, rotaId2).setVisible(true);
                         //JOptionPane.showMessageDialog(null, passageiroId2);
                         //JOptionPane.showMessageDialog(null, rotaId2);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Confirmaepagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_credito;
    private javax.swing.JRadioButton jRadioButton_pix;
    private javax.swing.JTextField jText_FormasPgt;
    private javax.swing.JTextField jText_chegada;
    private javax.swing.JTextField jText_cpf;
    private javax.swing.JTextField jText_dadopassageiro;
    private javax.swing.JTextField jText_dadopassagem;
    private javax.swing.JTextField jText_data;
    private javax.swing.JTextField jText_desembarque;
    private javax.swing.JTextField jText_email;
    private javax.swing.JTextField jText_embarque;
    private javax.swing.JTextField jText_inf1;
    private javax.swing.JTextField jText_inf2;
    private javax.swing.JTextField jText_inf3;
    private javax.swing.JTextField jText_inf4;
    private javax.swing.JTextField jText_nome;
    private javax.swing.JTextField jText_saida;
    private javax.swing.JTextField jText_telefone;
    private javax.swing.JTextField jText_valor;
    private javax.swing.JTextField jText_valor1;
    private javax.swing.JTextField jText_valor2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDesembarque;
    private javax.swing.JLabel lblEMAIL;
    private javax.swing.JLabel lblEMBARQUE;
    private javax.swing.JLabel lblNOME;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblTELEFONE;
    private javax.swing.JLabel lblchegada;
    private javax.swing.JLabel lbldistancia;
    private javax.swing.JLabel lblduracao;
    private javax.swing.JLabel lblmotorista;
    private javax.swing.JLabel lblteste;
    private javax.swing.JLabel lblvalor;
    // End of variables declaration//GEN-END:variables
}
