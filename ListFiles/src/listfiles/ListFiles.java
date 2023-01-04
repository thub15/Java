/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listfiles;
import java.io.*;
import java.util.Arrays;
//import java.nio.file.Files;

/**
 *
 * @author Tom Hubbard
 */
public class ListFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create new File object and create as dir
        // dir is the folder c:\temp and everything in it.
        File dir = new File("c:\\temp\\");
        
        try {
            // create a FileWriter file object 
            FileWriter file = new FileWriter("c:\\temp\\files.txt");
            // call the bufferedWriter class? 
            BufferedWriter buffer = new BufferedWriter( file);
            
            if (dir.exists())
        {
            // assign the files variable the number of files in the directory
            String[] files = dir.list();
            
            // listing the number of files found
            System.out.println(files.length + " files found...");
            
            // initializing int i as a zero, comparing the length of the files object, then if files.length is less than that, add 1
            // but I don't get why it's done this way
            // iterates through the files in c:\temp
            
        //    for ( initilization; test; increment)
        // initialization is the expression that starts the loop
        // test is the test that occurs before each pass of the loop, must be a boolean, if true continue
        // increment used to change the value of the loop index to bring closer to returning false, occurs 
        //  after each pass of the loop.
        // in this case i refers to creating an index, and starting it at 0
        // I get it now!
        for ( int i = 0; i < files.length; i++)
        {
            // This works to sort the files, but it is sorted capital letters
            // first alphabetically, then lower case letters alphabetically.
            Arrays.sort(files);
            // list the files found
            System.out.println(files[i]);
            // write the list of file to a txt file
            buffer.append(files[i]);
            buffer.newLine();
            //buffer.close();
        }
        buffer.close();
        }
        else
        {
            System.out.println("Folder not found.");
        }
        
        
        } catch (IOException e) {
            System.out.println("Can't write to file");
            //buffer.close();
        }
    }
}
        
    
    

