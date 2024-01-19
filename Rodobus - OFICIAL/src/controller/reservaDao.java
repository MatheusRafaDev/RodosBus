package controller;

import com.mysql.cj.xdevapi.Statement;
import static functions.Geradores.gerarCodigoAleatorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Reserva;
import java.util.Date;
import java.util.ArrayList;
import model.Passageiro;

public class reservaDao extends conectarDao {

    private PreparedStatement ps;

    public reservaDao() {
        super();
    }

    public Reserva incluir(Reserva obj) {
        sql = "INSERT INTO tb_reservas (id_rota, id_passageiro, dt_reserva, ds_status, vl_total,id_assento,qtd_reserva,ds_codigo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql, new String[]{"id_reserva"});

            ps.setInt(1, obj.getIdRota());
            ps.setInt(2, obj.getIdPassageiro());
            ps.setDate(3, new java.sql.Date(obj.getDataReserva().getTime()));
            ps.setString(4, obj.getStatus());
            ps.setDouble(5, obj.getValorTotal());
            ps.setInt(6, obterUltimoIdAssento());
            ps.setInt(7, obj.getQuantidade());
            ps.setString(8, gerarCodigoAleatorio(8));
            
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

    public int obterUltimoIdAssento() {
        int ultimoId = -1;
        String sql = "SELECT MAX(id_assento) AS ultimo_id FROM tb_assentos";

        try (PreparedStatement ps = mycon.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                ultimoId = rs.getInt("ultimo_id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao obter o último ID de assento! " + e.getMessage());
        }

        return ultimoId;
    }

    public Reserva selecionarUmaReserva(int id) {
        String sql = "SELECT * FROM TB_RESERVAS WHERE ID_RESERVA = " + id;
        
        Reserva reserva = null;

        try {
            
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();


            if (resultSet.next()) {
                reserva = new Reserva();
                
                reserva.setIdReserva(resultSet.getInt("id_reserva"));
                reserva.setIdRota(resultSet.getInt("id_rota"));
                reserva.setIdPassageiro(resultSet.getInt("id_passageiro"));
                java.sql.Timestamp reserTimestamp = resultSet.getTimestamp("dt_reserva");
                reserva.setDataReserva(new Date(reserTimestamp.getTime()));
                reserva.setStatus(resultSet.getString("ds_status"));
                reserva.setValorTotal(resultSet.getDouble("vl_total"));
                reserva.setIdAssento(resultSet.getInt("id_assento"));
                reserva.setQuantidade(resultSet.getInt("qtd_reserva"));
                reserva.setCodigo( resultSet.getString("ds_codigo"));

            } else {
                JOptionPane.showMessageDialog(null, "Reserva not found for ID: " + id);
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
        String sql = "UPDATE tb_reservas SET id_rota = ?, id_passageiro = ?, dt_reserva = ?, ds_status = ?, vl_total = ?,id_assento = ? WHERE id_reserva = ?";

        try {
            ps = mycon.prepareStatement(sql);

            ps.setInt(1, obj.getIdRota());
            ps.setInt(2, obj.getIdPassageiro());
            ps.setDate(3, new java.sql.Date(obj.getDataReserva().getTime()));
            ps.setString(4, obj.getStatus());
            ps.setDouble(5, obj.getValorTotal());
            ps.setInt(6, obj.getIdReserva());
            ps.setInt(7, obj.getIdAssento());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Reserva! " + err.getMessage());
        }
    }

    public ArrayList<Reserva> selecionarReservas() {
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();

        String sql = "SELECT * FROM TB_RESERVAS";

        try {
            ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int idReserva = resultSet.getInt("id_reserva");
                int idRota = resultSet.getInt("id_rota");
                int idPassageiro = resultSet.getInt("id_passageiro");
                int idAssento = resultSet.getInt("id_assento");

                java.sql.Timestamp reserTimestamp = resultSet.getTimestamp("dt_reserva");
                Date dataReserva = new Date(reserTimestamp.getTime());
                String status = resultSet.getString("ds_status");
                double valorTotal = resultSet.getDouble("vl_total");
                int Quantidade = resultSet.getInt("qtd_reserva");
                String Codigo  = resultSet.getString("ds_codigo");
                
                Reserva reserva = new Reserva();
                reserva.setIdReserva(idReserva);
                reserva.setIdRota(idRota);
                reserva.setIdPassageiro(idPassageiro);
                reserva.setDataReserva(dataReserva);
                reserva.setStatus(status);
                reserva.setIdAssento(idAssento);
                reserva.setQuantidade(Quantidade);
                    
                reserva.setValorTotal(valorTotal);
                reserva.setCodigo(Codigo);
                
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
        String sql = "SELECT * FROM TB_RESERVAS WHERE ID_PASSAGEIRO =" + id;

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
                String Codigo  = resultSet.getString("ds_codigo");
                
                reserva.setIdReserva(IdReserva);
                reserva.setIdRota(IdRota);
                reserva.setDataReserva(dtreserva);
                reserva.setStatus(status);
                reserva.setValorTotal(vl_total);
                reserva.setCodigo(Codigo);
                reservas.add(reserva);
            }
            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar reserva! " + err.getMessage());
        }

        return reservas;
    }

    public void alterarStatus(int id) {
        String sql = "UPDATE tb_reservas SET DS_STATUS=? WHERE id_reserva =" + id;

        try {
            ps = mycon.prepareStatement(sql);
            ps.setString(1, "Cancelada");
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva cancelada com com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao cancelar pedido!! " + err.getMessage());
        }
    }
}
