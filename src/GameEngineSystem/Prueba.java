/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import GameView.Drawing;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xcreed
 */
public class Prueba {
    
    private static XMLreader xml = new XMLreader();
    private static final Scanner scanner = new Scanner(System.in);
    private static Game game = new Game();
    private static Drawing draw = new Drawing();
    
    
    public static void main(String[] args) {
        
        while (true) {
            String line = scanner.nextLine();
            game.tryDeath(Integer.parseInt(line));
            game.checkAmount();
        }
    }
}
