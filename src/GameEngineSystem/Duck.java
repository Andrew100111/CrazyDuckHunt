/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author xcreed
 */
public class Duck extends Enemy {
    
    public JLabel block = new JLabel(new ImageIcon(getImage("/home/xcreed/NetBeansProjects/CrazyDuckHunt/src/res/block.png")));

//    public Duck(int life, int points, int speed, float appearance) {
//        super(life, points, speed, appearance);
//    }
    
    
        
    
}
