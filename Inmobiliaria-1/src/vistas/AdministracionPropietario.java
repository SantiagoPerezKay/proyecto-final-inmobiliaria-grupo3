/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import acceso_a_datos.PropietarioData;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import inmobiliaria.entidades.Propietario;
import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import jdk.nashorn.internal.scripts.JO;
import java.awt.Color;

/**
 *
 * @author santy
 */
public class AdministracionPropietario extends javax.swing.JInternalFrame {

    private PropietarioData propiData = new PropietarioData();
    private Propietario propiActual = null;

    public AdministracionPropietario() {
        initComponents();
        jractivo.setSelected(true);

        evitarPegar(jtdni);
        evitarPegar(jtapellido);
        evitarPegar(jtnombre);
        evitarPegar(jtdomicilio);
        evitarPegar(jttelefono);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jpanelPropietario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jtapellido = new javax.swing.JTextField();
        jttelefono = new javax.swing.JTextField();
        jtdomicilio = new javax.swing.JTextField();
        jractivo = new javax.swing.JRadioButton();
        jrinactivo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("INGRESAR INMUEBLE");

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1060, 600));
        setMinimumSize(new java.awt.Dimension(1060, 600));
        setPreferredSize(new java.awt.Dimension(1060, 600));
        getContentPane().setLayout(null);

        jpanelPropietario.setBackground(new java.awt.Color(255, 255, 255));
        jpanelPropietario.setMaximumSize(new java.awt.Dimension(1060, 570));
        jpanelPropietario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("NOMBRE ");
        jpanelPropietario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 30));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("APELLIDO ");
        jpanelPropietario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 30));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("TELEFONO ");
        jpanelPropietario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DNI ");
        jpanelPropietario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 60, 30));

        jtdni.setPreferredSize(new java.awt.Dimension(10, 20));
        jpanelPropietario.add(jtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 370, 30));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("DOMICILIO ");
        jpanelPropietario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, 30));

        jtnombre.setToolTipText("");
        jtnombre.setPreferredSize(new java.awt.Dimension(10, 20));
        jpanelPropietario.add(jtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 370, 30));

        jtapellido.setPreferredSize(new java.awt.Dimension(10, 20));
        jpanelPropietario.add(jtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 370, 30));

        jttelefono.setPreferredSize(new java.awt.Dimension(10, 20));
        jpanelPropietario.add(jttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 370, 30));

        jtdomicilio.setPreferredSize(new java.awt.Dimension(10, 20));
        jpanelPropietario.add(jtdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 370, 30));

        jractivo.setBackground(new java.awt.Color(255, 255, 255));
        jractivo.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jractivo.setForeground(new java.awt.Color(51, 51, 51));
        jractivo.setText("ACTIVO");
        jractivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jractivoActionPerformed(evt);
            }
        });
        jpanelPropietario.add(jractivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, -1, -1));

        jrinactivo.setBackground(new java.awt.Color(255, 255, 255));
        jrinactivo.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jrinactivo.setForeground(new java.awt.Color(51, 51, 51));
        jrinactivo.setText("INACTIVO");
        jrinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrinactivoActionPerformed(evt);
            }
        });
        jpanelPropietario.add(jrinactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("REGISTRAR");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpanelPropietario.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 500, -1));

        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("INGRESAR INMUEBLE");
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpanelPropietario.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, -1, -1));

        jblimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jblimpiar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jblimpiar.setForeground(new java.awt.Color(51, 51, 51));
        jblimpiar.setText("LIMPIAR CAMPOS");
        jblimpiar.setBorderPainted(false);
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });
        jpanelPropietario.add(jblimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        jbsalir.setBackground(new java.awt.Color(255, 255, 255));
        jbsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(51, 51, 51));
        jbsalir.setText("SALIR");
        jbsalir.setBorderPainted(false);
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        jpanelPropietario.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/INGRESO PROPIETARIO.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jpanelPropietario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 460, 590));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jpanelPropietario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 620, 570));

        getContentPane().add(jpanelPropietario);
        jpanelPropietario.setBounds(0, 0, 1050, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String dni = jtdni.getText();
            String nombre = jtnombre.getText();
            String apellido = jtapellido.getText();
            String telefono = jttelefono.getText();
            String domicilio = jtdomicilio.getText();
            boolean estado = jractivo.isSelected();

            if (validarCampoNumerico( jtdni) && (validarCampoTexto(jtnombre))&& (validarCampoTexto(jtapellido))&& (validarCampoNumerico(jttelefono))&& (validarCampoTexto(jtdomicilio))) {
                
                propiActual = new Propietario(nombre, apellido, domicilio, telefono, dni, estado);
                propiData.insertarPropietario(propiActual);
                limpiarCampos();
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, nfe.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Menu menu = new Menu();
        menu.setVisible(true);

        menu.Escritorio.removeAll();
        menu.Escritorio.revalidate();
        menu.Escritorio.repaint();
        AdministracionInmueble administracioninmueble = new AdministracionInmueble();
        administracioninmueble.setVisible(true);
        menu.Escritorio.add(administracioninmueble);
        administracioninmueble.setLocation((menu.Escritorio.getWidth() - administracioninmueble.getWidth()) / 2, (menu.Escritorio.getHeight() - administracioninmueble.getHeight()) / 2);
        menu.Escritorio.moveToFront(administracioninmueble);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jblimpiarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jractivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jractivoActionPerformed
        jractivo.setSelected(true);
        jrinactivo.setSelected(false);
    }//GEN-LAST:event_jractivoActionPerformed

    private void jrinactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrinactivoActionPerformed
        jractivo.setSelected(false);
        jrinactivo.setSelected(true);
    }//GEN-LAST:event_jrinactivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JPanel jpanelPropietario;
    private javax.swing.JRadioButton jractivo;
    private javax.swing.JRadioButton jrinactivo;
    private javax.swing.JTextField jtapellido;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtdomicilio;
    private javax.swing.JTextField jtnombre;
    private javax.swing.JTextField jttelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {

        jtdni.setText("");
        jtapellido.setText("");
        jtnombre.setText("");
        jttelefono.setText("");
        jtdomicilio.setText("");
    }

  

    public static void evitarPegar(JTextField campo) {

        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

    }

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

}
