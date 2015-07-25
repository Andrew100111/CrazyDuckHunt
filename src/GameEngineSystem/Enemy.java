/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

/**
 *
 * @author xcreed
 */
public abstract class Enemy {

    public int life; //hits needed to kill it
    public int points; //points the player earns
    public int time; //Piquirrojo has only 30s on screen
    public int speed; //every duck has different speeds
    public float emerge; //rarity of types on screen
    
    public abstract void hurtPlayer(); //only the Piquirrojo has this method, 
    //so it will be implemented in its class
    
    public static void fly() { //every duck has the ability to fly
        
    } 
    
    public static void die() {
        
    }
    
    
}
