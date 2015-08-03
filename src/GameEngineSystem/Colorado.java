
package GameEngineSystem;


public class Colorado extends Enemy {

    //int life = 5; 
    //int points = 2; for each shot at the duck  
    //int speed = 6; 
    //float appearance = 100; percentage of this duck: 5% 
    
//    public Colorado(int life, int points, int speed, float appearance) {
//        super(life, points, speed, appearance);
//    } 
    
    public Colorado() {
        
        life = 5;
        points = 2;
        speed = speed * 0.6;
        appearance = 100;
        
        System.out.println(speed);
    }
    
    
}
