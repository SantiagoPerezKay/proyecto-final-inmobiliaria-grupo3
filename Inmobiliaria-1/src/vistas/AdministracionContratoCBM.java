
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

        jPanel1 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1030, 700));
        setMinimumSize(new java.awt.Dimension(1030, 700));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1030, 700));

        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("BUSCAR POR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jcbusqueda.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jcbusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inquilino", "Inmueble" }));
        jcbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 190, 90, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 550, 120));

        jCopciones.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jCopciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCopcionesActionPerformed(evt);
            }
        });
        jPanel1.add(jCopciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 320, -1));

        jbsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbsalir.setForeground(new java.awt.Color(51, 51, 51));
        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, 120, -1));

        jbrestablecer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbrestablecer.setForeground(new java.awt.Color(51, 51, 51));
        jbrestablecer.setText("RESTABLECER");
        jbrestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestablecerActionPerformed(evt);
            }
        });
        jPanel1.add(jbrestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 620, 240, -1));

        jbguardarcambios.setBackground(new java.awt.Color(153, 153, 153));
        jbguardarcambios.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jbguardarcambios.setForeground(new java.awt.Color(51, 51, 51));
        jbguardarcambios.setText("GUARDAR CAMBIOS");
        jbguardarcambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarcambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jbguardarcambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 550, -1));

        jbeliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbeliminar.setForeground(new java.awt.Color(51, 51, 51));
        jbeliminar.setText("ELIMINAR");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 170, -1));
        jPanel1.add(jtdesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 240, 110, 27));
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
        jPanel1.add(jthasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 110, 27));
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

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Desde :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Hasta :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, 27));

        jRfecha.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jRfecha.setText("FECHA");
        jRfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRfechaActionPerformed(evt);
            }
        });
        jPanel1.add(jRfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jRmonto.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jRmonto.setText("MONTO");
        jPanel1.add(jRmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Min :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Max: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        jtminimo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jtminimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtminimoKeyReleased(evt);
            }
        });
        jPanel1.add(jtminimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 110, -1));

        jtmaximo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jtmaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtmaximoKeyReleased(evt);
            }
        });
        jPanel1.add(jtmaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 110, -1));

        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton1.setText("APLICAR FILTROS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 150, -1));

        alertafechas.setBorder(null);
        jPanel1.add(alertafechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 495, -1));

        alertamonto.setBorder(null);
        alertamonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertamontoActionPerformed(evt);
            }
        });
        jPanel1.add(alertamonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 495, -1));

        alertas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alertas.setBorder(null);
        alertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertasActionPerformed(evt);
            }
        });
        jPanel1.add(alertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 415, -1));

        alertas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alertas2.setBorder(null);
        jPanel1.add(alertas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 416, -1));

        jOrden.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Fecha inicio", "Fecha fin", "Monto" }));
        jOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(jOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 90, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ORDENAR POR ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, 20));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("ESTADO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, 20));

        jEstado.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activo", "Inactivo" }));
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/LABEL BUSCAR CONTRATO.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setMinimumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setPreferredSize(new java.awt.Dimension(576, 1280));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -20, 500, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -80, 650, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
        borrarDatos();
        rellenarTabla();
    }//GEN-LAST:event_jbguardarcambiosActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        int fila = jContratos.getSelectedRow();
        int id = (int)jContratos.getValueAt(fila,0);
        int id_inm = (int)jContratos.getValueAt(fila,5);
        ContratoData contData = new ContratoData();
        InmuebleData inmData = new InmuebleData();
        
        inmData.actualizarDisponibilidadInmueble(id_inm, 0);
        contData.borrarContrato(id);
        
        borrarDatos();
        rellenarTabla();
        limpiarCampos();
        
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

    private void alertamontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertamontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alertamontoActionPerformed
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jOrden;
    private javax.swing.JPanel jPanel1;
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
