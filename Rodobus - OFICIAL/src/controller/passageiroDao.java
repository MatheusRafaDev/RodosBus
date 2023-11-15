package controller;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Passageiro;

public class passageiroDao extends conectarDao {

    private PreparedStatement ps;
    private Passageiro passageiro;

    public passageiroDao() {
        super();
    }

    public void Incluir(Passageiro obj) {
        sql = "INSERT INTO TB_PASSAGEIRO (DS_CPF, DS_NOME, DS_EMAIL, DS_TELEFONE, NR_IDADE, DS_SENHA) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getCpf());
            ps.setString(2, obj.getNome());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getTelefone());
            ps.setInt(5, obj.getIdade());
            ps.setString(6, obj.getSenha());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Cadastro concluído com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!" + err.getMessage());
        }
    }

    public void Alterar(Passageiro obj) {
        sql = " UPDATE TB_PASSAGEIRO SET DS_CPF = ?,DS_NOME  = ?,DS_EMAIL = ?, DS_TELEFONE = ?, NR_IDADE = ?,DS_SENHA = ? WHERE ID_PASSAGEIRO =  " + (obj.getIdPassageiro());
        try {
            ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getCpf());
            ps.setString(2, obj.getNome());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getTelefone());
            ps.setInt(5, obj.getIdade());
            ps.setString(6, obj.getSenha());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar!" + err.getMessage());
        }
    }

   public Passageiro validarLogin(String login, String senha) {
    
    String sql = "SELECT ID_PASSAGEIRO, DS_NOME, DS_EMAIL, NR_IDADE, DS_CPF, DS_TELEFONE, DS_SENHA " +
                 "FROM TB_PASSAGEIRO WHERE ucase(DS_NOME) = ucase(?) AND DS_SENHA = ucase(?)";

    try (PreparedStatement ps = mycon.prepareStatement(sql)) {
        ps.setString(1, login);
        ps.setString(2, senha);

        ResultSet result = ps.executeQuery();

        if (result.next()) {
            int id = result.getInt("ID_PASSAGEIRO");
            String nome = result.getString("DS_NOME");
            int idade = result.getInt("NR_IDADE");
            String cpf = result.getString("DS_CPF");
            String telefone = result.getString("DS_TELEFONE");
            String email = result.getString("DS_EMAIL");

            Passageiro passageiro = new Passageiro();
            passageiro.setIdPassageiro(id);
            passageiro.setCpf(cpf);
            passageiro.setIdade(idade);
            passageiro.setNome(nome);
            passageiro.setTelefone(telefone);
            passageiro.setSenha(senha);
            passageiro.setEmail(email);

            return passageiro;
        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos", "Erro de operação", JOptionPane.WARNING_MESSAGE);

            Passageiro p = new Passageiro();
            p.setIdPassageiro(0);
            return p;
        }
    } catch (SQLException err) {
        JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
        Passageiro p = new Passageiro();
        p.setIdPassageiro(0);
        return p;
    }
}


    public ArrayList<Passageiro> selecionarPassageiros() {
        ArrayList<Passageiro> passageiros = new ArrayList<>();

        String sql = "SELECT ID_PASSAGEIRO, DS_NOME, DS_EMAIL,NR_IDADE, DS_CPF, DS_TELEFONE,DS_SENHA FROM TB_PASSAGEIRO";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_PASSAGEIRO");
                String nome = resultSet.getString("DS_NOME");
                int idade = resultSet.getInt("NR_IDADE");
                String cpf = resultSet.getString("DS_CPF");
                String telefone = resultSet.getString("DS_TELEFONE");
                String senha = resultSet.getString("DS_SENHA");
                String email = resultSet.getString("DS_EMAIL");
                   
                Passageiro passageiro = new Passageiro();

                passageiro.setIdPassageiro(id);
                passageiro.setCpf(cpf);
                passageiro.setIdade(idade);
                passageiro.setNome(nome);
                passageiro.setTelefone(telefone);
                passageiro.setSenha(senha);
                passageiro.setEmail(email);
                passageiros.add(passageiro);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Passageiros! " + err.getMessage());
        }

        return passageiros;
    }
    
    public Passageiro selecionarUmPassageiro(int id) {
        String sql = "SELECT ID_PASSAGEIRO, DS_NOME, DS_EMAIL,NR_IDADE, DS_CPF, DS_TELEFONE,DS_SENHA FROM TB_PASSAGEIRO WHERE ID_PASSAGEIRO =" + id;

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
           
             
            int idPassageiro = resultSet.getInt("ID_PASSAGEIRO");
            String nome = resultSet.getString("DS_NOME");
            int idade = resultSet.getInt("NR_IDADE");
            String cpf = resultSet.getString("DS_CPF");
            String telefone = resultSet.getString("DS_TELEFONE");
            String senha = resultSet.getString("DS_SENHA");
            String email = resultSet.getString("DS_EMAIL");

            Passageiro passageiro = new Passageiro();

            passageiro.setIdPassageiro(idPassageiro);
            passageiro.setCpf(cpf);
            passageiro.setIdade(idade);
            passageiro.setNome(nome);
            passageiro.setTelefone(telefone);
            passageiro.setSenha(senha);
            passageiro.setEmail(email);

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            
        }

        return passageiro;
    }
    
    public void Excluir(int id) {
        String sql = "DELETE FROM TB_PASSAGEIRO WHERE ID_PASSAGEIRO = ?";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Passageiro! " + err.getMessage());
        }
    }

}
