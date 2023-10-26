
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
                
            }
    }


    public ArrayList<Motorista> selecionarMotoristas() {
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();

        String sql = "SELECT DS_NOME, NR_IDADE, DS_CPF, DS_TELEFONE FROM TB_MOTORISTA";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                String nome = resultSet.getString("DS_NOME");
                int idade = resultSet.getInt("NR_IDADE");
                String cpf = resultSet.getString("DS_CPF");
                String telefone = resultSet.getString("DS_TELEFONE");

                Motorista motorista = new Motorista();
                
                motorista.setCpf(cpf);
                motorista.setIdade(idade);
                motorista.setNome(nome);
                motorista.setCpf(cpf);
                motoristas.add(motorista);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Motoristas! " + err.getMessage());
        }

        return motoristas;
    }
}