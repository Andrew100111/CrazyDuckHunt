
package GameEngineSystem;

import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Player {
    
    private MouseShooter mouse = new MouseShooter();
    
    private int Score = 0;
    private final IPAddress id = new IPAddress();
    private String Name = id.getName();;
    private final String IP = id.getIP();
    
    public Player() {
        
    }
    
    public void shoot() {                 
       
    }
    
    //Adds duck's points to the score
    public void addScore(int points) {
        Score = Score + points;
    }
    
    public int getScore() {
        return Score;
    }
    
    public String getName(){
        
        return Name;
    }
    
    public String getIP(){
        return IP;
    }
    
    
}
