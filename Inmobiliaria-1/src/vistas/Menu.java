package vistas;

import java.awt.Color;
import static javafx.scene.paint.Color.color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        loadICons();
        this.setLocationRelativeTo(null);

        //metodo o sentencias para obtener la fecha actual y actualizar el estado de "en alquiler" a "para alquilar" automaticamente
    }

    private void loadICons() {
        Portada miImagen = new Portada(jLpropietarios);
        jLpropietarios.add(miImagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jLpropietarios = new javax.swing.JPanel();
        jLpropietario = new javax.swing.JLabel();
        jLinquilino = new javax.swing.JLabel();
        jLinmueble = new javax.swing.JLabel();
        jLcontratos = new javax.swing.JLabel();
        jLsalir = new javax.swing.JLabel();
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
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        Escritorio.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLpropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLpropietarios.setPreferredSize(new java.awt.Dimension(1280, 1024));

        jLpropietario.setText(".");
        jLpropietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLpropietarioMouseClicked(evt);
            }
        });

        jLinquilino.setText(".");
        jLinquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLinquilinoMouseClicked(evt);
            }
        });

        jLinmueble.setText(".");
        jLinmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLinmuebleMouseClicked(evt);
            }
        });

        jLcontratos.setText(".");
        jLcontratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLcontratosMouseClicked(evt);
            }
        });

        jLsalir.setText(".");
        jLsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLsalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLpropietariosLayout = new javax.swing.GroupLayout(jLpropietarios);
        jLpropietarios.setLayout(jLpropietariosLayout);
        jLpropietariosLayout.setHorizontalGroup(
            jLpropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLpropietariosLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLinquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLinmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLcontratos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jLsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jLpropietariosLayout.setVerticalGroup(
            jLpropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLpropietariosLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jLpropietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLinquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLinmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcontratos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(921, Short.MAX_VALUE))
        );

        Escritorio.setLayer(jLpropietarios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLpropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLpropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("PROPIETARIO");
        jMenu1.setToolTipText("");
        jMenu1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setText("Nuevo Propietario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem5.setText("Buscar Propietario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inquilino");

        jMenuItem2.setText("Nuevo Inquilino");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem6.setText("Buscar Inquilino");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inmuebles");

        jMenuItem3.setText("Ingresar Inmueble");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem7.setText("Buscar Inmueble");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Contratos");

        jMenuItem4.setText("Nuevo Contrato");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem9.setText("Buscar Contrato");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Informe");

        jMenuItem10.setText("Obtener Informes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
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

    private void jLpropietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLpropietarioMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionPropietario administracionpropietario = new AdministracionPropietario();
        administracionpropietario.setVisible(true);
        Escritorio.add(administracionpropietario);
        administracionpropietario.setLocation((Escritorio.getWidth() - administracionpropietario.getWidth()) / 2, (Escritorio.getHeight() - administracionpropietario.getHeight()) / 2);
        Escritorio.moveToFront(administracionpropietario);

    }//GEN-LAST:event_jLpropietarioMouseClicked

    private void jLinquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinquilinoMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionInquilino administracioninquilino = new AdministracionInquilino();
        administracioninquilino.setVisible(true);
        Escritorio.add(administracioninquilino);
        administracioninquilino.setLocation((Escritorio.getWidth() - administracioninquilino.getWidth()) / 2, (Escritorio.getHeight() - administracioninquilino.getHeight()) / 2);
        Escritorio.moveToFront(administracioninquilino);
    }//GEN-LAST:event_jLinquilinoMouseClicked

    private void jLinmuebleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinmuebleMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionInmueble administracioninmueble = new AdministracionInmueble();
        administracioninmueble.setVisible(true);
        Escritorio.add(administracioninmueble);
        administracioninmueble.setLocation((Escritorio.getWidth() - administracioninmueble.getWidth()) / 2, (Escritorio.getHeight() - administracioninmueble.getHeight()) / 2);
        Escritorio.moveToFront(administracioninmueble);
    }//GEN-LAST:event_jLinmuebleMouseClicked

    private void jLcontratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcontratosMouseClicked
        Escritorio.removeAll();
        Escritorio.repaint();
        AdministracionContrato administracioncontrato = new AdministracionContrato();
        administracioncontrato.setVisible(true);
        Escritorio.add(administracioncontrato);
        administracioncontrato.setLocation((Escritorio.getWidth() - administracioncontrato.getWidth()) / 2, (Escritorio.getHeight() - administracioncontrato.getHeight()) / 2);
        Escritorio.moveToFront(administracioncontrato);
    }//GEN-LAST:event_jLcontratosMouseClicked

    private void jLsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLsalirMouseClicked

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Informe informe = new Informe();
        informe.setVisible(true);
        Escritorio.add(informe);
        informe.setLocation((Escritorio.getWidth() - informe.getWidth()) / 2, (Escritorio.getHeight() - informe.getHeight()) / 2);
        Escritorio.moveToFront(informe);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel jLcontratos;
    private javax.swing.JLabel jLinmueble;
    private javax.swing.JLabel jLinquilino;
    private javax.swing.JLabel jLpropietario;
    private javax.swing.JPanel jLpropietarios;
    private javax.swing.JLabel jLsalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
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
