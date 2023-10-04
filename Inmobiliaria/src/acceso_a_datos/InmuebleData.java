
package acceso_a_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Propietario;
import java.util.ArrayList;


public class InmuebleData extends Conexion {
    
    public InmuebleData() {
        
    }
    
    public void agregarInmueble(Inmueble inmueble) { 
        
        String sql = "INSERT INTO Inmueble (direccion, altura, tipo, superficie, precio, disponibilidad, id_propietario	) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getAltura());
            ps.setString(3, inmueble.getTipo());
            ps.setDouble(4, inmueble.getSuperficie());
            ps.setDouble(5, inmueble.getPrecio());
            ps.setBoolean(6, inmueble.isDisponibilidad());
            ps.setInt(7, inmueble.getPropietario().getIdPropietario());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "se agrego correctamente un inmueble de ID " + rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se agrego correctamente un inmueble ");
        }
    }
    
    public void eliminarInmueble(int idInmueble) {
        String sql = "DELETE FROM inmueble WHERE id_inmueble=?"; 
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInmueble);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "se elimino correctamente el inmueble ID: " + idInmueble);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo eliminar el inmueble de ID " + idInmueble + "\n error:" + ex.getMessage());
        }
    }
    
    public void actualizarInmueble(Inmueble inmueble) {

        String sql = "UPDATE inmueble SET direccion=?, altura=?, tipo=?, superficie=?, precio=?, disponibilidad=?, id_propietario=? WHERE id_inmueble=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getAltura());
            ps.setString(3, inmueble.getTipo());
            ps.setDouble(4, inmueble.getSuperficie());
            ps.setDouble(5, inmueble.getPrecio());
            ps.setBoolean(6, inmueble.isDisponibilidad());
            ps.setInt(7, inmueble.getPropietario().getIdPropietario());
            ps.setInt(8, inmueble.getIdInmueble());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "se actualizo correctamente el inmueble ID: " + inmueble);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo actualizar el inmueble de ID " + inmueble.getIdInmueble()+ "\n error:" + ex.getMessage());
        }

    }
    
    public Inmueble obtenerInmueblePorId(int idprop) {

        String sql = "SELECT * FROM inmueble WHERE id_inmueble=?";
        Inmueble inmueble = new Inmueble();
        
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idprop);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
                inmueble.setIdInmueble(rs.getInt("id_inmueble"));
                
            }

            JOptionPane.showMessageDialog(null, "se obtuvo el inmueble correctamente");
            return inmueble;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo obtener el inmueble de ID " + idprop + "\n error:" + ex.getMessage());
            return inmueble;
        }

    }
    
    public Inmueble obtenerInmueblePorDireccion(String direccion) {
        String sql = "SELECT * FROM Inmueble WHERE direccion=?";
        Inmueble inmueble = new Inmueble();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, direccion);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
                inmueble.setIdInmueble(rs.getInt("id_inmueble"));
                
            }

            JOptionPane.showMessageDialog(null, "Se obtuvo el inmueble correctamente");
            return inmueble;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener el inmueble con dirección " + direccion + "\nError: " + ex.getMessage());
            return inmueble;
        }
    }
    
    public ArrayList<Inmueble> listarInmuebles() {
    ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
    
    String sql = "SELECT * FROM Inmueble";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            
            //Inmueble inmueble = new Inmueble();
            Inmueble inmueble = new Inmueble();
            
            inmueble.setDireccion(rs.getString("direccion"));
            inmueble.setAltura(rs.getInt("altura"));
            inmueble.setTipo(rs.getString("tipo"));
            inmueble.setSuperficie(rs.getDouble("superficie"));
            inmueble.setPrecio(rs.getDouble("precio"));
            inmueble.setDisponibilidad(rs.getBoolean("disponibilidad"));
            inmueble.setIdInmueble(rs.getInt("id_inmueble"));
            
            listaInmuebles.add(inmueble);
        }

        JOptionPane.showMessageDialog(null, "Se Muestra la lista de inmuebles correctamente");
        return listaInmuebles;

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo listar los inmuebles" + "\nError: " + ex.getMessage());
        return listaInmuebles;
    }
}
    
}