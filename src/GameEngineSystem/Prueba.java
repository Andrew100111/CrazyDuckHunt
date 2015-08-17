
package GameEngineSystem;

import java.util.Scanner;

public class Prueba {
    
    private static XMLreader xml = new XMLreader();
    private static final Scanner scanner = new Scanner(System.in);
    private static Game game = new Game();
    
    
    public static void main(String[] args) {
        
        while (true) {
            String line = scanner.nextLine();
            game.tryDeath(Integer.parseInt(line));
            game.checkAmount();
        }
    }
}
