/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemlanguage;

import java.util.Locale;

/**
 *
 * @author Wesley Jacques
 */
public class SystemLanguage {

    
    public static void main(String[] args) {
        
        Locale language = Locale.getDefault();
        System.out.print("O sistema esta utilizando a linguagem: ");
        System.out.println(language.getDisplayLanguage());  
    }
    
}
