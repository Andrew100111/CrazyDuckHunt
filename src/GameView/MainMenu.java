package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Duck;
import java.awt.BorderLayout;
import java.awt.Point;
import java.util.Scanner;
import javax.swing.JFrame;


public class MainMenu {

    static MouseShooter mouse = new MouseShooter(); 
    static Duck duck = new Duck(1); //Creates instance of a duck
    private static Point Mouse;
    

    public static void main(String[] args) {

        windows();
        //duck.die();

        //Gets user text
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        //Keeps track of what the user entered
        System.out.println("You entered:");
        System.out.println(name);

    }

    public static void windows() {

        JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        window.getContentPane().add(duck.block, BorderLayout.CENTER); 
        
         
        //Check the position of the click on the window
        window.addMouseListener(MouseShooter.MouseAdapter());  
                
        window.setSize(600, 400); //window size
        window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        window.setResizable(false);

        //window.pack();
        window.setVisible(true);

    }
    
    public static Point getMouse() {
        return Mouse;
    }

}
