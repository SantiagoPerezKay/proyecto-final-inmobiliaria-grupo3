/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_a_datos;

import inmobiliaria.entidades.Inquilino;
import inmobiliaria.entidades.Propietario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InquilinoData extends Conexion {
    
    public InquilinoData() {
    }
    
    public void insertarInquilino(Inquilino inqui) {
        
        String sql = "INSERT INTO inquilino (cuit,nombre,apellido,lugar_trabajo,nombre_garante, dni_garante,estado) VALUES(?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, inqui.getCuit());
            ps.setString(2, inqui.getNombre());
            ps.setString(3, inqui.getApellido());
            ps.setString(4, inqui.getLugarTrabajo());
            ps.setString(5, inqui.getNombreGarante());
            ps.setString(6, inqui.getDniGarante());
            ps.setBoolean(7, inqui.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "se agrego correctamente un inquilino de ID " + rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo agregar el inquilino ");
        }
        
    }
    
    public void borrarInquilino(int idInquilino) {
        
        String sql = "DELETE FROM inquilino WHERE id_inquilino=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInquilino);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "se elimino correctamente al inquilino ID: " + idInquilino);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo eliminar al inquilino de ID " + idInquilino + "\n error:" + ex.getMessage());
        }
    }
    
    public void actualizarInquilino(Inquilino inqui) {
        
        String sql = "UPDATE inquilino SET cuit=?,nombre=?,apellido=?,lugar_trabajo=?,nombre_garante=?,dni_garante = ?,estado=? WHERE id_inquilino=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, inqui.getCuit());
            ps.setString(2, inqui.getNombre());
            ps.setString(3, inqui.getApellido());
            ps.setString(4, inqui.getLugarTrabajo());
            ps.setString(5, inqui.getNombreGarante());
            ps.setString(6, inqui.getDniGarante());
            ps.setBoolean(7, inqui.isEstado());
            ps.setInt(8, inqui.getIdInquilino());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "se actualizo correctamente el inquilino con ID: " + inqui);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo actualizar el inquilino con ID " + inqui.getIdInquilino() + "\n error:" + ex.getMessage());
        }
        
    }
    
    public Inquilino obtenerInquilinoPorId(int idInqui) {
        
        String sql = "SELECT * FROM inquilino WHERE id_inquilino=?";
        Inquilino inqui = new Inquilino();
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idInqui);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                inqui.setCuit(rs.getString("cuit"));
                inqui.setNombre(rs.getString("nombre"));
                inqui.setApellido(rs.getString("apellido"));
                inqui.setLugarTrabajo(rs.getString("lugar_trabajo"));
                inqui.setNombreGarante(rs.getString("nombre_garante"));
                inqui.setDniGarante("dni_garante");
                
            }
            
            JOptionPane.showMessageDialog(null, "se obtuvo al inquilino correctamente");
            return inqui;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo obtener el inquilino de ID " + idInqui + "\n error:" + ex.getMessage());
            return inqui;
        }
        
    }
    
    public Inquilino obtenerInquilinoPorCuit(String cuit) {
        
        String sql = "SELECT * FROM inquilino WHERE cuit=?";
        Inquilino inqui = new Inquilino();
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, cuit);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                inqui.setNombre(rs.getString("nombre"));
                inqui.setApellido(rs.getString("apellido"));
                inqui.setLugarTrabajo(rs.getString("lugar_trabajo"));
                inqui.setNombreGarante(rs.getString("nombre_garante"));
                inqui.setDniGarante(rs.getString("dni_garante"));
                inqui.setIdInquilino(rs.getInt("id_inquilino"));
                
            }
            
            JOptionPane.showMessageDialog(null, "se obtuvo al inquilino correctamente");
            return inqui;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo obtener el inquilino por el Cuit " + cuit + "\n error:" + ex.getMessage());
            return inqui;
        }
        
    }
    
    public ArrayList<Inquilino> listarInquilinos() {
        
        ArrayList<Inquilino> milista = new ArrayList<>();
        
        String sql = "SELECT * FROM inquilino";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Inquilino inqui = new Inquilino();
                
                inqui.setNombre(rs.getString("nombre"));
                inqui.setCuit(rs.getString("cuit"));
                inqui.setApellido(rs.getString("apellido"));
                inqui.setLugarTrabajo(rs.getString("lugar_trabajo"));
                inqui.setNombreGarante(rs.getString("nombre_garante"));
                inqui.setDniGarante(rs.getString("dni_garante"));
                inqui.setIdInquilino(rs.getInt("id_inquilino"));
                inqui.setEstado(rs.getBoolean("estado"));
                milista.add(inqui);
                
            }
            
            return milista;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo listar los inquilnos " + "\n error:" + ex.getMessage());
            return milista;
        }
        
    }
    
}
