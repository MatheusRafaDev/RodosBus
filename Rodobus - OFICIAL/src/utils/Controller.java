package utils;

import controller.motoristaDao;
import controller.onibusDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import controller.passageiroDao;
import controller.reservaDao;
import controller.rotaDao;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import model.Motorista;
import model.Onibus;
import model.Passageiro;
import model.Reserva;
import model.Rota;

public class Controller {

    reservaDao reservaDao = new reservaDao();
    rotaDao rotaDao  = new rotaDao();
    onibusDao onibusDao = new onibusDao();
    motoristaDao motoristaDao= new motoristaDao();
    passageiroDao passageiroDao = new passageiroDao();
        
    public void carregarPassageiro(DefaultTableModel passageiroModel, JTable tblPASSAGEIRO) {
        passageiroDao passageiroDao = new passageiroDao();
        ArrayList<Passageiro> passageiros = passageiroDao.selecionarPassageiros();
        passageiroModel.setRowCount(0);

        for (Passageiro passageiro : passageiros) {
            passageiroModel.addRow(new Object[]{
                passageiro.getIdPassageiro(),
                passageiro.getNome(),
                passageiro.getEmail(),
                passageiro.getCpf(),
                passageiro.getIdade(),
                passageiro.getTelefone(),
                passageiro.getSenha()});
        }
    }

    public void carregarMotorista(DefaultTableModel motoristaModel, JTable tblMOTORISTA) {
        motoristaDao motoristaDao = new motoristaDao();
        ArrayList<Motorista> motoristas = motoristaDao.selecionarMotoristas();
        motoristaModel.setRowCount(0);

        for (Motorista motorista : motoristas) {
            motoristaModel.addRow(new Object[]{
                motorista.getIdMotorista(),
                motorista.getNome(),
                motorista.getIdade(),
                motorista.getCpf(),
                motorista.getTelefone()
            });
        }
    }

    public void carregarOnibusComboBox(JComboBox<String> cmbONIBUS4) {
        onibusDao onibusDao = new onibusDao();

        DefaultComboBoxModel<String> cmbOnibusModel = (DefaultComboBoxModel<String>) cmbONIBUS4.getModel();

        if (cmbOnibusModel != null) {
            cmbOnibusModel.removeAllElements();
        }

        ArrayList<Onibus> onibuss = onibusDao.selecionarOnibus();

        cmbOnibusModel.addElement("Selecione um ônibus");

        for (Onibus onibus : onibuss) {
            cmbOnibusModel.addElement(onibus.getIdOnibus() + " - " + onibus.getModelo());
        }
    }

    public void carregarComboBoxMotoristas(JComboBox<String> cmbMOTORISTA4) {
        DefaultComboBoxModel<String> mymodel = (DefaultComboBoxModel<String>) cmbMOTORISTA4.getModel();

        if (mymodel != null) {
            mymodel.removeAllElements();
        }

        motoristaDao motoristaDao = new motoristaDao();
        motoristaDao.criarBanco();
        ArrayList<Motorista> motoristas = motoristaDao.selecionarMotoristas();

        mymodel.addElement("Selecione um motorista");

        for (Motorista motorista : motoristas) {
            String item = motorista.getIdMotorista() + " - " + motorista.getNome();
            mymodel.addElement(item);
        }
    }

    public void carregarReservasBasicas(JTable tblReservas) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Reserva> reservas = reservaDao.selecionarReservas();

        DefaultTableModel reservaModel = (DefaultTableModel) tblReservas.getModel();
        reservaModel.setRowCount(0);

        for (Reserva reserva : reservas) {
            reservaModel.addRow(new Object[]{
                reserva.getIdReserva(),
                reserva.getIdRota(),
                reserva.getIdPassageiro(),
                sdf.format(reserva.getDataReserva()),
                reserva.getStatus()
            });
        }
    }

    public void carregarReservasDetalhadas(JTable tblReservas) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        ArrayList<Reserva> reservas = reservaDao.selecionarReservas();

        DefaultTableModel reservaModel = (DefaultTableModel) tblReservas.getModel();
        reservaModel.setRowCount(0);

        for (Reserva reserva : reservas) {
            Rota rota = rotaDao.selecionarUmaRota(reserva.getIdRota());
            Onibus onibus = onibusDao.selecionarUmOnibus(rota.getIdOnibus());
            Motorista motorista = motoristaDao.selecionarUmMotorista(rota.getIdMotorista());
            Passageiro passageiro = passageiroDao.selecionarUmPassageiro(reserva.getIdPassageiro());

            reservaModel.addRow(new Object[]{
                reserva.getIdReserva(),
                reserva.getIdRota(),
                sdf1.format(reserva.getDataReserva()),
                reserva.getStatus(),
                motorista.getIdMotorista() + " - " + motorista.getNome(),
                passageiro.getIdPassageiro() + " - " + passageiro.getNome(),
                reserva.getQuantidadeReserva(),
                reserva.getValorTotal(),
                rota.getOrigem(),
                rota.getDestino(),
                rota.getDtSaida(),
                rota.getDtChegada(),
                onibus.getIdOnibus() + " - " + onibus.getModelo()
            });
        }
    }
    
    public void carregarRotas(JTable tblRota) {
        DefaultTableModel rotaModel = (DefaultTableModel) tblRota.getModel();
        rotaModel.setRowCount(0);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        ArrayList<Rota> rotas = rotaDao.selecionarRotas();

        for (Rota rota : rotas) {
            Onibus onibus = onibusDao.selecionarUmOnibus(rota.getIdOnibus());
            Motorista motorista = motoristaDao.selecionarUmMotorista(rota.getIdMotorista());

            rotaModel.addRow(new Object[]{
                rota.getIdRota(),
                rota.getIdMotorista() + " - " + motorista.getNome(),
                rota.getIdOnibus() + " - " + onibus.getModelo(),
                rota.getVlPreco(),
                rota.getOrigem(),
                rota.getDestino(),
                sdf.format(rota.getDtSaida()),
                sdf.format(rota.getDtChegada())
            });
        }
    }

    public void carregarRotasComboBox(JComboBox<String> cmbRota) {
        DefaultComboBoxModel<String> cmbRotaModel = (DefaultComboBoxModel<String>) cmbRota.getModel();

        if (cmbRotaModel != null) {
            cmbRotaModel.removeAllElements();
        }

        ArrayList<Rota> rotas = rotaDao.selecionarRotas();

        cmbRotaModel.addElement("Selecione uma rota");

        for (Rota rota : rotas) {
            cmbRotaModel.addElement(rota.getIdRota() + " - " + rota.getOrigem() + " - " + rota.getDestino());
        }
    }
    
    public void carregarOnibus(JTable tblOnibus) {
        ArrayList<Onibus> onibuss = onibusDao.selecionarOnibus();
        DefaultTableModel onibusModel = (DefaultTableModel) tblOnibus.getModel();
        onibusModel.setRowCount(0);

        for (Onibus onibus : onibuss) {
            onibusModel.addRow(new Object[]{
                onibus.getIdOnibus(),
                onibus.getModelo(),
                onibus.getPlaca(),
                onibus.getCapacidade(),
                onibus.getAnoFabricacao()
            });
        }
    }
    
    public void carregarStatusReservaComboBox(JComboBox<String> cmbStatus) {
        String[] statusReserva = {"Pendente", "Reservado", "Cancelada"};

        DefaultComboBoxModel<String> cmbStatusModel = (DefaultComboBoxModel<String>) cmbStatus.getModel();

        if (cmbStatusModel != null) {
            cmbStatusModel.removeAllElements();
        }

        cmbStatusModel.addElement("Selecione um status");

        for (String status : statusReserva) {
            cmbStatusModel.addElement(status);
        }
    }
    
    public void carregarPassageirosComboBox(JComboBox<String> cmbPassageiro) {

        DefaultComboBoxModel<String> cmbPassageiroModel = (DefaultComboBoxModel<String>) cmbPassageiro.getModel();

        if (cmbPassageiroModel != null) {
            cmbPassageiroModel.removeAllElements();
        }

        ArrayList<Passageiro> passageiros = passageiroDao.selecionarPassageiros();

        cmbPassageiroModel.addElement("Selecione um passageiro");

        for (Passageiro passageiro : passageiros) {
            cmbPassageiroModel.addElement(passageiro.getIdPassageiro() + " - " + passageiro.getNome());
        }
    }
    
    public String obterValorSelecionado(JComboBox<String> cmbMOTORISTA4) {
        String valorSelecionado = (String) cmbMOTORISTA4.getSelectedItem();
        
        if (valorSelecionado != null) {
            return valorSelecionado;
        } else {
            return null;
        }
    }
    
    
}

