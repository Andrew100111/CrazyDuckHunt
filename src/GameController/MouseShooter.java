
package GameController;

import GameEngineSystem.Duck;
import GameEngineSystem.Enemy;
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
    private static boolean c;
    private static Enemy duck;
                
        
    //Checks for action at the time of a click
    public static void getC() { 
        
        System.out.println(Mouse);
        try { //Fucking problem is fucking here
            //Fucking method will not run
            duck.fly();
            System.out.println("54654");
        } catch (Throwable e) {
            System.out.println("tanana");
        }
        System.out.println("click click");

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
                c = true; //Activates click
                getC(); //Check for action
                c = false; //Deactivates click
                System.out.println("X:" + Mouse);
            
            }
        };
        return mouseAdapter;
    }
}
