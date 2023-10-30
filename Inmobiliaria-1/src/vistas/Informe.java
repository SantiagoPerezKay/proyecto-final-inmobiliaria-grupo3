package vistas;

import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import acceso_a_datos.PropietarioData;

import javax.swing.table.DefaultTableModel;
import inmobiliaria.entidades.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Informe extends javax.swing.JInternalFrame {

    DefaultTableModel modeloC = new DefaultTableModel();
    DefaultTableModel modeloInq = new DefaultTableModel();
    DefaultTableModel modeloInm = new DefaultTableModel();
    DefaultTableModel modeloP = new DefaultTableModel();

    ContratoData contratodata = new ContratoData();
    InmuebleData Inmuebledata = new InmuebleData();
    PropietarioData propietariodata = new PropietarioData();
    InquilinoData Inquilinodata = new InquilinoData();

    public Informe() {
        initComponents();
        cargarCabeceraP();
        cargarCabeceraInm();
        cargarCabeceraInq();
        cargarCabeceraC();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcopcion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtinforme = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbimprimir = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jcordenar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jco = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1060, 660));
        setMinimumSize(new java.awt.Dimension(1060, 660));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1060, 660));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1060, 660));
        jPanel1.setMinimumSize(new java.awt.Dimension(1060, 660));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcopcion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jcopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "contrato", "propietario", "inquilino", "inmueble" }));
        jcopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcopcionActionPerformed(evt);
            }
        });
        jPanel1.add(jcopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 270, 30));

        jtinforme.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtinforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtinforme);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 570, 200));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("FILTRAR POR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jbimprimir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jbimprimir.setForeground(new java.awt.Color(51, 51, 51));
        jbimprimir.setText("IMPRIMIR PDF");
        jbimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbimprimirActionPerformed(evt);
            }
        });
        jPanel1.add(jbimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 310, 40));

        jbsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(51, 51, 51));
        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 130, 40));

        jcordenar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jcordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcordenarActionPerformed(evt);
            }
        });
        jPanel1.add(jcordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/LABEL INFORME.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(576, 1280));
        jLabel3.setMinimumSize(new java.awt.Dimension(576, 1280));
        jLabel3.setPreferredSize(new java.awt.Dimension(576, 1280));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 490, 660));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ORDENAR POR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jPanel1.add(jco, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -20, 680, 650));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1058, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcopcionActionPerformed
        eleccionModelo((String) jcopcion.getSelectedItem());


    }//GEN-LAST:event_jcopcionActionPerformed

    private void jbimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbimprimirActionPerformed
        CrearPdf crearpdf = new CrearPdf();
        String opcion = (String) jcopcion.getSelectedItem();
        switch (opcion) {
            case "propietario":
                crearpdf.crearPdfconTablaProp(jtinforme);
                break;
            case "inmueble":
                crearpdf.crearPdfconTablaInm(jtinforme);
                break;
            case "inquilino":
                crearpdf.crearPdfconTablaInq(jtinforme);
                break;
            case "contrato":
                crearpdf.crearPdfconTablaCont(jtinforme);
                break;
        }
    }//GEN-LAST:event_jbimprimirActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jcordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcordenarActionPerformed
        String op = (String) jcopcion.getSelectedItem();
       

        if (op.equals("propietario")) {
            ordenarTablaP();
        }else if (op.equals("contrato")) {
            ordenarTablaC();
            
        }else if (op.equals("inmueble")) {
            //TO DO
        }else{
            //TO DO
        }
    }//GEN-LAST:event_jcordenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbimprimir;
    private javax.swing.JButton jbsalir;
    private javax.swing.JLabel jco;
    private javax.swing.JComboBox<String> jcopcion;
    private javax.swing.JComboBox<Object> jcordenar;
    private javax.swing.JTable jtinforme;
    // End of variables declaration//GEN-END:variables

    public void cargarCabeceraC() {
        JTableHeader headerimn = jtinforme.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));

        modeloC.addColumn("id_contrato");
        modeloC.addColumn("fecha_inicio");
        modeloC.addColumn("fecha_fin");
        modeloC.addColumn("estado");
        modeloC.addColumn("monto");
        modeloC.addColumn("id_inmueble");
        modeloC.addColumn("id_inquilino");
        jtinforme.setModel(modeloC);
    }

    public void cargarCabeceraP() {
        JTableHeader headerimn = jtinforme.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));

        modeloP.addColumn("id_propietario");
        modeloP.addColumn("nombre");
        modeloP.addColumn("apellido");
        modeloP.addColumn("telefono");
        modeloP.addColumn("dni");
        modeloP.addColumn("domicilio");
        modeloP.addColumn("estado");
        jtinforme.setModel(modeloP);
    }

    public void cargarCabeceraInq() {
        JTableHeader headerimn = jtinforme.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));

        modeloInq.addColumn("id_inquilino");
        modeloInq.addColumn("cuit");
        modeloInq.addColumn("nombre");
        modeloInq.addColumn("apellido");
        modeloInq.addColumn("lugar_trabajo");
        modeloInq.addColumn("nombre_garante");
        modeloInq.addColumn("dni_garante");
        modeloInq.addColumn("estado");
        jtinforme.setModel(modeloInq);
    }

    public void cargarCabeceraInm() {
        JTableHeader headerimn = jtinforme.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));

        modeloInm.addColumn("idinmueble");
        modeloInm.addColumn("direccion");
        modeloInm.addColumn("altura");
        modeloInm.addColumn("tipo");
        modeloInm.addColumn("sup");
        modeloInm.addColumn("precio");
        modeloInm.addColumn("disponibilidad");
        modeloInm.addColumn("nombreProp");

        jtinforme.setModel(modeloInm);
    }

    public void cargarComboC() {
        jcordenar.addItem("id_contrato");
        jcordenar.addItem("fecha_inicio");
        jcordenar.addItem("fecha_fin");
        jcordenar.addItem("estado");
        jcordenar.addItem("monto");
        jcordenar.addItem("id_inmueble");
        jcordenar.addItem("id_inquilino");
    }

    public void cargarComboP() {

        jcordenar.addItem("id_propietario");
        jcordenar.addItem("nombre");
        jcordenar.addItem("apellido");
        jcordenar.addItem("telefono");
        jcordenar.addItem("dni");
        jcordenar.addItem("domicilio");
        jcordenar.addItem("estado");
    }

    public void cargarComboInq() {
        jcordenar.addItem("id_inquilino");
        jcordenar.addItem("cuit");
        jcordenar.addItem("nombre");
        jcordenar.addItem("apellido");
        jcordenar.addItem("lugar_trabajo");
        jcordenar.addItem("nombre_garante");
        jcordenar.addItem("dni_garante");
        jcordenar.addItem("estado");

    }

    public void cargarComboInm() {
        jcordenar.addItem("idinmueble");
        jcordenar.addItem("direccion");
        jcordenar.addItem("altura");
        jcordenar.addItem("tipo");
        jcordenar.addItem("sup");
        jcordenar.addItem("precio");
        jcordenar.addItem("disponibilidad");
        jcordenar.addItem("nombreProp");

    }

    public void eleccionModelo(String opcion) {
        // Limpia los datos del modelo en lugar de configurar la cabecera cada vez
        borrarDatos(modeloC);
        borrarDatos(modeloP);
        borrarDatos(modeloInq);
        borrarDatos(modeloInm);

        switch (opcion) {
            case "propietario":
                jcordenar.removeAllItems();//remuevo todos los valores del mi combobox "jcordenar
                cargarComboP();//invoco metodo para cargar valores (cada valor representa el nombre un campo en la bd)
                jtinforme.setModel(modeloP);//seteo el modelo a la tabla perteneciente a propietario 

                for (Propietario prop : propietariodata.listarPropietarios()) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "inquilino":
                jcordenar.removeAllItems();
                cargarComboInq();
                jtinforme.setModel(modeloInq);

                for (Inquilino inq : Inquilinodata.listarInquilinos()) {
                    modeloInq.addRow(new Object[]{inq.getIdInquilino(), inq.getCuit(), inq.getNombre(), inq.getApellido(), inq.getLugarTrabajo(), inq.getNombreGarante(), inq.getDniGarante(), inq.isEstado()});
                }
                break;
            case "inmueble":
                jcordenar.removeAllItems();
                cargarComboInm();
                jtinforme.setModel(modeloInm);

                for (Inmueble inm : Inmuebledata.listarInmuebles()) {
                    modeloInm.addRow(new Object[]{inm.getIdInmueble(), inm.getDireccion(), inm.getAltura(), inm.getTipo(),
                        inm.getSuperficie(), inm.getPrecio(), inm.getDisponibilidad(),
                        propietariodata.obtenerPropietarioPorId(inm.getPropid()).getApellido()});
                }
                break;

            case "contrato":
                jcordenar.removeAllItems();
                cargarComboC();
                jtinforme.setModel(modeloC);

                for (Contrato con : contratodata.listarContratos()) {
                    modeloC.addRow(new Object[]{con.getIdContrato(), con.getFechaInicio(), con.getFechaFin(), con.isEstado(),
                        con.getMonto(), con.getIdimb(), Inquilinodata.obtenerInquilinoPorId(con.getIdinq()).getApellido()});
                }
                break;
        }

    }

    private void borrarDatos(DefaultTableModel model) {

        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

    }

    private void ordenarTablaP() {
        String eleccion = (String) jcordenar.getSelectedItem();

        if (modeloP.getRowCount() == 0) {
            return; // Si la tabla está vacía, no ordenar
        }

        PropietarioData inmData = new PropietarioData();

        switch (eleccion) {
            case "id_propietario":

                borrarDatos(modeloP);
                for (Propietario prop : inmData.ordenarX(eleccion)) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "nombre":
                borrarDatos(modeloP);
                for (Propietario prop : inmData.ordenarX(eleccion)) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "apellido":
                borrarDatos(modeloP);
                for (Propietario prop : inmData.ordenarX(eleccion)) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "telefono":
                borrarDatos(modeloP);
                for (Propietario prop : inmData.ordenarX(eleccion)) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "dni":
                borrarDatos(modeloP);
                for (Propietario prop : inmData.ordenarX(eleccion)) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "estado":
                borrarDatos(modeloP);
                for (Propietario prop : inmData.ordenarX(eleccion)) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
        }
    }

    private void ordenarTablaC() {
        String eleccion = (String) jcordenar.getSelectedItem();

        if (modeloC.getRowCount() == 0) {
            return; // Si la tabla está vacía, no ordenar
        }

        ContratoData contData = new ContratoData();

      
        
        switch (eleccion) {
            case "id_contrato":
                borrarDatos(modeloC);
                for (Contrato c : contData.ordenarX(eleccion)) {
                    modeloC.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                }
                break;
            case "fecha_inicio":
                borrarDatos(modeloC);
                for (Contrato c : contData.ordenarX(eleccion)) {
                    modeloC.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                }
                break;
            case "fecha_fin":
                borrarDatos(modeloC);
                for (Contrato c : contData.ordenarX(eleccion)) {
                    modeloC.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                }
                break;
            case "estado":
                borrarDatos(modeloC);
                for (Contrato c : contData.ordenarX(eleccion)) {
                    modeloC.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                }
                break;
                case "monto":
                borrarDatos(modeloC);
                for (Contrato c : contData.ordenarX(eleccion)) {
                    modeloC.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                }
                break;
                case "id_inmueble":
                borrarDatos(modeloC);
                for (Contrato c : contData.ordenarX(eleccion)) {
                    modeloC.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                }
                break;
                 case "id_inquilino":
                borrarDatos(modeloC);
                for (Contrato c : contData.ordenarX(eleccion)) {
                    modeloC.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                }
                break;
        }
    }

}
