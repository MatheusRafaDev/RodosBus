/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Reserva;

/**
 *
 * @author thiag
 */
public class reservaDao {
    
    private PreparedStatement ps;
    
    public reservaDao() {
        super();
    }
    
    public void incluir(Reserva obj) {
        sql = "INSERT INTO TB_MOTORISTA (DS_NOME, NR_IDADE, DS_CPF, DS_TELEFONE) VALUES (?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getNome());
            ps.setInt(2, obj.getIdade());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getTelefone());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Registro Cadastrado com Sucesso !");
        } catch (SQLException err) {
            
        }
    }
}
