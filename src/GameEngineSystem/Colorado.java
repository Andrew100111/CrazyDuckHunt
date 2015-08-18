
package GameEngineSystem;

import static java.awt.Color.BLACK;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Colorado extends Enemy {

    public Colorado() {

        start();
        life = 5;
        points = 2;
        speed = speed * 0.6;
        appearance = 100;
        color = BLACK;
        //fly();
//        start();
//        fly();
//        try {
//                Thread.sleep(10000); //The faster they move equals 
//                                            //the delay on this defined by speed
//                state = false;
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
//            }
        
    }
    
    private void start() {
        setX(random.nextInt(1000));
        setY(random.nextInt(600));
        //setLocation(getX(), getY());
    }
    
}
