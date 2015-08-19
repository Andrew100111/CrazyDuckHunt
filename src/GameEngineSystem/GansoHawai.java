

package GameEngineSystem;

import static java.awt.Color.RED;


public class GansoHawai extends Enemy {
    
    public GansoHawai() {
        
        
        color = RED;
        life = 2;
        points = 10;
        speed = speed * 0.7;
        fly();
    }
    
    @Override //Duck only appears at one random part of the screen
    public void fly() {
        setX(random.nextInt(1000));
        setY(random.nextInt(600));
        
        //die();
    }
}
