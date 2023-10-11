
package vistas;

import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import inmobiliaria.entidades.Contrato;
import inmobiliaria.entidades.Inmobiliaria;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Inquilino;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class AdministracionContratoCBM extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCopciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
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
                .addGap(230, 230, 230))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbusquedaActionPerformed
        String opc = (String)jcbusqueda.getSelectedItem();
        
        if (opc.equals("Inquilino")){
            jCopciones.removeAllItems();
            
            InquilinoData inquiData = new InquilinoData();

            ArrayList<Inquilino> ListInq = new ArrayList<>(inquiData.listarInquilinos());

            for (Inquilino i : ListInq) {
                jCopciones.addItem(i);
            }
            
        } else {
            
            jCopciones.removeAllItems();
             
            InmuebleData inmData = new InmuebleData();

            ArrayList<Inmueble> ListInm = new ArrayList<>(inmData.listarInmuebles());

            for (Inmueble a : ListInm) {
                jCopciones.addItem(a);
            }
        }
    }//GEN-LAST:event_jcbusquedaActionPerformed

    private void jCopcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCopcionesActionPerformed
        String opc = (String)jcbusqueda.getSelectedItem();
        
        if (opc.equals("Inquilino")){
            opc="inquilino";
            Inquilino inqui = (Inquilino)jCopciones.getSelectedItem();
            ContratoData contData = new ContratoData();
            
            ArrayList<Contrato> Listcont = new ArrayList<>(contData.listarContratosX(opc, inqui.getIdInquilino()));
            
            for(Contrato c : Listcont){
            modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio(), c.getFechaFin(), c.getMonto(),c.getInquilino(), c.getInmueble(), c.isEstado()});
            }
            
        } else {
            
            opc="inmueble";
            Inmueble inm = (Inmueble)jCopciones.getSelectedItem();
            ContratoData contData = new ContratoData();
            
            ArrayList<Contrato> Listcont = new ArrayList<>(contData.listarContratosX(opc, inm.getIdInmueble()));
            
            for(Contrato c : Listcont){
            modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio(), c.getFechaFin(), c.getMonto(),c.getInquilino(), c.getInmueble(), c.isEstado()});
            }
            
        }
    }//GEN-LAST:event_jCopcionesActionPerformed

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
    private javax.swing.JComboBox<String> jcbusqueda;
    // End of variables declaration//GEN-END:variables
}
