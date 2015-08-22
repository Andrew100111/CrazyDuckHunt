/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Xcreed
 */
public class Game extends JPanel implements Runnable{
    
    
    //Relate mouseshooter
    
    private List<Enemy> Enemies = new ArrayList<>(); 
    private List<Enemy> EnemiesOnScreen = new ArrayList<>();
    private Thread thread = new Thread(this);
    
    public Game() {
        getEnemy();
        thread.start();
    }
    
    public void run() {
        enemyScreen();
    }
    
    //Creates a list with different instances of ducks
    public List getEnemy() {
        //Adds a new instance to the list of enemies
        for (int i = 0; i < 25; i++) {
            Enemies.add(new Colorado());
            Enemies.add(new GansoHawai());
            Enemies.add(new PatoSalvaje());
            Enemies.add(new TarroCanelo());
        }
       return Enemies;
    }
        
    //Checks the amount of enemies in the list
    public void checkAmount(){
        //No more enemies = next level
        if (Enemies.isEmpty()){
            System.out.println("Congrats");
        }
        //No more time and enemies left = Game Over
        if (EnemiesOnScreen.size() == 25) {
            System.out.println("Game Over");
        }
    }
    
    //Adds enemies to the screen **Doesn't have delay**
    public List enemyScreen() {
        Random random = new Random();
        //Randomly adds from Enemies
        for (int i = 0; i < 25; i++) {
            EnemiesOnScreen.add(Enemies.get(random.nextInt(Enemies.size())));
            EnemiesOnScreen.get(i).state = true;//When the duck is added that state changes
        }
        return EnemiesOnScreen;
    }
    
    @Override
    public void paintComponent(Graphics g) {    
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Enemy enemy : EnemiesOnScreen) {
            //Sets color and the new location and draws the rectangle
            g2.setColor(enemy.getColor());
            enemy.rec.setLocation(enemy.getX(), enemy.getY());
            g2.draw(enemy.rec);
            
            g2.fill(enemy.rec);
            
            super.repaint();
        }
        super.repaint();
    }
}
