/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Xcreed
 */
public class Game extends JPanel{
    
    private final List<Enemy> Enemies = new ArrayList<Enemy>(); //since there is 25 ducks per level
    private LinkedList EnemiesOnScreen = new LinkedList();
    private int Level = 1;
    
    public Game() {
        
//        for (int i = 0; i < 25; i++) {
//            System.out.println(getEnemy().get(i));
//        }
        
        //System.out.println("Game " + colorado.rec);
        getEnemy();
        checkAmount();
    }
    
    //25 ducks per level, will be in the array 
    public List getEnemy() {
        
        Random random = new Random();

        List<Enemy> ducks = new ArrayList();
        //ducks.add(new Colorado());
        //ducks.add(new PatoSalvaje());
        ducks.add(new GansoHawai());
//        ducks.add(new TarroCanelo());
//        ducks.add(new YaguasaPiquirrojo());
        
        for (int i = Enemies.size(); i < 25; i++) {
            Enemies.add(ducks.get(random.nextInt(ducks.size())));
        }
        return Enemies;
        
    }
    
    //Removes the duck that is inside of each index
    public void tryDeath(int i) {
        Enemies.remove(i);
        Enemies.size();
    }
    
    //make private//Checks the amount of enemies in the list
    public void checkAmount(){
        //No more enemies = next level
        if (Enemies.isEmpty()){
            System.out.println("Congrats");
            Level++;
        }
        //No more time and enemies left = Game Over
        if (EnemiesOnScreen.size() == 25) {
            System.out.println("Game Over");
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {    
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Enemy enemy : Enemies) {
            //System.out.println(enemy);
            g2.setColor(enemy.getColor());
            g2.draw(enemy.rec);
            g2.fill(enemy.rec);
            //enemy.rec.setLocation(enemy.getLocation());
            //super.repaint();
        }
        
        //super.repaint();
    }
}
