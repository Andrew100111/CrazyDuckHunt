package GameView;

import GameEngineSystem.Enemy;
import GameEngineSystem.GansoHawai;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class Drawing extends JPanel{ 
    
    //Needs to be able to work for any duck
    private Enemy enemy = new GansoHawai();
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(enemy.getColor());
        g2.draw(enemy.rec);

        //super.repaint();
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
