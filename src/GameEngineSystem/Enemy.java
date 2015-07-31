
package GameEngineSystem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
    private boolean t = true;
    public final int height = 30;
    public final int width = 30;
    

    public Enemy(int life, int points, int speed, float appearance) {
        this.life = life;
        this.points = points;
        this.speed = speed;
        this.appearance = appearance;
        
        
    }
    
//    public void run () {
//        if (t) {
//            //fly();
//            die();
//        }
//    }
    public Enemy() {
        //run();
        
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
        
        if (x < 600 || x == 0) {
            
            x++;
            
            System.out.println("X =" + x);
            
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        else if (x > 0 || x == 0) {
            x--;
        }     
        
        
        
        System.out.println("reached limit");
        
        
    } 
    
    public static void die() {
        //pato se muere
        System.out.println("Shit");
        System.out.println("Hi");

//        if (block.getBounds().contains(MouseShooter.getP())) {
//             System.out.println("hello there");
//        }
//
//
//        else 
//             System.out.println("hey");
    }
    
    public JLabel createDuck(String path) {
        block = new JLabel(new ImageIcon(getImage(path)));  
        block.setLocation(50, 50);
        block.revalidate();
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
    
}
