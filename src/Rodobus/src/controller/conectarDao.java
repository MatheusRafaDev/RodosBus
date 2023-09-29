package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectarDao {

    Connection con;

    public conectarDao() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjCad", "root", "");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão com oMySQL ...\n" + err.getMessage());
        }
    }
}