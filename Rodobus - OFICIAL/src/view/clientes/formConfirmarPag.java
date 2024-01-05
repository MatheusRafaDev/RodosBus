package view.clientes;

import controller.assentoDao;
import controller.motoristaDao;
import controller.onibusDao;
import controller.passageiroDao;
import controller.rotaDao;
import static java.lang.System.in;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.Assento;
import model.Motorista;
import model.Onibus;
import model.Passageiro;
import model.Reserva;
import model.Rota;
import utils.ValidarNumero;

public class formConfirmarPag extends javax.swing.JFrame {
    
    Rota rota = new Rota();
    Passageiro pass = new Passageiro();
    Onibus onibus = new Onibus();
    Motorista moto = new Motorista();
    Assento assento = new Assento();
    
    private void atualizarValorTotal() {
        double valorUnitario = Double.parseDouble(lbVALOR.getText());
    }
    
    public formConfirmarPag(int IdPassageiro, int IdRota, int IdAssento) {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        passageiroDao p = new passageiroDao();
        rotaDao r = new rotaDao();
        onibusDao o = new onibusDao();
        motoristaDao m = new motoristaDao();
        
        
        rota = r.selecionarUmaRota(IdRota);
        pass = p.selecionarUmPassageiro(IdPassageiro);
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
        this.lbVALOR.setText(String.valueOf(rota.getVlPreco()));
        this.lblDURACAO.setText(rota.getDsDuracao());
        this.lblMOTORISTA.setText(moto.getNome());
        this.lblASSENTO.setText(String.valueOf(IdAssento));
        this.lblROTA.setText(String.valueOf(IdRota));
        
        this.mnNOME.setText(pass.getNome());
        this.mnID.setText("Id: " + pass.getIdPassageiro());
        
        assento.setIdRota(rota.getIdRota());
        assento.setNumeroAssento(IdAssento);
        assento.setStatus("Indisponível");
        
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
        lblMOTORISTA = new javax.swing.JLabel();
        lblEMBARQUE = new javax.swing.JLabel();
        lblMOTORISTA1 = new javax.swing.JLabel();
        lblDURACAO1 = new javax.swing.JLabel();
        lblCHEGADA1 = new javax.swing.JLabel();
        lblSAIDA1 = new javax.swing.JLabel();
        lblDESEMBARQUE1 = new javax.swing.JLabel();
        lblEMBARQUE1 = new javax.swing.JLabel();
        lbVALOR3 = new javax.swing.JLabel();
        lbVALOR = new javax.swing.JLabel();
        lbVALOR4 = new javax.swing.JLabel();
        lblASSENTO = new javax.swing.JLabel();
        lbVALOR5 = new javax.swing.JLabel();
        lblROTA = new javax.swing.JLabel();
        btnConfirmaPagar = new javax.swing.JButton();
        lblNOME1 = new javax.swing.JLabel();
        lblNOME2 = new javax.swing.JLabel();
        lblNOME4 = new javax.swing.JLabel();
        lblNOME5 = new javax.swing.JLabel();
        lblNOME6 = new javax.swing.JLabel();
        lblNOME7 = new javax.swing.JLabel();
        lblNOME8 = new javax.swing.JLabel();
        optCARTAO1 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnRODOBUS1 = new javax.swing.JMenu();
        mnNOME = new javax.swing.JMenu();
        mnID = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 54, 66));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
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

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
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

        lblMOTORISTA.setBackground(new java.awt.Color(51, 255, 204));
        lblMOTORISTA.setForeground(new java.awt.Color(255, 255, 255));
        lblMOTORISTA.setText("Motorista");

        lblEMBARQUE.setBackground(new java.awt.Color(51, 255, 204));
        lblEMBARQUE.setForeground(new java.awt.Color(255, 255, 255));
        lblEMBARQUE.setText("Embarque");

        lblMOTORISTA1.setBackground(new java.awt.Color(51, 255, 204));
        lblMOTORISTA1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMOTORISTA1.setForeground(new java.awt.Color(255, 255, 255));
        lblMOTORISTA1.setText("Motorista");

        lblDURACAO1.setBackground(new java.awt.Color(51, 255, 204));
        lblDURACAO1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDURACAO1.setForeground(new java.awt.Color(255, 255, 255));
        lblDURACAO1.setText("Duração");

        lblCHEGADA1.setBackground(new java.awt.Color(51, 255, 204));
        lblCHEGADA1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCHEGADA1.setForeground(new java.awt.Color(255, 255, 255));
        lblCHEGADA1.setText("Chegada");

        lblSAIDA1.setBackground(new java.awt.Color(51, 255, 204));
        lblSAIDA1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSAIDA1.setForeground(new java.awt.Color(255, 255, 255));
        lblSAIDA1.setText("Saída");

        lblDESEMBARQUE1.setBackground(new java.awt.Color(51, 255, 204));
        lblDESEMBARQUE1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDESEMBARQUE1.setForeground(new java.awt.Color(255, 255, 255));
        lblDESEMBARQUE1.setText("Desembarque");

        lblEMBARQUE1.setBackground(new java.awt.Color(51, 255, 204));
        lblEMBARQUE1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEMBARQUE1.setForeground(new java.awt.Color(255, 255, 255));
        lblEMBARQUE1.setText("Embarque");

        lbVALOR3.setBackground(new java.awt.Color(51, 255, 204));
        lbVALOR3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbVALOR3.setForeground(new java.awt.Color(255, 255, 255));
        lbVALOR3.setText("Valor");

        lbVALOR.setBackground(new java.awt.Color(51, 255, 204));
        lbVALOR.setForeground(new java.awt.Color(255, 255, 255));
        lbVALOR.setText("Valor");

        lbVALOR4.setBackground(new java.awt.Color(51, 255, 204));
        lbVALOR4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbVALOR4.setForeground(new java.awt.Color(255, 255, 255));
        lbVALOR4.setText("Assento");

        lblASSENTO.setBackground(new java.awt.Color(51, 255, 204));
        lblASSENTO.setForeground(new java.awt.Color(255, 255, 255));
        lblASSENTO.setText("Assento");

        lbVALOR5.setBackground(new java.awt.Color(51, 255, 204));
        lbVALOR5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbVALOR5.setForeground(new java.awt.Color(255, 255, 255));
        lbVALOR5.setText("Id.Rota");

        lblROTA.setBackground(new java.awt.Color(51, 255, 204));
        lblROTA.setForeground(new java.awt.Color(255, 255, 255));
        lblROTA.setText("Rota");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSAIDA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCHEGADA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDURACAO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEMBARQUE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDESEMBARQUE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSAIDA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCHEGADA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDURACAO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEMBARQUE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDESEMBARQUE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblMOTORISTA1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMOTORISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbVALOR3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbVALOR4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblASSENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbVALOR5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblROTA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(lblMOTORISTA1)
                    .addComponent(lblMOTORISTA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVALOR4)
                    .addComponent(lblASSENTO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVALOR5)
                    .addComponent(lblROTA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVALOR3)
                    .addComponent(lbVALOR))
                .addContainerGap())
        );

        btnConfirmaPagar.setBackground(new java.awt.Color(50, 54, 66));
        btnConfirmaPagar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConfirmaPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmaPagar.setText("Confirmar e pagar");
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

        optCARTAO1.setBackground(new java.awt.Color(50, 54, 66));
        grupo.add(optCARTAO1);
        optCARTAO1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        optCARTAO1.setForeground(new java.awt.Color(255, 255, 255));
        optCARTAO1.setSelected(true);
        optCARTAO1.setText("Pagar com Cartão de Crédito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNOME4)
                    .addComponent(lblNOME1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNOME5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNOME7)
                            .addGap(54, 54, 54))
                        .addComponent(lblNOME6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblNOME2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNOME8))
                    .addComponent(optCARTAO1)
                    .addComponent(btnConfirmaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNOME1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNOME4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNOME5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optCARTAO1)
                        .addGap(163, 163, 163)
                        .addComponent(lblNOME2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNOME6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNOME7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNOME8)
                        .addGap(36, 36, 36)
                        .addComponent(btnConfirmaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        mnRODOBUS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 1/house.png"))); // NOI18N
        mnRODOBUS1.setText("RodoBus");
        mnRODOBUS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnRODOBUS1MouseClicked(evt);
            }
        });
        jMenuBar1.add(mnRODOBUS1);

        mnNOME.setText("Nome");
        jMenuBar1.add(mnNOME);

        mnID.setText("ID:");
        jMenuBar1.add(mnID);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 1/user.png"))); // NOI18N
        jMenu2.setText("Perfil");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons 1/cart.png"))); // NOI18N
        jMenu4.setText("Pedido");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

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

    private void btnConfirmaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmaPagarActionPerformed

    private void btnConfirmaPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmaPagarMouseClicked
        
        this.dispose();
        this.setVisible(false);
         
        
        formPagCartao cartao = new formPagCartao(pass.getIdPassageiro(), rota.getIdMotorista(),Integer.parseInt(this.lblASSENTO.getText()));
        cartao.setVisible(true);
        

    }//GEN-LAST:event_btnConfirmaPagarMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.dispose();
        this.setVisible(false);
        formInfoPassageiro pag = new formInfoPassageiro(pass.getIdPassageiro());
        pag.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        this.dispose();
        this.setVisible(false);
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        this.dispose();
        this.setVisible(false);
        formPedidoRealizado pedido = new formPedidoRealizado(pass);
        pedido.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void mnRODOBUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRODOBUSMouseClicked
        
        this.setVisible(false);
        this.dispose();
        formConsultaPassagem consulta = new formConsultaPassagem(pass);
        consulta.setVisible(true);
    }//GEN-LAST:event_mnRODOBUSMouseClicked

    private void mnRODOBUS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRODOBUS1MouseClicked
        this.setVisible(false);
        this.dispose();
        assentoDao a = new assentoDao();
        a.incluir(assento);
        formConsultaPassagem consulta = new formConsultaPassagem(pass);
        consulta.setVisible(true);
    }//GEN-LAST:event_mnRODOBUS1MouseClicked
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int IdPassageiro = 0;
                int IdRota = 0;
                int IdAssento = 0;
                
                new formConfirmarPag(IdPassageiro, IdRota, IdAssento).setVisible(true);
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
    private javax.swing.JLabel lbVALOR3;
    private javax.swing.JLabel lbVALOR4;
    private javax.swing.JLabel lbVALOR5;
    private javax.swing.JLabel lblASSENTO;
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
    private javax.swing.JLabel lblROTA;
    private javax.swing.JLabel lblSAIDA;
    private javax.swing.JLabel lblSAIDA1;
    private javax.swing.JLabel lblTELEFONE;
    private javax.swing.JLabel lblTELEFONE1;
    private javax.swing.JMenu mnID;
    private javax.swing.JMenu mnNOME;
    private javax.swing.JMenu mnRODOBUS1;
    private javax.swing.JRadioButton optCARTAO1;
    // End of variables declaration//GEN-END:variables
}
