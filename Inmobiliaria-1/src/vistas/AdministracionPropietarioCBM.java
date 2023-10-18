package vistas;

import acceso_a_datos.PropietarioData;
import inmobiliaria.entidades.Propietario;
import javafx.beans.value.ObservableObjectValue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdministracionPropietarioCBM extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int a, int c) {
            return (c != 0) && (c != 6);
        }
    };

    public AdministracionPropietarioCBM() {
        initComponents();
        cargarCabecera();
        cargarTabla();
        cargarCombo();
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
        jtpalabra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpropietarios = new javax.swing.JTable();
        jtrestablecer = new javax.swing.JButton();
        jcbusqueda = new javax.swing.JComboBox<>();
        jbsalir = new javax.swing.JButton();
        jbguardarcambios = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("CONSULTA BAJA MODIFICACION");

        jtpalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtpalabraKeyReleased(evt);
            }
        });

        jLabel2.setText("Buscar por:");

        jtpropietarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtpropietarios);

        jtrestablecer.setText("RESTABLECER");
        jtrestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtrestablecerActionPerformed(evt);
            }
        });

        jcbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbusquedaActionPerformed(evt);
            }
        });

        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbguardarcambios.setText("GUARAR CAMBIOS");
        jbguardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarcambiosActionPerformed(evt);
            }
        });

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jtpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jtrestablecer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbguardarcambios)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(72, 72, 72)
                .addComponent(jbsalir)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtpalabra)
                    .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtrestablecer)
                    .addComponent(jbsalir)
                    .addComponent(jbguardarcambios)
                    .addComponent(jButton1))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtrestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtrestablecerActionPerformed
        borrarDatos();
        cargarTabla();
        jtpalabra.setText("");
    }//GEN-LAST:event_jtrestablecerActionPerformed

    private void jtpalabraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtpalabraKeyReleased

        borrarDatos();

        String opcion = (String) jcbusqueda.getSelectedItem();

        PropietarioData propietariodata = new PropietarioData();

        switch (opcion) {
            case "id_propietario":
                for (Propietario prop : propietariodata.listarPropietarios()) {
                    if (String.valueOf(prop.getIdPropietario()).startsWith(jtpalabra.getText())) {
                        modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                    }
                }

                break;
            case "nombre":

                for (Propietario prop : propietariodata.listarPropietarios()) {
                    if (String.valueOf(prop.getNombre().toLowerCase()).startsWith(jtpalabra.getText().toLowerCase())) {
                        modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                    }
                }

                break;
            case "apellido":
                for (Propietario prop : propietariodata.listarPropietarios()) {
                    if (String.valueOf(prop.getApellido().toLowerCase()).startsWith(jtpalabra.getText().toLowerCase())) {
                        modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                    }
                }
                break;
            case "telefono":
                for (Propietario prop : propietariodata.listarPropietarios()) {
                    if (String.valueOf(prop.getTelefono()).startsWith(jtpalabra.getText())) {
                        modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                    }
                }
                break;
            case "dni":
                for (Propietario prop : propietariodata.listarPropietarios()) {
                    if (String.valueOf(prop.getDni()).startsWith(jtpalabra.getText())) {
                        modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                    }
                }
                break;
            case "domicilio":
                for (Propietario prop : propietariodata.listarPropietarios()) {
                    if (String.valueOf(prop.getDomicilio().toLowerCase()).startsWith(jtpalabra.getText().toLowerCase())) {
                        modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                    }
                }
                break;
            case "estado":
                for (Propietario prop : propietariodata.listarPropietarios()) {
                    if (String.valueOf(prop.isEstado()).startsWith(jtpalabra.getText().toLowerCase())) {
                        modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
                    }
                }
                break;
        }


    }//GEN-LAST:event_jtpalabraKeyReleased

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jcbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbusquedaActionPerformed

    private void jbguardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarcambiosActionPerformed
        int fila = jtpropietarios.getSelectedRow();

        PropietarioData propietariodata = new PropietarioData();
        Propietario prop = new Propietario();

        String nombre = (String) jtpropietarios.getValueAt(fila, 1);
        String apellido = (String) jtpropietarios.getValueAt(fila, 2);
        String telefono = (String) jtpropietarios.getValueAt(fila, 3);
        String dni = (String) jtpropietarios.getValueAt(fila, 4);
        String domicilio=(String) jtpropietarios.getValueAt(fila, 5);
       
     

        prop.setIdPropietario((int) jtpropietarios.getValueAt(fila, 0));
        prop.setNombre(nombre);
        prop.setApellido(apellido);
        prop.setTelefono(telefono);
        prop.setDni(dni);
        prop.setDomicilio(domicilio);
        prop.setEstado((boolean) jtpropietarios.getValueAt(fila, 6));

        propietariodata.actualizarPropietario(prop);
        borrarDatos();
        jtpalabra.setText("");

        cargarTabla();


    }//GEN-LAST:event_jbguardarcambiosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        PropietarioData propietariodata = new PropietarioData();

        int fila = jtpropietarios.getSelectedRow();

        Propietario prop = new Propietario();

        prop.setIdPropietario((int) jtpropietarios.getValueAt(fila, 0));
        prop.setNombre((String) jtpropietarios.getValueAt(fila, 1));
        prop.setApellido((String) jtpropietarios.getValueAt(fila, 2));
        prop.setTelefono((String) jtpropietarios.getValueAt(fila, 3));
        prop.setDni((String) jtpropietarios.getValueAt(fila, 4));
        prop.setDomicilio((String) jtpropietarios.getValueAt(fila, 5));
        prop.setEstado(false);

        propietariodata.actualizarPropietario(prop);
        borrarDatos();
        jtpalabra.setText("");
        cargarTabla();


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbguardarcambios;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbusqueda;
    private javax.swing.JTextField jtpalabra;
    private javax.swing.JTable jtpropietarios;
    private javax.swing.JButton jtrestablecer;
    // End of variables declaration//GEN-END:variables

    public void cargarCabecera() {
        modelo.addColumn("Id Propietario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("DNI");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Estado");
        jtpropietarios.setModel(modelo);
    }

    public void cargarCombo() {

        jcbusqueda.addItem("id_propietario");
        jcbusqueda.addItem("nombre");
        jcbusqueda.addItem("apellido");
        jcbusqueda.addItem("telefono");
        jcbusqueda.addItem("dni");
        jcbusqueda.addItem("domicilio");
        jcbusqueda.addItem("estado");
    }

    public void cargarTabla() {

        PropietarioData propietariodata = new PropietarioData();
        for (Propietario prop : propietariodata.listarPropietarios()) {

            modelo.addRow(new Object[]{prop.getIdPropietario(), prop.getNombre(), prop.getApellido(), prop.getTelefono(), prop.getDni(), prop.getDomicilio(), prop.isEstado()});
        }

    }

    public void filtrarTabla(String palabraABuscar) {

    }

    private void borrarDatos() {

        int f = modelo.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }

    }

    public boolean validarCadena(String cadena) {
        // Utilizamos una expresión regular para verificar si la cadena contiene solo letras y espacios en blanco
        // ^ indica el inicio de la cadena, [a-zA-Z ]+ permite letras mayúsculas y minúsculas y espacios en blanco,
        // y $ indica el final de la cadena.
        return cadena.matches("^[a-zA-Z ]+$");
    }

}
