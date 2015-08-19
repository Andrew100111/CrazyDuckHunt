
package GameController;

import GameView.MainMenu;
import java.awt.BorderLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MouseShooter {

    private static Point Mouse;
    //Gets the location of the pointer
    public void getClick() {     
    }
    
    //Get the pointer location
    public static Point getPoint() {
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
