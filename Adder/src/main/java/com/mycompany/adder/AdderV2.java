/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adder;
import java.util.Scanner;

/**
 *
 * @author Tom Hubbard
 */
public class AdderV2 {
    public static void main(String[] args) {
        //Declare the number values and initialize them to 0
        int sum = 0;
        int operand1 = 0;
        int operand2 = 0;
        
        //Declare and initialize a scanner object - the scanner reads
        //input from the console
        Scanner myScanner = new Scanner(System.in);
        
        // declare and initialize String (text) variables to hold the values
        // the user types in
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        // ask the user to input the first operand
        System.out.println("Please enter the first number to be added:");
        
        // now wait until the user types something in - put the value
        // in stringOperand1
        stringOperand1 = myScanner.nextLine();
        
        // ask the user to input the second operand
        System.out.println("Please enter the second number to be added:");
        
        // now wait until the user types something in - put the value
        //in stringOperand2
        stringOperand2 = myScanner.nextLine();
        
        //in order to add the values input by the user we must
        // convert the string values into int values. We use the
        //parseInt method for this:
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        ///assign the sum of operand1 and operand2 to sum
        sum = operand1 + operand2;
        
        // print the sum to the console
        System.out.println("Sum is: " + sum);
    }
}
