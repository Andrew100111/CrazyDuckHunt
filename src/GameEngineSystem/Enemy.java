
package GameEngineSystem;

import GameController.MouseShooter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public abstract class Enemy {
    
    //si aparecen 100 patos: 
   // 82 PatosSalvados, 5 PatosColorados, 2 TarrosCanelo, 10GansoHawai, 1YPiquirrojo

    public int life = 5; //hits needed to kill it
    public int points; //points the player earns
    public int speed; //speed of movement of each duck
    public float appearance; // percentage of apprearence on the screen
    private static int x = 0; //location x
    private static int y = 0; //location y
    public JLabel block;
    public final int height = 30;
    public final int width = 30;
    private int score = 0;

    public Enemy(int life, int points, int speed, float appearance) {
        this.life = life;
        this.points = points;
        this.speed = speed;
        this.appearance = appearance;
                
    }
    
    public Enemy(String name) {
        
        if (name.equals("Colorado")) {
            Enemy colorado = new Colorado();
        }
        //run();
        
    }
    
    //Delete this
    public Enemy (int i) {
        
    }
    
    public Enemy() {
        
    }
    
    //#######################################################################//
   /*métodos necesarios acá
    ortorgarPuntos() -> en cada clase según tipo de pato
    aparecerEnPantalla() 
    desaparecerEnPantalla()
    quitarPuntos() -> solo YagasuaPiquirrojo, metodo en su clase
    
    */
    
    
    
    public void fly() { //every duck has the ability to fly
     
        if (x == 600) {

            x--;

        }

        if (x ==0 || x < 600) {

            x++;    
            block.setLocation(x, y);
            System.out.println(block.getBounds());

        }
          
        else if (y == 400) {
            
            y--;
        }    
        
        else {
             
            y++;
        }
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void die() {

                //Agregar aumentar score del player
        if (life == 0) {
            System.out.println("DEAD");
            score++;
            System.out.println(score);
            block.setEnabled(false);
        }
        
        else if (block.contains(MouseShooter.getP())) {
            life--;
            System.out.println(life);
        }
        
        else {
            System.out.println("Missed");
        }

    }
    
    public JLabel createDuck(String path) {
        block = new JLabel(new ImageIcon(getImage(path)));  
        //block.setLocation(50, 50);
        //block.revalidate();
        block.setSize(width, height);
        System.out.println(block.getBounds());
        return block;
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
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
