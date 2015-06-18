/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agar;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

/**
 *
 * @author Sulf
 */
public class Controls {

    public static Dimension rozmiar = Toolkit.getDefaultToolkit().getScreenSize();
    private float speed;
    private float x = rozmiar.width/2;
    private float y = rozmiar.height/2;

    public Controls() {
        speed = 4.0f;
    }
    
    void goForMouse(int mouseX, int mouseY)
    {
        if(x<mouseX)
            x+=speed;
        if(y<mouseY)
            y+=speed;
        if(x>mouseX)
            x-=speed;
        if(y>mouseY)
            y-=speed;   
    }
    
    void dinnerCheck(User[] user)//sprawdzanie mozliwości wchłonięcia
    {
        for(int i=0;i<user.length;i++)
        {
            //if(user[user.length-1].circle.getDiameter() + user[user.length-1].myszka.x )   
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    
}
