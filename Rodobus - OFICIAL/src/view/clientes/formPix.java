/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.clientes;

import controller.assentoDao;
import controller.passageiroDao;
import controller.reservaDao;
import controller.rotaDao;
import functions.Email;
import static functions.Geradores.gerarCodigoAleatorio;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Assento;
import model.Passageiro;
import model.Reserva;
import model.Rota;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

import java.util.Timer;
import java.util.TimerTask;



public class formPix extends javax.swing.JFrame {

    Rota rota = new Rota();
    Passageiro pass = new Passageiro();
    
    passageiroDao passageiro = new passageiroDao();
    reservaDao rese = new reservaDao();

    int nrAssento = 0;
    
    public void executarFuncaoAposUmMinuto() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            carregarBil();
                
            
            }
        }, 30000);  
    }
     
    public void carregarBil() {
        this.setVisible(false);
        this.dispose();

        assentoDao a = new assentoDao();
        Assento assento = new Assento();
        assento.setNumeroAssento(nrAssento);
        assento.setIdRota(rota.getIdRota());
        assento.setStatus("indisponivel");
        a.incluir(assento);
        
        Reserva reserva = new Reserva(); 
        Date dataReserva = new Date();
        
        
        reserva.setDataReserva(dataReserva);
        
        reserva.setIdPassageiro(pass.getIdPassageiro());
        reserva.setIdRota(rota.getIdRota());
        reserva.setStatus("Reservado");
        reserva.setValorTotal(rota.getVlPreco());
        rese.incluir(reserva);
        
        String fromEmail = "";
        String password = "";
        String toEmail = pass.getEmail();
        String emailSubject = "";

        Email email = new Email(fromEmail, password, toEmail, emailSubject, "","html");

        
            
        int id = rese.obterUltimoIdReserva();
        reserva.setIdReserva(id);
        
        reserva = rese.selecionarUmaReserva(id);
        
        email.enviarConfirmacaoPedido(reserva, rota, String.valueOf(nrAssento), pass);
      
        formPassagemBilhete pas = new formPassagemBilhete(reserva);
        pas.setVisible(true);
    }
   
    public void carregarInfo2(int IdPassageiro, int IdRota) {
        this.setVisible(false);
        this.dispose();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        formInfoPassageiro pag = new formInfoPassageiro(IdPassageiro);

        pag.setVisible(true);
    }


    private static String gerarPIX(String chavePixDestinatario, double valor, String descricao,String nomeRecebedor, String cidadeRecebedor) {

        return "00020101021226880014br.gov.bcb.pix2566qrcodes-" +
                "pix.gerencianet.com.br/v2/b444fa26e415499d8371" +
                "BANCO506551fbf22d52040000530398654044.005802BR" +
                "5911" + String.format("%013.2f", valor) +
                "5303" + chavePixDestinatario +
                "6009" + nomeRecebedor +
                "6015" + cidadeRecebedor +
                "62" + String.format("%04d", descricao.length()) + descricao;
        
    }
    
    public formPix(int IdPassageiro, int idRota, int idAssento,int qtd) {
        initComponents();
        nrAssento = idAssento;
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        passageiroDao p = new passageiroDao();
        rotaDao r = new rotaDao();
        
        rota = r.selecionarUmaRota(idRota);
        pass = p.selecionarUmPassageiro(IdPassageiro);
        
        nrAssento = idAssento;

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataHoraAtual = new Date();
        String dataHoraFormatada = dateFormat.format(dataHoraAtual);
        this.txtDATA.setText(dataHoraFormatada);
        
        this.txtEMAIL.setText(pass.getEmail());
        this.txtNUMERO.setText("N° " + gerarCodigoAleatorio(8));
        
        double valortotal = qtd * rota.getVlPreco();
        this.txtVALOR1.setText(String.valueOf(valortotal));
        this.txtVALOR2.setText(String.valueOf(valortotal));
             
        this.txtCODIGO.setText(gerarPIX("989224781",valortotal,"",pass.getNome(),"São paulo"));
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.mnNOME.setText(pass.getNome());
        this.mnID.setText("Id: " + pass.getIdPassageiro());
        
        
        executarFuncaoAposUmMinuto();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPIX = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVALOR2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDATA = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNUMERO = new javax.swing.JLabel();
        txtVALOR1 = new javax.swing.JLabel();
        txtEMAIL = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCOPIAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCODIGO = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblPIX1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnRODOBUS = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagamento Pix");

        jPanel1.setBackground(new java.awt.Color(50, 54, 66));

        lblPIX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 2/Logo_-_pix_powered_by_Banco_Central_(Brazil,_2020) 1.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 165, 0));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 2/pix logo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pagamento via PIX");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 2/rodo bus logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor a pagar:");

        txtVALOR2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtVALOR2.setForeground(new java.awt.Color(255, 255, 255));
        txtVALOR2.setText("0");

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Email");

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Escaneie o QR code:");

        txtDATA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDATA.setForeground(new java.awt.Color(255, 255, 255));
        txtDATA.setText("DATA");

        jLabel22.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Data");

        txtNUMERO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNUMERO.setForeground(new java.awt.Color(255, 255, 255));
        txtNUMERO.setText("NUMERO");

        txtVALOR1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtVALOR1.setForeground(new java.awt.Color(255, 255, 255));
        txtVALOR1.setText("0");

        txtEMAIL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEMAIL.setForeground(new java.awt.Color(255, 255, 255));
        txtEMAIL.setText("EMAIL");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Se preferir você pode pagar copiando e colocando o seguinte código");

        btnCOPIAR.setBackground(new java.awt.Color(50, 54, 66));
        btnCOPIAR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCOPIAR.setForeground(new java.awt.Color(255, 255, 255));
        btnCOPIAR.setText("Copiar Código");
        btnCOPIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCOPIARMouseClicked(evt);
            }
        });
        btnCOPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOPIARActionPerformed(evt);
            }
        });

        txtCODIGO.setColumns(20);
        txtCODIGO.setLineWrap(true);
        txtCODIGO.setRows(5);
        jScrollPane1.setViewportView(txtCODIGO);

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Como pagar com PIX:");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("1. Acesse o app ou site do seu banco");

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("2. Busque a opçao de pagar com PIX");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("3. Leia o QR code ou código PIX");

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("4. Pronto! Você verá a confirmação do ");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("pagamento");

        jLabel30.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Total");

        jLabel31.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Número do pedido");

        lblPIX1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 2/qr code.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel27)
                                .addComponent(jLabel25)
                                .addComponent(jLabel24)
                                .addComponent(lblPIX)
                                .addComponent(jLabel28))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPIX1)
                                        .addGap(8, 8, 8)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtVALOR2)
                                    .addGap(25, 25, 25))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel29))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addComponent(txtNUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17)
                                .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(txtDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30)
                                .addComponent(txtVALOR1))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCOPIAR))))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(txtVALOR1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPIX)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVALOR2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPIX1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCOPIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        mnID.setText("ID");
        jMenuBar1.add(mnID);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 1/user.png"))); // NOI18N
        jMenu3.setText("Perfil");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

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

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked

        carregarInfo2(pass.getIdPassageiro(), rota.getIdRota());        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked

        this.setVisible(false);
        this.dispose();
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void mnRODOBUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRODOBUSMouseClicked
        this.setVisible(false);
        this.dispose();
        formConsultaPassagem consulta = new formConsultaPassagem(pass);
        consulta.setVisible(true);
    }//GEN-LAST:event_mnRODOBUSMouseClicked

    private void btnCOPIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCOPIARMouseClicked

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection(this.txtCODIGO.getText());
        clipboard.setContents(selection, null);
        System.out.println("Código PIX copiado para o clipboard: " + this.txtCODIGO.getText());
    }//GEN-LAST:event_btnCOPIARMouseClicked

    private void btnCOPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOPIARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCOPIARActionPerformed

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
            java.util.logging.Logger.getLogger(formPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                int IdPassageiro = 0;
                int IdRota = 0;
                int nrAssento = 0;
                int qtd = 1;
                new formPix(IdPassageiro , IdRota, nrAssento,qtd).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCOPIAR;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPIX;
    private javax.swing.JLabel lblPIX1;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnRODOBUS;
    private javax.swing.JTextArea txtCODIGO;
    private javax.swing.JLabel txtDATA;
    private javax.swing.JLabel txtEMAIL;
    private javax.swing.JLabel txtNUMERO;
    private javax.swing.JLabel txtVALOR1;
    private javax.swing.JLabel txtVALOR2;
    // End of variables declaration//GEN-END:variables
}
