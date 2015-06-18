/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agar;

import java.awt.EventQueue;
import javax.annotation.Resource;

/**
 *
 * @author Sulf
 */
public class Agar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nrOfBots = 80;
        User uzytkownik = new User();
        User[] bot = new User[nrOfBots]; 
        App application = new App();
        ImageView panel = new ImageView();
        application.add(panel);
        
        for(int i=0;i<nrOfBots;i++)
        {
            bot[i] = new Bot(i);
        }
        bot[bot.length-1] = uzytkownik;
        while (true) 
        {
            try{
                //panel.setUzytkownik(uzytkownik);
                uzytkownik.myszka.goForMouse(panel.getMousePosition().x, panel.getMousePosition().y);
            }catch(NullPointerException e){}
            
            panel.setUzytkownik(bot); 
            panel.repaint();
            
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){}
        }
    }
    
}
