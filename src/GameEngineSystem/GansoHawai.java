package GameEngineSystem;

public class GansoHawai extends Enemy {
    
    public GansoHawai() {
        
        //getImage("src/res/gansoHawai1.png");
        //createDuck("src/res/gansoHawai1.png");
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