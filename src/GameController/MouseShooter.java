
package GameController;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseShooter {
    

    private static Point Mouse;
                
        
    //Gets the location of the pointer
    public void getClick() {     
       
    }
    
    //Get the pointer location
    public static Point getP() {
        return Mouse;
    }
    
    
    //Adds the method to retrieve the click location on the window
    public static MouseListener MouseAdapter() {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Mouse = e.getPoint();
                
                System.out.println("X:" + Mouse);
            
            }
        };
        return mouseAdapter;
    }
}
