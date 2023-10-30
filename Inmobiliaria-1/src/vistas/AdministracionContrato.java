
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
import javax.swing.JOptionPane;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class AdministracionContrato extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    private ContratoData contData = new ContratoData();

    public AdministracionContrato() {
        //conexion();
        initComponents();
        rellenarInmuebles();
        rellenarInquilinos();
        cargarCabeceraInm();
        cargarCabeceraInq();
        centrarTexto();
        
        borrarFilaInm();
        borrarFilaInq();
        // jComboinquilinos.setSelectedIndex(-1);    
    }
    public void conexion(){
        contData.EstablecerConexion();
    }

    public void centrarTexto(){
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            jTinmueble.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        for (int x = 0; x < modelo2.getColumnCount(); x++) {
            jTinquilino.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbalta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        alertafechas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboinquilinos = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTinquilino = new javax.swing.JTable();
        jtfechafin = new com.toedter.calendar.JDateChooser();
        jtfechainicio = new com.toedter.calendar.JDateChooser();
        alertaingresar = new javax.swing.JTextField();
        jbrestablecer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboinmuebles = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTinmueble = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1030, 700));
        setMinimumSize(new java.awt.Dimension(1030, 700));
        setPreferredSize(new java.awt.Dimension(1030, 700));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbalta.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jbalta.setForeground(new java.awt.Color(51, 51, 51));
        jbalta.setText("INGRESAR");
        jbalta.setBorderPainted(false);
        jbalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaltaActionPerformed(evt);
            }
        });
        jPanel1.add(jbalta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 390, 30));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("FECHA FIN ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, 30));

        alertafechas.setEditable(false);
        alertafechas.setBackground(new java.awt.Color(255, 255, 255));
        alertafechas.setBorder(null);
        jPanel1.add(alertafechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 560, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("FECHA INICIO ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, 30));

        jComboinquilinos.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jComboinquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboinquilinosActionPerformed(evt);
            }
        });
        jPanel1.add(jComboinquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 460, 30));

        jTinquilino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTinquilino.setGridColor(new java.awt.Color(204, 204, 204));
        jTinquilino.setMinimumSize(new java.awt.Dimension(60, 26));
        jTinquilino.setRowHeight(26);
        jTinquilino.setSelectionBackground(java.awt.SystemColor.activeCaption);
        jTinquilino.setShowHorizontalLines(false);
        jScrollPane4.setViewportView(jTinquilino);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 570, 80));

        jtfechafin.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jtfechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 150, 30));
        jtfechafin.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())){
                    if (jtfechainicio.getDate()!=null){
                        if(jtfechainicio.getDate().after(jtfechafin.getDate())){
                            alertafechas.setText("La fecha final del contrato no puede ser anterior a la inicial. Ingrese una fecha correcta.");
                        }else{
                            alertafechas.setText(null);
                        }
                    }
                }
            }
        });

        jtfechainicio.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jtfechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 150, 30));
        jtfechainicio.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())){
                    Date fechaActual = new Date();
                    if(jtfechainicio.getDate()!=null){
                        if (jtfechainicio.getDate().before(fechaActual)){
                            alertafechas.setText("La fecha de inicio del contrato no puede ser anterior al dia de hoy. Ingrese una fecha correcta.");
                        }else{
                            alertafechas.setText(null);
                        }
                        if (jtfechafin.getDate()!=null){
                            if(jtfechainicio.getDate().after(jtfechafin.getDate())){
                                alertafechas.setText("La fecha de inicio del contrato no puede ser posterior a la final. Ingrese una fecha correcta.");
                            }else{
                                alertafechas.setText(null);
                            }
                        }
                    }
                }
            }
        });

        alertaingresar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        alertaingresar.setForeground(new java.awt.Color(51, 51, 51));
        alertaingresar.setBorder(null);
        jPanel1.add(alertaingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 390, -1));

        jbrestablecer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jbrestablecer.setForeground(new java.awt.Color(51, 51, 51));
        jbrestablecer.setText("RESTABLECER");
        jbrestablecer.setBorderPainted(false);
        jbrestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestablecerActionPerformed(evt);
            }
        });
        jPanel1.add(jbrestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 190, 30));

        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("SALIR");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 190, 30));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("INQUILINO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 30));

        jComboinmuebles.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jComboinmuebles.setSelectedItem(-1);
        jComboinmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboinmueblesActionPerformed(evt);
            }
        });
        jPanel1.add(jComboinmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 450, 30));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("INMUEBLE ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 260, 120, 30));

        jTinmueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTinmueble.setAlignmentX(0.25F);
        jTinmueble.setGridColor(new java.awt.Color(204, 204, 204));
        jTinmueble.setMinimumSize(new java.awt.Dimension(60, 26));
        jTinmueble.setRowHeight(26);
        jTinmueble.setSelectionBackground(java.awt.SystemColor.activeCaption);
        jTinmueble.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(jTinmueble);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 570, 63));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/LABEL NUEVO CONTRATO.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setMinimumSize(new java.awt.Dimension(576, 1280));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(576, 1280));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -20, 500, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Sis gestion.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -100, 650, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
   
    private void jbaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaltaActionPerformed

        try {
           
            Date fechaInicio = (Date) jtfechainicio.getDate();
            Date fechaFin = (Date) jtfechafin.getDate(); 
            Inmueble inmueble = (Inmueble) jComboinmuebles.getSelectedItem();
            Inquilino inquilino = (Inquilino) jComboinquilinos.getSelectedItem();
            double monto = inmueble.getPrecio();
            boolean estado = true;
         
            if ("".equals(alertafechas.getText()) || alertafechas.getText()==null ){
                alertaingresar.setText(null);

                try{
                   LocalDate fecha1 = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                   LocalDate fecha2 = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                   Contrato cont = new Contrato(fecha1, fecha2, monto, inquilino, inmueble, estado);
                   contData.crearContrato(cont);
                   jComboinmuebles.removeItem(inmueble);
                   restablecer();   
                }catch(NullPointerException e ){
                    JOptionPane.showMessageDialog(null, "Por favoringrese las fechas para continuar.");  
                }   
            }else{
                alertaingresar.setText("Verifique los datos para continuar.");
            }      
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }   
    }//GEN-LAST:event_jbaltaActionPerformed

    private void jComboinmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboinmueblesActionPerformed

        if(jComboinmuebles.getSelectedIndex()!=-1 ){          
            if  ( modelo.getRowCount()>0){
                modelo.removeRow(0);
            }
            InmuebleData inmData = new InmuebleData();
            Inmueble inm = (Inmueble) jComboinmuebles.getSelectedItem();
            modelo.addRow(new Object[]{inm.getIdInmueble(), inm.getTipo(), inm.getSuperficie(), inm.getPrecio(), inm.getDisponibilidad(), inm.getPropid(), inm.isEstado()}); 
        } else {
           if  ( modelo.getRowCount()>0){
                modelo.removeRow(0);
            }
        }   
    }//GEN-LAST:event_jComboinmueblesActionPerformed

    private void jComboinquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboinquilinosActionPerformed
        
        if(jComboinmuebles.getSelectedIndex()!=-1 ){
            if  ( modelo2.getRowCount()>0){
              modelo2.removeRow(0);
            }
            InquilinoData inqData = new InquilinoData();
            Inquilino inq = (Inquilino) jComboinquilinos.getSelectedItem();
            modelo2.addRow(new Object[]{inq.getIdInquilino(), inq.getLugarTrabajo(), inq.getNombreGarante(), inq.getDniGarante(),inq.isEstado()});
        }else{
            if  ( modelo2.getRowCount()>0){
              modelo2.removeRow(0);
            }
        }
    }//GEN-LAST:event_jComboinquilinosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbrestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrestablecerActionPerformed

        restablecer();
    }//GEN-LAST:event_jbrestablecerActionPerformed

    public void rellenarInmuebles() {
        InmuebleData inmData = new InmuebleData();

        ArrayList<Inmueble> ListInm = new ArrayList<>(inmData.listarInmueblesDisponibles());

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
         JTableHeader headerimn = jTinmueble.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));
        
        modelo.addColumn("Id");
        modelo.addColumn("Tipo");
        modelo.addColumn("Superficie");
        modelo.addColumn("Precio");
        modelo.addColumn("Disponibilidad");
        modelo.addColumn("Propietrario");
        modelo.addColumn("Estado");
        jTinmueble.setModel(modelo);
    }
    
     public void cargarCabeceraInq() {
         JTableHeader headerimn = jTinquilino.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerimn.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerimn.setOpaque(false);
        headerimn.setBackground(Color.GRAY);
        headerimn.setForeground(Color.WHITE);
        headerimn.setFont(new Font("SansSerif", Font.BOLD, 12));
        
        modelo2.addColumn("Id");
        modelo2.addColumn("Trabajo");
        modelo2.addColumn("Garante");
        modelo2.addColumn("Dni Garante");
        modelo2.addColumn("Estado");
        jTinquilino.setModel(modelo2);
    }

    private void borrarFilaInm() {
        int f = jTinmueble.getRowCount() - 1;

        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }
    
    private void borrarFilaInq() {
        int f = jTinquilino.getRowCount() - 1;

        for (; f >= 0; f--) {

            modelo2.removeRow(f);
        }
    }
    
    private void restablecer(){
        jComboinmuebles.setSelectedIndex(-1);
        jComboinquilinos.setSelectedIndex(-1);
        borrarFilaInm();
        borrarFilaInq();
        jtfechainicio.setDate(null);
        jtfechafin.setDate(null);
    }

    //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alertafechas;
    private javax.swing.JTextField alertaingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Inmueble> jComboinmuebles;
    private javax.swing.JComboBox<Inquilino> jComboinquilinos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTinmueble;
    private javax.swing.JTable jTinquilino;
    private javax.swing.JButton jbalta;
    private javax.swing.JButton jbrestablecer;
    private com.toedter.calendar.JDateChooser jtfechafin;
    private com.toedter.calendar.JDateChooser jtfechainicio;
    // End of variables declaration//GEN-END:variables
}
