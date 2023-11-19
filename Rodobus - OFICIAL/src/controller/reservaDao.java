/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Reserva;
import java.util.Date;
import java.util.ArrayList;

public class reservaDao extends conectarDao {

    private PreparedStatement ps;

    public reservaDao() {
        super();
    }

    public void incluir(Reserva obj) {
        sql = "INSERT INTO TB_RESERVA (ID_ROTA, ID_ONIBUS, ID_MOTORISTA, ID_PASSAGEIRO, DT_RESERVA, DS_STATUS) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);

            ps.setInt(1, obj.getIdRota());
            ps.setInt(2, obj.getIdOnibus());
            ps.setInt(3, obj.getIdMotorista());
            ps.setInt(4, obj.getIdReserva());
            ps.setDate(5, (java.sql.Date) obj.getDataReserva());
            ps.setString(6, obj.getStatus());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva Cadastrada com Sucesso !");
        } catch (SQLException err) {
            // Lide com as exceções SQL, por exemplo, exibindo uma mensagem de erro.
            err.printStackTrace();
        }
    }

    public Reserva selecionarUmaReserva(int id) {
        String sql = "SELECT ID_RESERVA, ID_ROTA, ID_ONIBUS, ID_MOTORISTA, ID_PASSAGEIRO, DT_RESERVA, DS_STATUS FROM TB_RESERVA WHERE ID_RESERVA = ?";
        Reserva reserva = new Reserva();

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                // ... (código existente para obter dados do ResultSet)
            } else {
                reserva.setIdReserva(0);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Reserva! " + err.getMessage());
        }

        return reserva;
    }

    public void excluirReserva(int id) {    
        String sql = "DELETE FROM TB_RESERVA WHERE ID_RESERVA = ?";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Reserva! " + err.getMessage());
        }
    }

    public void alterarReserva(Reserva obj) {
        String sql = "UPDATE TB_RESERVA SET ID_ROTA = ?, ID_ONIBUS = ?, ID_MOTORISTA = ?, ID_PASSAGEIRO = ?, DT_RESERVA = ?, DS_STATUS = ? WHERE ID_RESERVA = ?";

        try {
            ps = mycon.prepareStatement(sql);

            ps.setInt(1, obj.getIdRota());
            ps.setInt(2, obj.getIdOnibus());
            ps.setInt(3, obj.getIdMotorista());
            ps.setInt(4, obj.getIdPassageiro());
            ps.setDate(5, new java.sql.Date(obj.getDataReserva().getTime()));
            ps.setString(6, obj.getStatus());
            ps.setInt(7, obj.getIdReserva());

            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Reserva! " + err.getMessage());
        }
    }
    
    
}
