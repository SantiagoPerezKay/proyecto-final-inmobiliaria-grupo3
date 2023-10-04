
package acceso_a_datos;

import inmobiliaria.entidades.Contrato;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ContratoData extends Conexion{
    
    public ContratoData() {
    }
    
    public void crearContrato(Contrato contrato){
        String sql = "INSERT INTO contrato(fecha_inicio,fecha_fin,estado,monto,id_inmueble,id_inquilino) VALUES(?,?,?,?,?,?)";
        
        try {

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setDate(1, (Date) contrato.getFechaInicio());
            ps.setDate(2, (Date) contrato.getFechaFin());
            ps.setBoolean(3, contrato.isEstado());
            ps.setDouble(4, contrato.getMonto());
            ps.setInt(5, contrato.getInmueble().getIdInmueble());
            ps.setInt(6, contrato.getInquilino().getIdInquilino());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "se creó correctamente el contrato de ID " + rs.getInt(1));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se crear correctamente el contrato." + "\n error:" + ex.getMessage());
        }
    }
    
    public void borrarContrato(int idcontrato) {

        String sql = "DELETE FROM contrato WHERE id_contrato=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idcontrato);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "se elimino correctamente el contrato ID: " + idcontrato);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo eliminar el contrato de ID " + idcontrato + "\n error:" + ex.getMessage());
        }
    }
    
    public void actualizarPropietario(Contrato contrato) {

        String sql = "UPDATE contrato SET fecha_inicio=?,fecha_fin=?,estado=?,monto=?,id_inmueble=?,id_inquilino=? WHERE id_contrato=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) contrato.getFechaInicio());
            ps.setDate(2, (Date) contrato.getFechaFin());
            ps.setBoolean(3, contrato.isEstado());
            ps.setDouble(4, contrato.getMonto());
            ps.setInt(5, contrato.getInmueble().getIdInmueble());
            ps.setInt(6, contrato.getInquilino().getIdInquilino());
            ps.setInt(7, contrato.getIdContrato());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "se actualizo correctamente el contrato ID: " + contrato);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo actualizar el contrato de ID " + contrato.getIdContrato() + "\n error:" + ex.getMessage());
        }
    }
    
    public ArrayList<Contrato> listarContratos() {
        
        ArrayList<Contrato>contratos=new ArrayList<>();

        
        String sql = "SELECT * FROM propietario";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Contrato contrato = new Contrato();
                
                contrato.setFechaInicio(rs.getDate("fecha_inicio"));
                contrato.setFechaInicio(rs.getDate("fecha_fin"));
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setInmueble(rs.getInmueble("domicilio"));
                contrato.setIdPropietario(rs.getInt("id_propietario"));
                
                contratos.add(propietario);
                
            }
            
            JOptionPane.showMessageDialog(null, "se actualizo la lista correctamente");
            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo listar los propietarios " + "\n error:" + ex.getMessage());
            return contratos;
        }

    }
}
