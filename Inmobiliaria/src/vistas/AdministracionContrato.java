
package vistas;

import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import inmobiliaria.entidades.Contrato;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Inquilino;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import java.time.LocalDate;

import java.time.ZoneId;
import java.util.Date;

public class AdministracionContrato extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    private ContratoData contData = new ContratoData();

    public AdministracionContrato() {
        initComponents();

        rellenarInmuebles();

        rellenarInquilinos();

        cargarCabeceraInm();
        
        cargarCabeceraInq();
        
        borrarFila();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfechainicio = new com.toedter.calendar.JDateChooser();
        jtfechafin = new com.toedter.calendar.JDateChooser();
        jComboinmuebles = new javax.swing.JComboBox<>();
        jComboinquilinos = new javax.swing.JComboBox<>();
        jbalta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTinmueble = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTinquilino = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ALTA DE CONTRATO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("FECHA INICIO :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("FECHA FIN :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("INMUEBLE :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("INQUILINO :");

        jComboinmuebles.setSelectedItem(-1);
        jComboinmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboinmueblesActionPerformed(evt);
            }
        });

        jComboinquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboinquilinosActionPerformed(evt);
            }
        });

        jbalta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbalta.setText("INGRESAR");
        jbalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaltaActionPerformed(evt);
            }
        });

        jTinmueble.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTinmueble);

        jTinquilino.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTinquilino);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jbalta))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfechafin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfechainicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboinmuebles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboinquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(278, 278, 278))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41))
                        .addComponent(jtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboinmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboinquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbalta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaltaActionPerformed

        try {

            Date fechaInicio = (Date) jtfechainicio.getDate();
            Date fechaFin = (Date) jtfechafin.getDate();

            LocalDate fecha1 = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fecha2 = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Inmueble inmueble = (Inmueble) jComboinmuebles.getSelectedItem();
            Inquilino inquilino = (Inquilino) jComboinquilinos.getSelectedItem();
            double monto = inmueble.getPrecio();
            boolean estado = true;

            Contrato cont = new Contrato(fecha1, fecha2, monto, estado, inquilino, inmueble);
            contData.crearContrato(cont);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jbaltaActionPerformed

    private void jComboinmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboinmueblesActionPerformed
        if  ( modelo.getRowCount()>0){
          modelo.removeRow(0);
        }
        InmuebleData inmData = new InmuebleData();

        Inmueble inm = (Inmueble) jComboinmuebles.getSelectedItem();
        
        modelo.addRow(new Object[]{inm.getIdInmueble(), inm.getTipo(), inm.getSuperficie(), inm.getPrecio(), inm.getDisponibilidad(), inm.getPropid(), inm.isEstado()});
    }//GEN-LAST:event_jComboinmueblesActionPerformed

    private void jComboinquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboinquilinosActionPerformed
         if  ( modelo2.getRowCount()>0){
          modelo2.removeRow(0);
        }
        InquilinoData inqData = new InquilinoData();

        Inquilino inq = (Inquilino) jComboinquilinos.getSelectedItem();
        
        modelo2.addRow(new Object[]{inq.getIdInquilino(), inq.getLugarTrabajo(), inq.getNombreGarante(), inq.getDniGarante(),inq.isEstado()});
    }//GEN-LAST:event_jComboinquilinosActionPerformed

    public void rellenarInmuebles() {
        InmuebleData inmData = new InmuebleData();

        ArrayList<Inmueble> ListInm = new ArrayList<>(inmData.listarInmuebles());

        for (Inmueble a : ListInm) {
            jComboinmuebles.addItem(a);

        }
    }

    public void rellenarInquilinos() {
        InquilinoData inquiData = new InquilinoData();

        ArrayList<Inquilino> ListInq = new ArrayList<>(inquiData.listarInquilinos());

        for (Inquilino i : ListInq) {
            jComboinquilinos.addItem(i);
        }
    }

    public void cargarCabeceraInm() {
        modelo.addColumn("Id Inmueble");
        modelo.addColumn("Tipo");
        modelo.addColumn("Superficie");
        modelo.addColumn("Precio");
        modelo.addColumn("Disponibilidad");
        modelo.addColumn("Propietrario");
        modelo.addColumn("Estado");
        jTinmueble.setModel(modelo);
    }
    
    public void cargarCabeceraInq() {
        modelo2.addColumn("Id Iquilino");
        modelo2.addColumn("Trabajo");
        modelo2.addColumn("Garante");
        modelo2.addColumn("Dni Garante");
        modelo2.addColumn("Estado");
        jTinquilino.setModel(modelo2);
    }

    private void borrarFila() {
        int f = jTinmueble.getRowCount() - 1;

        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Inmueble> jComboinmuebles;
    private javax.swing.JComboBox<Inquilino> jComboinquilinos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTinmueble;
    private javax.swing.JTable jTinquilino;
    private javax.swing.JButton jbalta;
    private com.toedter.calendar.JDateChooser jtfechafin;
    private com.toedter.calendar.JDateChooser jtfechainicio;
    // End of variables declaration//GEN-END:variables
}
