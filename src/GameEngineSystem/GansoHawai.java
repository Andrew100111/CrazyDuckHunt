

package GameEngineSystem;


public class GansoHawai extends Enemy {
    
    //por lo general se quedan es un seccion del área del juego & se mantienen ahí
    //este mae no tiene mucho movimiento 
    
    //int life = 2; 
    //int points = 10; for each shot at the duck
    //int speed = 7; 
    //float appearance = 100; percentage of this duck: 10% 
    
    public GansoHawai() {
        
        createDuck("src/res/gansoHawai1.png");
        life = 2;
        points = 10;
        speed = speed * 0.7;
        fly();
    }
    
    @Override //Duck only appears at one random part of the screen
    public void fly() {
        
        setX(random.nextInt(1000));
        setY(random.nextInt(600));
        
        setLocation(getX(), getY());
        
        System.out.println(getLocation());
    }
}
