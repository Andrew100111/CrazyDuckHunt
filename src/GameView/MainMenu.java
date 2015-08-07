package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Enemy;
import GameEngineSystem.Game;
import GameEngineSystem.GansoHawai;
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
    
    private static Game game = new Game();
    
    public static void main(String[] args) {
        
        start();

    }
    
    public static void start() {
        
        JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
                        
        window.setSize(1000, 600); //window size
        window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        window.setResizable(false); //don't allow to change size of the window
        
        //window.add(game.getDuck("Ganso").duck);
        //window.add(new GansoHawai().duck);
        
        window.pack();
        window.setVisible(true);
    }
}
