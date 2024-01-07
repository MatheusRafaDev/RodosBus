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
            JOptionPane.showMessageDialog(null, "Registro Cadastrado com Sucesso !");
        } catch (SQLException err) {

        }
    }

    public ArrayList<Motorista> selecionarMotoristas() {
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();

        String sql = "SELECT * FROM TB_MOTORISTA";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_MOTORISTA");
                String nome = resultSet.getString("DS_NOME");
                int idade = resultSet.getInt("NR_IDADE");
                String cpf = resultSet.getString("DS_CPF");
                String telefone = resultSet.getString("DS_TELEFONE");

                Motorista motorista = new Motorista();

                motorista.setIdMotorista(id);
                motorista.setCpf(cpf);
                motorista.setIdade(idade);
                motorista.setNome(nome);
                motorista.setTelefone(cpf);

                motoristas.add(motorista);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Motoristas! " + err.getMessage());
        }

        return motoristas;
    }

    public Motorista selecionarUmMotorista(int idMotorista) {
        String sql = "SELECT * FROM TB_MOTORISTA WHERE ID_MOTORISTA = ?";
        Motorista motorista = new Motorista();

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setInt(1, idMotorista);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                motorista.setIdMotorista(resultSet.getInt("ID_MOTORISTA"));
                motorista.setNome(resultSet.getString("DS_NOME"));
                motorista.setIdade(resultSet.getInt("NR_IDADE"));
                motorista.setCpf(resultSet.getString("DS_CPF"));
                motorista.setTelefone(resultSet.getString("DS_TELEFONE"));
            } else {
                motorista.setIdMotorista(0);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Motorista! " + err.getMessage());
        }

        return motorista;
    }

    public void excluir(int id) {

        sql = "DELETE FROM TB_MOTORISTA WHERE ID_MOTORISTA = '" + id + "'";
        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso !");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir usuário!" + err.getMessage());
        }
    }

    public void alterar(Motorista obj) {
        String sql = "UPDATE TB_MOTORISTA SET DS_NOME = ?, NR_IDADE = ?, DS_CPF = ?, DS_TELEFONE = ? WHERE ID_MOTORISTA = ?";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getNome());
            ps.setInt(2, obj.getIdade());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getTelefone());
            ps.setInt(5, obj.getIdMotorista()); // Você deve fornecer o ID do motorista a ser atualizado

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso !");
            } else {

            }

            ps.close();
        } catch (SQLException err) {

            err.printStackTrace();
        }
    }

}
