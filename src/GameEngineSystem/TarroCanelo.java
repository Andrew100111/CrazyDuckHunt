
package GameEngineSystem;

import static java.awt.Color.WHITE;


public class TarroCanelo extends Enemy {

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
