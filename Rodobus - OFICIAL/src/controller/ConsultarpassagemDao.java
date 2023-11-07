package controller;

import java.awt.List;
import model.Passageiro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ConsultarpassagemDao extends conectarDao {

    private PreparedStatement ps;

    public ConsultarpassagemDao() {
        super();
    }

    public void incluir(Passageiro obj) {
        sql = "INSERT INTO TB_PASSAGEIRO (ds_nome, nr_idade, ds_CPF, ds_TELEFONE, ds_email, ds_SENHA) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getNome());
            ps.setInt(2, obj.getIdade());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getTelefone());
            ps.setString(5, obj.getEmail());
            ps.setString(6, obj.getSenha());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Cadastrado com Sucesso !");
        } catch (SQLException err) {

        }
    }

    public ArrayList<Passageiro> selecionarPassageiro() {
        ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();

        String sql = "SELECT ID_PASSAGEIRO,DS_NOME, NR_IDADE, DS_CPF, DS_TELEFONE, DS_EMAIL, DS_SENHA FROM TB_PASSAGEIRO";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_MOTORISTA");
                String nome = resultSet.getString("DS_NOME");
                int idade = resultSet.getInt("NR_IDADE");
                String cpf = resultSet.getString("DS_CPF");
                String telefone = resultSet.getString("DS_TELEFONE");
                String email = resultSet.getString("DS_EMAIL");
                String senha = resultSet.getString("DS_SENHA");

                Passageiro passageiro = new Passageiro();

                passageiro.setIdPassageiro(id);
                passageiro.setCpf(cpf);
                passageiro.setIdade(idade);
                passageiro.setNome(nome);
                passageiro.setTelefone(telefone);
                passageiro.setEmail(email);
                passageiro.setSenha(senha);

                passageiros.add(passageiro);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Motoristas! " + err.getMessage());
        }

        return passageiros;
    }

    public void excluir(int id) {

        sql = "DELETE FROM TB_PASSAGEIRO WHERE ID_PASSAGEIRO = '" + id + "'";
        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso !");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir usuário!" + err.getMessage());
        }
    }

    public void alterar(Passageiro obj) {
        String sql = "UPDATE TB_PASSAGEIRO SET DS_NOME = ?, NR_IDADE = ?, DS_CPF = ?, DS_TELEFONE = ?, DS_EMAIL = ?, DS_SENHA = ? WHERE ID_PASSAGEIRO = ?";
        try {
            PreparedStatement ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getNome());
            ps.setInt(2, obj.getIdade());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getTelefone());
            ps.setString(5, obj.getEmail());
            ps.setString(6, obj.getSenha());
            ps.setInt(7, obj.getIdPassageiro()); // Você deve fornecer o ID do motorista a ser atualizado

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso !");
            } else {

            }

            ps.close();
        } catch (SQLException err) {
            // Lide com as exceções SQL, por exemplo, exibindo uma mensagem de erro.
            err.printStackTrace();
        }
    }
    
    

}
