package GameEngineSystem;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

/**
 *
 * @author Xcreed
 */
public class Prueba {
    
//    private static XMLreader xml = new XMLreader();
//    private static final Scanner scanner = new Scanner(System.in);
//    private static Game game = new Game();
//    
//    
//    public static void main(String[] args) {
//        
//        while (true) {
//            String line = scanner.nextLine();
//            game.tryDeath(Integer.parseInt(line));
//            game.checkAmount();
//        }
//    }
    public static void main(String[] args) {
      new GameFrame();
   }


static class GameFrame extends JFrame {
   public GameFrame() {
      super("Game Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Squares squares = new Squares();
      getContentPane().add(squares);
      for (int i = 0; i < 15; i++) {
         squares.addSquare(i * 10, i * 10, 100, 100);
      }

      pack();
      setLocationRelativeTo(null);
      setVisible(true);

   }

   

}

static class Squares extends JPanel {
   private static final int PREF_W = 500;
   private static final int PREF_H = PREF_W;
   private List<Rectangle> squares = new ArrayList<Rectangle>();

   public void addSquare(int x, int y, int width, int height) {
      Rectangle rect = new Rectangle(x, y, width, height);
      squares.add(rect);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(PREF_W, PREF_H);
   }

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      for (Rectangle rect : squares) {
         g2.draw(rect);
      }
   }

}
}
