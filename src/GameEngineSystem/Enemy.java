
package GameEngineSystem;

import GameController.MouseShooter;
import GameView.MainMenu;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


public abstract class Enemy {
    
    //si aparecen 100 patos: 
    // 82 PatosSalvados, 5 PatosColorados, 2 TarrosCanelo, 10GansoHawai, 1YPiquirrojo

    public int life; //hits needed to kill it
    public int points; //points the player earns
    public int speed; //speed of movement of each duck
    public float appearance; // percentage of apprearence on the screen
    private static int x = 50; //location x
    private static int y = 50; //location y
    public static JLabel block;
    

    public Enemy(int life, int points, int speed, float appearance) {
        this.life = life;
        this.points = points;
        this.speed = speed;
        this.appearance = appearance;
    }
    
    public Enemy() {
        
    }
    

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getAppearance() {
        return appearance;
    }

    public void setAppearance(float appearance) {
        this.appearance = appearance;
    }
    
    //Retrieves Image
    
    //ADD RES FOLDER??
    public BufferedImage getImage(String path) {
        
        File file = new File(path);
        try {
            BufferedImage image = ImageIO.read(file);
            return image;
        } catch (IOException ex) {
           
            Logger.getLogger(Duck.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    //#######################################################################//
   /*métodos necesarios acá
    ortorgarPuntos() -> en cada clase según tipo de pato
    aparecerEnPantalla() 
    desaparecerEnPantalla()
    quitarPuntos() -> solo YagasuaPiquirrojo, metodo en su clase
    
    */
    
    
    
    public void fly() { //every duck has the ability to fly
        
        int x = 0;
        int y;
        
        while (true && x <= 600) {
            
            x++;
            
            System.out.println("X =" + x);
            
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        System.out.println("reached limit");
        
        
    } 
    
    public void die() {
        //pato se muere
       
        
       if (block.getLocation() == MouseShooter.getP())
            System.out.println("hello there");
    }
}
