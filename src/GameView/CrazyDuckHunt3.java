
package GameView;

import GameController.MouseShooter;
import GameEngineSystem.Game;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

//CAMBIAR NOMBRE
public class CrazyDuckHunt3 {
    
    public JFrame Window;
    public JPanel Pa;
    Menu MenuW;
    About AboutW;
    public boolean running;
    public boolean MenuWindow;
    public boolean GameLoop;
    public boolean AboutLoop;
    public Graphics g;
    private static final MouseShooter mouse = new MouseShooter();
    
    public CrazyDuckHunt3(){
        Controller();
    }
    
    public void Controller(){
        running = true;
        MenuWindow = true;
        MenuW = new Menu();
        AboutW = new About();
        Window = new JFrame("Crazy Duck Hunt");
        Window.setSize(800, 600);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setLocationRelativeTo(null);
        Window.setVisible(true);
        /*MenuW.Menus();
        Window.add(MenuW.getGUI());*/
        
        while (running){
            if (MenuWindow){
                MenuW.Menus();
                Window.add(MenuW.getGUI());
                if (MenuW.GameLoop==true){
                    this.GameLoop = true;
                    this.AboutLoop = false;
                    this.MenuWindow = false;
                    Window.getContentPane().removeAll();
                    Window.repaint();
                }
                if (MenuW.AboutLoop==true){
                    this.GameLoop = false;
                    this.AboutLoop = true;
                    this.MenuWindow = false;
                    Window.getContentPane().removeAll();
                    Window.repaint();
                }
            }
            if (GameLoop){
                //JFrame window = new JFrame();
                System.out.println("Playing");
                Game game = new Game();
                Window.addMouseListener(mouse.MouseAdapter());
                Window.getContentPane().add(game);
            }
            if (AboutLoop){
                AboutW.Abouts();
                Window.add(AboutW.getGUI());
                if (AboutW.MenuWindow==true){       
                    this.MenuWindow = true;
                    this.AboutLoop = false;
                    this.GameLoop = false;
                    Window.getContentPane().removeAll();
                    Window.repaint();
                }
            Window.setVisible(true);
            }
        }
    }
    
    public static void main(String[] args) {
        new CrazyDuckHunt3();
    }
}
