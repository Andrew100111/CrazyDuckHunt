/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import GameController.MouseShooter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xcreed
 */
public class Player {
    
    MouseShooter mouse = new MouseShooter();
    
    public int score = 0; //player doesn't have lifes, it's only score
    
    public void shoot() {
        
        try {
            mouse.getClick();
        } catch (InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
    
    
    
}
