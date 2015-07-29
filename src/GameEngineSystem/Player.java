
package GameEngineSystem;

import GameController.MouseShooter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Player {
    
    MouseShooter mouse = new MouseShooter();
    
    int score = 0; //player doesn't have lifes, it's only score
    
    public void shoot() {
        
        try {
            mouse.getClick();
        } catch (InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }                      
        
    }
    
    public int getScore() {
        
        return score;
    }
    
    
}
