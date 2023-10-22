package controller;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class usuarioDao extends conectarDao {

    public String sql;
    public PreparedStatement ps;

    public usuarioDao() {
        super();
    }

    public void criarTabela() {

        try {
            sql = "CREATE TABLE IF NOT EXISTS TB_ONIBUS ("
                    + "id_onibus INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_modelo VARCHAR(100),"
                    + "ds_placa VARCHAR(10),"
                    + "ds_ano_fabricacao YEAR,"
                    + "nr_capacidade INT(10)";
            ps = con.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_MOTORISTA ("
                    + "id_motorista INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_nome VARCHAR(100),"
                    + "nr_idade INT(3),"
                    + "ds_cpf VARCHAR(12),"
                    + "ds_telefone VARCHAR(20),"
                    + "PRIMARY KEY (ds_cpf)";
            ps = con.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_PASSAGEIRO ("
                    + "id_passageiro INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_nome VARCHAR(100) not null,"
                    + "nome varchar(50) not null,"
                    + "email varchar(50) not null,"
                    + "celular varchar(20) not null,"
                    + "idNivel int not null,"
                    + "ds_SENHA varchar(30),"
                    + "primary key (ds_CPF)";
            ps = con.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS TB_ROTA ("
                    + "id_rota INT(5) PRIMARY KEY AUTO_INCREMENT,"
                    + "ds_origem varchar(100),"
                    + "ds_destino VARCHAR(100),"
                    + "vl_distancia DECIMAL(10,2),"
                    + "ds_duracao VARCHAR(10),"
                    + "vl_preco DECIMAL(10,2)";
            ps = con.prepareStatement(sql);
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
                    + "FOREIGN KEY (id_rota) REFERENCES TB_ROTA(id_rota)";
            ps = con.prepareStatement(sql);
            ps.execute();
            
            ps.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage());
        }
    }
}
