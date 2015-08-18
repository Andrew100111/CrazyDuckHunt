
package GameEngineSystem;

import GameController.MouseShooter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public abstract class Enemy{
    
    //si aparecen 100 patos: 
   // 82 PatosSalvados, 5 PatosColorados, 2 TarrosCanelo, 10GansoHawai, 1YPiquirrojo

    protected int life = 10; //hits needed to kill it
    protected int points; //points the player earns
    protected double speed; //speed of movement of each duck
    protected double appearance; // percentage of apprearence on the screen
    protected Random random = new Random();
    private Point location;
    protected int x; //location x
    protected int y; //location y
    public BufferedImage duck;
    public final int height = 30;
    public final int width = 25;
    public Rectangle rec = new Rectangle(getX(),getY(),height,width);
    protected Color color;
    protected String type;
    
    public Enemy() {
         
        try {
            speed = getSpeed();
        } catch (Exception ex) {
            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void fly() { //every duck has the ability to fly

        if (x == 600) {
            setLocation(x--,y);
        }
        if (x == 0 || x < 600) {
            setLocation(x++,y);
        }
        else if (y == 400) {
            setLocation(x,y--);
        }    
        else {
            setLocation(x,y++);
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
        }
        
        //Ducks is being shot (NO Sirve) 
        //Puntero relativo a la pantalla y no a las figuras
        else if (rec.getBounds().contains(MouseShooter.getPoint())) {
        //if ( MouseShooter.getPoint().x >= rec.getMinX() && MouseShooter.getPoint().x <= rec.getMaxX()   // check if X is within range
            //&& ( MouseShooter.getPoint().y >= rec.getMinY() && MouseShooter.getPoint().y <= rec.getMaxY())) { // check if y is within range
            System.out.println("Ouch!");
            life--;
            System.out.println(life);
        }
        
        else {
            System.out.println("Missed");
        }
    }
    
//    public ImageIcon createDuck(String path) {
//        duck = new ImageIcon(getImage(path));  
//        //block.setLocation(50, 50);
//        //block.revalidate();
////        duck.setSize(width, height);
////        System.out.println(duck.getBounds());
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
    
    //Retrieves Image
    public BufferedImage getImage(String path) {
        File file = new File(path);
        try {
            duck = ImageIO.read(file); 
            //BufferedImage image = ImageIO.read(file);
            //return image;
            return duck;
        } catch (IOException ex) {
           
            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
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
    
    public Color getColor() {
        return color;
    }

}
