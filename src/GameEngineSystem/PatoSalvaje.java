
package GameEngineSystem;


public class PatoSalvaje extends Enemy{
    
    
    //int life = 1;
    //int points = 1;
    //int speed = 10; percentage of this duck: 90%
    //float appearance = 100; percentage of this duck: 1% 
    
    public PatoSalvaje() {
        
        life = 1;
        points = 1;
        speed = speed * 0.4;
        type = "Pato";
    }
    
    //This duck moves all over the screen
    @Override
    public void fly() {
        
        int y = getY();
        boolean axisY = random.nextBoolean();
        
        if (y == 600) {
            axisY = false;
        }
        
        if (y == 0) {
            axisY = true;
        }
        if (axisY) {
            
            y++;
        }
        
        else { 
            y--;
        }
    }
        
}
