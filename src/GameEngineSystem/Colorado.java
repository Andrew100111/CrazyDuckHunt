
package GameEngineSystem;

import static java.awt.Color.BLACK;

public class Colorado extends Enemy {

    public Colorado() {
        life = 5;
        points = 2;
        speed = speed * 0.6;
        appearance = 100;
        color = BLACK;
    }
}
