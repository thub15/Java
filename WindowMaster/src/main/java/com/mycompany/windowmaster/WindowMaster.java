/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.windowmaster;
import java.util.Scanner;

/**
 *
 * @author Tom Hubbard
 */
public class WindowMaster {
    public static void main(String[] args) {
        //what variables do we need?
        
        //String for height, read from console from user input
        
        //String for width, read from console from user input
        
        //Float for height converted from string
        //Float is a single precision, should not be used for currency
        
        //Float for width coverted from String
        
        //Float for area of window, calc from height * width
        
        //Float for perimeter, calc from width + height * 2
        
        //Float for cost, calc from area, perimeter and costs
        
        // declare variable for height and width
        float height;
        float width;
        float costOfGlass;
        float costOfTrim;
        float howManyWindows;
        
        // declare String variables to hold the users inputted height and width
        // also cost of glass and cost of trim
        String stringHeight;
        String stringWidth;
        String stringCostOfGlass;
        String stringCostOfTrim;
        String stringHowManyWindows;
        
        // declare other variables
        float areaOfWindow;
        float perimeterOfWindow;
        float costPerWindow;
        float totalCost;
        
        
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("How many windows do you want?");
        stringHowManyWindows = myScanner.nextLine();
        
        System.out.println("Please enter the window height:");
        stringHeight = myScanner.nextLine();
        
        System.out.println("Please enter the window width:");
        stringWidth = myScanner.nextLine();
        
        System.out.println("What is the cost of glass per foot?");
        stringCostOfGlass = myScanner.nextLine();
        
        System.out.println("What is the cost of trim?");
        stringCostOfTrim = myScanner.nextLine();
        
        // Convert String values of height and width to float values
        // Use the Float parseFloat method to convert entered String values into Float type
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        costOfGlass = Float.parseFloat(stringCostOfGlass);
        costOfTrim = Float.parseFloat(stringCostOfTrim);
        howManyWindows = Float.parseFloat(stringHowManyWindows);
        
        // calculate the area of the window
        areaOfWindow = height * width;
        // calc the perimeter of the window
        perimeterOfWindow = (width + height) * 2;
        
        // calc the total cost of the window - use a hardcoded variable
        // for material cost
        
        costPerWindow = ((costOfGlass * areaOfWindow) + (costOfTrim * perimeterOfWindow));
        totalCost = ((costOfGlass * areaOfWindow) + (costOfTrim * perimeterOfWindow)) * howManyWindows;
        
        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Price per window = " + costPerWindow);
        System.out.println("Total Cost = " + totalCost);
        
        
        
        /* what would I have done differently?
         instead of hard coding the cost of glass and trim in the program
         I would have gotten the real cost from somewhere with real - time prices
        Also would not have hardcoded those values so far down in the program
        */
        
        
        
        
        
        
        
        
    }
}
