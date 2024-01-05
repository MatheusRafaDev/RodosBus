package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Assento;

public class assentoDao extends conectarDao {

    private PreparedStatement ps;

    public assentoDao() {
        super();
    }

    public void incluir(Assento assento) {
        String sql = "INSERT INTO TB_ASSENTOS (id_rota, nr_numero_assento, ds_status) VALUES (?, ?, ?)";
        try {

            ps = mycon.prepareStatement(sql);

            ps.setInt(1, assento.getIdRota());
            ps.setInt(2, assento.getNumeroAssento());
            ps.setString(3, assento.getStatus());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public List<Assento> buscarAssentosPorRota(int idRota) {
        List<Assento> assentos = new ArrayList<>();
        String sql = "SELECT * FROM TB_ASSENTOS WHERE ID_ROTA = ?";

        try (PreparedStatement ps = mycon.prepareStatement(sql)) {
            ps.setInt(1, idRota);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Assento assento = new Assento();
                    assento.setIdAssento(rs.getInt("id_assento"));
                    assento.setIdRota(rs.getInt("id_rota"));
                    assento.setNumeroAssento(rs.getInt("nr_numero_assento"));
                    assento.setStatus(rs.getString("ds_status"));
                    assentos.add(assento);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar assentos por rota", e);
        }

        return assentos;
    }
    
    public Assento selecionarAssento(int idAssento) {
        Assento assento = null;
        String sql = "SELECT * FROM TB_ASSENTOS WHERE ID_ASSENTO = ?";

        try (PreparedStatement ps = mycon.prepareStatement(sql)) {
            ps.setInt(1, idAssento);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    assento = new Assento();
                    assento.setIdAssento(rs.getInt("id_assento"));
                    assento.setIdRota(rs.getInt("id_rota"));
                    assento.setNumeroAssento(rs.getInt("nr_numero_assento"));
                    assento.setStatus(rs.getString("ds_status"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar assento", e);
        }

        return assento;
    }


}
