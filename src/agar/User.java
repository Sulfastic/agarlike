/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agar;

/**
 *
 * @author Sulf
 */
public class User{
    
    protected Circle circle;
    protected Controls myszka = new Controls();
    
    public User() {
        circle = new Circle();
        circle.randomColor();
        circle.setDiameter(20);
    }
    
     public User(User user) {
        this.circle = user.circle;
        this.myszka = user.myszka;
    }
    
    public User(int diameter) {
        circle = new Circle();
        circle.randomColor();
        circle.setDiameter(diameter);
    }

    @Override
    public String toString() {
        return "User";
    }
    
    
}
