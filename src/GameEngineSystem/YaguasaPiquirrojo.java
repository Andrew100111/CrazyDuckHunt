package GameEngineSystem;

import static java.awt.Color.GREEN;



public class YaguasaPiquirrojo extends Enemy {
    
    //int life = 1;
    //int points = 2; for each shot at the duck 
    //int speed = 10; percentage of this duck: duble than colorado's
    //float appearance = 100;  percentage of this duck: 1% 
    
    private int time = 30;   
    
    public YaguasaPiquirrojo() {
        
        color = GREEN;
        state = true;
        life = 1;
        points = 25;
        speed = speed * 1.3;
        
        System.out.println(this.x);
    }
    public void Time(){
        while(time>0){
            if(time != 0){
                time --;
            }
            else{
                break;
            }
        }
        System.out.println(time);
    }
    
    /*public void NaturalDeath(){
        if(time == 0){
            if (score >=  2){
                score = score -2; 
            } else if(score == 1){
                score --;
            } else if (score == 0){
                System.out.println("Puntaje sin cambios");
            }
                
            }
      */          
            
    }
  
