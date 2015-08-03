/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xcreed
 */
public class Prueba {
    
    private static XMLreader xml = new XMLreader();
    
    public static void main(String[] args) {
        try {
            System.out.println(xml.main());
        } catch (Exception ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
