
package GameEngineSystem;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Duck extends Enemy {
    
//    public Duck(int life, int points, int speed, float appearance) {
//        super(life, points, speed, appearance);
//    }
    
    //just trying
    public Duck(int N) {
        
        if (N == 1) {
            
            createDuck("C:/Users/Xcreed/Documents/NetBeansProjects/CrazyDuckHunt/src/res/block.png");

            fly();
        }
        
    }    
            
}
