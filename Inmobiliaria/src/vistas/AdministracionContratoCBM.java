
package vistas;

import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import inmobiliaria.entidades.Contrato;
import inmobiliaria.entidades.Inmobiliaria;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Inquilino;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class AdministracionContratoCBM extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public boolean isCellEditable(int a, int c) {
            return (c != 0) && (c != 6);
    }
    
    public AdministracionContratoCBM() {
        initComponents();
        cargarCabecera();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCopciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
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
            
            if (inqui != null && contData != null) {
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
            
             if (inm != null && contData != null) {
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
        borrarDatos();
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

    public void rellenarTaba(){
        ContratoData contData = new ContratoData();
        contData.listarContratos();
        
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jContratos;
    private javax.swing.JComboBox<Inmobiliaria> jCopciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardarcambios;
    private javax.swing.JButton jbrestablecer;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcbusqueda;
    // End of variables declaration//GEN-END:variables
}
