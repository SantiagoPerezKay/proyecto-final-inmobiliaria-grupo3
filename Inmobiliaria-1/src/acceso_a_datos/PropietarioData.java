package acceso_a_datos;

import inmobiliaria.entidades.Propietario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PropietarioData extends Conexion {

    public PropietarioData() {
    }

    public void insertarPropietario(Propietario propietario) {

        String sql = "INSERT INTO propietario(nombre,apellido,dni,telefono,domicilio,estado) VALUES(?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, propietario.getNombre());
            ps.setString(2, propietario.getApellido());
            ps.setString(3, propietario.getDni());
            ps.setString(4, propietario.getTelefono());
            ps.setString(5, propietario.getDomicilio());
            ps.setBoolean(6, propietario.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "se agrego correctamente un propietario de ID " + rs.getInt(1));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se agrego correctamente un propietario ");
        }

    }

    public void borrarPropietarioLogico(int idpropietario) {

        String sql = "UPDATE propietario SET  estado=0  WHERE id_propietario=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idpropietario);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "se cambio el estado a falso propietario ID: " + idpropietario);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo eliminar el propietario de ID " + idpropietario + "\n error:" + ex.getMessage());
        }
    }

    public void borrarPropietarioFisico(int idpropietario) {

        String sql = "DELETE FROM propietario WHERE id_propietario=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idpropietario);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "se elimino correctamente a propietario ID: " + idpropietario);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo eliminar el propietario de ID " + idpropietario + "\n error:" + ex.getMessage());
        }
    }

    public void actualizarPropietario(Propietario propietario) {

        String sql = "UPDATE propietario SET nombre=?,apellido=?,telefono=?,dni=?,domicilio=?,estado=? WHERE id_propietario=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, propietario.getNombre());
            ps.setString(2, propietario.getApellido());
            ps.setString(3, propietario.getTelefono());
            ps.setString(4, propietario.getDni());
            ps.setString(5, propietario.getDomicilio());
            ps.setBoolean(6, propietario.isEstado());
            ps.setInt(7, propietario.getIdPropietario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "se actualizo correctamente a propietario ID: " + propietario);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo actualizar el propietario de ID " + propietario.getIdPropietario() + "\n error:" + ex.getMessage());
        }

    }

    public Propietario obtenerPropietarioPorId(int idprop) {

        String sql = "SELECT * FROM propietario WHERE id_propietario=?";
        Propietario propietario = new Propietario();
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idprop);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setDni(rs.getString("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setIdPropietario(rs.getInt("id_propietario"));
                propietario.setEstado(rs.getBoolean("estado"));
            }

            
            return propietario;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo obtener el propietario de ID " + idprop + "\n error:" + ex.getMessage());
            return propietario;
        }

    }

    public Propietario obtenerPropietarioPorDni(String dni) {

        String sql = "SELECT * FROM propietario WHERE dni=?";
        Propietario propietario = new Propietario();
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setDni(rs.getString("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setIdPropietario(rs.getInt("id_propietario"));
                propietario.setEstado(rs.getBoolean("estado"));
            }

            JOptionPane.showMessageDialog(null, "se obtuvo al propietario correctamente");
            return propietario;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo obtener el propietario de DNI " + dni + "\n error:" + ex.getMessage());
            return propietario;
        }

    }

    public ArrayList<Propietario> listarPropietarios() {

        ArrayList<Propietario> milista = new ArrayList<>();

        String sql = "SELECT * FROM propietario";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Propietario propietario = new Propietario();

                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setDni(rs.getString("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setEstado(rs.getBoolean("estado"));
                propietario.setIdPropietario(rs.getInt("id_propietario"));

                milista.add(propietario);

            }

            return milista;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo listar los propietarios " + "\n error:" + ex.getMessage());
            return milista;
        }

    }

  public ArrayList<Propietario> ordenarX(String x, int act) {
    ArrayList<Propietario> propietarios = new ArrayList<>();

    switch (x) {
        case "Id":
            x = "id_propietario";
            break;
        case "Nombre":
            x = "nombre";
            break;
        case "Apellido":
            x = "apellido";
            break;
        case "Telefono":
            x = "telefono";
            break;
        case "Dni":
            x = "dni";
            break;
        case "Direccion":
            x = "direccion";
            break;
    }

    try {
        if (act == 1 || act == 0) {
            String sql = "SELECT * FROM propietario WHERE estado = " + act + " ORDER BY " + x + " ASC";

            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                Propietario propietario = new Propietario();

                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setDni(rs.getString("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setEstado(rs.getBoolean("estado"));
                propietario.setIdPropietario(rs.getInt("id_propietario"));

                propietarios.add(propietario);
            }

            ps.close();
        } else {
            String sql = "SELECT * FROM propietario ORDER BY " + x + " ASC";

            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                Propietario propietario = new Propietario();

                propietario.setNombre(rs.getString("nombre"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setDni(rs.getString("dni"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setEstado(rs.getBoolean("estado"));
                propietario.setIdPropietario(rs.getInt("id_propietario"));

                propietarios.add(propietario);
            }

            ps.close();
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
    }
    return propietarios;
}

    public ArrayList<Propietario> ordenarX(String x) {
    ArrayList<Propietario> Propietarios = new ArrayList<>();

    switch (x) {
        case "Id":
            x = "id_propietario";
            break;
        case "Nombre":
            x = "nombre";
            break;
        case "Apellido":
            x = "apellido";
            break;
        case "Telefono":
            x = "telefono";
            break;
        case "Dni":
            x = "dni";
            break;
        case "Direccion":
            x = "direccion";
            break;
    }

    try {
        String sql = "SELECT * FROM propietario ORDER BY lower(" + x + ") ASC";

        Statement ps = con.createStatement();

        ResultSet rs = ps.executeQuery(sql);

        while (rs.next()) {
            Propietario propietario = new Propietario();

            propietario.setNombre(rs.getString("nombre"));
            propietario.setApellido(rs.getString("apellido"));
            propietario.setTelefono(rs.getString("telefono"));
            propietario.setDni(rs.getString("dni"));
            propietario.setDomicilio(rs.getString("domicilio"));
            propietario.setEstado(rs.getBoolean("estado"));
            propietario.setIdPropietario(rs.getInt("id_propietario"));

            Propietarios.add(propietario);
        }

        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
    }
    return Propietarios;
}
    
    public  ArrayList<Propietario> MostrarEstado(String x) {
         ArrayList<Propietario> Propietarios = new ArrayList<>();
        switch (x){
            case "Activo": x= "1"; break;
            case "Inactivo": x="0"; break;
        }
        try {

            String sql = "SELECT * FROM propietario WHERE estado="+x+"";

            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(sql);
            
            while (rs.next()) {
                Propietario propietario = new Propietario();

                    propietario.setNombre(rs.getString("nombre"));
                    propietario.setApellido(rs.getString("apellido"));
                    propietario.setTelefono(rs.getString("telefono"));
                    propietario.setDni(rs.getString("dni"));
                    propietario.setDomicilio(rs.getString("domicilio"));
                    propietario.setEstado(rs.getBoolean("estado"));
                    propietario.setIdPropietario(rs.getInt("id_propietario"));

                    Propietarios.add(propietario);  
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error: " + e.getMessage());
        }
        return Propietarios;
    }

}
