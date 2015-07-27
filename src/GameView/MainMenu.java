/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Duck;
import GameEngineSystem.Enemy;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author xcreed
 */
public class MainMenu {

    static MouseShooter mouse = new MouseShooter();
    static Duck duck = new Duck();
    

    public static void main(String[] args) {

        windows();
        duck.fly();
        //Thread inside MouseShooter needs a try/catch

//        try {
//            mouse.getClick();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //Gets user text
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        //Keeps track of what the user entered
        System.out.println("You entered:");
        System.out.println(name);

    }

    public static void windows() {

        JButton click = new JButton();

        click.setSize(20, 10);

        JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        //window.getContentPane().add(click, BorderLayout.CENTER); 

        //Check the position of the click on the window
//        window.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                System.out.println(e.getPoint());
//            }
//        });  
        
    
        
        window.setSize(600, 400); //window size
        window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        window.setResizable(false);

        //window.pack();
        window.setVisible(true);

    }

}
