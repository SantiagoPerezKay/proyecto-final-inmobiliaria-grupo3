/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import acceso_a_datos.InquilinoData;
import inmobiliaria.entidades.Inquilino;
import javax.swing.table.DefaultTableModel;


public class AdministracionInquilinoCBM extends javax.swing.JInternalFrame {
 DefaultTableModel modelo = new DefaultTableModel();

 
    public AdministracionInquilinoCBM() {
        initComponents();
        cargarCombo();
        cargarCabecera();
        cargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtpalabra = new javax.swing.JTextField();
        jcbusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtinquilinos = new javax.swing.JTable();
        jbrestablecer = new javax.swing.JButton();
        jbguardarcambios = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(814, 603));

        jLabel1.setText("CONSULTA ALTA  BAJA MODIFICIACION");

        jLabel2.setText("BUSCAR POR:");

        jtpalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtpalabraActionPerformed(evt);
            }
        });
        jtpalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtpalabraKeyReleased(evt);
            }
        });

        jtinquilinos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtinquilinos);

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

        jbsalir.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbrestablecer)
                            .addGap(18, 18, 18)
                            .addComponent(jbguardarcambios)
                            .addGap(18, 18, 18)
                            .addComponent(jbeliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbsalir))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jtpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbrestablecer)
                    .addComponent(jbguardarcambios)
                    .addComponent(jbeliminar)
                    .addComponent(jbsalir))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtpalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtpalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtpalabraActionPerformed

    private void jbguardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarcambiosActionPerformed
//       
//        InquilinoData inqui = new InquilinoData();
//        Inquilino n = new Inquilino();
//        
//          String dato=String.valueOf(modelo.getValueAt(jtinquilinos.getSelectedRow(),0));
//          inqui.actualizarInquilino(n); **VER 
    }//GEN-LAST:event_jbguardarcambiosActionPerformed

    private void jbrestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrestablecerActionPerformed
           borrarDatos();
           cargarTabla();
    }//GEN-LAST:event_jbrestablecerActionPerformed

    private void jtpalabraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtpalabraKeyReleased
        borrarDatos();
        String letra = (String)jcbusqueda.getSelectedItem();
        InquilinoData inqui = new InquilinoData();
        
        switch (letra) {
            case "id_inquilino":
                for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getIdInquilino()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante()});
                }
                    
        }
                break;
            case "nombre":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getNombre()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante()});
                }
                    
        }
                break;    
             case "apellido":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getApellido()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante()});
                }
                    
        }
                break;    
                
                 case "cuit":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getCuit()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante()});
                }
                    
        }
                break;    
                
                 case "Lugar_trabajo":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getLugarTrabajo()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante()});
                }
                    
        }
                break;    
                
                 case "nombre_garante":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getNombreGarante()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante()});
                }
                    
        }
                break;    
                 case "dni_garante":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getDniGarante()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante()});
                }
                    
        }
                break;    
    }//GEN-LAST:event_jtpalabraKeyReleased
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardarcambios;
    private javax.swing.JButton jbrestablecer;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbusqueda;
    private javax.swing.JTable jtinquilinos;
    private javax.swing.JTextField jtpalabra;
    // End of variables declaration//GEN-END:variables
  public void cargarCombo() {
      

        jcbusqueda.addItem("id_inquilino");
        jcbusqueda.addItem("nombre");
        jcbusqueda.addItem("apellido");
        jcbusqueda.addItem("cuit");
        jcbusqueda.addItem("Lugar_trabajo");
        jcbusqueda.addItem("nombre_garante");
        jcbusqueda.addItem("dni_garante");


}
    public void cargarCabecera() {
        modelo.addColumn("Id Inquilino");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cuit");
        modelo.addColumn("Lugar Trabajo");
        modelo.addColumn("Nombre Garante");
        modelo.addColumn("DNI Garante");
        jtinquilinos.setModel(modelo);
    }
    
     public void cargarTabla() {

        InquilinoData inqui = new InquilinoData();
        for (Inquilino inquilino : inqui.listarInquilinos()) {
            modelo.addRow(new Object[]{inquilino.getIdInquilino(), inquilino.getNombre(),inquilino.getApellido(), inquilino.getLugarTrabajo(), inquilino.getNombreGarante(), inquilino.getDniGarante() });
        }

    }
     
       private void borrarDatos() {

        int f = jtinquilinos.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }

}
       
}