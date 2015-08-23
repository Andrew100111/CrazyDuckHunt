
package GameEngineSystem;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseShooter {
    
    private static Point Mouse;
    
    //Get the pointer location
    public static Point getClick() {
        return Mouse;
    }
    
    //Adds the method to retrieve the click location on the window
    public MouseListener MouseAdapter() {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Mouse = e.getPoint();
                System.out.println("Mouse Shooter" + Mouse);
            }
        };
        return mouseAdapter;
    }
}
