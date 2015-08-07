/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import GameEngineSystem.Enemy;
import java.util.LinkedList;
import org.w3c.dom.NodeList;

/**
 *
 * @author Xcreed
 */
public class Game {
    
    private LinkedList Enemies = new LinkedList(); //since there is 25 ducks per level
    private int time = 90;
    private int Level = 1;
    
    public Game() {
        
//        for (int i = 0; i < 25; i++) {
//            System.out.println(getEnemy().get(i));
//        }
        getEnemy();
        checkAmount();
    }
    
    //25 ducks per level, will be in the array 
    private LinkedList getEnemy() {
        
        Random random = new Random();

        List ducks = new ArrayList();
        ducks.add(new Colorado());
        ducks.add(new PatoSalvaje());
        ducks.add(new GansoHawai());
        ducks.add(new TarroCanelo());
        ducks.add(new YaguasaPiquirrojo());
        
        
        for (int i = Enemies.size(); i < 25; i++) {
            Enemies.add(ducks.get(random.nextInt(ducks.size())));
        }
        return Enemies;
        
    }
    
    //Removes the duck that is inside of each index
    public void tryDeath(int i) {
        
        Enemies.remove(i);
        Enemies.size();
        System.out.println(Enemies.size());
    }
    
    //make private//Checks the amount of enemies in the list
    public void checkAmount(){ 
        
        //No more enemies = next level
        if (Enemies.isEmpty()){
            System.out.println("Congrats");
            Level++;
        }
        
        //No more time and enemies left = Game Over
        if (time == 0 && !Enemies.isEmpty()){
            System.out.println("Game Over");
        }
    }
}
