/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensize;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Wesley Jacques
 */
public class ScreenSize {

    
    public static void main(String[] args) {
        
        Toolkit t = Toolkit.getDefaultToolkit();
        System.out.println(t);
        Dimension d = t.getScreenSize();
        System.out.println(d);
        // Termine o programa mostrando apenas a resolução formatada (1920 X 1080)
    }
    
}
