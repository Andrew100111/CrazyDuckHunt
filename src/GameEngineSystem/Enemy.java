
package GameEngineSystem;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public abstract class Enemy {
    
    //si aparecen 100 patos: 
        // 82 PatosSalvados, 
        //5 PatosColorados, 
        //2 TarrosCanelo, 
        //10GansoHawai, 
        //1YPiquirrojo

    protected int life; //hits needed to kill it
    protected int points; //points the player earns
    protected double speed; //speed of movement of each duck
    protected double appearance; // percentage of apprearence on the screen
    protected Random random = new Random();
    private Point location;
    private static int x = 0; //location x
    private static int y = 0; //location y
    public BufferedImage duck;
    public final int height = 30;
    public final int width = 30;
        
    public Enemy(){
        
        try {
            speed = getSpeed();
        }catch (Exception ex){
            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fly(){ //every duck has the ability to fly
     
        if (x == 600) {

            x--;

        }

        if (x ==0 || x < 600) {

            x++;    
            
        }
          
        else if (y == 400) {
            
            y--;
        }    
        
        else {
             
            y++;
        }
        
        //delay in the method to execute again
        try {
            Thread.sleep((int) speed); //the faster they move equals 
                                        //the delay on this defined by speed
        } catch (InterruptedException ex) {
            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void die() {

        //agregar aumentar score del player
        if (life == 0) {
            System.out.println("DEAD");
        }
        
//        //Ducks is being shot
//        else if (duck.contains(MouseShooter.getP())) {
//            life--;
//            System.out.println(life);
//        }
        
        else {
            System.out.println("Missed");
        }

    }
    
//    public ImageIcon createDuck(String path) {
//        duck = new ImageIcon(getImage(path));  
//        block.setLocation(50, 50);
//        block.revalidate();
//        duck.setSize(width, height);
//        System.out.println(duck.getBounds());
//        return duck;
//    }

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
    
    //retrieves Image
    
    //ADD RES FOLDER ??
//    public BufferedImage getImage(String path) {
//        
//        File file = new File(path);
//        try {
//            duck = ImageIO.read(file); 
//            //BufferedImage image = ImageIO.read(file);
//            //return image;
//            return duck;
//        } catch (IOException ex) {
//           
//            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//        
//    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int i) {
        x = i;
    }
    
    public void setY(int i) {
       y = i;
    }
    
    public void setLocation(int x, int y) {
        
        location = new Point(x, y);
    }
    
    public Point getLocation() {
        
        return location;
    }
}
