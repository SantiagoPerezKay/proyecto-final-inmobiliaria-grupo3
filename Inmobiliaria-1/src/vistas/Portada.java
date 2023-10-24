/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Portada extends javax.swing.JLabel {
    
    int x,y;
    public Portada(JPanel portada){
        this.x = portada.getWidth();
        this.y = portada.getHeight();
        this.setSize(portada.getWidth(), portada.getHeight());
    }
    
    public void paint(Graphics g){
            //aca va el codigo para colocar la imagen 
            // creo un atributo de tipo Icon
            ImageIcon por = new ImageIcon(getClass().getResource("/ICONS/por.jpg"));
            g.drawImage(por.getImage(), 0, 0, x, y, null);
}
}