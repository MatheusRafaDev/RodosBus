/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Timestamp;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class conectarDao {

    public Connection mycon = null;
    public String sql = null;

    public conectarDao() {

        String con = "jdbc:mysql://localhost:3306/RodoBus";

        try {
            mycon = DriverManager.getConnection(con, "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + ex);
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
                    + "nr_idade INT(3),"
                    + "ds_CPF VARCHAR(14),"
                    + "ds_TELEFONE VARCHAR(13),"
                    + "ds_email VARCHAR(100),"
                    + "ds_SENHA VARCHAR(30)"
                    + ");";
            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_ROTA ("
                    + "id_rota INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_origem VARCHAR(100),"
                    + "ds_destino VARCHAR(100),"
                    + "vl_distancia DECIMAL(10,2),"
                    + "ds_duracao VARCHAR(10),"
                    + "vl_preco DECIMAL(10,2),"
                    + "dt_saida DATETIME,"
                    + "dt_chegada DATETIME,"
                    + "id_motorista INT(5),"
                    + "FOREIGN KEY (id_motorista) REFERENCES TB_MOTORISTA(id_motorista)"
                    + ");";

            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_RESERVAS ("
                    + "id_reserva INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "id_rota INT(5) NOT NULL,"
                    + "id_onibus INT(5) NOT NULL,"
                    + "id_motorista INT(5) NOT NULL,"
                    + "id_passageiro INT(5) NOT NULL,"
                    + "dt_reserva DATETIME,"
                    + "ds_status VARCHAR(20),"
                    + "CONSTRAINT FOREIGN KEY (id_onibus) REFERENCES TB_ONIBUS(id_onibus),"
                    + "CONSTRAINT FOREIGN KEY (id_motorista) REFERENCES TB_MOTORISTA(id_motorista),"
                    + "CONSTRAINT FOREIGN KEY (id_passageiro) REFERENCES TB_PASSAGEIRO(id_passageiro),"
                    + "CONSTRAINT FOREIGN KEY (id_rota) REFERENCES TB_ROTA(id_rota)"
                    + ");";
            ps = mycon.prepareStatement(sql);
            ps.execute();
            inserirDados();
            ps.close();
            mycon.close();
            JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
        } catch (SQLException err) {
           
        }
    }

    public void inserirDados() {
        try {
            sql = "INSERT INTO TB_PASSAGEIRO (ds_nome, nr_idade, ds_CPF, ds_TELEFONE, ds_email, ds_SENHA) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement psPassageiro = mycon.prepareStatement(sql);
            psPassageiro.setString(1, "Alice Passageiro");
            psPassageiro.setInt(2, 25);
            psPassageiro.setString(3, "11122233344");
            psPassageiro.setString(4, "(11) 2223344");
            psPassageiro.setString(5, "alice@example.com");
            psPassageiro.setString(6, "pass123");
            psPassageiro.executeUpdate();

            psPassageiro.setString(1, "Bob Passageiro");
            psPassageiro.setInt(2, 30);
            psPassageiro.setString(3, "55566677788");
            psPassageiro.setString(4, "(55) 666-7788");
            psPassageiro.setString(5, "bob@example.com");
            psPassageiro.setString(6, "pass456");
            psPassageiro.executeUpdate();
            psPassageiro.close();

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

            sql = "INSERT INTO TB_ROTA (ds_origem, ds_destino, vl_distancia, ds_duracao, vl_preco, dt_saida, dt_chegada,id_motorista) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement psRota = mycon.prepareStatement(sql);
            psRota.setString(1, "Origem1");
            psRota.setString(2, "Destino1");
            psRota.setBigDecimal(3, new BigDecimal("100.50"));
            psRota.setString(4, "2 horas");
            psRota.setBigDecimal(5, new BigDecimal("50.00"));
            psRota.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));
            psRota.setTimestamp(7, Timestamp.valueOf(LocalDateTime.now().plusHours(2)));
            psRota.setInt(8, 1);
            psRota.executeUpdate();

            psRota.setString(1, "Origem2");
            psRota.setString(2, "Destino2");
            psRota.setBigDecimal(3, new BigDecimal("150.75"));
            psRota.setString(4, "3 horas");
            psRota.setBigDecimal(5, new BigDecimal("75.00"));
            psRota.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now().plusDays(1)));
            psRota.setTimestamp(7, Timestamp.valueOf(LocalDateTime.now().plusDays(1).plusHours(3)));
            psRota.setInt(8, 2);
            psRota.executeUpdate();
            psRota.close();

            sql = "INSERT INTO TB_ONIBUS (ds_modelo, ds_placa, ds_ano_fabricacao, nr_capacidade) VALUES (?, ?, ?, ?)";
            PreparedStatement psOnibus = mycon.prepareStatement(sql);
            psOnibus.setString(1, "Modelo3");
            psOnibus.setString(2, "GHI789");
            psOnibus.setInt(3, 2018);
            psOnibus.setInt(4, 35);
            psOnibus.executeUpdate();

            psOnibus.setString(1, "Modelo4");
            psOnibus.setString(2, "JKL012");
            psOnibus.setInt(3, 2017);
            psOnibus.setInt(4, 45);
            psOnibus.executeUpdate();
            psOnibus.close();

            sql = "INSERT INTO TB_RESERVAS (id_rota, id_onibus, id_motorista, id_passageiro, dt_reserva, ds_status) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement psReservas = mycon.prepareStatement(sql);
            psReservas.setInt(1, 1);
            psReservas.setInt(2, 1);
            psReservas.setInt(3, 1);
            psReservas.setInt(4, 1);
            psReservas.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
            psReservas.setString(6, "Reservado");
            psReservas.executeUpdate();

            psReservas.setInt(1, 2);
            psReservas.setInt(2, 2);
            psReservas.setInt(3, 2);
            psReservas.setInt(4, 2);
            psReservas.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
            psReservas.setString(6, "Reservado");
            psReservas.executeUpdate();
            psReservas.close();

            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso...");
        }  catch (SQLException err) {
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados " + err.getMessage());
        }
    }

}
