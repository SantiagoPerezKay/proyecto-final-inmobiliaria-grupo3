/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import acceso_a_datos.InmuebleData;
import acceso_a_datos.PropietarioData;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Propietario;

/**
 *
 * @author santy
 */
public class AdministracionInmueble extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdministracionInmueble
     */
    public AdministracionInmueble() {
        initComponents();
        cargarPropietarios();
        jractivo.setSelected(true);

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
        jLabel5 = new javax.swing.JLabel();
        jtdireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtaltura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jttipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtsuperficie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtprecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtdisponibilidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbalta = new javax.swing.JButton();
        jractivo = new javax.swing.JRadioButton();
        jrinactivo = new javax.swing.JRadioButton();
        jcpropietario = new javax.swing.JComboBox<>();

        jLabel1.setText("Alta Inmueble");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("DIRECCION:");

        jtdireccion.setPreferredSize(new java.awt.Dimension(10, 20));
        jtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdireccionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ALTURA:");

        jtaltura.setPreferredSize(new java.awt.Dimension(10, 20));
        jtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtalturaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("TIPO:");

        jttipo.setPreferredSize(new java.awt.Dimension(10, 20));
        jttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttipoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("SUPERFICIE:");

        jtsuperficie.setPreferredSize(new java.awt.Dimension(10, 20));
        jtsuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtsuperficieActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("PRECIO:");

        jtprecio.setPreferredSize(new java.awt.Dimension(10, 20));
        jtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtprecioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("DISPONIBILIDAD:");

        jtdisponibilidad.setPreferredSize(new java.awt.Dimension(10, 20));
        jtdisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdisponibilidadActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("PROPIETARIO:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("ESTADO:");

        jbalta.setText("ALTA");
        jbalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaltaActionPerformed(evt);
            }
        });

        jractivo.setText("ACTIVO");
        jractivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jractivoActionPerformed(evt);
            }
        });

        jrinactivo.setText("INACTIVO");
        jrinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrinactivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jtdisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(22, 22, 22)
                            .addComponent(jtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(jractivo)
                            .addGap(29, 29, 29)
                            .addComponent(jrinactivo)
                            .addGap(17, 17, 17))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(22, 22, 22)
                                .addComponent(jtsuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22)
                                .addComponent(jttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)
                                .addComponent(jtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jbalta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)
                                .addGap(22, 22, 22)
                                .addComponent(jcpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)))
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtsuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtdisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jractivo)
                    .addComponent(jrinactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jbalta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdireccionActionPerformed

    private void jtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtalturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtalturaActionPerformed

    private void jttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttipoActionPerformed

    private void jtsuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtsuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtsuperficieActionPerformed

    private void jtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtprecioActionPerformed

    private void jtdisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdisponibilidadActionPerformed

    private void jrinactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrinactivoActionPerformed
        jractivo.setSelected(false);
        jrinactivo.setSelected(true);
    }//GEN-LAST:event_jrinactivoActionPerformed

    private void jractivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jractivoActionPerformed
        jractivo.setSelected(true);
        jrinactivo.setSelected(false);

    }//GEN-LAST:event_jractivoActionPerformed

    private void jbaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaltaActionPerformed

        InmuebleData inmuebledata = new InmuebleData();

        String direccion = jtdireccion.getText();
        int altura = Integer.parseInt(jtaltura.getText());
        String tipo = jttipo.getText();
        double superficie = Double.parseDouble(jtsuperficie.getText());
        double precio = Double.parseDouble(jtprecio.getText());
        String disponibilidad = jtdisponibilidad.getText();
        Propietario propietario = (Propietario) jcpropietario.getSelectedItem();// mi alumno
        int idpropietario = propietario.getIdPropietario();
        
        boolean estado;
        
        if (jractivo.isSelected()) {
            estado = true;
        } else {
            estado = false;
        }
    
        Inmueble inmueble = new Inmueble(direccion, altura, tipo, superficie, precio, disponibilidad, propietario, estado);

        inmuebledata.agregarInmueble(inmueble);

    }//GEN-LAST:event_jbaltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbalta;
    private javax.swing.JComboBox<Propietario> jcpropietario;
    private javax.swing.JRadioButton jractivo;
    private javax.swing.JRadioButton jrinactivo;
    private javax.swing.JTextField jtaltura;
    private javax.swing.JTextField jtdireccion;
    private javax.swing.JTextField jtdisponibilidad;
    private javax.swing.JTextField jtprecio;
    private javax.swing.JTextField jtsuperficie;
    private javax.swing.JTextField jttipo;
    // End of variables declaration//GEN-END:variables

    public void cargarPropietarios() {
        PropietarioData propietariodata = new PropietarioData();

        for (Propietario propietario : propietariodata.listarPropietarios()) {
            jcpropietario.addItem(propietario);
        }

    }

}
