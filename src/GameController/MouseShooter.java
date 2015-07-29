/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameController;

import GameView.MainMenu;
import java.awt.BorderLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author xcreed
 */
public class MouseShooter {
    
    //private static int MouseX = MainMenu.getMouse().x;
    //private static int MouseY = MainMenu.getMouse().y;
    public static Point loc = MainMenu.getMouse();
                
        
    //Gets the location of the pointer
    public void getClick() throws InterruptedException {
        
//        //Check the position of the click on the window
//        this.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                System.out.println(e.getPoint());
//            }
//        });  
//        while (true) {
//        
//        mouse = MouseInfo.getPointerInfo();
//        loc = mouse.getLocation();
//        
//        int x = loc.x;
//        int y = loc.y;
//                
//        System.out.println(loc);
//        
//        if (x <= 600) {
//            //System.out.println("raeched");
//            //break;
//   
//        }

        
        //Puts a 1s delay for printing the location
        
        Thread.sleep(1000);
        
        
        //}
    }
    
//    public int getX() {
//        return MouseX;
//    }
//    
//    public int getY() {
//        return MouseY;
//    }
    
    public Point getP() {
        return loc;
    }
    
}
