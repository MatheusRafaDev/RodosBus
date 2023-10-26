/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class conectarDao {

    public  Connection mycon = null;
    public String       sql = null;

    public conectarDao () {
        String con = "jdbc:mysql://localhost:3306/RodoBus";
        
        try {
            mycon = DriverManager.getConnection(con, "root", "");
            this.criarBanco();
            
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

                sql = "CREATE TABLE TB_MOTORISTA ("
                    + "id_motorista INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_nome VARCHAR(100),"
                    + "nr_idade INT(3),"
                    + "ds_cpf VARCHAR(12),"
                    + "ds_telefone VARCHAR(20)"
                    + ");";
                ps = mycon.prepareStatement(sql);
                ps.execute();

                sql = "CREATE TABLE TB_PASSAGEIRO ("
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
                        + "ds_origem varchar(100),"
                        + "ds_destino VARCHAR(100),"
                        + "vl_distancia DECIMAL(10,2),"
                        + "ds_duracao VARCHAR(10),"
                        + "vl_preco DECIMAL(10,2)"
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
                        + "FOREIGN KEY (id_onibus) REFERENCES TB_ONIBUS(id_onibus),"
                        + "FOREIGN KEY (id_motorista) REFERENCES TB_MOTORISTA(id_motorista),"
                        + "FOREIGN KEY (id_passageiro) REFERENCES TB_PASSAGEIRO(id_passageiro),"
                        + "FOREIGN KEY (id_rota) REFERENCES TB_ROTA(id_rota)"
                        + ");";
                ps = mycon.prepareStatement(sql);
                ps.execute();
                ps.close();
                mycon.close();
                JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage());
            }
        }
}


