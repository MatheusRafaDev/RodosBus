package controller;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class usuarioDao extends conectarDao {

    String sql;
    PreparedStatement ps;

    public usuarioDao() {
        super();
    }


}
