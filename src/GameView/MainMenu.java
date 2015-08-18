package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Game;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MainMenu extends JFrame{
    
    //private static Game game = new Game();
    private static MouseShooter mouse = new MouseShooter();
    
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MainMenu();
//            }
//        });  
        new MainMenu();
    }
    
    public MainMenu() {
        
        Game game = new Game();
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
