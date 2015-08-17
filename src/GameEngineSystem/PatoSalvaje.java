package GameEngineSystem;

public class PatoSalvaje extends Enemy{

    public PatoSalvaje() {
        
        life = 1;
        points = 1;
        speed = speed * 0.4;
    }
    
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
