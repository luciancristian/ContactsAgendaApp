/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsAgenda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class RegisterValidation {
    
    public static String registerCode = "";
    public static final String registerFile = System.getProperty("user.dir").toString() + "\registerFile";
    
    public static void registerValidation (String registerInputCode) throws IOException
    {
        System.out.println(System.getProperty("user.dir"));
        registerCode = new String(Files.readAllBytes(Paths.get(registerFile))); 
        System.out.println ("nnnnnnn " + registerCode);
    }
    
    
}
