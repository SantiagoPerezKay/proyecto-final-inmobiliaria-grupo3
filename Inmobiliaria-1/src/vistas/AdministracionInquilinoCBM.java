/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import acceso_a_datos.InquilinoData;
import inmobiliaria.entidades.Inquilino;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class AdministracionInquilinoCBM extends javax.swing.JInternalFrame {
 DefaultTableModel modelo = new DefaultTableModel(){
         @Override
        public boolean isCellEditable(int a, int c) {
            return (c != 0) && (c != 7);
        }
};
    public AdministracionInquilinoCBM() {
        initComponents();
        cargarCombo();
        cargarCabecera();
        cargarTabla();
        centrarTexto();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtpalabra = new javax.swing.JTextField();
        jcbusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtinquilinos = new javax.swing.JTable();
        jbrestablecer = new javax.swing.JButton();
        jbguardarcambios = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jOrden = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1060, 660));
        setMinimumSize(new java.awt.Dimension(1060, 660));
        setPreferredSize(new java.awt.Dimension(1060, 660));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 630));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("BUSCAR POR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 140, -1));

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
        jPanel1.add(jtpalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 240, 30));

        jcbusqueda.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jcbusqueda.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jcbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 90, 30));

        jtinquilinos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtinquilinos.setForeground(new java.awt.Color(51, 51, 51));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 600, 170));

        jbrestablecer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbrestablecer.setForeground(new java.awt.Color(51, 51, 51));
        jbrestablecer.setText("RESTABLECER");
        jbrestablecer.setBorderPainted(false);
        jbrestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestablecerActionPerformed(evt);
            }
        });
        jPanel1.add(jbrestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 170, -1));

        jbguardarcambios.setBackground(new java.awt.Color(153, 153, 153));
        jbguardarcambios.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jbguardarcambios.setForeground(new java.awt.Color(51, 51, 51));
        jbguardarcambios.setText("GUARDAR CAMBIOS");
        jbguardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarcambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jbguardarcambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 490, -1));

        jbeliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbeliminar.setForeground(new java.awt.Color(51, 51, 51));
        jbeliminar.setText("ELIMINAR");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 160, -1));

        jbsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(51, 51, 51));
        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 140, -1));

        jOrden.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jOrden.setForeground(new java.awt.Color(51, 51, 51));
        jOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Cuit", "Nombre", "Apellido" }));
        jOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(jOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 90, 30));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ORDENAR POR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 30));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("VER ESTADO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, -1, 30));

        jEstado.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jEstado.setForeground(new java.awt.Color(51, 51, 51));
        jEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activo", "Inactivo" }));
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/LABEL BUSCAR INQUILINO.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(576, 1280));
        jLabel3.setMinimumSize(new java.awt.Dimension(576, 1280));
        jLabel3.setPreferredSize(new java.awt.Dimension(576, 1280));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 510, 690));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 640, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtpalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtpalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtpalabraActionPerformed

    private void jbguardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarcambiosActionPerformed
        int fila = jtinquilinos.getSelectedRow();
       InquilinoData inquidata = new InquilinoData();

       
        Inquilino i = new Inquilino();
        
         try {
        String Nombre = (String) jtinquilinos.getValueAt(fila,1);
        String Apellido= (String)jtinquilinos.getValueAt(fila,2);
        String Cuit= (String)jtinquilinos.getValueAt(fila,3); 
        String LugarTrabajo =(String)jtinquilinos.getValueAt(fila,4);
        String NombreGarante = (String)jtinquilinos.getValueAt(fila,5);
        String DniGarante= (String)jtinquilinos.getValueAt(fila,6);
        
        if ((validarCampoTexto(Nombre)) && (validarCampoTexto(Apellido) && (validarCampoNumerico(Cuit))&& (validarCampoTexto(LugarTrabajo))&&(validarCampoTexto(NombreGarante))&& (validarCampoNumerico(DniGarante)))){
     
        i.setIdInquilino ((int) jtinquilinos.getValueAt(fila,0));
        i.setNombre(Nombre);
        i.setApellido(Apellido);
        i.setCuit(Cuit); 
        i.setLugarTrabajo(LugarTrabajo); 
        i.setNombreGarante(NombreGarante);
        i.setDniGarante(DniGarante); 
        i.setEstado((boolean)jtinquilinos.getValueAt(fila,7)); 
        
        inquidata.actualizarInquilino(i);
        borrarDatos();
        jtpalabra.setText("");
        cargarTabla();
        
        cargarTabla();
         }
       }catch (Exception e){
           System.out.println("erro:"+e.getMessage());
           
  }
    }//GEN-LAST:event_jbguardarcambiosActionPerformed

    private void jbrestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrestablecerActionPerformed
        borrarDatos();
        cargarTabla();
        jtpalabra.setText("");
        jEstado.setSelectedIndex(0);
        jOrden.setSelectedIndex(0);
    }//GEN-LAST:event_jbrestablecerActionPerformed

    private void jtpalabraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtpalabraKeyReleased
        borrarDatos();
        String letra = (String)jcbusqueda.getSelectedItem();
        InquilinoData inqui = new InquilinoData();
        
        switch (letra) {
            case "id_inquilino":
                for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getIdInquilino()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(), i.isEstado()});
                }            
            }
                break;
            case "nombre":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getNombre()).toLowerCase().startsWith(jtpalabra.getText().toLowerCase())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
                }            
            }
                break;    
             case "apellido":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getApellido()).toLowerCase().startsWith(jtpalabra.getText().toLowerCase())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
                }            
            }
                break;    
                
                 case "cuit":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getCuit()).toLowerCase().startsWith(jtpalabra.getText().toLowerCase())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
                }        
            }
                break;    
                
                 case "Lugar_trabajo":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getLugarTrabajo()).toLowerCase().startsWith(jtpalabra.getText().toLowerCase())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
                }        
            }
                break;    
                
                 case "nombre_garante":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getNombreGarante()).toLowerCase().startsWith(jtpalabra.getText().toLowerCase())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
                }            
            }
                break;    
                 case "dni_garante":
             for (Inquilino i:inqui.listarInquilinos()){
                    if (String.valueOf(i.getDniGarante()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
                }            
            }
                break;    
                
                 case "estado":
              for (Inquilino i:inqui.listarInquilinos()){
                  if (String.valueOf(i.isEstado()).startsWith(jtpalabra.getText())){
                        modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
                }
    }//GEN-LAST:event_jtpalabraKeyReleased
 
        break;
     }   
     }
        
        
    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
         InquilinoData inquidata = new InquilinoData();

        int fila = jtinquilinos.getSelectedRow();

        Inquilino in = new Inquilino();
        
        in.setIdInquilino((int) jtinquilinos.getValueAt(fila, 0));
        in.setNombre((String) jtinquilinos.getValueAt(fila, 1));
        in.setApellido((String) jtinquilinos.getValueAt(fila, 2));
        in.setCuit((String) jtinquilinos.getValueAt(fila, 3));
        in.setLugarTrabajo((String) jtinquilinos.getValueAt(fila, 4));
        in.setNombreGarante((String) jtinquilinos.getValueAt(fila, 5));
        in.setDniGarante((String) jtinquilinos.getValueAt(fila, 6));
        in.setEstado(false);

        inquidata.actualizarInquilino(in);
        borrarDatos();
        jtpalabra.setText("");
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
    private javax.swing.JTable jtinquilinos;
    private javax.swing.JTextField jtpalabra;
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
        
       InquilinoData inmData = new InquilinoData();

        switch (eleccion){
            case "Id" :
            borrarDatos();
            for (Inquilino i : inmData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
            }
            break;
            case "Cuit":
            borrarDatos();
            for (Inquilino i : inmData.ordenarX(eleccion, act)) {
              modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
            }
            break;
            case "Nombre":
            borrarDatos();
            for (Inquilino i : inmData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
            }
            break;
            case "Apellido":
            borrarDatos();
            for (Inquilino i : inmData.ordenarX(eleccion, act)) {
               modelo.addRow(new Object[]{i.getIdInquilino(), i.getNombre(), i.getApellido(), i.getCuit(), i.getLugarTrabajo(), i.getNombreGarante(), i.getDniGarante(),i.isEstado()});
            }
            break;
        }
    }
    
    public void cargarCombo() {
      

        jcbusqueda.addItem("id_inquilino");
        jcbusqueda.addItem("nombre");
        jcbusqueda.addItem("apellido");
        jcbusqueda.addItem("cuit");
        jcbusqueda.addItem("Lugar_trabajo");
        jcbusqueda.addItem("nombre_garante");
        jcbusqueda.addItem("dni_garante");
        jcbusqueda.addItem("estado");


}
    public void cargarCabecera() {
        JTableHeader headerimn = jtinquilinos.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        DefaultTableCellRenderer idCell = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));
       
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cuit");
        modelo.addColumn("Lugar Trabajo");
        modelo.addColumn("Nombre Garante");
        modelo.addColumn("DNI Garante");
        modelo.addColumn("Estado");
                
        jtinquilinos.setModel(modelo);
    }
    
    public void centrarTexto(){
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            jtinquilinos.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    public void cargarTabla() {

        InquilinoData inqui = new InquilinoData();
        for (Inquilino inquilino : inqui.listarInquilinos()) {
            modelo.addRow(new Object[]{inquilino.getIdInquilino(), inquilino.getNombre(),inquilino.getApellido(), inquilino.getCuit(), inquilino.getLugarTrabajo(), inquilino.getNombreGarante(), inquilino.getDniGarante(), inquilino.isEstado() });
        }

    }
     
       private void borrarDatos() {

        int f = jtinquilinos.getRowCount() - 1; //obtengo total de filas de la tabla

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
    
}