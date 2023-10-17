/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import acceso_a_datos.InmuebleData;
import inmobiliaria.entidades.Inmueble;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agente Sosa
 */
public class AdministracionInmuebleCBM extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int a, int c) {
            return (c != 0) && (c != 8);
        }
    };
    
    public AdministracionInmuebleCBM() {
        initComponents();
        cargarCombo();
        cargarCabecera();
        cargarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInmuebles = new javax.swing.JTable();
        jbsalir = new javax.swing.JButton();
        jbrestablecer = new javax.swing.JButton();
        jbguardarcambios = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jtLetra = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("CONSULTA ALTA  BAJA MODIFICIACION");

        jLabel2.setText("BUSCAR POR:");

        jcbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbusquedaActionPerformed(evt);
            }
        });

        jtInmuebles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtInmuebles);

        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbrestablecer.setText("RESTABLECER");
        jbrestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestablecerActionPerformed(evt);
            }
        });

        jbguardarcambios.setText("GUARDAR CAMBIOS");
        jbguardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarcambiosActionPerformed(evt);
            }
        });

        jbeliminar.setText("ELIMINAR");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jtLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtLetraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(jbrestablecer)
                            .addGap(18, 18, 18)
                            .addComponent(jbguardarcambios)
                            .addGap(18, 18, 18)
                            .addComponent(jbeliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                            .addComponent(jbsalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbrestablecer)
                    .addComponent(jbguardarcambios)
                    .addComponent(jbeliminar)
                    .addComponent(jbsalir))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbrestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrestablecerActionPerformed
        borrarDatos();
        cargarTabla();
        jtLetra.setText("");
    }//GEN-LAST:event_jbrestablecerActionPerformed

    private void jbguardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarcambiosActionPerformed

        InmuebleData inmudata = new InmuebleData();

        int fila = jtInmuebles.getSelectedRow();

        Inmueble i = new Inmueble();

        i.setIdInmueble((int)jtInmuebles.getValueAt(fila, 0));
        i.setDireccion((String)jtInmuebles.getValueAt(fila,1));
        i.setAltura((int)jtInmuebles.getValueAt(fila,2));
        i.setTipo((String)jtInmuebles.getValueAt(fila,3));
        
        String valor1=String.valueOf(jtInmuebles.getValueAt(fila,4));
        
        i.setSuperficie(Double.parseDouble(valor1));
      
        String valor2=String.valueOf(jtInmuebles.getValueAt(fila,5));
        i.setPrecio(Double.parseDouble(valor2));
      
        i.setDisponibilidad((String)jtInmuebles.getValueAt(fila,6));
        i.setPropid((int)jtInmuebles.getValueAt(fila,7));
        i.setEstado((boolean) jtInmuebles.getValueAt(fila, 8));
        
        System.out.println(i);
        
        inmudata.actualizarInmueble(i);
        borrarDatos();
        jtLetra.setText("");
        cargarTabla();
        
    }//GEN-LAST:event_jbguardarcambiosActionPerformed

    private void jcbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbusquedaActionPerformed
        
        
        
    }//GEN-LAST:event_jcbusquedaActionPerformed

    private void jtLetraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLetraKeyReleased
        borrarDatos();
        String letra = (String)jcbusqueda.getSelectedItem();
        InmuebleData inmo = new InmuebleData();
        
        switch (letra) {
            case "id_inmueble":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getIdInmueble()).startsWith(jtLetra.getText())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;
            case "direccion":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getDireccion()).toLowerCase().startsWith(jtLetra.getText().toLowerCase())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;
            case "altura":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getAltura()).startsWith(jtLetra.getText())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;
            case "tipo":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getTipo()).toLowerCase().startsWith(jtLetra.getText().toLowerCase())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;    
            case "superficie":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getSuperficie()).startsWith(jtLetra.getText())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;
            case "precio":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getPrecio()).startsWith(jtLetra.getText())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;    
            case "disponibilidad":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getDisponibilidad()).toLowerCase().startsWith(jtLetra.getText().toLowerCase())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;
            case "id_propietario":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.getPropid()).startsWith(jtLetra.getText())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;
            case "estado":
                for (Inmueble i : inmo.listarInmuebles()) {
                    if (String.valueOf(i.isEstado()).startsWith(jtLetra.getText())) {
                        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
                    }
                }
                break;    
        }
    }//GEN-LAST:event_jtLetraKeyReleased

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        
        InmuebleData inmudata = new InmuebleData();

        int fila = jtInmuebles.getSelectedRow();

        Inmueble inm = new Inmueble();

        inm.setIdInmueble((int)jtInmuebles.getValueAt(fila, 0));
        inm.setDireccion((String)jtInmuebles.getValueAt(fila,1));
        inm.setAltura((int)jtInmuebles.getValueAt(fila,2));
        inm.setTipo((String)jtInmuebles.getValueAt(fila,3));
        inm.setSuperficie((Double)jtInmuebles.getValueAt(fila,4));
        inm.setPrecio((Double)jtInmuebles.getValueAt(fila,5));
        inm.setDisponibilidad((String)jtInmuebles.getValueAt(fila,6));
        inm.setPropid((int)jtInmuebles.getValueAt(fila,7));
        inm.setEstado(false);

        inmudata.actualizarInmueble(inm);
        borrarDatos();
        jtLetra.setText("");
        cargarTabla();      
    }//GEN-LAST:event_jbeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardarcambios;
    private javax.swing.JButton jbrestablecer;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbusqueda;
    private javax.swing.JTable jtInmuebles;
    private javax.swing.JTextField jtLetra;
    // End of variables declaration//GEN-END:variables

    public void cargarCombo (){
        
        jcbusqueda.addItem("id_inmueble");
        jcbusqueda.addItem("direccion");
        jcbusqueda.addItem("altura");
        jcbusqueda.addItem("tipo");
        jcbusqueda.addItem("superficie");
        jcbusqueda.addItem("precio");
        jcbusqueda.addItem("disponibilidad");
        jcbusqueda.addItem("id_propietario");
        jcbusqueda.addItem("estado");
        
    }
    
    public void cargarCabecera (){
        
        modelo.addColumn("id_inmueble");
        modelo.addColumn("direccion");
        modelo.addColumn("altura");
        modelo.addColumn("tipo");
        modelo.addColumn("superficie");
        modelo.addColumn("precio");
        modelo.addColumn("disponibilidad");
        modelo.addColumn("id_propietario");
        modelo.addColumn("estado");
        jtInmuebles.setModel(modelo);
        
    }

    private void borrarDatos() {

        int f = jtInmuebles.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }
    }
    
    public void cargarTabla() {

        InmuebleData inmo = new InmuebleData();
        for (Inmueble i : inmo.listarInmuebles()) {
        modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});        }

    }
    
}
