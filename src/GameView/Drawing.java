/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameView;

import GameEngineSystem.Duck;
import GameEngineSystem.Enemy;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Xcreed
 */
public class Drawing extends JPanel{ 
    
    private Enemy enemy = new Duck();
    
    public void paintComponent(Graphics g) {
        
        enemy.fly();
        //enemy.block.setLocation(enemy.getX(), enemy.getY());
        //enemy.block.repaint();
//        super.update(g);
        
        //super.add(enemy.block);        
        
    }
    
}
