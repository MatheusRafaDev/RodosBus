package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Passageiro;
import org.mindrot.jbcrypt.BCrypt;


public class passageiroDao extends conectarDao {

    private PreparedStatement ps;
    private Passageiro passageiro;

    public passageiroDao() {
        super();
    }


    public boolean Incluir(Passageiro obj) {

        String emailVerificacao = emailExiste(obj.getEmail());
        if (emailVerificacao != null) {
            JOptionPane.showMessageDialog(null, emailVerificacao);
            return false;
        }

        String nomeVerificacao = nomeExiste(obj.getNome());
        if (nomeVerificacao != null) {
            JOptionPane.showMessageDialog(null, nomeVerificacao);
            return false;
        }

        try {
            // Gerar o hash da senha usando SHA-256
            String hashedPassword = hashSenhaSHA256(obj.getSenha());

            sql = "INSERT INTO TB_PASSAGEIRO (DS_CPF, DS_NOME, DS_EMAIL, DS_TELEFONE, NR_IDADE, DS_SENHA, DS_NOME_COMPLETO) VALUES(?, ?, ?, ?, ?, ?, ?)";
            ps = mycon.prepareStatement(sql);

            ps.setString(1, obj.getCpf());
            ps.setString(2, obj.getNome());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getTelefone());
            ps.setInt(5, obj.getIdade());
            ps.setString(6, hashedPassword); // Armazenar o hash da senha no banco
            ps.setString(7, obj.getNomeCompleto());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Cadastro concluído com Sucesso!");
        } catch (SQLException | NoSuchAlgorithmException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!" + err.getMessage());
        }

        return true;
    }

    private String hashSenhaSHA256(String senha) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(senha.getBytes());

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public Passageiro validarLogin(String login, String senha) throws NoSuchAlgorithmException {
        String sql = "SELECT ID_PASSAGEIRO, DS_NOME, DS_EMAIL, NR_IDADE, DS_CPF, DS_TELEFONE, DS_SENHA, DS_NOME_COMPLETO "
                + "FROM TB_PASSAGEIRO WHERE ucase(DS_NOME) = ucase(?)";

        try (PreparedStatement ps = mycon.prepareStatement(sql)) {
            ps.setString(1, login);

            ResultSet result = ps.executeQuery();

            if (result.next()) {
                // Obtenha o hash da senha armazenada no banco de dados
                String hashedPassword = result.getString("DS_SENHA");
                
                String senha1 = hashSenhaSHA256(senha);
                   
                // Verifique a senha usando BCrypt
                if (senha1.equals(hashedPassword)) {
                    Passageiro passageiro = new Passageiro();
                    passageiro.setIdPassageiro(result.getInt("ID_PASSAGEIRO"));
                    passageiro.setCpf(result.getString("DS_CPF"));
                    passageiro.setIdade(result.getInt("NR_IDADE"));
                    passageiro.setNome(result.getString("DS_NOME"));
                    passageiro.setTelefone(result.getString("DS_TELEFONE"));
                    passageiro.setSenha(hashedPassword);  // Armazenar o hash da senha
                    passageiro.setEmail(result.getString("DS_EMAIL"));
                    passageiro.setNomeCompleto(result.getString("DS_NOME_COMPLETO"));

                    return passageiro;
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos", "Erro de operação", JOptionPane.WARNING_MESSAGE);

                    Passageiro p = new Passageiro();
                    p.setIdPassageiro(0);
                    return p;
                }
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

        String sql = "SELECT * FROM TB_PASSAGEIRO";

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {

                Passageiro passageiro = new Passageiro();

                passageiro.setIdPassageiro(resultSet.getInt("ID_PASSAGEIRO"));
                passageiro.setCpf(resultSet.getString("DS_CPF"));
                passageiro.setIdade(resultSet.getInt("NR_IDADE"));
                passageiro.setNome(resultSet.getString("DS_NOME"));
                passageiro.setNomeCompleto(resultSet.getString("DS_NOME_COMPLETO"));
                passageiro.setTelefone(resultSet.getString("DS_TELEFONE"));
                passageiro.setSenha(resultSet.getString("DS_SENHA"));
                passageiro.setEmail(resultSet.getString("DS_EMAIL"));
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
        String sql = "SELECT * FROM TB_PASSAGEIRO WHERE ID_PASSAGEIRO =" + id;

        Passageiro passageiro = null;

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                passageiro = new Passageiro();

                passageiro.setIdPassageiro(resultSet.getInt("ID_PASSAGEIRO"));
                passageiro.setNome(resultSet.getString("DS_NOME"));
                passageiro.setNomeCompleto(resultSet.getString("DS_NOME_COMPLETO"));     
                passageiro.setIdade(resultSet.getInt("NR_IDADE"));
                passageiro.setCpf(resultSet.getString("DS_CPF"));
                passageiro.setTelefone(resultSet.getString("DS_TELEFONE"));
                passageiro.setEmail(resultSet.getString("DS_EMAIL"));
                passageiro.setSenha(resultSet.getString("DS_SENHA"));

            } else {
                JOptionPane.showMessageDialog(null, "Passageiro not found for ID: " + id);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            err.printStackTrace();
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

    private String emailExiste(String email) {
        try (PreparedStatement ps = mycon.prepareStatement("SELECT COUNT(*) FROM TB_PASSAGEIRO WHERE DS_EMAIL = ?")) {
            ps.setString(1, email);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    if (count > 0) {
                        return "E-mail já cadastrado.";
                    }
                }
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar e-mail!" + err.getMessage());
        }

        return null;
    }

    private String nomeExiste(String nome) {
        try (PreparedStatement ps = mycon.prepareStatement("SELECT COUNT(*) FROM TB_PASSAGEIRO WHERE DS_NOME = ?")) {
            ps.setString(1, nome);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    if (count > 0) {
                        return "Nome já cadastrado.";
                    }
                }
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar nome!" + err.getMessage());
        }

        return null;
    }
    
    public Passageiro selecionarPassageiroPorEmail(String email) {
        String sql = "SELECT * FROM TB_PASSAGEIRO WHERE DS_EMAIL = ?";

        Passageiro passageiro = null;

        try {
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.setString(1, email); // Define o valor do parâmetro

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                passageiro = new Passageiro();

                passageiro.setIdPassageiro(resultSet.getInt("ID_PASSAGEIRO"));
                passageiro.setNome(resultSet.getString("DS_NOME"));
                passageiro.setNomeCompleto(resultSet.getString("DS_NOME_COMPLETO"));     
                passageiro.setIdade(resultSet.getInt("NR_IDADE"));
                passageiro.setCpf(resultSet.getString("DS_CPF"));
                passageiro.setTelefone(resultSet.getString("DS_TELEFONE"));
                passageiro.setEmail(resultSet.getString("DS_EMAIL"));
                passageiro.setSenha(resultSet.getString("DS_SENHA"));
            } else {
                JOptionPane.showMessageDialog(null, "Passageiro not found for email: " + email);
            }

            ps.close();
            resultSet.close();
        } catch (SQLException err) {
            err.printStackTrace();
        }

        return passageiro;
    }


    public boolean alterarCpf(Passageiro obj) {
        return alterarCampo("DS_CPF", obj.getCpf(), obj.getIdPassageiro());
    }

    public boolean alterarNome(Passageiro obj) {
        String nomeVerificacao = nomeExiste(obj.getNome());
        if (nomeVerificacao != null) {
            JOptionPane.showMessageDialog(null, nomeVerificacao);
            return false;
        }

        return alterarCampo("DS_NOME", obj.getNome(), obj.getIdPassageiro());
    }
    
    public boolean alterarNomeCompleto(Passageiro obj) {
        return alterarCampo("DS_NOME_COMPLETO", obj.getNomeCompleto(), obj.getIdPassageiro());
    }

    public boolean alterarEmail(Passageiro obj) {
        String emailVerificacao = emailExiste(obj.getEmail());
        if (emailVerificacao != null) {
            JOptionPane.showMessageDialog(null, emailVerificacao);
            return false;
        }
        return alterarCampo("DS_EMAIL", obj.getEmail(), obj.getIdPassageiro());
    }

    public boolean alterarTelefone(Passageiro obj) {
        return alterarCampo("DS_TELEFONE", obj.getTelefone(), obj.getIdPassageiro());
    }

    public boolean alterarIdade(Passageiro obj) {
        return alterarCampo("NR_IDADE", String.valueOf(obj.getIdade()), obj.getIdPassageiro());
    }

    public boolean alterarSenha(Passageiro obj) {
        try {
            String hashedPassword = hashSenhaSHA256(obj.getSenha());

            return alterarCampo("DS_SENHA", hashedPassword, obj.getIdPassageiro());
        } catch (NoSuchAlgorithmException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Senha!" + err.getMessage());
            return false;
        }
    }
    
    private boolean alterarCampo(String campo, String valor, int idPassageiro) {
        sql = "UPDATE TB_PASSAGEIRO SET " + campo + " = ? WHERE ID_PASSAGEIRO = " + idPassageiro;

        try {
            ps = mycon.prepareStatement(sql);
            ps.setString(1, valor);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Alteração feita com Sucesso!");
            return true;
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar! " + err.getMessage());
            return false;
        }
    }

}
