
package acceso_a_datos;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
   
    private String usuario = "root";
    private String password = "";
    private String url = "jdbc:mariadb://localhost:3306/Inmobiliaria";
    public Connection con;
    public Connection conMysql;

    public Conexion() {
        this.con = EstablecerConexion();
       // this.conMysql = EstablecerConexion2();
    }

    public Connection EstablecerConexion() {
        try {
           // Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
            return null;
        }
    }
    public void cerrarConexion() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión");
        }
    }
    
}
