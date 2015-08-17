package GameView;

import GameEngineSystem.Enemy;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JFrame{ 
        
    public void paintComponent(Graphics g) {
        
        super.paintComponents(g);
        //enemy.block.setLocation(enemy.getX(), enemy.getY());
        //enemy.block.repaint();
//        super.update(g);
        
        //super.add(enemy.block);        
        
    }
//    public static BufferedImage resize(BufferedImage image, int width, int height) {
//        
//        //editedImage -> imagen editedImage
//        BufferedImage editedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
//        Graphics2D g2d = (Graphics2D) editedImage.createGraphics();
//        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
//        g2d.drawImage(image, 0, 0, width, height, null);
//        g2d.dispose();
//        return editedImage;
    
    
}
