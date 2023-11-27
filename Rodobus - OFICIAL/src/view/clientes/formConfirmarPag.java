package view.clientes;

import controller.motoristaDao;
import controller.onibusDao;
import controller.passageiroDao;
import controller.rotaDao;
import static java.lang.System.in;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Motorista;
import model.Onibus;
import model.Passageiro;
import model.Rota;

public class formConfirmarPag extends javax.swing.JFrame {

    Rota rota = new Rota();
    Passageiro pass = new Passageiro();
    Onibus onibus = new Onibus();   
    Motorista moto = new Motorista();
     public void carregarInfo2(int IdPassageiro, int IdRota) {
        this.setVisible(false);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         
        formInfoPassageiro pag = new formInfoPassageiro(IdPassageiro, IdRota);

        pag.setVisible(true);
    }
    public formConfirmarPag(int passageiroId2, int rotaId2) {
        initComponents();
       
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        passageiroDao p = new passageiroDao();
        rotaDao r = new rotaDao();
        onibusDao o = new onibusDao();
        motoristaDao m = new motoristaDao();
        
        rota = r.selecionarUmaRota(rotaId2);
        pass = p.selecionarUmPassageiro(passageiroId2);
        onibus = o.selecionarUmOnibus(rota.getIdOnibus());
        moto = m.selecionarUmMotorista(rota.getIdMotorista());
        
          
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.lblNOME.setText(pass.getNome());
        this.lblCPF.setText(pass.getCpf());
        this.lblEMAIL.setText(pass.getEmail());
        this.lblTELEFONE.setText(pass.getTelefone());
        this.lblEMBARQUE.setText(rota.getOrigem());
        this.lblDESEMBARQUE.setText(rota.getDestino());
        this.lblSAIDA.setText(formato.format(rota.getDtSaida()));
        this.lblCHEGADA.setText(formato.format(rota.getDtChegada()));
        this.lbVALOR.setText(String.valueOf( rota.getVlPreco()));
        this.lblDURACAO.setText(rota.getDsDuracao());
        this.lblMOTORISTA.setText(moto.getNome());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNOME = new javax.swing.JLabel();
        lblEMAIL = new javax.swing.JLabel();
        lblTELEFONE = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblTELEFONE1 = new javax.swing.JLabel();
        lblEMAIL1 = new javax.swing.JLabel();
        lblCPF1 = new javax.swing.JLabel();
        lblNOME3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDESEMBARQUE = new javax.swing.JLabel();
        lblSAIDA = new javax.swing.JLabel();
        lblCHEGADA = new javax.swing.JLabel();
        lblDURACAO = new javax.swing.JLabel();
        lbVALOR = new javax.swing.JLabel();
        lblMOTORISTA = new javax.swing.JLabel();
        lblEMBARQUE = new javax.swing.JLabel();
        lblMOTORISTA1 = new javax.swing.JLabel();
        lbVALOR1 = new javax.swing.JLabel();
        lblDURACAO1 = new javax.swing.JLabel();
        lblCHEGADA1 = new javax.swing.JLabel();
        lblSAIDA1 = new javax.swing.JLabel();
        lblDESEMBARQUE1 = new javax.swing.JLabel();
        lblEMBARQUE1 = new javax.swing.JLabel();
        btnConfirmaPagar = new javax.swing.JButton();
        lblNOME1 = new javax.swing.JLabel();
        lblNOME2 = new javax.swing.JLabel();
        lblNOME4 = new javax.swing.JLabel();
        lblNOME5 = new javax.swing.JLabel();
        lblNOME6 = new javax.swing.JLabel();
        lblNOME7 = new javax.swing.JLabel();
        lblNOME8 = new javax.swing.JLabel();
        optPIX = new javax.swing.JRadioButton();
        optCARTAO1 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnRODOBUS = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comfirmar pagamento");

        jPanel1.setBackground(new java.awt.Color(242, 147, 4));

        jPanel2.setBackground(new java.awt.Color(50, 54, 66));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

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

        lblTELEFONE1.setBackground(new java.awt.Color(51, 255, 204));
        lblTELEFONE1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblTELEFONE1.setForeground(new java.awt.Color(255, 255, 255));
        lblTELEFONE1.setText("Telefone");

        lblEMAIL1.setBackground(new java.awt.Color(51, 255, 204));
        lblEMAIL1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblEMAIL1.setForeground(new java.awt.Color(255, 255, 255));
        lblEMAIL1.setText("Email");

        lblCPF1.setBackground(new java.awt.Color(51, 255, 204));
        lblCPF1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblCPF1.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF1.setText("CPF");

        lblNOME3.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME3.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME3.setText("Nome");
        lblNOME3.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEMAIL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTELEFONE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNOME3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNOME3)
                    .addComponent(lblNOME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF1)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEMAIL1)
                    .addComponent(lblEMAIL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTELEFONE1)
                    .addComponent(lblTELEFONE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(50, 54, 66));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lblDESEMBARQUE.setBackground(new java.awt.Color(51, 255, 204));
        lblDESEMBARQUE.setForeground(new java.awt.Color(255, 255, 255));
        lblDESEMBARQUE.setText("Desembarque");

        lblSAIDA.setBackground(new java.awt.Color(51, 255, 204));
        lblSAIDA.setForeground(new java.awt.Color(255, 255, 255));
        lblSAIDA.setText("Saída");

        lblCHEGADA.setBackground(new java.awt.Color(51, 255, 204));
        lblCHEGADA.setForeground(new java.awt.Color(255, 255, 255));
        lblCHEGADA.setText("Chegada");

        lblDURACAO.setBackground(new java.awt.Color(51, 255, 204));
        lblDURACAO.setForeground(new java.awt.Color(255, 255, 255));
        lblDURACAO.setText("Duração");

        lbVALOR.setBackground(new java.awt.Color(51, 255, 204));
        lbVALOR.setForeground(new java.awt.Color(255, 255, 255));
        lbVALOR.setText("Valor");

        lblMOTORISTA.setBackground(new java.awt.Color(51, 255, 204));
        lblMOTORISTA.setForeground(new java.awt.Color(255, 255, 255));
        lblMOTORISTA.setText("Motorista");

        lblEMBARQUE.setBackground(new java.awt.Color(51, 255, 204));
        lblEMBARQUE.setForeground(new java.awt.Color(255, 255, 255));
        lblEMBARQUE.setText("Embarque");

        lblMOTORISTA1.setBackground(new java.awt.Color(51, 255, 204));
        lblMOTORISTA1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblMOTORISTA1.setForeground(new java.awt.Color(255, 255, 255));
        lblMOTORISTA1.setText("Motorista");

        lbVALOR1.setBackground(new java.awt.Color(51, 255, 204));
        lbVALOR1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbVALOR1.setForeground(new java.awt.Color(255, 255, 255));
        lbVALOR1.setText("Valor");

        lblDURACAO1.setBackground(new java.awt.Color(51, 255, 204));
        lblDURACAO1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblDURACAO1.setForeground(new java.awt.Color(255, 255, 255));
        lblDURACAO1.setText("Duração");

        lblCHEGADA1.setBackground(new java.awt.Color(51, 255, 204));
        lblCHEGADA1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblCHEGADA1.setForeground(new java.awt.Color(255, 255, 255));
        lblCHEGADA1.setText("Chegada");

        lblSAIDA1.setBackground(new java.awt.Color(51, 255, 204));
        lblSAIDA1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSAIDA1.setForeground(new java.awt.Color(255, 255, 255));
        lblSAIDA1.setText("Saída");

        lblDESEMBARQUE1.setBackground(new java.awt.Color(51, 255, 204));
        lblDESEMBARQUE1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblDESEMBARQUE1.setForeground(new java.awt.Color(255, 255, 255));
        lblDESEMBARQUE1.setText("Desembarque");

        lblEMBARQUE1.setBackground(new java.awt.Color(51, 255, 204));
        lblEMBARQUE1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblEMBARQUE1.setForeground(new java.awt.Color(255, 255, 255));
        lblEMBARQUE1.setText("Embarque");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMOTORISTA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSAIDA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCHEGADA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDURACAO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVALOR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEMBARQUE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDESEMBARQUE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMOTORISTA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSAIDA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCHEGADA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDURACAO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVALOR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEMBARQUE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDESEMBARQUE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEMBARQUE1)
                    .addComponent(lblEMBARQUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDESEMBARQUE1)
                    .addComponent(lblDESEMBARQUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSAIDA1)
                    .addComponent(lblSAIDA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCHEGADA1)
                    .addComponent(lblCHEGADA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDURACAO1)
                    .addComponent(lblDURACAO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVALOR1)
                    .addComponent(lbVALOR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMOTORISTA1)
                    .addComponent(lblMOTORISTA))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnConfirmaPagar.setBackground(new java.awt.Color(50, 54, 66));
        btnConfirmaPagar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnConfirmaPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmaPagar.setText("Confirma e pagar");
        btnConfirmaPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmaPagarMouseClicked(evt);
            }
        });
        btnConfirmaPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaPagarActionPerformed(evt);
            }
        });

        lblNOME1.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME1.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME1.setText("Dado do (a) Passageiro(a)");
        lblNOME1.setToolTipText("");

        lblNOME2.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME2.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME2.setText("- Embarque apenas com documento.");
        lblNOME2.setToolTipText("");

        lblNOME4.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME4.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME4.setText("Dados da Passagem de Ônibus");
        lblNOME4.setToolTipText("");

        lblNOME5.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME5.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME5.setText("Formas de pagamento");
        lblNOME5.setToolTipText("");

        lblNOME6.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME6.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME6.setText("- Apresente o comprovante na hora do embarque.");
        lblNOME6.setToolTipText("");

        lblNOME7.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME7.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME7.setText("- Reembolso de 100% do valor em viagens");
        lblNOME7.setToolTipText("");

        lblNOME8.setBackground(new java.awt.Color(51, 255, 204));
        lblNOME8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNOME8.setForeground(new java.awt.Color(255, 255, 255));
        lblNOME8.setText("canceladas em até 1 hora antes do embarque");
        lblNOME8.setToolTipText("");

        grupo.add(optPIX);
        optPIX.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        optPIX.setForeground(new java.awt.Color(255, 255, 255));
        optPIX.setText("Pagamaneto no pix");
        optPIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPIXActionPerformed(evt);
            }
        });

        optCARTAO1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        optCARTAO1.setForeground(new java.awt.Color(255, 255, 255));
        optCARTAO1.setText("Pagar com Cartão de Crédito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNOME4)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNOME1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNOME5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(optPIX)
                        .addGap(18, 18, 18)
                        .addComponent(optCARTAO1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNOME7)
                            .addGap(54, 54, 54))
                        .addComponent(lblNOME6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblNOME2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNOME8))
                    .addComponent(btnConfirmaPagar))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNOME1)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNOME5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optPIX)
                            .addComponent(optCARTAO1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNOME4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNOME2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNOME6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNOME7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNOME8)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmaPagar)))
                .addGap(50, 50, 50))
        );

        mnRODOBUS.setText("RodoBus");
        mnRODOBUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnRODOBUSMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnRODOBUS);

        mnNOME.setText("Nome");
        jMenuBar1.add(mnNOME);

        mnID.setText("ID:");
        jMenuBar1.add(mnID);

        jMenu2.setText("Perfil");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Pedido");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optPIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPIXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optPIXActionPerformed

    private void btnConfirmaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmaPagarActionPerformed

    private void btnConfirmaPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmaPagarMouseClicked

        if(this.optPIX.isSelected()){
            this.setVisible(false);
            formPix pix = new formPix(pass.getIdPassageiro(),rota.getIdMotorista());
            pix.setVisible(true);
        } else {
            this.setVisible(false);
            formPagCartao cartao = new formPagCartao(pass.getIdPassageiro(),rota.getIdMotorista());
            cartao.setVisible(true);
        }

    }//GEN-LAST:event_btnConfirmaPagarMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

        carregarInfo2(pass.getIdPassageiro(), rota.getIdRota());      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        formLogin login = new formLogin();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        this.setVisible(false);
        formPedidoRealizado pedido = new formPedidoRealizado(pass);
        pedido.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void mnRODOBUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRODOBUSMouseClicked
        this.setVisible(false);
        formConsultaPassagem consulta = new formConsultaPassagem(pass);
        consulta.setVisible(true);
    }//GEN-LAST:event_mnRODOBUSMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int passageiroId2 = 0;
                int rotaId2 = 0;
                int last=1;
                new formConfirmarPag(passageiroId2, rotaId2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmaPagar;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbVALOR;
    private javax.swing.JLabel lbVALOR1;
    private javax.swing.JLabel lblCHEGADA;
    private javax.swing.JLabel lblCHEGADA1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblDESEMBARQUE;
    private javax.swing.JLabel lblDESEMBARQUE1;
    private javax.swing.JLabel lblDURACAO;
    private javax.swing.JLabel lblDURACAO1;
    private javax.swing.JLabel lblEMAIL;
    private javax.swing.JLabel lblEMAIL1;
    private javax.swing.JLabel lblEMBARQUE;
    private javax.swing.JLabel lblEMBARQUE1;
    private javax.swing.JLabel lblMOTORISTA;
    private javax.swing.JLabel lblMOTORISTA1;
    private javax.swing.JLabel lblNOME;
    private javax.swing.JLabel lblNOME1;
    private javax.swing.JLabel lblNOME2;
    private javax.swing.JLabel lblNOME3;
    private javax.swing.JLabel lblNOME4;
    private javax.swing.JLabel lblNOME5;
    private javax.swing.JLabel lblNOME6;
    private javax.swing.JLabel lblNOME7;
    private javax.swing.JLabel lblNOME8;
    private javax.swing.JLabel lblSAIDA;
    private javax.swing.JLabel lblSAIDA1;
    private javax.swing.JLabel lblTELEFONE;
    private javax.swing.JLabel lblTELEFONE1;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnRODOBUS;
    private javax.swing.JRadioButton optCARTAO1;
    private javax.swing.JRadioButton optPIX;
    // End of variables declaration//GEN-END:variables
}
