package controller;

import static functions.Geradores.gerarCodigoAleatorio;
import java.awt.List;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Passageiro;
import model.Reserva;

public class conectarDao {

    public String sql = null;
    public Connection mycon = null;

    public conectarDao() {
        fecharConexao();
        String con = "jdbc:mysql://localhost:3306/RodoBus";

        try {
            mycon = DriverManager.getConnection(con, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
        }
    }

    public void fecharConexao() {
        try {
            if (mycon != null && !mycon.isClosed()) {
                mycon.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\n" + ex);
        }
    }

    public void criarBanco() {
        try {
            sql = "CREATE TABLE IF NOT EXISTS TB_ONIBUS ("
                    + "id_onibus INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_modelo VARCHAR(100),"
                    + "ds_placa VARCHAR(10),"
                    + "ds_ano_fabricacao YEAR,"
                    + "nr_capacidade INT(10)"
                    + ");";
            PreparedStatement ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_MOTORISTA ("
                    + "id_motorista INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_nome VARCHAR(100),"
                    + "nr_idade INT(3),"
                    + "ds_cpf VARCHAR(12),"
                    + "ds_telefone VARCHAR(20)"
                    + ");";
            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_PASSAGEIRO ("
                    + "id_passageiro INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_nome VARCHAR(100),"
                    + "ds_nome_completo VARCHAR(100),"
                    + "nr_idade INT(3),"
                    + "ds_CPF VARCHAR(14),"
                    + "ds_TELEFONE VARCHAR(13),"
                    + "ds_email VARCHAR(100),"
                    + "ds_SENHA VARCHAR(300)"
                    + ");";
            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_ROTA ("
                    + "id_rota INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_origem VARCHAR(100),"
                    + "ds_destino VARCHAR(100),"
                    + "ds_duracao VARCHAR(100),"
                    + "vl_preco DECIMAL(10,2),"
                    + "dt_saida DATETIME,"
                    + "dt_chegada DATETIME,"
                    + "id_motorista INT(5),"
                    + "id_onibus INT(5),"
                    + "CONSTRAINT FOREIGN KEY (id_motorista) REFERENCES TB_MOTORISTA(id_motorista),"
                    + "CONSTRAINT FOREIGN KEY (id_onibus) REFERENCES TB_ONIBUS(id_onibus)"
                    + ");";

            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_ASSENTOS ("
                    + "id_assento INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "id_rota INT(5) NOT NULL,"
                    + "nr_numero_assento INT(3) NOT NULL,"
                    + "ds_status VARCHAR(20),"
                    + "CONSTRAINT FOREIGN KEY (id_rota) REFERENCES TB_ROTA(id_rota)"
                    + ");";
            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_RESERVAS ("
                    + "id_reserva INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "id_rota INT(5) NOT NULL,"
                    + "id_passageiro INT(5) NOT NULL,"
                    + "id_assento INT(5) NOT NULL,"
                    + "dt_reserva DATETIME,"
                    + "ds_status VARCHAR(20),"
                    + "vl_total DECIMAL(10,2),"
                    + "qtd_reserva INT(5) NOT NULL,"
                    + "ds_codigo VARCHAR(20),"
                    + "CONSTRAINT FOREIGN KEY (id_passageiro) REFERENCES TB_PASSAGEIRO(id_passageiro),"
                    + "CONSTRAINT FOREIGN KEY (id_rota) REFERENCES TB_ROTA(id_rota)"
                    + ");";
            ps = mycon.prepareStatement(sql);
            ps.execute();

            try {
                String contar = "SELECT CAST(COUNT(*) AS VARCHAR(30)) AS CONTAR FROM TB_PASSAGEIRO;";
                ps = mycon.prepareStatement(contar);
                ResultSet resultSet = ps.executeQuery();
                resultSet.next();

                int contador = Integer.parseInt(resultSet.getString("CONTAR"));

                if (contador == 0) {
                    inserirDados();
                }
            } catch (SQLException ex) {
                Logger.getLogger(conectarDao.class.getName()).log(Level.SEVERE, null, ex);
            }

            ps.close();
        } catch (SQLException err) {

        }
    }

    public void inserirDados() {

        try {
            
            passageiroDao dao = new passageiroDao();
            Passageiro passageiro1 = new Passageiro();
            passageiro1.setNome("Matheus");
            passageiro1.setIdade(25);
            passageiro1.setCpf("11122233344");
            passageiro1.setTelefone("(11) 2223344");
            passageiro1.setEmail("rafaelmatheus061@gmail.com");
            passageiro1.setSenha("1111");
            passageiro1.setNomeCompleto("Matheus Rafael");

            // Incluir o primeiro passageiro
            dao.Incluir(passageiro1);

            Passageiro passageiro2 = new Passageiro();
            passageiro2.setNome("Bob");
            passageiro2.setIdade(30);
            passageiro2.setCpf("55566677788");
            passageiro2.setTelefone("(55) 666-7788");
            passageiro2.setEmail("bob@example.com");
            passageiro2.setSenha("123");
            passageiro2.setNomeCompleto("Matheus Bob");

            // Incluir o segundo passageiro
            dao.Incluir(passageiro2);


            sql = "INSERT INTO TB_MOTORISTA (ds_nome, nr_idade, ds_cpf, ds_telefone) VALUES (?, ?, ?, ?)";
            PreparedStatement psMotorista = mycon.prepareStatement(sql);
            psMotorista.setString(1, "Carlos Motorista");
            psMotorista.setInt(2, 28);
            psMotorista.setString(3, "45678901234");
            psMotorista.setString(4, "(46) 789-0123");
            psMotorista.executeUpdate();

            psMotorista.setString(1, "Daniela Motorista");
            psMotorista.setInt(2, 32);
            psMotorista.setString(3, "78901234567");
            psMotorista.setString(4, "(78) 012-3456");
            psMotorista.executeUpdate();
            psMotorista.close();

            sql = "INSERT INTO TB_ONIBUS (ds_modelo, ds_placa, ds_ano_fabricacao, nr_capacidade) VALUES (?, ?, ?, ?)";
            PreparedStatement psOnibus = mycon.prepareStatement(sql);
            psOnibus.setString(1, "Scania 344");
            psOnibus.setString(2, "GHI789");
            psOnibus.setInt(3, 2018);
            psOnibus.setInt(4, 35);
            psOnibus.executeUpdate();

            psOnibus.setString(1, "Mercedes R23");
            psOnibus.setString(2, "JKL012");
            psOnibus.setInt(3, 2017);
            psOnibus.setInt(4, 45);
            psOnibus.executeUpdate();
            psOnibus.close();

            String sql = "INSERT INTO TB_ROTA (ds_origem, ds_destino, ds_duracao, vl_preco, dt_saida, dt_chegada, id_motorista, id_onibus) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psRota = mycon.prepareStatement(sql);

            psRota.setString(1, "São Paulo");
            psRota.setString(2, "Rio de Janeiro");
            psRota.setString(3, "2 Horas");
            psRota.setBigDecimal(4, new BigDecimal("50.00"));
            psRota.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
            psRota.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now().plusHours(2)));
            psRota.setInt(7, 1);
            psRota.setInt(8, 1);
            psRota.executeUpdate();

            psRota.setString(1, "Curitiba");
            psRota.setString(2, "Santos");
            psRota.setString(3, "2 Horas");
            psRota.setBigDecimal(4, new BigDecimal("75.00"));
            psRota.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now().plusDays(1)));
            psRota.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now().plusDays(1).plusHours(3)));
            psRota.setInt(7, 2);
            psRota.setInt(8, 2);
            psRota.executeUpdate();

            psRota.close();

            String insertAssentosSql = "INSERT INTO TB_ASSENTOS (ID_ROTA, NR_NUMERO_ASSENTO, DS_STATUS) VALUES (?, ?, ?)";
            PreparedStatement psAssentos = mycon.prepareStatement(insertAssentosSql);

            psAssentos.setInt(1, 1);
            psAssentos.setInt(2, 1);
            psAssentos.setString(3, "Indisponivel");
            psAssentos.executeUpdate();

            psAssentos.setInt(1, 1);
            psAssentos.setInt(2, 2);
            psAssentos.setString(3, "Indisponivel");
            psAssentos.executeUpdate();

            psAssentos.setInt(1, 2);
            psAssentos.setInt(2, 1);
            psAssentos.setString(3, "Indisponivel");
            psAssentos.executeUpdate();

            psAssentos.setInt(1, 2);
            psAssentos.setInt(2, 2);
            psAssentos.setString(3, "Indisponivel");
            psAssentos.executeUpdate();

            psAssentos.close();

            sql = "INSERT INTO TB_RESERVAS (id_rota, id_passageiro, dt_reserva, ds_status, vl_total,id_assento,qtd_reserva,ds_codigo) VALUES (?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement psReservas = mycon.prepareStatement(sql);
            psReservas.setInt(1, 1);
            psReservas.setInt(2, 1);
            psReservas.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psReservas.setString(4, "Reservado");
            psReservas.setBigDecimal(5, new BigDecimal("50.00"));
            psReservas.setInt(6, 1);
            psReservas.setInt(7, 1);
            psReservas.setString(8, gerarCodigoAleatorio(8));
            psReservas.executeUpdate();

            psReservas.setInt(1, 2);
            psReservas.setInt(2, 2);
            psReservas.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psReservas.setString(4, "Reservado");
            psReservas.setBigDecimal(5, new BigDecimal("75.00"));
            psReservas.setInt(6, 1);
            psReservas.setInt(7, 1);
            psReservas.setString(8, gerarCodigoAleatorio(8));
            psReservas.executeUpdate();
            psReservas.close();

            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso...");
        } catch (SQLException err) {
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados " + err.getMessage());
        }
    }

}
