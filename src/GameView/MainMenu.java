package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Duck;
import GameEngineSystem.Enemy;
import java.awt.BorderLayout;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
<<<<<<< HEAD

=======
=======
>>>>>>> master
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
>>>>>>> origin/master
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


<<<<<<< HEAD

=======
<<<<<<< HEAD
public class MainMenu {

    static MouseShooter mouse = new MouseShooter();
    //static Duck duck = new Duck();
    
=======
>>>>>>> master
public class MainMenu{

    private static MouseShooter mouse = new MouseShooter(); 
    private static Duck duck = new Duck(1); //creates instance of a duck
    //private static 
    private static JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
    //private Timer timer = new Timer(20,new ActionListener());
>>>>>>> origin/master

<<<<<<< HEAD

    public static void main(String[] args) {
=======
    public static void main(String... args) {
>>>>>>> master
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //start();
                NewClass.start();
                //window.repaint();
                //paintScreen(g);
                
            }
        });
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master

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

<<<<<<< HEAD

=======
=======
>>>>>>> master
        
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
        
>>>>>>> origin/master
        //Check the position of the click on the window
        window.addMouseListener(MouseShooter.MouseAdapter());  
                
        window.setSize(1000, 600); //window size
        window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        window.setResizable(false); //don't allow to change size of the window
        
        //ImageIcon chdicon = new ImageIcon(); //image to change the icon on the window
        //window.setIconImage(chdicon.getImage());//set the icon on the window

        //window.pack();
        window.setVisible(true);

        
            
//        draw.repaint();
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    
//    public static void paintScreen (Graphics g) {
//        window.paint(g);
//        window.revalidate();
//    }
>>>>>>> origin/master
>>>>>>> master
}
