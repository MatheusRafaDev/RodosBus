package controller;

import com.mysql.cj.xdevapi.Statement;
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

    public Reserva incluir(Reserva obj) {
        sql = "INSERT INTO tb_reservas (id_rota, id_passageiro, dt_reserva, ds_status, qtd_reserva, vl_total) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql, new String[]{"id_reserva"});

            ps.setInt(1, obj.getIdRota());
            ps.setInt(2, obj.getIdPassageiro());
            ps.setDate(3, new java.sql.Date(obj.getDataReserva().getTime()));
            ps.setString(4, obj.getStatus());
            ps.setInt(5, obj.getQuantidadeReserva());
            ps.setDouble(6, obj.getValorTotal());

            ps.executeUpdate();

            obj.setIdReserva(obterUltimoIdReserva());

            ps.close();
        } catch (SQLException err) {
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar reserva! " + err.getMessage());
        }

        return obj;
    }

    public int obterUltimoIdReserva() {
        int ultimoId = -1;
        String sql = "SELECT MAX(id_reserva) AS ultimo_id FROM tb_reservas";

        try (PreparedStatement ps = mycon.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                ultimoId = rs.getInt("ultimo_id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao obter o último ID de reserva! " + e.getMessage());
        }

        return ultimoId;
    }

    public Reserva selecionarUmaReserva(int id) {
        String sql = "SELECT id_reserva, id_rota, id_passageiro, dt_reserva, ds_status, qtd_reserva, vl_total FROM tb_reservas WHERE id_reserva = ?";
        Reserva reserva = new Reserva();

        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                reserva.setIdReserva(resultSet.getInt("id_reserva"));
                reserva.setIdRota(resultSet.getInt("id_rota"));
                reserva.setIdPassageiro(resultSet.getInt("id_passageiro"));
                java.sql.Timestamp reserTimestamp = resultSet.getTimestamp("dt_reserva");
                reserva.setDataReserva(new Date(reserTimestamp.getTime()));
                reserva.setStatus(resultSet.getString("ds_status"));
                reserva.setQuantidadeReserva(resultSet.getInt("qtd_reserva"));
                reserva.setValorTotal(resultSet.getDouble("vl_total"));
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
        String sql = "DELETE FROM tb_reservas WHERE id_reserva = ?";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir reserva! " + err.getMessage());
        }
    }

    public void alterarReserva(Reserva obj) {
        String sql = "UPDATE tb_reservas SET id_rota = ?, id_passageiro = ?, dt_reserva = ?, ds_status = ?, qtd_reserva = ?, vl_total = ? WHERE id_reserva = ?";

        try {
            ps = mycon.prepareStatement(sql);

            ps.setInt(1, obj.getIdRota());
            ps.setInt(2, obj.getIdPassageiro());
            ps.setDate(3, new java.sql.Date(obj.getDataReserva().getTime()));
            ps.setString(4, obj.getStatus());
            ps.setInt(5, obj.getQuantidadeReserva());
            ps.setDouble(6, obj.getValorTotal());
            ps.setInt(7, obj.getIdReserva());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Reserva! " + err.getMessage());
        }
    }

    public ArrayList<Reserva> selecionarReservas() {
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();

        String sql = "SELECT * FROM tb_reservas";

        try {
            ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int idReserva = resultSet.getInt("id_reserva");
                int idRota = resultSet.getInt("id_rota");
                int idPassageiro = resultSet.getInt("id_passageiro");
                java.sql.Timestamp reserTimestamp = resultSet.getTimestamp("dt_reserva");
                Date dataReserva = new Date(reserTimestamp.getTime());
                String status = resultSet.getString("ds_status");
                int quantidadeReserva = resultSet.getInt("qtd_reserva");
                double valorTotal = resultSet.getDouble("vl_total");

                Reserva reserva = new Reserva();
                reserva.setIdReserva(idReserva);
                reserva.setIdRota(idRota);
                reserva.setIdPassageiro(idPassageiro);
                reserva.setDataReserva(dataReserva);
                reserva.setStatus(status);
                reserva.setQuantidadeReserva(quantidadeReserva);

                reserva.setValorTotal(valorTotal);

                reservas.add(reserva);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar reserva! " + err.getMessage());
        }

        return reservas;
    }

    public ArrayList<Reserva> FormPedidos(int id) {
        ArrayList<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM TB_RESERVAS WHERE ID_PASSAGEIRO =" + id ;
     
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Reserva reserva = new Reserva();     
                int IdReserva = resultSet.getInt("ID_RESERVA");
                int IdRota = resultSet.getInt("ID_ROTA");
                Date dtreserva = resultSet.getDate("DT_RESERVA");
                int quantidadeReserva = resultSet.getInt("qtd_reserva");
                String status = resultSet.getString("DS_STATUS");
                double vl_total = resultSet.getDouble("vl_total");      
                
                reserva.setIdReserva(IdReserva);
                reserva.setIdRota(IdRota);
                reserva.setDataReserva(dtreserva);
                reserva.setStatus(status);
                reserva.setQuantidadeReserva(quantidadeReserva);
                reserva.setValorTotal(vl_total);
                reservas.add(reserva);  
            }
            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar reserva! " + err.getMessage());
        }

        return reservas;
    }
}
