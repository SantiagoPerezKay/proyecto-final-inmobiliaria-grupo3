package acceso_a_datos;

import inmobiliaria.entidades.Contrato;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Inquilino;

import java.sql.Date;
import java.time.LocalDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ContratoData extends Conexion {

    private Inmueble inmueble;
    private Inquilino inquilino;

    public ContratoData(Inmueble inmueble, Inquilino inquilino) {
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }

    public ContratoData() {
    }

    public void crearContrato(Contrato contrato) {
        String sql = "INSERT INTO contrato(fecha_inicio,fecha_fin,estado,monto,id_inmueble,id_inquilino) VALUES(?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(2, Date.valueOf(contrato.getFechaFin()));
            ps.setBoolean(3, contrato.isEstado());
            ps.setDouble(4, contrato.getMonto());
            ps.setInt(5, contrato.getInmueble().getIdInmueble());
            ps.setInt(6, contrato.getInquilino().getIdInquilino());

            InmuebleData inmData = new InmuebleData();
            int id = contrato.getInmueble().getIdInmueble();
            inmData.obtenerInmueblePorId(id);
            inmData.actualizarDisponibilidadInmueble(id, 1);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "se creó correctamente el contrato de ID " + rs.getInt(1));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al crear el contrato." + "\n error:" + ex.getMessage());
        }
    }

    public void borrarContrato(int idcontrato) {

        String sql = "UPDATE contrato SET estado=0 WHERE id_contrato=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idcontrato);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "se elimino correctamente el contrato ID: " + idcontrato);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo eliminar el contrato de ID " + idcontrato + "\n error:" + ex.getMessage());
        }
    }

    public void actualizarContrato(Contrato contrato) {

        String sql = "UPDATE contrato SET fecha_inicio=?,fecha_fin=?,estado=?,monto=?,id_inmueble=?,id_inquilino=? WHERE id_contrato=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            PreparedStatement setLocalDate;
            ps.setDate(1, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(2, Date.valueOf(contrato.getFechaFin()));
            ps.setBoolean(3, contrato.isEstado());
            ps.setDouble(4, contrato.getMonto());
            ps.setInt(5, contrato.getIdimb());
            ps.setInt(6, contrato.getIdinq());
            ps.setInt(7, contrato.getIdContrato());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "se actualizo correctamente el contrato ID " + contrato.getIdContrato());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo actualizar el contrato ID: " + contrato.getIdContrato() + "\n error:" + ex.getMessage());
        }
    }

    public ArrayList<Contrato> listarContratos() {

        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato";

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }
            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public ArrayList<Contrato> listarContratosX(String x, int id) {

        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE id_" + x + "=" + id;

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }
            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public ArrayList<Contrato> listarContratosXfecha(LocalDate x, LocalDate y) {

        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE fecha_inicio > '" + x + "' AND fecha_fin < '" + y + "'";

        System.out.println(sql);

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }

            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public ArrayList<Contrato> listarContratosXfechaANDid(LocalDate x, LocalDate y, String z, int id) {

        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE fecha_inicio > '" + x + "' AND fecha_fin < '" + y + "' AND id_" + z + "=" + id;

        System.out.println(sql);

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }

            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public ArrayList<Contrato> listarContratosXmonto(double x, double y) {
        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE monto > '" + x + "' AND monto < '" + y + "'";

        System.out.println(sql);

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }

            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public ArrayList<Contrato> listarContratosXmontoANDid(double x, double y, String z, int id) {
        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE monto > '" + x + "' AND monto < '" + y + "' AND id_" + z + "=" + id;

        System.out.println(sql);

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }

            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public ArrayList<Contrato> listarContratosXfiltros(LocalDate a, LocalDate b, double c, double d) {
        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE (fecha_inicio > '" + a + "' AND fecha_fin < '" + b + "') AND(monto > '" + c + "' AND monto < '" + d + "')";

        System.out.println(sql);

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }

            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public ArrayList<Contrato> listarContratosXfiltrosANDid(LocalDate a, LocalDate b, double c, double d, String z, int id) {
        ArrayList<Contrato> contratos = new ArrayList<>();

        String sql = "SELECT * FROM contrato WHERE (fecha_inicio > '" + a + "' AND fecha_fin < '" + b + "') AND(monto > '" + c + "' AND monto < '" + d + "') AND id_" + z + "=" + id;

        System.out.println(sql);

        try {

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());

                contratos.add(contrato);
            }

            return contratos;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudieron listar los contratos " + "\n error:" + ex.getMessage());
            return contratos;
        }
    }

    public Contrato buscarContrato(int id) {

        String sql = "SELECT * FROM contrato WHERE id_contrato=?";
        Contrato contrato = new Contrato();

        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaInicio(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));
                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));

                JOptionPane.showMessageDialog(null, "busqueda exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar contrato");

                ps.close();
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de contratos");
        }

        return contrato;

    }

    public Inmueble buscarInmueble(int id) {

        String sql = "SELECT * FROM inmueble WHERE id_inmueble=?";
        Inmueble inmueble = new Inmueble();

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inmueble.setIdInmueble(rs.getInt("id_inmueble"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setDisponibilidad(rs.getString("disponibilidad"));
            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar inmueble");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inmuebles" + ex.getMessage());
        }
        return inmueble;
    }

    public Inquilino buscarInquilino(int id) {

        String sql = "SELECT * FROM inquilino WHERE id_inquilino=?";
        Inquilino inqui = new Inquilino();

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                inqui.setCuit(rs.getString("cuit"));
                inqui.setNombre(rs.getString("nombre"));
                inqui.setApellido(rs.getString("apellido"));
                inqui.setLugarTrabajo(rs.getString("lugar_trabajo"));
                inqui.setNombreGarante(rs.getString("nombre_garante"));
                inqui.setDniGarante("dni_garante");

                inqui.setIdInquilino(rs.getInt("id_inquilino"));

            } else {
                JOptionPane.showMessageDialog(null, "Error al buscar inquilino");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inquilinos" + ex.getMessage());
        }
        return inqui;
    }

    public ArrayList<Contrato> ordenarX(String x, int act) {
        ArrayList<Contrato> contratos = new ArrayList<>();

        switch (x) {
            case "Id":
                x = "id_contrato";
                break;
            case "Fecha inicio":
                x = "fecha_inicio";
                break;
            case "Fecha fin":
                x = "fecha_fin";
                break;
            case "Monto":
                x = "monto";
                break;
        }
        try {
            if (act == 1 || act == 0) {
                String sql = "SELECT * FROM contrato WHERE estado =" + act + " ORDER BY lower(" + x + ") ASC";

                Statement ps = con.createStatement();

                ResultSet rs = ps.executeQuery(sql);

                while (rs.next()) {
                    Contrato contrato = new Contrato();

                    Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                    Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                    contrato.setIdContrato(rs.getInt("id_contrato"));
                    contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                    contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                    contrato.setMonto(rs.getInt("monto"));
                    contrato.setEstado(rs.getBoolean("estado"));
                    contrato.setIdimb(imb.getIdInmueble());
                    contrato.setIdinq(inq.getIdInquilino());
                    contratos.add(contrato);
                }

                ps.close();
            } else {
                String sql = "SELECT * FROM contrato ORDER BY lower(" + x + ") ASC";

                Statement ps = con.createStatement();

                ResultSet rs = ps.executeQuery(sql);

                while (rs.next()) {
                    Contrato contrato = new Contrato();

                    Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                    Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                    contrato.setIdContrato(rs.getInt("id_contrato"));
                    contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                    contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                    contrato.setMonto(rs.getInt("monto"));
                    contrato.setEstado(rs.getBoolean("estado"));
                    contrato.setIdimb(imb.getIdInmueble());
                    contrato.setIdinq(inq.getIdInquilino());
                    contratos.add(contrato);
                }

                ps.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error" + e.getMessage());
        }
        return contratos;
    }
    public ArrayList<Contrato> ordenarX(String x) {
    ArrayList<Contrato> contratos = new ArrayList<>();

    switch (x) {
        case "Id":
            x = "id_contrato";
            break;
        case "Fecha inicio":
            x = "fecha_inicio";
            break;
        case "Fecha fin":
            x = "fecha_fin";
            break;
        case "Monto":
            x = "monto";
            break;
    }

    try {
        String sql = "SELECT * FROM contrato ORDER BY lower(" + x + ") ASC";

        Statement ps = con.createStatement();
        ResultSet rs = ps.executeQuery(sql);

        while (rs.next()) {
            Contrato contrato = new Contrato();

            Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
            Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

            contrato.setIdContrato(rs.getInt("id_contrato"));
            contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
            contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            contrato.setMonto(rs.getInt("monto"));
            contrato.setEstado(rs.getBoolean("estado"));
            contrato.setIdimb(imb.getIdInmueble());
            contrato.setIdinq(inq.getIdInquilino());
            contratos.add(contrato);
        }

        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "ocurrio un error" + e.getMessage());
    }
    return contratos;
}

    public ArrayList<Contrato> MostrarEstado(String x) {
        ArrayList<Contrato> contratos = new ArrayList<>();
        switch (x) {
            case "Activo":
                x = "1";
                break;
            case "Inactivo":
                x = "0";
                break;
        }
        try {

            String sql = "SELECT * FROM contrato WHERE estado=" + x + "";

            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                Contrato contrato = new Contrato();

                Inquilino inq = buscarInquilino(rs.getInt("id_inquilino"));
                Inmueble imb = buscarInmueble(rs.getInt("id_inmueble"));

                contrato.setIdContrato(rs.getInt("id_contrato"));
                contrato.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                contrato.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                contrato.setMonto(rs.getInt("monto"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setIdimb(imb.getIdInmueble());
                contrato.setIdinq(inq.getIdInquilino());
                contratos.add(contrato);
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error: " + e.getMessage());
        }
        return contratos;
    }
}
