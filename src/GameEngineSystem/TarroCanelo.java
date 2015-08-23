
package GameEngineSystem;

import static java.awt.Color.WHITE;


public class TarroCanelo extends Enemy {

    public TarroCanelo() {
        
        color = WHITE;
        life = 7;
        points = 5;
        speed = speed * 3;
        
    }
}
