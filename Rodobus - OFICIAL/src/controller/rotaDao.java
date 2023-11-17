package controller;

import java.awt.List;
import model.Rota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;

public class rotaDao extends conectarDao {

    private PreparedStatement ps;

    public rotaDao() {
        super();
    }

    public ArrayList<Rota> selecionarRotas() {
        ArrayList<Rota> rotas = new ArrayList<Rota>();

        String sql = "SELECT id_rota, ds_origem, ds_destino, vl_distancia, ds_duracao, vl_preco, dt_saida, dt_chegada from tb_rota";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_rota");
                
                String destino = resultSet.getString("ds_destino");
                String origem = resultSet.getString("ds_origem");
                
                Date saida = resultSet.getDate("dt_saida");
                Date chegada = resultSet.getDate("dt_chegada");
                Double preco = resultSet.getDouble("vl_preco");

                Rota rota = new Rota();

                rota.setIdRota(id);
                rota.setDestino(destino);
                rota.setOrigem(origem);
                rota.setChegada(chegada);
                rota.setSaida(saida);
                rota.setPreco(preco);
            
                
                rotas.add(rota);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Motoristas! " + err.getMessage());
        }

        return rotas;
    }
}

    

