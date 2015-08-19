
package GameEngineSystem;

import static java.awt.Color.ORANGE;


public class PatoSalvaje extends Enemy{
    
    public PatoSalvaje() {
        
        color = ORANGE;
        state = true;
        life = 1;
        points = 1;
        speed = speed * 0.4;
        fly();
        System.out.println(this.x);
    }
    
    //This duck moves all over the screen
//    public void fly() {
//        
//        int y = getY();
//        boolean axisY = random.nextBoolean();
//        
//        if (y == 600) {
//            axisY = false;
//        }
//        
//        if (y == 0) {
//            axisY = true;
//        }
//        if (axisY) {
//            
//            y++;
//        }
//        
//        else { 
//            y--;
//        }
//    }
//        
}
