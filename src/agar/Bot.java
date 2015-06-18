/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agar;

import java.util.Random;

/**
 *
 * @author Sulf
 */
public class Bot extends User{

    private Thread BotThread;
    private int count;
    private int move;
    private Random generator = new Random();

    public Bot() {
    }
    
    public Bot(int count) {
    super(10);
    this.count = count;
    move = 5;
    BotThread = new Thread(new Runnable() {

        @Override
        public void run() {
            makeItMove();
            while(true)
            {
                try
                {
                    randomizeMove();
                    Thread.sleep(50);
                }catch(InterruptedException e){}
            }
        }
    } ,count + " - BotThread");
    BotThread.start();
    }
    
    public void makeItMove()
    {
        myszka.setX(generator.nextInt(Controls.rozmiar.width));
        myszka.setY(generator.nextInt(Controls.rozmiar.height));
    }
    
    public void randomizeMove()
    {
        if(myszka.getX() <= 0) 
            myszka.setX(myszka.getX() + generator.nextInt(move));
        if(myszka.getX() >= Controls.rozmiar.width)
            myszka.setX(myszka.getX() - generator.nextInt(move));
        if(myszka.getY() <= 0) 
            myszka.setY(myszka.getY() + generator.nextInt(move));
        if(myszka.getY() >= Controls.rozmiar.height)
            myszka.setY(myszka.getY() - generator.nextInt(move));
        if(myszka.getX() > 0 && myszka.getX() < Controls.rozmiar.width && myszka.getY() > 0 && myszka.getY() < Controls.rozmiar.height)
        {
            myszka.setX(myszka.getX() + ( -generator.nextInt(move) + generator.nextInt(move)));
            myszka.setY(myszka.getY() + ( -generator.nextInt(move) + generator.nextInt(move)));
        }
    }

    @Override
    public String toString() {
        return "Bot";
    }
}
