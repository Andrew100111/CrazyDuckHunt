
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

    protected int life = 5; //hits needed to kill it
    protected int points; //points the player earns
    protected double speed; //speed of movement of each duck
    protected double appearance; // percentage of apprearence on the screen
    private static int x = 0; //location x
    private static int y = 0; //location y
    public JLabel block;
    public final int height = 30;
    public final int width = 30;
    private int score = 0;//Try for die()
        
    public Enemy() {
        
        try {
            speed = getSpeed();
        } catch (Exception ex) {
            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
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
        
        //Delay in the method to execute again
        try {
            Thread.sleep((int) speed); //The faster they move equals 
                                        //the delay on this defined by speed
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

    public double getSpeed() throws Exception {
        XMLreader xml = new XMLreader();
        //speed = xml.main();
        return xml.main();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getAppearance() {
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
