package controller;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Passageiro;

public class passageiroDao extends conectarDao {
    private PreparedStatement ps;
    public passageiroDao() {
        super();
    }

    public void cadastrar(Passageiro obj) {
          sql = "INSERT INTO TB_PASSAGEIRO (DS_CPF, DS_NOME, DS_EMAIL, DS_TELEFONE, NR_IDADE, DS_SENHA) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);
            
            ps.setString(1, obj.getCpf());
            ps.setString(2, obj.getNome());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getTelefone());
            ps.setInt(5, obj.getIdade());
            ps.setString ( 6, obj.getSenha());
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Cadastro concluído com Sucesso!");
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
            ps.setString ( 6, obj.getSenha());
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Alteração feita com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar!" + err.getMessage());
        }
    }
    
    
    public ResultSet validarLogin (String login, String senha)   {
    
    sql = "SELECT * FROM TB_PASSAGEIRO WHERE ucase(DS_NOME) = ucase('"+login+"') and DS_SENHA= ucase('"+ senha +"')";
   
    try {
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery();
    } catch
            (SQLException err) {
        JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
        JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos", "Erro de operação", JOptionPane.WARNING_MESSAGE);

        return null; 
    }
}

}
