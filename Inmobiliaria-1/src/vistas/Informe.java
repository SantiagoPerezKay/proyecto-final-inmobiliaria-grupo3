package vistas;

import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import acceso_a_datos.PropietarioData;

import javax.swing.table.DefaultTableModel;
import inmobiliaria.entidades.*;

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

        label1 = new java.awt.Label();
        jcopcion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtinforme = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbimprimir = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcordenar = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1280, 1024));
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("INFORME");
        getContentPane().add(label1);
        label1.setBounds(510, 100, 272, 32);

        jcopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "contrato", "propietario", "inquilino", "inmueble" }));
        jcopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcopcionActionPerformed(evt);
            }
        });
        getContentPane().add(jcopcion);
        jcopcion.setBounds(720, 130, 92, 26);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 360, 753, 310);

        jLabel1.setText("Filtrar por:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 140, 58, 16);

        jbimprimir.setText("Imprimir PDF");
        jbimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(jbimprimir);
        jbimprimir.setBounds(340, 710, 110, 30);

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbsalir);
        jbsalir.setBounds(740, 710, 90, 30);

        jLabel2.setText("ordenar por:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 180, 80, 20);

        getContentPane().add(jcordenar);
        jcordenar.setBounds(720, 180, 90, 26);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbimprimir;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcopcion;
    private javax.swing.JComboBox<Object> jcordenar;
    private javax.swing.JTable jtinforme;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    public void cargarCabeceraC() {

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
