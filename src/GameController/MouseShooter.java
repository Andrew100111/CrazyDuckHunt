/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameController;

import java.awt.BorderLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author xcreed
 */
public class MouseShooter {
    
    
    //Gets the location of the pointer
    public void getClick() throws InterruptedException {
        
        while (true) {
        
        PointerInfo mouse = MouseInfo.getPointerInfo();
         
        Point loc = mouse.getLocation();
        System.out.println(loc);
        //System.out.println(loc.x);
        //System.out.println(loc.y);
        
        //Puts a 1s delay for printing the location
        
        Thread.sleep(1000);
        
        } 

    }
    
}
