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
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Xcreed
 */
public class Game extends JPanel implements Runnable{
    
    private List<Enemy> Enemies = new ArrayList<Enemy>(); //since there is 25 ducks per level
    private List<Enemy> EnemiesOnScreen = new ArrayList<Enemy>();
    private int Level = 1;
    private Thread thread = new Thread(this);
    
    public Game() {
        
        getEnemy();
        thread.start();
    }
    
    public void run() {
        enemyScreen();
    }
    
    //25 ducks per level, will be in the array 
    public List getEnemy() {
        
        //Adds a new instance to the list of enemies
        for (int i = 0; i < 25; i++) {
            Enemies.add(new Colorado());
            Enemies.add(new GansoHawai());
            Enemies.add(new PatoSalvaje());
            Enemies.add(new TarroCanelo());
            //enemyScreen(Enemies.get(i));
           
        }
        
       //System.out.println(EnemiesOnScreen);
       return Enemies;
        
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
    
    //IT SHOULD ADD ONE BY ONE *MISSING*
    @SuppressWarnings("SleepWhileInLoop")
    public List enemyScreen() {
        Random random = new Random();

        
        for (int i = 0; i < 25; i++) {
            EnemiesOnScreen.add(Enemies.get(random.nextInt(Enemies.size())));
            EnemiesOnScreen.get(i).state = true;

            //return EnemiesOnScreen;
        }
        
        return EnemiesOnScreen;
    }
    //ONly 2 rectangles are showing
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
