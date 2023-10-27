
package vistas;

import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import inmobiliaria.entidades.Contrato;
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
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;



public class AdministracionContratoCBM extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public boolean isCellEditable(int a, int c) {
            return (c != 0) && (c != 5) && (c != 6);
    }
    
    
    
    public AdministracionContratoCBM() {
        initComponents();
        cargarCabecera();
        rellenarTabla();
        centrarTexto();
    }
    
    public void centrarTexto(){
       
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            jContratos.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        alertafechas = new javax.swing.JTextField();
        alertamonto = new javax.swing.JTextField();
        alertas = new javax.swing.JTextField();
        alertas2 = new javax.swing.JTextField();
        jOrden = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jEstado = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1280, 1024));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setText("BUSCAR POR:");

        jcbusqueda.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
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

        jCopciones.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jCopciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCopcionesActionPerformed(evt);
            }
        });

        jbsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jbrestablecer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbrestablecer.setText("RESTABLECER");
        jbrestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestablecerActionPerformed(evt);
            }
        });

        jbguardarcambios.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jbguardarcambios.setText("GUARDAR CAMBIOS");
        jbguardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarcambiosActionPerformed(evt);
            }
        });

        jbeliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbeliminar.setText("ELIMINAR");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Desde :");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Hasta :");

        jRfecha.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jRfecha.setText("FECHA");
        jRfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRfechaActionPerformed(evt);
            }
        });

        jRmonto.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jRmonto.setText("MONTO");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Min :");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Max :");

        jtminimo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jtminimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtminimoKeyReleased(evt);
            }
        });

        jtmaximo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jtmaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtmaximoKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton1.setText("APLICAR FILTROS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        alertafechas.setBorder(null);

        alertamonto.setBorder(null);

        alertas.setBackground(new java.awt.Color(240, 240, 240));
        alertas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alertas.setBorder(null);
        alertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertasActionPerformed(evt);
            }
        });

        alertas2.setBackground(new java.awt.Color(240, 240, 240));
        alertas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alertas2.setBorder(null);

        jOrden.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Fecha inicio", "Fecha fin", "Monto" }));
        jOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setText("Ordenar lista por: ");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setText("Mostrar estado :");

        jEstado.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activo", "Inactivo" }));
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jCopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRfecha)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRmonto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtdesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtminimo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jthasta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtmaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(alertafechas)
                            .addComponent(alertamonto, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(alertas2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(alertas, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbguardarcambios)
                                            .addGap(178, 178, 178)))
                                    .addGap(121, 121, 121))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbrestablecer)
                        .addGap(44, 44, 44)
                        .addComponent(jbeliminar)
                        .addGap(34, 34, 34)
                        .addComponent(jbsalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtdesde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jRfecha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRmonto)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtminimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jthasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtmaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(alertafechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertamonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alertas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbguardarcambios)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbrestablecer)
                        .addComponent(jbeliminar))
                    .addComponent(jbsalir))
                .addGap(237, 237, 237))
        );

        jtdesde.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())){
                    if (jthasta.getDate()!=null){
                        if(jtdesde.getDate().after(jthasta.getDate())){
                            alertafechas.setText("La fecha de inicio del contrato no puede ser posterior a la final. Ingrese una fecha correcta.");
                        }else{
                            alertafechas.setText(null);
                        }
                    }
                }
            }
        });
        jthasta.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())){
                    if (jtdesde.getDate()!=null){
                        if(jtdesde.getDate().after(jthasta.getDate())){
                            alertafechas.setText("La fecha final del contrato no puede ser anterior a la inicial. Ingrese una fecha correcta.");
                        }else{
                            alertafechas.setText(null);
                        }
                    }
                }
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbusquedaActionPerformed
        
        if (jCopciones != null) {
            jCopciones.removeAllItems();
        }
        String opc = (String) jcbusqueda.getSelectedItem();
        
        if (opc.equals("Inquilino")){
            
            InquilinoData inquiData = new InquilinoData();
            ArrayList<Inquilino> ListInq = new ArrayList<>(inquiData.listarInquilinos());

            for (Inquilino i : ListInq) {

                jCopciones.addItem(i);
            }   
        }   
        
        if (opc.equals("Inmueble")) {
             
            InmuebleData inmData = new InmuebleData();
            ArrayList<Inmueble> ListInm = new ArrayList<>(inmData.listarInmuebles());

            for (Inmueble a : ListInm) {

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
        borrarDatos();
        rellenarTabla();
        limpiarCampos();   
    }//GEN-LAST:event_jbrestablecerActionPerformed

    private void jbguardarcambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarcambiosActionPerformed

        ContratoData contdata = new ContratoData();

        int fila = jContratos.getSelectedRow();

        Contrato c = new Contrato();

        c.setIdContrato((int)jContratos.getValueAt(fila,0));       

        c.setIdinq((int)jContratos.getValueAt(fila,4));
        c.setIdimb((int)jContratos.getValueAt(fila,5));
        c.setEstado((boolean) jContratos.getValueAt(fila, 6));

        System.out.println(c);
        
        
  
        try{
            String valorInicio = String.valueOf(jContratos.getValueAt(fila,1));
            c.setFechaInicio(Date.valueOf(valorInicio).toLocalDate()); 
            
            String valorFin = String.valueOf(jContratos.getValueAt(fila,2));
            c.setFechaFin(Date.valueOf(valorFin).toLocalDate());
            
            alertas.setText("");
            
            if(Date.valueOf(valorInicio).toLocalDate().isAfter(Date.valueOf(valorFin).toLocalDate())){
            alertas.setText("La fecha de inicio no puede ser posterior a la del fin del contrato.");
            } else{
                alertas.setText("");
            }   
        }catch (IllegalArgumentException e){
            alertas.setText("Ingrese una fecha valida. YYYY-MM-DD.");
        }
        
        
        
        try{
            String valor = String.valueOf(jContratos.getValueAt(fila,3));
            c.setMonto(Double.parseDouble(valor));
            alertas2.setText("");
        } catch (NumberFormatException e){
            alertas2.setText("El monto solo puede contener numeros.");
        }
        
        if (("".equals(alertas.getText()) || alertas.getText()==null) && ("".equals(alertas2.getText()) || alertas2.getText()==null)){
            
            contdata.actualizarContrato(c);
            borrarDatos();
            rellenarTabla();
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor verifique que los campos sean correctos para continuar.");
        } 
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
       if(!jRfecha.isSelected() && !jRmonto.isSelected()){  //---------------------------------------------------------------------------------------------ningun filtro seleccionado
           JOptionPane.showMessageDialog(null, "Por favor indique al menos un filtro para aplicar");
        }
        
        if (jRfecha.isSelected() && !jRmonto.isSelected()){  //------------------------------------------------------------------------------------------- filtro fecha seleccionado          
            if ("".equals(alertafechas.getText()) || alertafechas.getText()==null) {
                LocalDate desde = jtdesde.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate hasta = jthasta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                if (desde.isAfter(hasta)) {
                    JOptionPane.showMessageDialog(null, "La fecha final no puede ser anterior a la inicial. Ingrese una fecha correcta.");
                }
                
                if(jCopciones.getSelectedItem()!= null){ //----- Si hay una opcion seleccionada:
                    ArrayList<Contrato> Listcont = new ArrayList<>();        
                    String opc = (String)jcbusqueda.getSelectedItem();

                    if (opc.equals("Inquilino")){//----------------------------- si hay un inquilino seleccionado

                        opc="inquilino";
                        Inquilino inqui = (Inquilino)jCopciones.getSelectedItem();
                        ContratoData contData = new ContratoData();

                        if (inqui != null) {
                            borrarDatos();
                            Listcont = contData.listarContratosXfechaANDid(desde,hasta,opc, inqui.getIdInquilino());
                            System.out.println(Listcont);
                        } else {
                            System.out.println("Alguno de los elementos es nulo");
                        }

                        if (Listcont.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                        } else {
                            borrarDatos();
                            for (Contrato c : Listcont) {
                                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                            }     
                        } 
                    } else { // ----------------------------------------------si hay un inmueble seleccionado

                        opc="inmueble";
                        Inmueble inm = (Inmueble)jCopciones.getSelectedItem();
                        ContratoData contData = new ContratoData();

                         if (inm != null) {
                            borrarDatos();
                            Listcont = contData.listarContratosXfechaANDid(desde,hasta,opc, inm.getIdInmueble());
                        } else {
                            System.out.println("Alguno de los elementos es nulo");
                        }

                        if (Listcont.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                        } else {
                            borrarDatos();
                            for (Contrato c : Listcont) {
                                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                            }     
                        }     
                    }            
                }else{ //----- Si NO hay una opcion seleccionada:
                
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
            }else{ 
                JOptionPane.showMessageDialog(null, "Por favor verifique los campos de fecha para realizar la busqueda");
            }
        }
        
        if (jRmonto.isSelected() && !jRfecha.isSelected()){ //------------------------------------------------------------------------------------------------ filtro monto seleccionado    
            if ("".equals(alertamonto.getText()) || alertamonto.getText()==null){
                double min = Double.parseDouble(jtminimo.getText());
                double max = Double.parseDouble(jtmaximo.getText());
                
                if (min>max) {
                    JOptionPane.showMessageDialog(null, "El monto máximo no puede ser menor que el minimo. Por favor ingrese un monto correcto.");
                }
                
                if(jCopciones.getSelectedItem()!= null){ //----- Si hay una opcion seleccionada:
                    ArrayList<Contrato> Listcont = new ArrayList<>();        
                    String opc = (String)jcbusqueda.getSelectedItem();

                    if (opc.equals("Inquilino")){//----------------------------- si hay un inquilino seleccionado

                        opc="inquilino";
                        Inquilino inqui = (Inquilino)jCopciones.getSelectedItem();
                        ContratoData contData = new ContratoData();

                        if (inqui != null) {
                            borrarDatos();
                            Listcont = contData.listarContratosXmontoANDid(min,max,opc, inqui.getIdInquilino());
                            System.out.println(Listcont);
                        } else {
                            System.out.println("Alguno de los elementos es nulo");
                        }

                        if (Listcont.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                        } else {
                            borrarDatos();
                            for (Contrato c : Listcont) {
                                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                            }     
                        } 
                    } else { // ----------------------------------------------si hay un inmueble seleccionado

                        opc="inmueble";
                        Inmueble inm = (Inmueble)jCopciones.getSelectedItem();
                        ContratoData contData = new ContratoData();

                        if (inm != null) {
                            borrarDatos();
                            Listcont = contData.listarContratosXmontoANDid(min,max,opc,inm.getIdInmueble());
                        } else {
                            System.out.println("Alguno de los elementos es nulo");
                        }

                        if (Listcont.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                        } else {
                            borrarDatos();
                            for (Contrato c : Listcont) {
                                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                            }     
                        }     
                    }             
                }else{ //----- Si NO hay una opcion seleccionada:
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
            } else {    
                JOptionPane.showMessageDialog(null, "Por favor verifique los campos de monto para realizar la busqueda");
            } 
        }
        
        if (jRfecha.isSelected() && jRmonto.isSelected()) { //------------------------------------------------------------------------------------------------- filtro fecha y monto seleccionado    
            if (("".equals(alertafechas.getText()) || alertafechas.getText() == null) || ("".equals(alertamonto.getText()) || alertamonto.getText() == null)) {
                LocalDate desde = jtdesde.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate hasta = jthasta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                double min = Double.parseDouble(jtminimo.getText());
                double max = Double.parseDouble(jtmaximo.getText());

                if (desde.isAfter(hasta)) {
                    JOptionPane.showMessageDialog(null, "La fecha final no puede ser anterior a la inicial. Ingrese una fecha correcta.");
                }
                if (min > max) {
                    JOptionPane.showMessageDialog(null, "El monto máximo no puede ser menor que el minimo. Por favor ingrese un monto correcto.");
                }

                if (jCopciones.getSelectedItem() != null) { //----- Si hay una opcion seleccionada:
                    ArrayList<Contrato> Listcont = new ArrayList<>();
                    String opc = (String) jcbusqueda.getSelectedItem();

                    if (opc.equals("Inquilino")) { // si hay un inquilino seleccionado

                        opc = "inquilino";
                        Inquilino inqui = (Inquilino) jCopciones.getSelectedItem();
                        ContratoData contData = new ContratoData();

                        if (inqui != null) {
                            borrarDatos();
                            Listcont = contData.listarContratosXfiltrosANDid(desde, hasta, min, max, opc, inqui.getIdInquilino());
                        } else {
                            System.out.println("Alguno de los elementos es nulo");
                        }

                        if (Listcont.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                        } else {
                            borrarDatos();
                            for (Contrato c : Listcont) {
                                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                            }
                        }
                    } else { // si hay un inmueble seleccionado

                        opc = "inmueble";
                        Inmueble inm = (Inmueble) jCopciones.getSelectedItem();
                        ContratoData contData = new ContratoData();

                        if (inm != null) {
                            borrarDatos();
                            Listcont = contData.listarContratosXfiltrosANDid(desde, hasta, min, max, opc, inm.getIdInmueble());
                        } else {
                            System.out.println("Alguno de los elementos es nulo");
                        }
                        
                        if (Listcont.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                        } else {
                            borrarDatos();
                            for (Contrato c : Listcont) {
                                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                            }
                        }
                    }                    
                } else { //----- Si NO hay una opcion seleccionada:

                    ContratoData contData = new ContratoData();
                    ArrayList<Contrato> Listcont = new ArrayList<>();

                    Listcont = contData.listarContratosXfecha(desde, hasta);

                    if (Listcont.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No se encontraron resultados para la busqueda");
                    } else {
                        borrarDatos();
                        for (Contrato c : Listcont) {
                            modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor verifique los campos de fecha para realizar la busqueda");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtminimoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtminimoKeyReleased
        try{    
            Double minimo = Double.parseDouble(jtminimo.getText());
            Double maximo = Double.parseDouble(jtmaximo.getText());
        
            if (maximo!=null){
                if(minimo>maximo){
                    alertamonto.setText("El valor mínimo no puede ser mayor que el máximo. Ingrese un valor correcto.");
                }else{
                    alertamonto.setText(null);
                }          
            }
        }catch (NumberFormatException e){
            alertamonto.setText("Ingrese solo numeros, por favor.");
        }
    }//GEN-LAST:event_jtminimoKeyReleased

    private void jtmaximoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtmaximoKeyReleased
        try{
            Double minimo = Double.parseDouble(jtminimo.getText());
            Double maximo = Double.parseDouble(jtmaximo.getText());

            if (minimo!=null){
                if(minimo>maximo){
                    alertamonto.setText("El valor máximo no puede ser menos que el mínimo. Ingrese un valor correcto.");
                }else{
                    alertamonto.setText(null);
                }
            }
        }catch (NumberFormatException e){
            alertamonto.setText("Ingrese solo numeros, por favor.");
        }
    }//GEN-LAST:event_jtmaximoKeyReleased

    private void jOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrdenActionPerformed
        ordenarTabla();
    }//GEN-LAST:event_jOrdenActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
       ordenarTabla();
    }//GEN-LAST:event_jEstadoActionPerformed

    private void alertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alertasActionPerformed
    
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
        
        ContratoData contData = new ContratoData();

        switch (eleccion){
            case "Id" :
            borrarDatos();
            for (Contrato c : contData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
            }
            break;
            case "Fecha inicio":
            borrarDatos();
            for (Contrato c : contData.ordenarX(eleccion, act)) {
               modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
            }
            break;
            case "Fecha fin":
            borrarDatos();
            for (Contrato c : contData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
            }
            break;
            case "Monto":
            borrarDatos();
            for (Contrato c : contData.ordenarX(eleccion, act)) {
                modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(), c.getIdinq(), c.getIdimb(), c.isEstado()});
            }
            break;
        }
    }

    public void rellenarTabla(){
        ContratoData contData = new ContratoData();
        
        for(Contrato c : contData.listarContratos()){
            modelo.addRow(new Object[]{c.getIdContrato(), c.getFechaInicio().toString(), c.getFechaFin().toString(), c.getMonto(),c.getIdinq(), c.getIdimb(), c.isEstado()});
        }    
    }
    
    public void cargarCabecera() {
        JTableHeader headerimn = jContratos.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));
        
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
      
        jtminimo.setText("");
        jtmaximo.setText("");
        jRfecha.setSelected(false);
        jRmonto.setSelected(false);
        jtdesde.setDate(null);
        jthasta.setDate(null);
        jCopciones.setSelectedIndex(-1);
        jOrden.setSelectedIndex(0);
        jEstado.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alertafechas;
    private javax.swing.JTextField alertamonto;
    private javax.swing.JTextField alertas;
    private javax.swing.JTextField alertas2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jContratos;
    private javax.swing.JComboBox<Object> jCopciones;
    private javax.swing.JComboBox<String> jEstado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jOrden;
    private javax.swing.JRadioButton jRfecha;
    private javax.swing.JRadioButton jRmonto;
    private javax.swing.JScrollPane jScrollPane1;
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
