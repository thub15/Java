/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package writefile;
import java.io.*;
import java.nio.Buffer;
/**
 *
 * @author Tom Hubbard
 */
public class WriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileWriter file = new FileWriter("c:\\temp\\tam.txt");
            BufferedWriter buffer = new BufferedWriter( file);
            
            buffer.write("The wind blew...");
            buffer.newLine();
            buffer.write("The rattling showers...");
            buffer.newLine();
            buffer.write("the speedy gleams....");
            buffer.newLine();
            buffer.write("loud, deep, and long....");
            buffer.newLine();
            buffer.write("That night....");
            buffer.newLine();
            buffer.write("the devil had business");
            buffer.close();
        } catch (IOException e) {
            System.out.println("A write error has ocurred");
        }
    }
    
}
