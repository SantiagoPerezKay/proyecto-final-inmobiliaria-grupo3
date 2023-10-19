
package vistas;


public class Menu extends javax.swing.JFrame {

  
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        //metodo o sentencias para obtener la fecha actual y actualizar el estado de "en alquiler" a "para alquilar" automaticamente
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Propietario");

        jMenuItem1.setText("Alta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Consulta");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inquilino");

        jMenuItem2.setText("Alta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem6.setText("Consulta");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inmuebles");

        jMenuItem3.setText("Alta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem7.setText("Consulta");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Contratos");

        jMenuItem4.setText("Administracion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem9.setText("Consulta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionInquilino administracioninquilino = new AdministracionInquilino();
        administracioninquilino.setVisible(true);
        Escritorio.add(administracioninquilino);
        administracioninquilino.setLocation((Escritorio.getWidth() - administracioninquilino.getWidth()) / 2, (Escritorio.getHeight() - administracioninquilino.getHeight()) / 2);
        Escritorio.moveToFront(administracioninquilino);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionPropietario administracionpropietario = new AdministracionPropietario();
        administracionpropietario.setVisible(true);
        Escritorio.add(administracionpropietario);
        administracionpropietario.setLocation((Escritorio.getWidth() - administracionpropietario.getWidth()) / 2, (Escritorio.getHeight() - administracionpropietario.getHeight()) / 2);
        Escritorio.moveToFront(administracionpropietario);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionInmueble administracioninmueble = new AdministracionInmueble();
        administracioninmueble.setVisible(true);
        Escritorio.add(administracioninmueble);
        administracioninmueble.setLocation((Escritorio.getWidth() - administracioninmueble.getWidth()) / 2, (Escritorio.getHeight() - administracioninmueble.getHeight()) / 2);
        Escritorio.moveToFront(administracioninmueble);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
   Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionContrato administracioncontrato = new AdministracionContrato();
        administracioncontrato.setVisible(true);
        Escritorio.add(administracioncontrato);
        administracioncontrato.setLocation((Escritorio.getWidth() - administracioncontrato.getWidth()) / 2, (Escritorio.getHeight() - administracioncontrato.getHeight()) / 2);
        Escritorio.moveToFront(administracioncontrato);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionPropietarioCBM AdministracionpropietarioCBM = new AdministracionPropietarioCBM();
        AdministracionpropietarioCBM.setVisible(true);
        Escritorio.add(AdministracionpropietarioCBM);
        AdministracionpropietarioCBM.setLocation((Escritorio.getWidth() - AdministracionpropietarioCBM.getWidth()) / 2, (Escritorio.getHeight() - AdministracionpropietarioCBM.getHeight()) / 2);
        Escritorio.moveToFront(AdministracionpropietarioCBM);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionInquilinoCBM administracionInquilinoCBM = new AdministracionInquilinoCBM();
        administracionInquilinoCBM.setVisible(true);
        Escritorio.add(administracionInquilinoCBM);
        administracionInquilinoCBM.setLocation((Escritorio.getWidth() - administracionInquilinoCBM.getWidth()) / 2, (Escritorio.getHeight() - administracionInquilinoCBM.getHeight()) / 2);
        Escritorio.moveToFront(administracionInquilinoCBM);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionInmuebleCBM administracionInmuebleCBM = new AdministracionInmuebleCBM(); 
        administracionInmuebleCBM.setVisible(true); 
        Escritorio.add(administracionInmuebleCBM);
        administracionInmuebleCBM.setLocation((Escritorio.getWidth() - administracionInmuebleCBM.getWidth()) / 2, (Escritorio.getHeight() - administracionInmuebleCBM.getHeight()) / 2);
        Escritorio.moveToFront(administracionInmuebleCBM);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionContratoCBM AdministracionContratoCBM = new AdministracionContratoCBM(); 
        AdministracionContratoCBM.setVisible(true); 
        Escritorio.add(AdministracionContratoCBM);
        AdministracionContratoCBM.setLocation((Escritorio.getWidth() - AdministracionContratoCBM.getWidth()) / 2, (Escritorio.getHeight() - AdministracionContratoCBM.getHeight()) / 2);
        Escritorio.moveToFront(AdministracionContratoCBM);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
