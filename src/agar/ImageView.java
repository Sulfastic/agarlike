/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Sulf
 */
public class ImageView extends JPanel{

    User[] uzytkownik;
    Thread panelThread;
    
    public ImageView() {
        setSize(Controls.rozmiar.width, Controls.rozmiar.height);
    }

    public void setUzytkownik(User[] uzytkownik) {
        this.uzytkownik = uzytkownik;
    }
    
    @Override
    public void paint(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2d = (Graphics2D) grphcs;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        try{
        for(User user: uzytkownik){
            g2d.setColor(user.circle.getColor());

            
            g2d.fillOval((int)user.myszka.getX() - user.circle.getDiameter()/2,
                         (int)user.myszka.getY() - user.circle.getDiameter()/2,
                         user.circle.getDiameter(),user.circle.getDiameter());
        }
        }catch(NullPointerException e){}
    }
}
