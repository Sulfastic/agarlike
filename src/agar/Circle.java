/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agar;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Sulf
 */
public class Circle {
    private int diameter;
    private Color color;
    
    public Circle(){
    }
    
    public void randomColor()
    {
        Random generator = new Random();
        float r = generator.nextFloat();
        float g = generator.nextFloat();
        float b = generator.nextFloat();
        while(r==(int)255 && g==(int)255 && b==(int)255)
        {
            r = generator.nextFloat();
            g = generator.nextFloat();
            b = generator.nextFloat();
        }
        
        this.color = new Color(r, g, b);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Color getColor() {
        return color;
    }

    public int getDiameter() {
        return diameter;
    }
}
