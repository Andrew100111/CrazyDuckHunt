/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import java.awt.Label;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xcreed
 */
public abstract class Enemy {

    public int life; //hits needed to kill it
    public int points; //points the player earns
    //public int time; //amount of time the duck's on the screen
    public int speed; //speed of movement of each duck
    public float appearance; // percentage of apprearence on the screen
    
    public Label duck = new Label();
    
    //public abstract void hurtPlayer(); //only the Piquirrojo has this method, 
    //so it will be implemented in its class
    
    
    public static void enemy() {
        
        //fly();
    }
    
    public void fly() { //every duck has the ability to fly
        
        int x = 0;
        int y;
        
        while (true && x <= 600) {
            
            x++;
            
            System.out.println("X =" + x);
            
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        System.out.println("reached limit");
        
        
    } 
    
    public static void die() {
        //pato se muere
    }
    
    
}
