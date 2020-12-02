package punto.de.venta;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Rey Figuritas
 */
public class DBConexion {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    //private static String PASSWORD = "Tuerto.21";
    //la de abajo es mi contraseña, solo descomentas tu contraseña para correrlo tu
    private static String PASSWORD = "password1";
    private static String URL = "jdbc:mysql://localhost:3306/testpuntoventa";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException E) {
            JOptionPane.showMessageDialog(null, "Error en el Driver" + E);
        }

    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa ");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Denegada " + e);
        }
        return con;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
