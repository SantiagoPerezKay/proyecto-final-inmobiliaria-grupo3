
package vistas;

import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import inmobiliaria.entidades.Contrato;
import inmobiliaria.entidades.Inmobiliaria;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Inquilino;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdministracionContratoCBM extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public boolean isCellEditable(int a, int c) {
            return (c != 0) && (c != 6);
    }
    
    public AdministracionContratoCBM() {
        initComponents();
        cargarCabecera();
        rellenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jcbusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jContratos = new javax.swing.JTable();
        jCopciones = new javax.swing.JComboBox<>();
        jbsalir = new javax.swing.JButton();
        jbrestablecer = new javax.swing.JButton();
        jbguardarcambios = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jtdesde = new com.toedter.calendar.JDateChooser();
        jthasta = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRfecha = new javax.swing.JRadioButton();
        jRmonto = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtminimo = new javax.swing.JTextField();
        jtmaximo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CONTRATO - CONSULTA Y MODIFICACION ");

        jLabel3.setText("BUSCAR POR:");

        jcbusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inquilino", "Inmueble" }));
        jcbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbusquedaActionPerformed(evt);
            }
        });

        jContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jContratos);

        jCopciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCopcionesActionPerformed(evt);
            }
        });

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

        jLabel4.setText("Desde :");

        jLabel5.setText("Hasta :");

        jRfecha.setText("Fecha");
        jRfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRfechaActionPerformed(evt);
            }
        });

        jRmonto.setText("Monto");

        jLabel6.setText("Min :");

        jLabel7.setText("Max :");

        jButton1.setText("APLICAR FILTROS");
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
                .addGap(0, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRfecha)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRmonto)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(jtminimo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jthasta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtmaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jCopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jbrestablecer)
                        .addGap(18, 18, 18)
                        .addComponent(jbguardarcambios)
                        .addGap(18, 18, 18)
                        .addComponent(jbeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbsalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtdesde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jthasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRfecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRmonto)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtminimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtmaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbrestablecer)
                    .addComponent(jbguardarcambios)
                    .addComponent(jbeliminar)
                    .addComponent(jbsalir))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbusquedaActionPerformed
        
        if (jCopciones != null) {
            jCopciones.removeAllItems();
        }
        
        String opc = (String) jcbusqueda.getSelectedItem();
        
        if (opc.equals("Inquilino")){
            
            InquilinoData inquiData = new InquilinoData();

            ArrayList<Inmobiliaria> ListInq = new ArrayList<>(inquiData.listarInquilinos());

            for (Inmobiliaria i : ListInq) {

                jCopciones.addItem(i);
            }   
        }   
        
        if (opc.equals("Inmueble")) {
             
            InmuebleData inmData = new InmuebleData();

            ArrayList<Inmobiliaria> ListInm = new ArrayList<>(inmData.listarInmuebles());

            for (Inmobiliaria a : ListInm) {

                jCopciones.addItem(a);
            }
        }
    }//GEN-LAST:event_jcbusquedaActionPerformed

    private void jCopcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCopcionesActionPerformed
        ArrayList<Contrato> Listcont = new ArrayList<>();
        
        String opc = (String)jcbusqueda.getSelectedItem();
        
        if (opc.equals("Inquilino")){
            
            opc="inquilino";
            Inquilino inqui = (Inquilino)jCopciones.getSelectedItem();
            ContratoData contData = new ContratoData();
            
            if (inqui != null) {
                borrarDatos();
                Listcont = contData.listarContratosX(opc, inqui.getIdInquilino());
            } else {
                System.out.println("Alguno de los elementos es nulo");
            }
            
            for(Contrato c : Listcont){
            modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio(), c.getFechaFin(), c.getMonto(),c.getIdinq(), c.getIdimb(), c.isEstado()});
            }
            
        } else {
           
            opc="inmueble";
            Inmueble inm = (Inmueble)jCopciones.getSelectedItem();
            ContratoData contData = new ContratoData();
            
             if (inm != null) {
                borrarDatos();
                Listcont = (contData.listarContratosX(opc, inm.getIdInmueble()));
            } else {
                System.out.println("Alguno de los elementos es nulo");
            }
            
            for(Contrato c : Listcont){
            modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(),c.getIdinq(), c.getIdimb(), c.isEstado()});
            }
            
        }
    }//GEN-LAST:event_jCopcionesActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbrestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrestablecerActionPerformed
        rellenarTabla();
        limpiarCampos();
    }//GEN-LAST:event_jbrestablecerActionPerformed

    private void jbguardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarcambiosActionPerformed

        ContratoData contdata = new ContratoData();

        int fila = jContratos.getSelectedRow();

        Contrato c = new Contrato();

        c.setIdContrato((int)jContratos.getValueAt(fila,0));
        
        String valorinicio = String.valueOf(jContratos.getValueAt(fila,1));
        c.setFechaInicio(Date.valueOf(valorinicio).toLocalDate());
        
        String valorFin = String.valueOf(jContratos.getValueAt(fila,2));
        c.setFechaFin(Date.valueOf(valorFin).toLocalDate());
        
        String valor = String.valueOf(jContratos.getValueAt(fila,3));
        c.setMonto(Double.parseDouble(valor));

        c.setIdinq((int)jContratos.getValueAt(fila,4));

        c.setIdimb((int)jContratos.getValueAt(fila,5));

        c.setEstado((boolean) jContratos.getValueAt(fila, 6));

        System.out.println(c);

        contdata.actualizarContrato(c);
        borrarDatos();
    }//GEN-LAST:event_jbguardarcambiosActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        int fila = jContratos.getSelectedRow();
        int id = (int)jContratos.getValueAt(fila,0);
        
        ContratoData contData = new ContratoData();
        contData.borrarContrato(id);
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jRfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRfechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(!jRfecha.isSelected() && !jRmonto.isSelected()){
           JOptionPane.showMessageDialog(null, "Por favor indique al menos un filtro para aplicar");
        }
        
        if (jRfecha.isSelected() && !jRmonto.isSelected())   {
            if (jtdesde.getDate() == null || jthasta.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Por favor rellene los campos de fecha para realizar la busqueda");
            }else{
                LocalDate desde = jtdesde.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate hasta = jthasta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                if (desde.isAfter(hasta)) {
                    JOptionPane.showMessageDialog(null, "La fecha final no puede ser anterior a la inicial. Ingrese una fecha correcta.");
                }

                ContratoData contData = new ContratoData();
                ArrayList<Contrato> Listcont = new ArrayList<>();
                
                Listcont = contData.listarContratosXfecha(desde,hasta);
                
                if (Listcont.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                } else {
                    borrarDatos();
                    for (Contrato c : Listcont) {
                        modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                    }     
                }
            }
        }
        
        if (jRmonto.isSelected() && !jRfecha.isSelected()){
            if (jtminimo == null || jtmaximo == null){
                JOptionPane.showMessageDialog(null, "Por favor rellene los campos de monto para realizar la busqueda");
            } else  {
                double min = Double.parseDouble(jtminimo.getText());
                double max = Double.parseDouble(jtmaximo.getText());
                
                if (min>max) {
                    JOptionPane.showMessageDialog(null, "El monto máximo no puede ser menor que el minimo. Por favor ingrese un monto correcto.");
                }
                
                ContratoData contData = new ContratoData();
                ArrayList<Contrato> Listcont = new ArrayList<>();
                
                Listcont = contData.listarContratosXmonto(min,max);
                
                if (Listcont.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                } else {
                    borrarDatos();
                    for (Contrato c : Listcont) {
                        modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                    }     
                }
            } 
        }
        
        if (jRfecha.isSelected() && jRmonto.isSelected()){
            if ((jtdesde.getDate() == null || jthasta.getDate() == null) && (jtminimo == null || jtmaximo == null))  {
                JOptionPane.showMessageDialog(null, "Por favor rellene los campos de fecha y monto para realizar la busqueda");
            }else{
                LocalDate desde = jtdesde.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate hasta = jthasta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                double min = Double.parseDouble(jtminimo.getText());
                double max = Double.parseDouble(jtmaximo.getText());
                
                if (desde.isAfter(hasta)) {
                    JOptionPane.showMessageDialog(null, "La fecha final no puede ser anterior a la inicial. Ingrese una fecha correcta.");
                }
                if (min>max) {
                    JOptionPane.showMessageDialog(null, "El monto máximo no puede ser menor que el minimo. Por favor ingrese un monto correcto.");
                }

                ContratoData contData = new ContratoData();
                ArrayList<Contrato> Listcont = new ArrayList<>();
                
                Listcont = contData.listarContratosXfiltros(desde,hasta,min,max);
                
                if (Listcont.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                } else {
                    borrarDatos();
                    for (Contrato c : Listcont) {
                        modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                    }     
                }
            }
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void rellenarTabla(){
        ContratoData contData = new ContratoData();
        
        for(Contrato c : contData.listarContratos()){
            modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(),c.getIdinq(), c.getIdimb(), c.isEstado()});
            }
        
    }
    
    public void cargarCabecera() {
        modelo.addColumn("Id Contrato");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Fecha de fin");
        modelo.addColumn("Monto ");
        modelo.addColumn("Id Inquilino");
        modelo.addColumn("Id Inmueble");
        modelo.addColumn("Estado");
        jContratos.setModel(modelo);
    }
    
    private void borrarDatos() {

        int f = modelo.getRowCount() - 1; //obtengo total de filas de la tabla

        for (; f >= 0; f--) { //recorro filas para borrar 1 por 1 en iteracion.

            modelo.removeRow(f);// remuevo valor por indice en la tabla "jcTable"
        }
    }
    
    private void limpiarCampos(){
         jtdesde.setDate(null);
        jthasta.setDate(null);
        jtminimo.setText("");
        jtmaximo.setText("");
        jRfecha.setSelected(false);
        jRmonto.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jContratos;
    private javax.swing.JComboBox<Inmobiliaria> jCopciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRfecha;
    private javax.swing.JRadioButton jRmonto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardarcambios;
    private javax.swing.JButton jbrestablecer;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbusqueda;
    private com.toedter.calendar.JDateChooser jtdesde;
    private com.toedter.calendar.JDateChooser jthasta;
    private javax.swing.JTextField jtmaximo;
    private javax.swing.JTextField jtminimo;
    // End of variables declaration//GEN-END:variables
}
