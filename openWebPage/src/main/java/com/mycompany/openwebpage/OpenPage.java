/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.openwebpage;
import java.net.URI;

/**
 *
 * @author U134713
 */
public class OpenPage {
    
    public static void main(String[] args) {
        try {
        URI uri = new URI("https://www.bing.com/search?q=silver+spot+price&form=QBLH&sp=-1&pq=silver+spot+pri&sc=8-15&qs=n&sk=&cvid=9218D1A9DD544DF9AC728E9FCD6ABDEA");
        java.awt.Desktop.getDesktop().browse(uri);
        System.out.println("Web page opened in browser!");
    } catch ( Exception e) {
            e.printStackTrace();
            }
    }
}
