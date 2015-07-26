/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameView;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author xcreed
 */
public class MainMenu {
      
    
    public static void main(String[] args) {
        
        windows();
        
         //Gets user text
        Scanner input = new Scanner(System.in); 
        
        
        String name = input.nextLine(); 
        //Keeps track of what the user entered
        System.out.println("You entered:");
        System.out.println(name);
        

}
    
    public static void windows() {
        
        Label empty = new Label();
        Button click = new Button();
        
        click.setSize(20, 10);
        
        JFrame window = new JFrame("CDH"); //creates window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        window.getContentPane().add(click, BorderLayout.CENTER); 
        
        window.setSize(600, 400);
        window.setLocationRelativeTo(null);     
        window.setResizable(false);
        
        
        
        //window.pack();
        window.setVisible(true);
        
        
    }
    
}
