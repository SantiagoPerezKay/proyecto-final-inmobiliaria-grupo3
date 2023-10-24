
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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

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
        centrarTexto();
        
        borrarFila();
        // jComboinquilinos.setSelectedIndex(-1);    
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
        alertafechas = new javax.swing.JTextField();
        alertainmueble = new javax.swing.JTextField();
        alertainquilino = new javax.swing.JTextField();
        alertaingresar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTinquilino = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1280, 1024));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

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

        alertafechas.setEditable(false);
        alertafechas.setBorder(null);

        alertainmueble.setBackground(new java.awt.Color(240, 240, 240));
        alertainmueble.setBorder(null);

        alertainquilino.setBackground(new java.awt.Color(240, 240, 240));
        alertainquilino.setBorder(null);

        alertaingresar.setBackground(new java.awt.Color(240, 240, 240));
        alertaingresar.setBorder(null);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(jtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(jtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(alertafechas, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(jComboinmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(alertainmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(alertainquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jbalta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(alertaingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)
                                .addComponent(jComboinquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(alertafechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jComboinmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertainmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboinquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(alertainquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbalta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(alertaingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtfechainicio.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())){
                    Date fechaActual = new Date();
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
        });
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

            if ("".equals(alertafechas.getText()) || alertafechas.getText()==null ){
                alertaingresar.setText(null);
                
                //InmuebleData inmData = new InmuebleData();
                //inmData.actualizarDisponibilidadInmueble(inmueble.getIdInmueble(), 1);
                
                Contrato cont = new Contrato(fecha1, fecha2, monto, inquilino, inmueble, estado);
                contData.crearContrato(cont);
            }else{
                alertaingresar.setText("Verifique los datos para continuar.");
            }
              
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
        JTableHeader headerinq = jTinquilino.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) headerinq.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        modelo2.addColumn("Id");
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
    private javax.swing.JTextField alertafechas;
    private javax.swing.JTextField alertaingresar;
    private javax.swing.JTextField alertainmueble;
    private javax.swing.JTextField alertainquilino;
    private javax.swing.JComboBox<Inmueble> jComboinmuebles;
    private javax.swing.JComboBox<Inquilino> jComboinquilinos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTinmueble;
    private javax.swing.JTable jTinquilino;
    private javax.swing.JButton jbalta;
    private com.toedter.calendar.JDateChooser jtfechafin;
    private com.toedter.calendar.JDateChooser jtfechainicio;
    // End of variables declaration//GEN-END:variables
}
