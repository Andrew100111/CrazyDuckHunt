
package GameEngineSystem;

import static java.awt.Color.WHITE;


public class TarroCanelo extends Enemy {
   
    //int life = 7;
    //int points = 5;
    //int speed = 4; percentage of this duck: number %
    //float appearance = 100; percentage of this duck: 2% 
    
    public TarroCanelo() {
        
        color = WHITE;
        state = true;
        life = 7;
        points = 5;
        speed = speed * 3;
        fly();
        System.out.println(this.x + "extemsion");
    }
}
