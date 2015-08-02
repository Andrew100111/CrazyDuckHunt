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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MainMenu {

    static MouseShooter mouse = new MouseShooter();
    //static Duck duck = new Duck();
    

    public static void main(String... args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                windows();
            }
        });

        //Gets user text
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        //Keeps track of what the user entered
        System.out.println("You entered: "  + name );
        

    }

    public static void windows() {

        JButton click = new JButton();

        click.setSize(20, 10);

        JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        //window.getContentPane().add(click, BorderLayout.CENTER); 

        //Check the position of the click on the window
        window.addMouseListener(MouseShooter.MouseAdapter());  
                
        window.setSize(1000, 600); //window size
        window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        window.setResizable(false); //don't allow to change size of the window
        
        //ImageIcon chdicon = new ImageIcon(); //image to change the icon on the window
        //window.setIconImage(chdicon.getImage());//set the icon on the window

        //window.pack();
        window.setVisible(true);

    }

}
