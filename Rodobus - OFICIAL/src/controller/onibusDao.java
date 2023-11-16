/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.List;
import model.Motorista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.Onibus;

/**
 *
 * @author thiag
 */

public class onibusDao extends conectarDao {

    private PreparedStatement ps;

    public onibusDao() {
        super();
    }

    public void incluir(Onibus obj) {
    
    sql = "INSERT INTO TB_ONIBUS (DS_MODELO, DS_PLACA, DS_ANO_FABRICACAO, NR_CAPACIDADE) VALUES(?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);

 
            ps.setString(1, obj.getModelo());
            ps.setString(2, obj.getPlaca());
            ps.setInt(3, obj.getAnoFabricacao());
            ps.setInt(4, obj.getCapacidade());


            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Onibus cadastrado com com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!" + err.getMessage());
        }
    }
    
        public ArrayList<Onibus> selecionarOnibus() {
        ArrayList<Onibus> selecionarOnibus = new ArrayList<Onibus>();

        String sql = "SELECT ID_ONIBUS,DS_MODELO, DS_PLACA, DS_ANO_FABRICACAO, NR_CAPACIDADE FROM TB_ONIBUS";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int idOnibus = resultSet.getInt("ID_ONIBUS");
                String modelo = resultSet.getString("DS_MODELO");
                String placa = resultSet.getString("DS_PLACA");
                int  AnoFabricacao= resultSet.getInt("DS_ANO_FABRICACAO");
                int capacidade = resultSet.getInt("NR_CAPACIDADE");

                Onibus onibus = new Onibus();

                onibus.setIdOnibus(idOnibus);
                onibus.setModelo(modelo);
                onibus.setPlaca(placa);
                onibus.setAnoFabricacao(AnoFabricacao);
                onibus.setCapacidade(capacidade);
                
                selecionarOnibus.add(onibus);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Motoristas! " + err.getMessage());
        }

        return selecionarOnibus;
    }
        
            public void excluir(int id) {

        sql = "DELETE FROM ID_ONIBUS WHERE ID_ONIBUS = '" + id + "'";
        try { 
            ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close(); 
            JOptionPane.showMessageDialog(null,"Registro Excluido com Sucesso !");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir usuário!"+ err.getMessage());
        }
    }
            
            
    
    public void alterar(Onibus obj) {
    String sql = "UPDATE TB_ONIBUS SET DS_MODELO = ?, DS_PLACA = ?, DS_ANO_FABRICACAO = ?, NR_CAPACIDADE = ? WHERE ID_ONIBUS = ?";
    try {
        PreparedStatement ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getModelo());
            ps.setString(2, obj.getPlaca());
            ps.setInt(3, obj.getAnoFabricacao());
            ps.setInt(4, obj.getCapacidade());

        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Onibus Alterado com Sucesso !");
        } else {
            
        }
        
        ps.close();
    } catch (SQLException err) {
 
        err.printStackTrace();
    }
    }
    
}
