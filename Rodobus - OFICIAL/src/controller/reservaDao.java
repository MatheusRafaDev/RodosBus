
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Reserva;
import java.util.Date;
import java.util.ArrayList;
import model.ReservaInfo;

public class reservaDao extends conectarDao {

    private PreparedStatement ps;

    public reservaDao() {
        super();
    }

    public void incluir(Reserva obj) {
        sql = "INSERT INTO tb_reservas (id_rota, id_passageiro, dt_reserva, ds_status, qtd_reserva, vl_total) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);

            ps.setInt(1, obj.getIdRota());
            ps.setInt(2, obj.getIdPassageiro());
            ps.setDate(3, new java.sql.Date(obj.getDataReserva().getTime()));
            ps.setString(4, obj.getStatus());
            ps.setInt(5, obj.getQuantidadeReserva());
            ps.setDouble(6, obj.getValorTotal());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva Cadastrada com Sucesso !");
        } catch (SQLException err) {
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar reserva! " + err.getMessage());
        }
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

        String sql = "SELECT id_reserva, id_rota, id_passageiro, dt_reserva, ds_status, qtd_reserva, vl_total FROM tb_reservas";

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

    public ArrayList<ReservaInfo> obterReservasComDetalhes() {

        ArrayList<ReservaInfo> reservas = new ArrayList<>();

        String sql = "SELECT r.id_reserva, r.dt_reserva, r.ds_status, "
                + "m.ds_nome AS nome_motorista, p.ds_nome AS nome_passageiro, ro.ds_origem, ro.ds_destino, ro.dt_saida, "
                + "ro.dt_chegada, o.ds_modelo AS modelo_onibus "
                + "FROM tb_reservas r "
                + "LEFT JOIN tb_passageiro p ON r.id_passageiro = p.id_passageiro "
                + "LEFT JOIN tb_rota ro ON r.id_rota = ro.id_rota "
                + "LEFT JOIN tb_onibus o ON ro.id_onibus = o.id_onibus "
                + "LEFT JOIN tb_motorista m ON ro.id_motorista = m.id_motorista ";

        try (PreparedStatement ps = mycon.prepareStatement(sql)) {
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    ReservaInfo reserva = new ReservaInfo();
                    reserva.setIdReserva(resultSet.getInt("id_reserva"));
                    reserva.setDataReserva(resultSet.getDate("dt_reserva"));
                    reserva.setStatus(resultSet.getString("ds_status"));
                    reserva.setNomeMotorista(resultSet.getString("nome_motorista"));
                    reserva.setNomePassageiro(resultSet.getString("nome_passageiro"));
                    reserva.setOrigem(resultSet.getString("ds_origem"));
                    reserva.setDestino(resultSet.getString("ds_destino"));
                    reserva.setDtSaida(resultSet.getDate("dt_saida"));
                    reserva.setDtChegada(resultSet.getDate("dt_chegada"));
                    reserva.setModeloOnibus(resultSet.getString("modelo_onibus"));

                    reservas.add(reserva);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reservas;
    }
}
