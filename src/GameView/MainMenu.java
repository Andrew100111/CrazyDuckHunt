/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameView;

import java.util.Scanner;

/**
 *
 * @author xcreed
 */
public class MainMenu {
      
    
    public static void main(String[] args) {
        
         //Gets user text
        Scanner input = new Scanner(System.in); 
        
        
        String name = input.nextLine(); 

        System.out.println("You entered:");
        System.out.println(name);

}
    
}
