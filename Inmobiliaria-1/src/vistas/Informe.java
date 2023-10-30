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
        jLabel2 = new javax.swing.JLabel();
        jcordenar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1060, 660));
        setMinimumSize(new java.awt.Dimension(1060, 660));
        setName(""); // NOI18N
        setOpaque(true);
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
        jPanel1.add(jcopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 270, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 570, 200));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("FILTRAR POR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jbimprimir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jbimprimir.setForeground(new java.awt.Color(51, 51, 51));
        jbimprimir.setText("IMPRIMIR PDF");
        jbimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbimprimirActionPerformed(evt);
            }
        });
        jPanel1.add(jbimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 310, 40));

        jbsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(51, 51, 51));
        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 130, 40));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ORDENAR POR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jcordenar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jPanel1.add(jcordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 270, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/LABEL INFORME.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(576, 1280));
        jLabel3.setMinimumSize(new java.awt.Dimension(576, 1280));
        jLabel3.setPreferredSize(new java.awt.Dimension(576, 1280));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 490, 660));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -20, 680, 650));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbimprimir;
    private javax.swing.JButton jbsalir;
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
    

    public void eleccionModelo(String opcion) {
        // Limpia los datos del modelo en lugar de configurar la cabecera cada vez
        borrarDatos(modeloC);
        borrarDatos(modeloP);
        borrarDatos(modeloInq);
        borrarDatos(modeloInm);

        switch (opcion) {
            case "propietario":
                jtinforme.setModel(modeloP);

                for (Propietario prop : propietariodata.listarPropietarios()) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "inquilino":
                jtinforme.setModel(modeloInq);

                for (Inquilino inq : Inquilinodata.listarInquilinos()) {
                    modeloInq.addRow(new Object[]{inq.getIdInquilino(), inq.getCuit(), inq.getNombre(), inq.getApellido(), inq.getLugarTrabajo(), inq.getNombreGarante(), inq.getDniGarante(), inq.isEstado()});
                }
                break;
            case "inmueble":
                jtinforme.setModel(modeloInm);

                for (Inmueble inm : Inmuebledata.listarInmuebles()) {
                    modeloInm.addRow(new Object[]{inm.getIdInmueble(), inm.getDireccion(), inm.getAltura(), inm.getTipo(),
                        inm.getSuperficie(), inm.getPrecio(), inm.getDisponibilidad(),
                        propietariodata.obtenerPropietarioPorId(inm.getPropid()).getApellido()});
                }
                break;

            case "contrato":
                jtinforme.setModel(modeloC);

                for (Contrato con : contratodata.listarContratos()) {
                    modeloC.addRow(new Object[]{con.getIdContrato(), con.getFechaInicio(), con.getFechaFin(), con.isEstado(),
                        con.getMonto(), con.getIdimb(), Inquilinodata.obtenerInquilinoPorId(con.getIdinq()).getApellido()});
                }
                break;
        }

    }

    private void borrarDatos(DefaultTableModel model) {

        int f = model.getRowCount() - 1; //obtengo total de filas de la tabla

        if (f > 0) {
            for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

                model.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
            }
        }
    }
}
