/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author U134713
 */
public class Customer {
    public static void main(String[] args) {
        String size;
        String customer1 = "Pinky";
        String customer1Size = "S";
        
        int measurement = 3;
        
        switch (size) {
            case 1: size = "Large";
                    
            
                break;
            case 2: size = "Medium";
                break;
                
            case 3: size = "Small";
            }
            default:
                throw new AssertionError();
        }
    }
}
