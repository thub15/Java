/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author U134713
 */
public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");
        
        double tax = 0.2, total = 0.0;
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description = "Blue Jacket";
        item1.price = 20.90;
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.50;
        item2.size = "S";
        
        System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
        System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
        
        total = (item1.price + item2.price * 2) * (1 + tax);
        //total = Math.round(total)
        System.out.println(total);
    }
}
