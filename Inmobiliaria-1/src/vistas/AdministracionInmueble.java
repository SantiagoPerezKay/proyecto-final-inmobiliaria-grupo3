/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import acceso_a_datos.InmuebleData;
import acceso_a_datos.PropietarioData;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Propietario;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtdireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtaltura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtsuperficie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtprecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbalta = new javax.swing.JButton();
        jractivo = new javax.swing.JRadioButton();
        jrinactivo = new javax.swing.JRadioButton();
        jcpropietario = new javax.swing.JComboBox<>();
        jttipo = new javax.swing.JComboBox<>();
        jtdisponibilidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1030, 600));
        setMinimumSize(new java.awt.Dimension(1030, 600));
        setPreferredSize(new java.awt.Dimension(1030, 600));
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 590));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 230, 40));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DIRECCIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, 30));

        jtdireccion.setPreferredSize(new java.awt.Dimension(10, 20));
        jtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdireccionActionPerformed(evt);
            }
        });
        jPanel1.add(jtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 350, 30));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ALTURA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, 30));

        jtaltura.setPreferredSize(new java.awt.Dimension(10, 20));
        jtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtalturaActionPerformed(evt);
            }
        });
        jPanel1.add(jtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 350, 30));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("TIPO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, 30));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("SUPERFICIE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, 30));

        jtsuperficie.setPreferredSize(new java.awt.Dimension(10, 20));
        jtsuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtsuperficieActionPerformed(evt);
            }
        });
        jPanel1.add(jtsuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 350, 30));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("PRECIO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, 30));

        jtprecio.setPreferredSize(new java.awt.Dimension(10, 20));
        jtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtprecioActionPerformed(evt);
            }
        });
        jPanel1.add(jtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 350, 30));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DISPONIBILIDAD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, 30));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("PROPIETARIO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, 30));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("ESTADO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, 30));

        jbalta.setBackground(new java.awt.Color(153, 153, 153));
        jbalta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 22)); // NOI18N
        jbalta.setForeground(new java.awt.Color(51, 51, 51));
        jbalta.setText("REGISTRAR");
        jbalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaltaActionPerformed(evt);
            }
        });
        jPanel1.add(jbalta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 250, 40));

        jractivo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jractivo.setForeground(new java.awt.Color(51, 51, 51));
        jractivo.setText("ACTIVO");
        jractivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jractivoActionPerformed(evt);
            }
        });
        jPanel1.add(jractivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 100, -1));

        jrinactivo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jrinactivo.setForeground(new java.awt.Color(51, 51, 51));
        jrinactivo.setText("INACTIVO");
        jrinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrinactivoActionPerformed(evt);
            }
        });
        jPanel1.add(jrinactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, -1, -1));

        jPanel1.add(jcpropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 350, 29));

        jttipo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jttipo.setForeground(new java.awt.Color(51, 51, 51));
        jttipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "casa", "local", "depto", "terreno" }));
        jPanel1.add(jttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 350, 30));

        jtdisponibilidad.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jtdisponibilidad.setForeground(new java.awt.Color(51, 51, 51));
        jtdisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponible", "no disponible" }));
        jPanel1.add(jtdisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/NUEVO INMUEBLE.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setMinimumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setPreferredSize(new java.awt.Dimension(576, 1280));
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 580));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 600, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdireccionActionPerformed

    private void jtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtalturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtalturaActionPerformed

    private void jtsuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtsuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtsuperficieActionPerformed

    private void jtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtprecioActionPerformed

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
        try {
            int altura = Integer.parseInt(jtaltura.getText());
            double superficie = Double.parseDouble(jtsuperficie.getText());
            double precio = Double.parseDouble(jtprecio.getText());

            Propietario propietario = (Propietario) jcpropietario.getSelectedItem();
            int idpropietario = propietario.getIdPropietario();

            boolean estado;
            if (jractivo.isSelected()) {
                estado = true;
            } else {
                estado = false;
            }
            if (validarCampoTexto(jtdireccion) && validarCampoNumerico(jtprecio) && validarCampoNumerico(jtsuperficie) && validarCampoNumerico(jtaltura)) {
                //creo inmueble
                Inmueble inmueble = new Inmueble(jtdireccion.getText(), altura, (String) jttipo.getSelectedItem(), superficie, precio, (String) jtdisponibilidad.getSelectedItem(), propietario, estado);
                inmuebledata.agregarInmueble(inmueble);

                limpiarCampos();
            }
        } catch (NumberFormatException e) {
            if (!validarCampoNumerico(jtaltura)) {
                return;
            }
            if (!validarCampoNumerico(jtsuperficie)) {
                return;
            }
            if (!validarCampoNumerico(jtprecio)) {
                return;
            }

        }

    }//GEN-LAST:event_jbaltaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    //metodos validadores de numeros
    public boolean validarCampoNumerico(JTextField textfield) {
        if (textfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");
            textfield.requestFocus();
            return false;

        } else if (!textfield.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "El campo solo puede contener numeros.");
            textfield.setText("");
            textfield.requestFocus();
            return false;
        }
        return true;
    }

    //metodos validadores de texto
    public boolean validarCampoTexto(JTextField textfield) {
        if (textfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");
            textfield.requestFocus();
            return false;
        } else if (!textfield.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ'\\s]+$")) {
            JOptionPane.showMessageDialog(null, "El campo solo puede contener letras.");
            textfield.setText("");
            textfield.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbalta;
    private javax.swing.JComboBox<Propietario> jcpropietario;
    private javax.swing.JRadioButton jractivo;
    private javax.swing.JRadioButton jrinactivo;
    private javax.swing.JTextField jtaltura;
    private javax.swing.JTextField jtdireccion;
    private javax.swing.JComboBox<String> jtdisponibilidad;
    private javax.swing.JTextField jtprecio;
    private javax.swing.JTextField jtsuperficie;
    private javax.swing.JComboBox<String> jttipo;
    // End of variables declaration//GEN-END:variables

    public void cargarPropietarios() {
        PropietarioData propietariodata = new PropietarioData();

        for (Propietario propietario : propietariodata.listarPropietarios()) {
            jcpropietario.addItem(propietario);
        }
    }

    private void limpiarCampos() {
        jtdireccion.setText("");
        jtaltura.setText("");
        jtdisponibilidad.setSelectedItem(0);
        jtprecio.setText("");
        jtsuperficie.setText("");
        jttipo.setSelectedItem(0);
    }

}
