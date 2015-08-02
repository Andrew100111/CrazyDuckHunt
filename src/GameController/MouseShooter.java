
package GameController;

import GameEngineSystem.Duck;
import GameEngineSystem.Enemy;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseShooter {
    

    private static Point Mouse;
    private static boolean c;
    private static Enemy duck = new Duck(1);
                
        
    //Checks for action at the time of a click
    public static void getC() { 
        
        duck.die();


    }
    
    //Get the pointer location
    public static Point getP() {
        return Mouse;
    }
    
    
    //Adds the method to retrieve the click location on the window
    public static MouseListener MouseAdapter() {
        MouseAdapter mouseAdapter;
        mouseAdapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Mouse = e.getPoint();
                //System.out.println("X:" + Mouse);
                getC(); //Check for action
                
            }
        };
        return mouseAdapter;
    }

    
}
