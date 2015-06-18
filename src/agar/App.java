/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agar;

import javax.swing.JFrame;

/**
 *
 * @author Sulf
 */
public class App extends JFrame{
    
    public App(){
        super("Agar :D");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Controls.rozmiar.width,Controls.rozmiar.height);
        setVisible(true);
    }
}
