/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appendstring;

/**
 *
 * @author U134713
 */
public class AppendString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                String str1 = "This is my string.";
        String str2 = " I'm appending new string data to it.";

        //StringBuilder is used to append two strings
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2);

        System.out.println("Original String: " + str1);
        System.out.println("Appended String: " + sb.toString());
    }
    }
    

