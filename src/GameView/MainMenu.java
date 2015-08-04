package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Enemy;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


public class MainMenu{
    
    private static MouseShooter mouse = new MouseShooter(); 

    private static JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
    
    public static void main(String[] args) {
        

    }
    

    public static void windows() {

        JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        //window.getContentPane().add(click, BorderLayout.CENTER); 


        
        //Gets user text
        //Scanner input = new Scanner(System.in);

        //String name = input.nextLine();
        //Keeps track of what the user entered
        //System.out.println("You entered:");
        //System.out.println(name);

    }

    public static void start() {
        
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        
        //Check the position of the click on the window
        //window.addMouseListener(MouseShooter.MouseAdapter());  
                
        //window.setSize(1000, 600); //window size
        //window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        //window.setResizable(false); //don't allow to change size of the window
        
        //ImageIcon chdicon = new ImageIcon(); //image to change the icon on the window
        //window.setIconImage(chdicon.getImage());//set the icon on the window

        //window.pack();
        //window.setVisible(true);
    }
}
