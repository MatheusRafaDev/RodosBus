package controller;

import model.Motorista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class motoristaDao extends conectarDao {
    private PreparedStatement ps;
    public motoristaDao() {
        super();
 }

public void incluir(Motorista obj) {
        sql = "INSERT INTO TB_MOTORISTA (DS_NOME, NR_IDADE, DS_CPF, DS_TELEFONE) VALUES (?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);
            
            ps.setString(1, obj.getNome());
            ps.setInt(2, obj.getIdade());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getTelefone());
            
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir Motorista!" + err.getMessage());
        }
    }
}

