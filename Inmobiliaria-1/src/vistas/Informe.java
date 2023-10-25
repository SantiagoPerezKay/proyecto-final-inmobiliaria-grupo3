package vistas;

import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import acceso_a_datos.PropietarioData;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Inquilino;
import inmobiliaria.entidades.Propietario;
import javax.swing.table.DefaultTableModel;

public class Informe extends javax.swing.JInternalFrame {

    DefaultTableModel modeloC = new DefaultTableModel();
    DefaultTableModel modeloInq = new DefaultTableModel();
    DefaultTableModel modeloInm = new DefaultTableModel();
    DefaultTableModel modeloP = new DefaultTableModel();

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

        setPreferredSize(new java.awt.Dimension(1280, 1024));

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("INFORME");

        jcopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "contrato", "propietario", "inquilino", "inmueble" }));
        jcopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcopcionActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Filtrar por:");

        jbimprimir.setText("Imprimir PDF");

        jbsalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215)
                        .addComponent(jcopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jbimprimir)
                        .addGap(281, 281, 281)
                        .addComponent(jbsalir)))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbimprimir)
                    .addComponent(jbsalir))
                .addContainerGap(421, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcopcionActionPerformed
        eleccionModelo((String) jcopcion.getSelectedItem());
    }//GEN-LAST:event_jcopcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbimprimir;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcopcion;
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

        modeloInm.addColumn("id_inmueble");
        modeloInm.addColumn("direccion");
        modeloInm.addColumn("altura");
        modeloInm.addColumn("tipo");
        modeloInm.addColumn("superficie");
        modeloInm.addColumn("precio");
        modeloInm.addColumn("disponibilidad");
        modeloInm.addColumn("id_propietario");
        modeloInm.addColumn("estado");
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
                PropietarioData propietariodata = new PropietarioData();
                for (Propietario prop : propietariodata.listarPropietarios()) {
                    modeloP.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                }
                break;
            case "inquilino":
                jtinforme.setModel(modeloInq);
                InquilinoData Inquilinodata = new InquilinoData();
                for (Inquilino inq : Inquilinodata.listarInquilinos()) {
                    modeloInq.addRow(new Object[]{inq.getIdInquilino(), inq.getCuit(), inq.getNombre(), inq.getApellido(), inq.getLugarTrabajo(), inq.getNombreGarante(), inq.getDniGarante(), inq.isEstado()});
                }
                break;
            case "inmueble":
                jtinforme.setModel(modeloInq);
                InmuebleData Inmuebledata = new InmuebleData();
                for (Inmueble inm : Inmuebledata.listarInmuebles()) {
                    modeloInq.addRow(new Object[]{inm.getIdInmueble(), inm.getDireccion(), inm.getAltura(), inm.getTipo(), inm.getPrecio(), inm.getDisponibilidad(), inm.getPropietario(), inm.isEstado()});
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
