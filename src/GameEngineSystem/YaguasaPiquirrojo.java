
package GameEngineSystem;


public class YaguasaPiquirrojo extends Enemy {
    
    int life = 1;
    int points = 2; //for each shot at the duck 
    int time = 30;
    int speed = 10; //percentage of this duck: duble than colorado's
    float appearance = 100; // percentage of this duck: 1% 
    
    public void Time(){
        while(time>0){
            if(time != 0){
                time --;
            }
            else{
                break ;
            }
        }
        System.out.println(time);
    }
    
    public void MuerteNatural(){
        if(time == 0){
            
            
        }
    }
    
    
    
}
