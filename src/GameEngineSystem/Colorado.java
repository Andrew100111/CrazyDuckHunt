
package GameEngineSystem;

import static java.awt.Color.BLACK;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Colorado extends Enemy {

    public Colorado() {

        state = true;
        life = 5;
        points = 2;
        speed = speed * 0.6;
        appearance = 100;
        color = BLACK;
        start();        
    }
    
    private void start() {
        //setX(random.nextInt(1000));
        //setY(random.nextInt(600));
        fly();
    }
    
}
