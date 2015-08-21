
package GameEngineSystem;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Enemy implements Runnable{

    protected int life; //hits needed to kill it
    protected int points; //points the player earns
    protected double speed; //speed of movement of each duck
    protected double appearance; // percentage of apprearence on the screen
    protected Random random = new Random();
    protected int x; //location x
    protected int y; //location y
    public final int height = 30;
    public final int width = 25;
    public Rectangle rec = new Rectangle(getX(),getY(),height,width);
    protected Color color;
    protected String type;
    protected boolean state = false;
    protected Thread run = new Thread(this);
    
    public Enemy() {
         
        //Trying with threads
        run.start();
        try {
            speed = getSpeed();//Gets the speed from the XML
        } catch (Exception ex) {
            Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        //Use of threads here
        fly();
    }
    public  void fly() { //every duck has the ability to fly
        //The method needs to run repeatly
        while (state) {
            setX(random.nextInt(1000));
            setY(random.nextInt(600));
            System.out.println("HEY MA! I'M FLYING");
            if (x == 600) {
                x--;
            }
            if (x == 0 || x < 600) {
                x++;
            }
            else if (y == 400) {
                y--;
            }    
            else {
                y++;
            }
            
//            try {
//                //fly();//DONT KNOW IF WORKS
//                Thread.sleep((long) speed*1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Enemy.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        //The duck is no longer alive
        System.out.println("Duck dead");
    }
    
    public void die() {
        //Duck is dead
        if (life == 0) {
            state = false;
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
        //Click wasn't in range
        else {
            System.out.println("Missed");
        }
    }
    
    //We were working with images at the beginning
//    public ImageIcon createDuck(String path) {
//        duck = new ImageIcon(getImage(path));  
//        block.setLocation(50, 50);
//        block.revalidate();
//        duck.setSize(width, height);
//        System.out.println(duck.getBounds());

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
//    public BufferedImage getImage(String path) {
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
    
    public Color getColor() {
        return color;
    }

}
