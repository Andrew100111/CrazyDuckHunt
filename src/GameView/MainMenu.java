package GameView;

import GameEngineSystem.Game;
import javax.swing.JFrame;


public class MainMenu{
    
    private static Game game = new Game();
    
    public static void main(String[] args) {
        
        start();

    }
    
    public static void start() {
        
        JFrame window = new JFrame("Crazy Duck Hunter"); //creates window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
                        
        window.setSize(1000, 400); //window size
        window.setLocationRelativeTo(null); //puts the window in the center of the screen  
        window.setResizable(true); //don't allow to change size of the window
        
        //window.add(game.getDuck("Ganso").duck);
        //window.add(new GansoHawai().duck);
         
        window.pack();
        window.setVisible(true);
    }
}
