/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csvread;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author U134713
 */
public class CSVRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner("c:\\temp\\honaker.csv");
        sc.useDelimiter(",");
        
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
    
}
