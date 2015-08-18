package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Game;
import javax.swing.JFrame;


public class MainMenu extends JFrame{
    
    private static Game game = new Game();
    //private static Drawing draw = new Drawing();
    private static MouseShooter mouse = new MouseShooter();
    
    public static void main(String[] args) {
          
        new MainMenu();
    }
    
    public MainMenu() {
        
        JFrame window = new JFrame();
        window.setTitle("CDH");
        window.setSize(1000,600);
        window.addMouseListener(mouse.MouseAdapter());
        window.getContentPane().add(game);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
}
