/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import acceso_a_datos.InmuebleData;
import inmobiliaria.entidades.Inmueble;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
        centrarTexto();
        
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
        jLabel2 = new javax.swing.JLabel();
        jcbusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInmuebles = new javax.swing.JTable();
        jbsalir = new javax.swing.JButton();
        jbrestablecer = new javax.swing.JButton();
        jbguardarcambios = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jtLetra = new javax.swing.JTextField();
        jOrden = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1030, 618));
        setMinimumSize(new java.awt.Dimension(1030, 618));
        setPreferredSize(new java.awt.Dimension(1030, 610));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("BUSCAR POR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, -1));

        jcbusqueda.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jcbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 170, 27));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 550, 170));

        jbsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(51, 51, 51));
        jbsalir.setText("SALIR");
        jbsalir.setBorderPainted(false);
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 120, -1));

        jbrestablecer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbrestablecer.setForeground(new java.awt.Color(51, 51, 51));
        jbrestablecer.setText("RESTABLECER");
        jbrestablecer.setBorderPainted(false);
        jbrestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestablecerActionPerformed(evt);
            }
        });
        jPanel1.add(jbrestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 180, -1));

        jbguardarcambios.setBackground(new java.awt.Color(153, 153, 153));
        jbguardarcambios.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jbguardarcambios.setForeground(new java.awt.Color(51, 51, 51));
        jbguardarcambios.setText("GUARDAR CAMBIOS");
        jbguardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarcambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jbguardarcambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 500, -1));

        jbeliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbeliminar.setForeground(new java.awt.Color(51, 51, 51));
        jbeliminar.setText("ELIMINAR");
        jbeliminar.setBorderPainted(false);
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 170, -1));

        jtLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtLetraKeyReleased(evt);
            }
        });
        jPanel1.add(jtLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 210, 30));

        jOrden.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jOrden.setForeground(new java.awt.Color(51, 51, 51));
        jOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Direccion", "Tipo", "Superficie", "Precio", "Disponibilidad" }));
        jOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(jOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 170, 30));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ORDENAR POR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("ESTADO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, 30));

        jEstado.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activo", "Inactivo" }));
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/LABEL BUSCAR INMUEBLE.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setMinimumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setPreferredSize(new java.awt.Dimension(576, 1280));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 510, 660));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 640, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jEstado.setSelectedIndex(0);
        jOrden.setSelectedIndex(0);
    }//GEN-LAST:event_jbrestablecerActionPerformed

    private void jbguardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarcambiosActionPerformed
 InmuebleData inmudata = new InmuebleData();

        int fila = jtInmuebles.getSelectedRow();

        Inmueble i = new Inmueble();

        try {
           
            String idinmueble = String.valueOf( jtInmuebles.getValueAt(fila, 0));
           
            String direccion = (String) jtInmuebles.getValueAt(fila, 1);
          
            String altura = String.valueOf(jtInmuebles.getValueAt(fila, 2));
           
            String tipo = (String) jtInmuebles.getValueAt(fila, 3);
         
            String superficie = String.valueOf(jtInmuebles.getValueAt(fila, 4));
           
            String precio = String.valueOf(jtInmuebles.getValueAt(fila, 5));
           
            String disponibilidad = (String) jtInmuebles.getValueAt(fila, 6);
           
            String idpropietario = (String.valueOf( jtInmuebles.getValueAt(fila, 7)));
           
            String estado = (String.valueOf(jtInmuebles.getValueAt(fila, 8))) ;

            if ((validarCampoTexto(direccion)) && (validarCampoNumerico(altura)) && (validarCampoTexto(tipo)) && (validarCampoNumericoDouble(superficie)) && (validarCampoNumericoDouble(precio)) && (validarCampoTexto(disponibilidad)) && (validarCampoNumerico(idpropietario))) {

                i.setIdInmueble(Integer.parseInt(idinmueble));
                i.setDireccion(direccion);
                i.setAltura(Integer.parseInt(altura));
                i.setTipo(tipo);
                i.setSuperficie(Double.parseDouble(superficie));
                i.setAltura(Integer.parseInt(altura));
                i.setPrecio(Double.parseDouble(precio));
                i.setDisponibilidad(disponibilidad);
                i.setPropid(Integer.parseInt(idpropietario));
                i.setEstado(Boolean.parseBoolean(estado));

                inmudata.actualizarInmueble(i);
                borrarDatos();
                jtLetra.setText("");
                cargarTabla();
            }
        } catch (Exception e) {
            System.out.println("e" + e.getMessage());
        }
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

    private void jOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrdenActionPerformed
        ordenarTabla();
    }//GEN-LAST:event_jOrdenActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
        ordenarTabla();
    }//GEN-LAST:event_jEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardarcambios;
    private javax.swing.JButton jbrestablecer;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbusqueda;
    private javax.swing.JTable jtInmuebles;
    private javax.swing.JTextField jtLetra;
    // End of variables declaration//GEN-END:variables

    private void ordenarTabla(){
        String eleccion = (String) jOrden.getSelectedItem();
        String estado = (String) jEstado.getSelectedItem();
        int act = 3;
        
        if (jEstado.getSelectedItem()!=null){
            if (estado=="Activo"){
                act = 1;
            }else if (estado=="Inactivo"){
                act = 0;
            }else{
                act = 3;
            }
        }
        
        InmuebleData inmData = new InmuebleData();

        switch (eleccion){
            case "Id" :
            borrarDatos();
            for (Inmueble i : inmData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
            }
            break;
            case "Direccion":
            borrarDatos();
            for (Inmueble i : inmData.ordenarX(eleccion, act)) {
               modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
            }
            break;
            case "Tipo":
            borrarDatos();
            for (Inmueble i : inmData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
            }
            break;
            case "Superficie":
            borrarDatos();
            for (Inmueble i : inmData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
            }
            break;
            case "Precio":
            borrarDatos();
            for (Inmueble i : inmData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
            }
            break;
            case "Disponibilidad":
            borrarDatos();
            for (Inmueble i : inmData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{i.getIdInmueble(), i.getDireccion(), i.getAltura(), i.getTipo(), i.getSuperficie(), i.getPrecio(), i.getDisponibilidad(), i.getPropid(), i.isEstado()});
            }
            break;
        }
    }
    
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
        JTableHeader headerimn = jtInmuebles.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));
        
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
    
    public void centrarTexto(){
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            jtInmuebles.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
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
    
    public boolean validarCadena(String cadena) {
        // Utilizamos una expresión regular para verificar si la cadena contiene solo letras y espacios en blanco
        // ^ indica el inicio de la cadena, [a-zA-Z ]+ permite letras mayúsculas y minúsculas y espacios en blanco,
        // y $ indica el final de la cadena.
        return cadena.matches("^[a-zA-Z ]+$");
    }

    //metodos validadores de numeros
    public boolean validarCampoNumerico(String textfield) {
        if (textfield.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");

            return false;

        } else if (!textfield.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "El campo solo puede contener numeros.");

            return false;
        }
        return true;
    }

    //metodos validadores de texto
    public boolean validarCampoTexto(String textfield) {
        if (textfield.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");

            return false;
        } else if (!textfield.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ'\\s]+$")) {
            JOptionPane.showMessageDialog(null, "El campo solo puede contener letras.");

            return false;
        }
        return true;
    }
      public boolean validarCampoNumericoDouble(String textfield) {
        if (textfield.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios.");

            return false;

        } else if (!textfield.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?")) {
            JOptionPane.showMessageDialog(null, "El campo solo puede contener numeros.");

            return false;
        }
        return true;
    }

}
