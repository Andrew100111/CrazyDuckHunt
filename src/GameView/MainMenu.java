package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Duck;
import java.awt.BorderLayout;
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
    private static Duck duck = new Duck(1); //creates instance of a duck
    //private static 
    private static JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
    //private Timer timer = new Timer(20,new ActionListener());

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                start();
                //window.repaint();
                //paintScreen(g);
                
            }
        });
        
//        //Gets user text
//        Scanner input = new Scanner(System.in);
//
//        String name = input.nextLine();
//        //Keeps track of what the user entered
//        System.out.println("You entered:");
//        System.out.println(name);

    }

    public static void start() {
        
        Drawing draw = new Drawing();
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        window.add(duck.block);
        
        //Check the position of the click on the window
        window.addMouseListener(MouseShooter.MouseAdapter());  
                
        window.setSize(600, 400); //window size
        window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        window.setResizable(false);

        //window.pack();
        window.setVisible(true);

        
            
        draw.repaint();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
//    public static void paintScreen (Graphics g) {
//        window.paint(g);
//        window.revalidate();
//    }
}
